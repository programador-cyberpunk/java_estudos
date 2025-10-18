package controller;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usuarios")
public class UsuariioController extends HttpServlet{
 private static final long serialVersionUID = 1L; //procurei, mas eu nao tenho ideia de que pora seja isso
 
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException{
	  
	  
	  
	  System.out.println("Recebi essa porra de requisição POST no meu controller, do usuario");
  

	  
  }
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException{
	  
	  System.out.println("Recebi essa porra de requisição GET no meu controller, do usuario");
  }
}
