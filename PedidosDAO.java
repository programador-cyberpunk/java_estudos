package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.DBConnection;


public class PedidosDAO {


    private Statement dblink = null;

}

public PedidosDAO(){
    try {
        this.dblink = new DBConnection().getConnection().createStatement();
    }catch(SQLException e){
        e.printStackTrace();
    }
}
public int insert( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "INSERT FROM lojinha.pedidos";
        cmd += "WHERE idPedido = " +user.getIdPedido();
        return  linesAfected;
    }

}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>0){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE idPedido = " +user.getIdPedido();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getIdPedido()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE idPedido = " +user.getIdPedido();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list(Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dtEnvio, dtRecebimento, tipoFrete, entregaEndereco, entregaNumero, entregaCompl, entregaNumero, entregaBairro, ,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

////////////////idUsuaio//////////////////////////

public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE idUsuario = " +=user.getIdUsuario();
        return  linesAfected;
    }

}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE idUsuario = " +=user.getIdUsuario();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getIdUsuario()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE idUsuario = " +user.getIdUsuario();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dtEnvio, dtRecebimento, tipoFrete, entregaEndereco, entregaNumero, entregaCompl, entregaNumero, entregaBairro, ,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

/////////////////////////dtPedido//////////////////////

public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE dtPedido = " +=user.getDtPedido();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE dtPedido = " +=user.getDtPedido();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getDtPedido()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE dtPedido = " +user.getDtPedido();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

/////////////////////////dtPagamento//////////////////////////


public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd += "WHERE dtPagamento = " +=user.getdtPagamento();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE dtPagamento = " +=user.getdtPagamento();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getdtPagamento()>0) {
            String cmd = "DELETE FROM lojinha.institucional";
            cmd += "WHERE dtPagamento = " +user.getdtPagamento();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dtEnvio, dtRecebimento, tipoFrete, entregaEndereco, entregaNumero, entregaCompl, entregaNumero, entregaBairro, ,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

///////////////dtNotaFiscal////////////////////


public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE bairro = " +=user.getDtNotaFiscal();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE dtNotaFiscal = " +=user.getDtNotaFiscal();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getDtNotaFiscal()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE dtNotaFiscal = " +user.getDtNotaFiscal();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dtEnvio, dtRecebimento, tipoFrete, entregaEndereco, entregaNumero, entregaCompl, entregaNumero, entregaBairro, ,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

///////////////notaFiscal/////////////


public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd+= "WHERE notaFiscal = " +=user.getNotaFiscal();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE notaFiscal = " +=user.getNotaFiscal();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getNotaFiscal()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE notaFiscal = " +user.getNotaFiscal();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dtEnvio, dtRecebimento, tipoFrete, entregaEndereco, entregaNumero, entregaCompl, entregaNumero, entregaBairro, ,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

////////////////dtEnvio/////////////////////


public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd+="WHERE dtEnvio = " +=user.getDtEnvio();
        return  lines Afected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE dtEnvio = " +=user.getDtEnvio);
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getDtEnvio()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE dtEnvio = " +user.getDtEnvio();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dtEnvio, " +
            "dtRecebimento, tipoFrete, entregaEndereco, entregaNumero, entregaCompl, entregaNumero, entregaBairro, ,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos";
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
////////////dtRecebimento/////////////


public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE dtRecebimento = " +=user.getDtRecebimento();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE dtRecebimento = " +=user.getDtRecebimento();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getDtRecebimento()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE dtRecebimento = " +user.getDtRecebimento();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dtEnvio, " +
            "dtRecebimento, tipoFrete, entregaEndereco, entregaNumero, entregaCompl, entregaNumero, entregaBairro, ,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

/////////////////////tipoFrete///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE tipoFrete = " +=user.getTipoFrete();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE tipoFrete = " +=user.getTipoFrete();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getTipoFrete()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE tipoFete = " +user.getTipoFrete();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco, entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

/////////////////////entregaEndereco///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE entregaEndereco = " +=user.getEntregaEndereco();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE entregaEndereco = " +=user.getEntregaEndereco();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getEntregaEndereco()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE entegaEndereco = " +user.getEntregaEndereco();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco, entregaCompl, entregaNumero, entregaBairro ,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

/////////////////////entregaCompl///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE entregaCompl = " +=user.getEntregaCompl();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE entregaCompl = " +=user.getEntregaCompl();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getEntregaCompl()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE entregaCompl = " +user.getEntregaCompl();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco, entregaCompl, entregaNumero, entregaBairro, entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////entregaNumero///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE entregaNumero = " +=user.getEntregaNumero();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE entregaNumero = " +=user.getEntregaNumero();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getEntregaCompl()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE entregaNumero = " +user.getEntregaNumero();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco, entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////EntregaBairro///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE entregaBairro = " +=user.getEntregaBairro();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE entregaBairro = " +=user.getEntregaBairro();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getEntregaBairro()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE entregaBairro = " +user.getEntregaBairro();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco, entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////entregaCidade///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE entregaCidade = " +=user.getEntregaCidade();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE entregaCidade = " +=user.getEntregaCidade();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getEntregaCidade()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE entregaCidade = " +user.getEntregaCidade();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco, entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////entregaUf///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE entregaUf = " +=user.getEntregaUF();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE entregaUf = " +=user.getEntregaUF();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getEntregaUF()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE entregaUf = " +user.getEntregaUF();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco,entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

/////////////////////entregaCep///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE entregaCep = " +=user.getEntregaCEP();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE entregaCep = " +=user.getEntregaCEP();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getEntregaCEP()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE entregaCep = " +user.getEntregaCEP();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco,entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////entregaTelefone///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE entregaTelefone = " +=user.getEntregaTelefone();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE Telefone = " +=user.getEntregaTelefone();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getTelefone()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE entregaTelefone = " +user.getEntregaTelefone();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco,entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////entregaUf///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE entregaRefer = " +=user.getEntregaRefer();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE entregaRefer = " +=user.getEntregaRefer();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getEntregaRefer()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE entregaRefer = " +user.getEntregaRefer();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco,entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////valorTotal///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE valorTotal = " +=user.getValorTotal();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE valorTotal = " +=user.getValorTotal();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getValorTotal()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE valorTotal = " +user.getValorTotal();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco,entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////qtdItens///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE qtdItems = " +=user.getQtdItems();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE qtdItems = " +=user.getQtdItems();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getQtdItems()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
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
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco,entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////entregaUf///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE dtDevolucao = " +=user.getdtDevolucao();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE dtDevolucao = " +=user.getdtDevolucao();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getdtDevolucao()f()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE dtDevolucao = " +user.getdtDevolucao();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco,entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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


/////////////////////entregaUf///////////////
public int insert( Pedidos user) {
    int linesAfected = 0;
    if(linesAfected()>0){
        String cmd = "INSERT INTO lojinha.pedidos";
        cmd +="WHERE motivoDevolucao = " +=user.getmotivoDevolucao();
        return  linesAfected;
    }
}

public int update( Pedidos user) {
    int linesAfected = 0;
    if (linesAfected()>1){
        String cmd = "UPDATE FROM lojinha.pedidos";
        cmd += "WHERE motivoDevolucao = " +=user.getmotivoDevolucao()f();
        return  linesAfected;
    }

}

public int delete( Pedidos user) {
    try {
        int linesAfected = 0;
        if(user.getmotivoDevolucao()>0) {
            String cmd = "DELETE FROM lojinha.pedidos";
            cmd += "WHERE motivoDevolucao = " +user.getmotivoDevolucao();
            linesAfected = dblink.executeUpdate(cmd);
            return linesAfected;
        }else {
            return 0;
        }
    }catch{

    }
}

public ResultSet list( Pedidos where) {
    String cmd = "SELECT idPedido, idUsuario, dtPedido, dtPagamento, dtNotaFiscal, notaFiscal, dEnvio,  dtRecebimento, tipoFrete," +
            "entregaEndereco,entregaCompl, entregaNumero, entregaBairro,entregaCidade, entregaUf, entregaCep, entregaTelefone, entregaRefer, valorTotal, qtdItens, dtDevolucao, motivoDevolucao FROM lojinha.pedidos ";
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

