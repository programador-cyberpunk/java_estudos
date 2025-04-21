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
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "INSERT FROM lojinha.usuarios";
        cmd =+ "WHERE idUsuario = " +user.getIdUsuario();
        return  linesAfected;
    }

}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>0){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd =+ "WHERE idUsuario = " +user.getIdUsuario();
        return  linesAfected;
    }

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

    ////////////////email//////////////////////////

public int insert( Usuarios user) {
 int linesAfected = 0;
 if(linesAfected()>0){
    String cmd = "INSERT INTO lojinha.usuarios";
    cmd +="WHERE email = " +=user.getEmail();
    return  lines Afected;
}
    if(email.contains("@")){
        this.email = email;
    }else{
        email = "";
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE email = " +=user.getEmail();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getEmail(email)>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE email = " +user.getEmail();
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

    /////////////////////////senha//////////////////////

public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd +="WHERE senha = " +=user.getSenha();
        return  linesAfected;
    }
    if(senha.contains(null)){
      return 0;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE senha = " +=user.getSenha();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getSenha()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE senha= " +user.getSenha();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

/////////////////////////nivelUsuario//////////////////////////


public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd += "WHERE nivelUsuario = " +=user.getNivelUsuario();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE nivelUsuario = " +=user.getNivelUsuario();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getNivelUsuario()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE nivelUsuario = " +user.getNivelUsuario();
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

///////////////nome////////////////////


public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd +="WHERE nome = " +=user.getNome();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE nome = " +=user.getNome();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getNome()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE nome = " +user.getNome();
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

    ///////////////cpf/////////////


public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd+= "WHERE cpf = " +=user.getCpf();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE cpf = " +=user.getCpf();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getCpf()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE cpf = " +user.getCpf();
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

////////////////endereco/////////////////////


public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd+="WHERE endereco = " +=user.getEndereco();
        return  lines Afected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE endereco = " +=user.getEndereco();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getEndereco()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE endereco = " +user.getEndereco();
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
////////////bairro/////////////


public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd +="WHERE bairro = " +=user.getBairro();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE bairro = " +=user.getBairro();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getBairro()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE bairro = " +user.getBairro();
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

/////////////////////cidade///////////////
public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd +="WHERE cidade = " +=user.getCidade();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE cidade = " +=user.getCidade();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getCidade()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE cidade = " +user.getCidade();
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
    ///////////////uf//////////////////////

public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd +="WHERE uf = " +=user.getUf();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE uf = " +=user.getUf();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getUf()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE uf = " +user.getUf();
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
  }
    ////////////cep////////////////////

public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd +="WHERE cep = " +=user.getCep();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE cep = " +=user.getCep();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getCep()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE cep = " +user.getCep();
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

    ////////////////////////////telefone////////////////////////

public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd +="WHERE telefone = " +=user.getTelefone();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE telefone = " +=user.getTelefone();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getTelefone()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE telefone = " +user.getTelefone();
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
//////////////////////foto////////////////////

public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd +="WHERE foto = " +=user.getFoto();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE foto = " +=user.getFoto();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getFoto()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE foto = " +user.getFoto();
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

    /////////////////ativo//////////////////////

public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.usuarios";
        cmd +="WHERE ativo = " +=user.getAtivo();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.usuarios";
        cmd += "WHERE ativo = " +=user.getAtivo();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getAtivo()>0) {
            String cmd = "DELETE FROM lojinha.usuarios";
            cmd += "WHERE ativo = " +user.getAtivo();
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
