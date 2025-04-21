package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.DBConnection;

public class InstituicaoDAO {


    private Statement dblink = null;

}

    public InstituicaoDAO(){
        try {
            this.dblink = new DBConnection().getConnection().createStatement();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public int insert( Usuarios user) {
        int linesAfected = 0;
        if (linesAfected()>1){
            String cmd = "INSERT FROM lojinha.institucional";
            cmd += "WHERE nome = " +user.getNome();
            return  linesAfected;
        }

    }

    public int update( Usuarios user) {
        int linesAfected = 0;
        if (linesAfected()>0){
            String cmd = "UPDATE FROM lojinha.institucional";
            cmd += "WHERE nome = " +user.getNome();
            return  linesAfected;
        }

    }

    public int delete( Usuarios user) {
        try {
            int linesAfected = 0;
            if(user.getNome()>0) {
                String cmd = "DELETE FROM lojinha.institucional";
                cmd += "WHERE nome = " +user.getNome();
                linesAfected = dblink.executeUpdate(cmd);
                return linesAfected;
            }else {
                return 0;
            }
        }catch{

        }
    }

    public ResultSet list(Usuarios where) {
        String cmd = "SELECT nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, cep, telefone, email, logo FROM lojinha.institucional ";
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

////////////////cpf_cnpj//////////////////////////

public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.institucional";
        cmd +="WHERE cpf_cnpj = " +=user.getCpf_cnpj();
        return  linesAfected;
    }

}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.institucional";
        cmd += "WHERE cpf_cnpj = " +=user.getCpf_cnpj();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getCpf_cnpj()>0) {
            String cmd = "DELETE FROM lojinha.institucional";
            cmd += "WHERE cpf_cnpj = " +user.getCpf_cnpj();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Usuarios where) {
    String cmd = "SELECT nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, cep, telefone, email, logo FROM lojinha.institucional";
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

/////////////////////////tipoPessoa//////////////////////

public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.institucional";
        cmd +="WHERE tipoPessoa = " +=user.getTipoPessoa();
        return  linesAfected;
    }
    if(senha.contains(null)){
        return 0;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.institucional";
        cmd += "WHERE tipoPessoa = " +=user.getTipoPessoa();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getTipoPessoa()>0) {
            String cmd = "DELETE FROM lojinha.institucional";
            cmd += "WHERE senha= " +user.getTipoPessoa();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

/////////////////////////endereco//////////////////////////


public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.institucional";
        cmd += "WHERE endereco = " +=user.getEndereco();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.institucional";
        cmd += "WHERE endereco = " +=user.getEndereco();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getEndereco()>0) {
            String cmd = "DELETE FROM lojinha.institucional";
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
    String cmd = "SELECT  nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, cep, telefone, email, logo FROM lojinha.institucional";
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
        String cmd = "INSERT INTO lojinha.institucional";
        cmd +="WHERE bairro = " +=user.getBairro();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.institucional";
        cmd += "WHERE bairro = " +=user.getBairro();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getBairro()>0) {
            String cmd = "DELETE FROM lojinha.institucional";
            cmd += "WHERE nome = " +user.getBairro();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Usuarios where) {
    String cmd = "SELECT  nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, cep, telefone, email, logo FROM lojinha.institucional";
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

///////////////cep/////////////


public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.institucional";
        cmd+= "WHERE cep = " +=user.getCep();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.institucional";
        cmd += "WHERE cep = " +=user.getCep();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getCep()>0) {
            String cmd = "DELETE FROM lojinha.institucional";
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
    String cmd = "SELECT nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, cep, telefone, email, logo FROM lojinha.institucional";
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

////////////////telefone/////////////////////


public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.institucional";
        cmd+="WHERE telefone = " +=user.getTelefone();
        return  lines Afected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.institucional";
        cmd += "WHERE telefone = " +=user.getTelefone();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getTelefone()>0) {
            String cmd = "DELETE FROM lojinha.institucional";
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
    String cmd = "SELECT nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, cep, telefone, email, logo FROM lojinha.institucional";
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
////////////email/////////////


public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.institucional";
        cmd +="WHERE email = " +=user.getEmail();
        return  linesAfected;
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
        String cmd = "UPDATE FROM lojinha.institucional";
        cmd += "WHERE email = " +=user.getEmail();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getEmail()>0) {
            String cmd = "DELETE FROM lojinha.institucional";
            cmd += "WHERE Email = " +user.getEmail();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Usuarios where) {
    String cmd = "SELECT nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, cep, telefone, email, logo FROM lojinha.institucional";
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

/////////////////////logo///////////////
public int insert( Usuarios user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.institucional";
        cmd +="WHERE logo = " +=user.getLogo();
        return  linesAfected;
    }
}

public int update( Usuarios user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.institucional";
        cmd += "WHERE logo = " +=user.getLogo();
        return  linesAfected;
    }

}

public int delete( Usuarios user) {
    try {
        int linesAfected = 0;
        if(user.getLogo()>0) {
            String cmd = "DELETE FROM lojinha.institucional";
            cmd += "WHERE logo = " +user.getLogo();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Usuarios where) {
    String cmd = "SELECT nome, cpf_cnpj, tipoPessoa, endereco, bairro, cidade, cep, telefone, email, logo FROM lojinha.institucional";
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
