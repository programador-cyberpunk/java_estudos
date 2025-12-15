package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modulo.Usuario;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email-login");
		String senha = request.getParameter("senha");
		
	Usuario	usuario = null;
	 if("adm@email.com".equals(email) && "123".equals(senha)){
		usuario = new Usuario(1, "Admin", email, senha);
	}
	 if(usuario !=null) {
		 HttpSession session = request.getSession();
		 out.print("{\"status\": \"sucesso\", \"redirect\": \"carrinho.jsp\"}");
	 }else {
		 response.setStatus(401);
		 out.print("{\"status\": \"erro\", \"mensagem\": \"Email ou senha inválidos, porra.\"}");
	 }
	 out.flush();
	}
}
