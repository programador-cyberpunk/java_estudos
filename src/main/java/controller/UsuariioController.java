package controller;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.UsuarioDTO;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@WebServlet("/usuarios")
public class UsuariioController extends HttpServlet{
 private static final long serialVersionUID = 1L; //procurei, mas eu nao tenho ideia de que pora seja isso
 private static final Map<String, UsuarioDTO> bancoDeDados = new ConcurrentHashMap<>();
 
 
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException{
	  
	  String username = request.getParameter("username");
	  String email = request.getParameter("email");
	  String senha = request.getParameter("senha");
	  
	  UsuarioDTO novoUsuario = new UsuarioDTO();
	  novoUsuario.setUsername(username);
	  novoUsuario.setEmail(email);
	  novoUsuario.setSenha(senha);
	  
	  if(bancoDeDados.containsKey(username)) {
		  response.setStatus(HttpServletResponse.SC_CONFLICT);
		  response.getWriter().write("Erro: Nome de usuario ja tem dono" );
	  }else {
		  bancoDeDados.put(username, novoUsuario);
		  System.out.println("Usuario foi salvo: " + username);
		  
		  response.setStatus(HttpServletResponse.SC_CREATED);
		  response.getWriter().write("Usuario registrado, gg");
	  }
	  
	  System.out.println("Recebi essa porra de requisição POST no meu controller, do usuario");
  }
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException{
	  
	  System.out.println("Recebi essa porra de requisição GET no meu controller, do usuario");
  }
}
