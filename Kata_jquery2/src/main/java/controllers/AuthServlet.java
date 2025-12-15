package controllers;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 @WebServlet("/auth")
public class AuthServlet {
	 private static final long serialVersionUID = 1L;
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("application/json");
	        response.setCharacterEncoding("UTF-8");
	        PrintWriter out = response.getWriter();
	        HttpSession session = request.getSession();

	        String acao = request.getParameter("acao");

	        if ("login".equals(acao)) {
	            String email = request.getParameter("email");
	            String senha = request.getParameter("senha");

	            if ("admin@loja.com".equals(email) && "123".equals(senha)) {
	                
	                String token = String.format("%06d", new Random().nextInt(999999));
	                
	                session.setAttribute("2fa_token", token);
	                session.setAttribute("2fa_email", email);
	                
	                EmailService emailService = new EmailService();
	                emailService.enviarCodigo(email, token);
	                
	                out.print("{\"status\": \"2fa_required\"}");
	            } else {
	                response.setStatus(401);
	                out.print("{\"status\": \"erro\", \"msg\": \"Credenciais inválidas\"}");
	            }

	        } else if ("validar".equals(acao)) {
	            String tokenDigitado = request.getParameter("token");
	            String tokenReal = (String) session.getAttribute("2fa_token");

	            if (tokenReal != null && tokenReal.equals(tokenDigitado)) {
	                session.setAttribute("usuarioLogado", session.getAttribute("2fa_email"));
	                session.removeAttribute("2fa_token");
	                out.print("{\"status\": \"ok\", \"redirect\": \"home.jsp\"}");
	            } else {
	                response.setStatus(401);
	                out.print("{\"status\": \"erro\", \"msg\": \"Token inválido\"}");
	            }
	        }
	    }
}
