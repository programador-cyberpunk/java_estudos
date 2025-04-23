package models;

import database.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ProdutosDAO {

    private Statement dblink = null;

    public ProdutosDAO(){
        try {
            this.dblink = new DBConnection().getConnection().createStatement();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public int insert( Produtos user) {
        int linesAfected = 0;
        if (linesAfected()>1){
            String cmd = "INSERT FROM lojinha.produtos";
            cmd += "WHERE idProduto = " +user.getIdProduto();
            return  linesAfected;
        }

    }

    public int update( Produtos user) {
        int linesAfected = 0;
        if (linesAfected()>0){
            String cmd = "UPDATE FROM lojinha.institucional";
            cmd += "WHERE idProduto = " +user.getIdProduto();
            return  linesAfected;
        }

    }

    public int delete( Produtos user) {
        try {
            int linesAfected = 0;
            if(user.getIdProduto()>0) {
                String cmd = "DELETE FROM lojinha.institucional";
                cmd += "WHERE idProduto = " +user.getIdProduto();
                linesAfected = dblink.executeUpdate(cmd);
                return linesAfected;
            }else {
                return 0;
            }
        }catch{

        }
    }

    public ResultSet list(Produtos where) {
        String cmd = "SELECT idProduto, nome, fabricante, modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos ";
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

////////////////nome//////////////////////////

public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +="WHERE nome= " +=user.getNome();
        return  linesAfected;
    }

}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE nome = " +=user.getNome();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getNome()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE nome = " +user.getNome();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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

/////////////////////////fabricante//////////////////////

public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +="WHERE fabricante = " +=user.getFabricante();
        return  linesAfected;
    }

}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE fabricante = " +=user.getFabricante();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getFabricante()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE fabricante= " +user.getFabricante();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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

/////////////////////////modelo//////////////////////////


public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +=  "WHERE modelo = " + user.getModelo();
        return  linesAfected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE modelo  = " + user.getModelo();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getModelo()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE modelo = " +user.getModelo());
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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

///////////////marca////////////////////


public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +="WHERE marca = " +=user.getMarca();
        return  linesAfected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE bairro = " +=user.getMarca();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getMarca()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE marca = " +user.getMarca();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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

///////////////idCategoria/////////////


public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd+= "WHERE idCategoria = " +=user.getIdCategoria();
        return  linesAfected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE idCategoria = " +=user.getIdCategoria();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getIdCategoria()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE idCategoria = " +user.getIdCategoria();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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

////////////////descricao/////////////////////


public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd+="WHERE descricao = " +=user.getDescricao();
        return  lines Afected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE descricao = " +=user.getDescricao();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getDescricao()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE descricao = " +user.getDescricao();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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
////////////unidadeMedida/////////////


public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +="WHERE unidadeMedida = " +=user.getUnidadeMedida();
        return  linesAfected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE unidadeMedida = " +=user.getUnidadeMedida();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getUnidadeMedida()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE unidadeMedida = " +user.getUnidadeMedida();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Instituicao where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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

/////////////////////largura///////////////
public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +="WHERE largura = " +=user.getLargura();
        return  linesAfected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE largura = " +=user.getLargura();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getLargura()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE largura = " +user.getLargura();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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

/////////////////////altura///////////////
public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +="WHERE altura = " +=user.getAltura();
        return  linesAfected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE altura = " +=user.getAltura();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getAltura()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE altura = " +user.getAltura();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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


/////////////////////profundidade///////////////
public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +="WHERE profundidade = " +=user.getProfundidade();
        return  linesAfected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE profundidade = " +=user.getProfundidade();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getProfundidade()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE profundidade = " +user.getProfundidade();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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


/////////////////////peso///////////////
public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +="WHERE peso = " +=user.getPeso();
        return  linesAfected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE peso = " +=user.getPeso();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getPeso()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE peso = " +user.getPeso();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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


/////////////////////cor///////////////
public int insert( Produtos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.produtos";
        cmd +="WHERE cor = " +=user.getCor();
        return  linesAfected;
    }
}

public int update( Produtos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.produtos";
        cmd += "WHERE cor = " +=user.getCor();
        return  linesAfected;
    }

}

public int delete( Produtos user) {
    try {
        int linesAfected = 0;
        if(user.getCor()>0) {
            String cmd = "DELETE FROM lojinha.produtos";
            cmd += "WHERE largura = " +user.getCor();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Produtos where) {
    String cmd = "SELECT idProduto, nome, fabricante,modelo, marca, IdCategoria, descricao, unidadeMedida, largura, altura, profundidade, peso, cor FROM lojinha.produtos";
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

