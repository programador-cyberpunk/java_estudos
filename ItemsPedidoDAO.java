package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.DBConnection;


public class ItemsPedidoDAO {


    private Statement dblink = null;

}

public ItemsPedidoDAO(){
    try {
        this.dblink = new DBConnection().getConnection().createStatement();
    }catch(SQLException e){
        e.printStackTrace();
    }
}
public int insert( ItemsPedido user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "INSERT FROM lojinha.itemsPedidos";
        cmd += "WHERE idItemPedido = " +user.getIdItemPedido();
        return  linesAfected;
    }

}

public int update( ItemsPedido user) {
    int linesAfected = 0;
    if (linesAfected()>0){
        String cmd = "UPDATE FROM lojinha.itemsPedidos";
        cmd += "WHERE idItemPedido = " +user.getIdItemPedido();
        return  linesAfected;
    }

}

public int delete( ItemsPedido user) {
    try {
        int linesAfected = 0;
        if(user.getIdItemPedido()>0) {
            String cmd = "DELETE FROM lojinha.itemsPedidos";
            cmd += "WHERE idItemPedido = " +user.getIdItemPedido();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list(ItemsPedido where) {
    String cmd = " idItemPedido, idPedido, ordem, idEstoque, qtdItem, dtDevolucao, motivoDevolucao FROM lojinha.itemsPedidos ";
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

////////////////idPedido//////////////////////////

public int insert( ItemsPedido user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.itemsPedido";
        cmd +="WHERE idPedido = " +=user.getIdPedido();
        return  linesAfected;
    }

}

public int update( ItemsPedido user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.itemsPedido";
        cmd += "WHERE idPedido = " +=user.getIdPedido();
        return  linesAfected;
    }

}

public int delete( ItemsPedido user) {
    try {
        int linesAfected = 0;
        if(user.getIdUsuario()>0) {
            String cmd = "DELETE FROM lojinha.itemsPedido";
            cmd += "WHERE idPedido = " +user.getIdPedido();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "int idItemPedido, int idPedido, int ordem, int idEstoque, int qtdItem, String dtDevolucao, String motivoDevolucao";
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

/////////////////////////ordem//////////////////////

public int insert( ItemsPedido user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.itemsPedido";
        cmd +="WHERE ordem = " +=user.getOrdem();
        return  linesAfected;
    }
}

public int update( ItemsPedido user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.itemsPedido;
        cmd += "WHERE ordem = " +=user.getOrdem();
        return  linesAfected;
    }

}

public int delete( ItemsPedido user) {
    try {
        int linesAfected = 0;
        if(user.getOrdem()>0) {
            String cmd = "DELETE FROM lojinha.itemsPedido";
            cmd += "WHERE ordem= " +user.getOrdem();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}
ublic ResultSet list( ItemsPedido where) {
    String cmd = " idItemPedido, idPedido, ordem, idEstoque,qtdItem, dtDevolucao, motivoDevolucao";
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

/////////////////////////idEstoque//////////////////////////


public int insert( ItemsPedido user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.itemsPedido";
        cmd += "WHERE idEstoque = " +=user.getIdEstoque();
        return  linesAfected;
    }
}

public int update( ItemsPedido user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.itemsPedido";
        cmd += "WHERE idEstoque = " +=user.getIdEstoque();
        return  linesAfected;
    }

}

public int delete( ItemsPedido user) {
    try {
        int linesAfected = 0;
        if(user.getIdEstoque()>0) {
            String cmd = "DELETE FROM lojinha.itemsPedido";
            cmd += "WHERE idEstoque = " +user.getIdEstoque();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( ItemsPedido where) {
    String cmd = " idItemPedido, idPedido, ordem, idEstoque,qtdItem, dtDevolucao, motivoDevolucao";
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

///////////////qtdItems////////////////////


public int insert( ItemsPedido user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.itemsPedido";
        cmd +="WHERE qtdItems = " +=user.getQtdItems();
        return  linesAfected;
    }
}

public int update( ItemsPedido user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.itemsPedido";
        cmd += "WHERE qtdItems = " +=user.getQtdItems();
        return  linesAfected;
    }

}

public int delete( ItemsPedido user) {
    try {
        int linesAfected = 0;
        if(user.getQtdItems()>0) {
            String cmd = "DELETE FROM lojinha.itemsPedido";
            cmd += "WHERE qtdItems = " +user.getQtdItems();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = public ResultSet list( Pedidos where) {
        String cmd = " idItemPedido, idPedido, ordem, idEstoque,qtdItem, dtDevolucao, motivoDevolucao";
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
;
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

///////////////dtDevolucao/////////////


public int insert( ItemsPedido user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.itemsPedido";
        cmd+= "WHERE dtDevolucao = " +=user.getDtDevolucao();
        return  linesAfected;
    }
}

public int update( ItemsPedido user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.itemsPedido";
        cmd += "WHERE dtDevolucao = " +=user.getDtDevolucao();
        return  linesAfected;
    }

}

public int delete( ItemsPedido user) {
    try {
        int linesAfected = 0;
        if(user.getDtDevolucao()>0) {
            String cmd = "DELETE FROM lojinha.itemsPedido";
            cmd += "WHERE dtDevolucao = " +user.getDtDevolucao();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = public ResultSet list( Pedidos where) {
        String cmd = " idItemPedido, idPedido, ordem, idEstoque,qtdItem, dtDevolucao, motivoDevolucao";
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

////////////////motivoDevolucao/////////////////////


public int insert( ItemsPedido user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.itemsPedidos";
        cmd+="WHERE motivoDevolucao = " +=user.getMotivoDevolucao();
        return  lines Afected;
    }
}

public int update( ItemsPedido user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.itemsPedidos";
        cmd += "WHERE motivoDevolucao = " +=user.getMotivoDevolucao);
        return  linesAfected;
    }

}

public int delete( ItemsPedido user) {
    try {
        int linesAfected = 0;
        if(user.getMotivoDevolucao()>0) {
            String cmd = "DELETE FROM lojinha.itemsPedidos";
            cmd += "WHERE motivoDevolucao = " +user.getMotivoDevolucao();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( ItemsPedido where) {
    String cmd = public ResultSet list( Pedidos where) {
        String cmd = " idItemPedido, idPedido, ordem, idEstoque,qtdItem, dtDevolucao, motivoDevolucao";
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
