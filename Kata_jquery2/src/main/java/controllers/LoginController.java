package controllers;
import java.io.IOException;
import java.ioPrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController {
	import Loja_service.EmailService; 

	@WebServlet("/auth") // Essa URL "/auth" é onde o AJAX vai bater
	public class LoginController extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Configura para responder em JSON
	        response.setContentType("application/json");
	        response.setCharacterEncoding("UTF-8");
	        PrintWriter out = response.getWriter();
	        HttpSession session = request.getSession();

	        String acao = request.getParameter("acao");

	        // --- CENÁRIO 1: Usuário tenta logar com Email/Senha ---
	        if ("login".equals(acao)) {
	            String email = request.getParameter("email");
	            String senha = request.getParameter("senha");

	            // SIMULAÇÃO DE BANCO DE DADOS (Aqui entraria seu DAO)
	            // Se o email for admin e senha 123...
	            if ("admin@loja.com".equals(email) && "123".equals(senha)) {
	                
	                // 1. Gera um token aleatório de 6 números
	                String token = String.format("%06d", new Random().nextInt(999999));
	                
	                // 2. Guarda na sessão temporariamente (ainda não está logado!)
	                session.setAttribute("2fa_token", token);
	                session.setAttribute("2fa_email", email);
	                
	                // 3. Envia o e-mail usando sua classe
	                EmailService service = new EmailService();
	                service.enviaCodigo(email, token);
	                
	                // 4. Responde JSON dizendo "Preciso do Token"
	                out.print("{\"status\": \"2fa_required\"}");
	            } else {
	                // Erro de login
	                response.setStatus(401);
	                out.print("{\"status\": \"erro\", \"msg\": \"Email ou senha incorretos.\"}");
	            }
	        } 
	        
	        // --- CENÁRIO 2: Usuário envia o código do E-mail ---
	        else if ("validar".equals(acao)) {
	            String tokenDigitado = request.getParameter("token");
	            String tokenReal = (String) session.getAttribute("2fa_token");

	            // Verifica se o token existe na sessão e se é igual ao digitado
	            if (tokenReal != null && tokenReal.equals(tokenDigitado)) {
	                
	                // SUCESSO! Agora sim, cria a sessão oficial do usuário
	                session.setAttribute("usuarioLogado", session.getAttribute("2fa_email"));
	                
	                // Limpa o token de segurança para não ser usado de novo
	                session.removeAttribute("2fa_token");
	                
	                // Responde JSON de sucesso com a URL de destino
	                out.print("{\"status\": \"ok\", \"redirect\": \"home.jsp\"}");
	            } else {
	                response.setStatus(401);
	                out.print("{\"status\": \"erro\", \"msg\": \"Código inválido.\"}");
	            }
	        }
	    }

}
