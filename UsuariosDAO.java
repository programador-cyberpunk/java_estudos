	package models;
	import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DBConnection;
	
	public class UsuariosDAO {
		private Statement dblink = null;
			
		}
		
		public UsuariosDAO(){
			try {
			this.dblink = new DBConnection().getConnection().createStatement();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	public int insert( Usuarios user) {
		
	}
	
	public int update( Usuarios user) {
		
	}
	
	public int delete( Usuarios user) {
	 try {
		 int linesAfected = 0;
		 if(user.getIdUsuario()>0) {
			 String cmd = "DELETE FROM lojinha.usuarios";
			 cmd += "WHERE idUsuario = " +user.getIdUsuario();
		linesAfected = dblink.executeUpdate(cmd);
		 return linesAfected;
		 }else {
			 return 0;
		 }
	 }catch{
		 
	 }
	}
	
	public ResultSet list( Usuarios where) {
		String cmd = "SELECT  idUsuario, email, senha, idNIvelUsuario,nome,cpf,endereco,bairro,cidade,uf,cep,telefone,foto,ativo FROM lojinha.usuarios ";
		if(! where.isEmpty() ){
			cmd += "WHERE" + where;
		}
		return new DBQuery().select(cmd);
	}
	ResultSet rs = null;
	 try {
		 rs = dblink.executeQuery(cmd);
	 }catch(SQLException e) {
		 e.printStackTrace();
	 }
	 return rs;
	}
