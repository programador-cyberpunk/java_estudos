    package models;

    public class Pedidos {

        int idPedido;
        int idUsuario;
        String dtPedido;
        String dtPagamento;
        String dtNotaFiscal;
        String notaFiscal;
        String dtEnvio;
        String dtRecebimento;
        String tipoFrete;
        String rastreioFrete;
        String entregaEndereco;
        String entregaNumero ;
        String entregaCompl ;
        String entregaBairro;
        String entregaCidade;
        String entregaUF;
        String entregaCEP;
        String entregaTelefone;
        String entregaRefer;
        String valorTotal;
        String qtdItems;
        String dtDevolucao;
        String motivoDevolucao;

        public Pedidos(){

        }

        public Pedidos(int idPedido, int idUsuario, String dtPedido, String dtPagamento, String dtNotaFiscal, String notaFiscal, String dtEnvio) {
            this.setIdPedido(idPedido);
            this.setIdUsuario(idUsuario);
            this.setDtPedido(dtPedido);
            this.setDtPagamento(dtPagamento);
            this.setDtNotaFiscal(dtNotaFiscal);
            this.setNotaFiscal(notaFiscal);
            this.setDtEnvio(dtEnvio);
        }


        Pedidos(int idPedido, int idUsuario, String dtPedido, String dtPagamento, String dtNotaFiscal,
                 String notaFiscal, String dtEnvio,String dtRecebimento,String tipoFrete, String rastreioFrete,
                 String entregaBairro,String entregaEndereco, String entregaNumero, String entregaCompl,
                 String entregaCidade, String entregaUF, String entregaCEP, String entregaTelefone,
                 String entregaRefer, String valorTotal, String qtdItems, String dtDevolucao, String motivoDevolucao){
            
            this.setIdPedido(idPedido);
            this.setIdUsuario(idUsuario);
            this.setDtPedido(dtPedido);
            this.setDtPagamento(dtPagamento);
            this.setDtNotaFiscal(dtNotaFiscal);
            this.setNotaFiscal(notaFiscal);
            this.setDtEnvio(dtEnvio);
            this.setDtRecebimento(dtRecebimento);
            this.setTipoFrete(tipoFrete);
            this.setRastreioFrete(rastreioFrete);
            this.setEntregaBairro(entregaBairro);
            this.setEntregaEndereco(entregaEndereco);
            this.setEntregaNumero(entregaNumero);
            this.setEntregaCompl(entregaCompl);
            this.setEntregaCidade(entregaCidade);
            this.setEntregaUF(entregaUF);
            this.setEntregaCEP(entregaCEP);
            this.setEntregaTelefone(entregaTelefone);
            this.setEntregaRefer(entregaRefer);
            this.setValorTotal(valorTotal);
            this.setQtdItems(qtdItems);
            this.setDtDevolucao(dtDevolucao);
            this.setMotivoDevolucao(motivoDevolucao);
        }


        //setando os bagulho
        public int getIdPedido( int idPedido){
            return idPedido;
        }
        public void setIdPedido(int idPedido){
            this.idPedido = idPedido;
        }

        //////////////////////////////////
        public int getIdUsuario(int idUsuario){
            return idUsuario;
        }
        public void setIdUsuario(int idUsuario){
            this.idUsuario = idUsuario;
        }

        ////////////////////////////////////////
        public String getDtPedido( String dtPedido){
            return dtPedido;
        }

        public void setDtPedido(String dtPedido){
            this.dtPedido = dtPedido;
        }
        ////////////////////////////
        public String getdtPagamento(String dtPagamento){
            return dtPagamento;
        }
        public void setDtPagamento(String dtPagamento){
            this. dtPagamento =  dtPagamento;
        }
        ////////////////////////
        public String getDtNotaFiscal(String dtNotaFiscal){
            return dtNotaFiscal;
        }
        public void setDtNotaFiscal(String dtNotaFiscal){
            this.dtNotaFiscal = dtNotaFiscal;
        }
        //////////////////////////
        public String getNotaFiscal(String notaFiscal){
            return notaFiscal;
        }
        public void setNotaFiscal(String notaFiscal){
            this.notaFiscal = notaFiscal;
        }
        //////////////////////////
        public String getDtEnvio(String dtEnvio){
            return dtEnvio;
        }
        public void setDtEnvio(String dtEnvio){
            this.dtEnvio = dtEnvio;
        }
        ///////////////////////////
        public String getDtRecebimento(String dtRecebimento){
            return dtRecebimento;
        }
        public void setDtRecebimento(String dtRecebimento){
            this.dtRecebimento = dtRecebimento;
        }
        //////////////////////
        public String getTipoFrete( String tipoFrete){
            return tipoFrete;
        }
        public void setTipoFrete(String tipoFrete){
            this.tipoFrete = tipoFrete;
        }
        ///////////////////
        public String getRastreioFrete( String rastreioFrete){
            return rastreioFrete;
        }
        public void setRastreioFrete(String rastreioFrete){
            this.rastreioFrete = rastreioFrete;
        }
        //////////////////////////

        public String getEntregaEndereco(String entregaEndereco){
            return entregaEndereco;
        }
        public void setEntregaEndereco(String entregaEndereco){
            this.entregaEndereco = entregaEndereco;
        }
        //////////////////////////////////
        public String getEntregaBairro(String entregaBairro){
            return entregaBairro;
        }
        public void setEntregaBairro(String entregaBairro){
            this.entregaBairro = entregaBairro;
        }
        /////////////////////////
        public String getEntregaNumero(String entregaNumero){
            return entregaNumero;
        }
        public void setEntregaNumero(String entregaNumero){
            this.entregaNumero = entregaNumero;
        }
        ///////////////////
        public String getEntregaCompl(String entregaCompl){
            return entregaCompl;
        }
        public void setEntregaCompl(String EntregaCompl){
            this.entregaCompl = entregaCompl;
        }

        ///////////////////
        public String getEntregaTelefone(String entregaTelefone){
            return entregaTelefone;
        }
        public void setEntregaTelefone(String entregaTelefone){
            this.entregaTelefone = entregaTelefone;
        }
        //////////////////////////////

        public String getEntregaUF(String entregaUF){
            return entregaUF;
        }
        public void setEntregaUF(String eentregaUF){
            this.entregaUF = entregaUF;
        }
        ///////////////////
        public String getEntregaCEP(String entregaCEP){
            return entregaCEP;
        }
        public void setEntregaCEP(String entregaCEP){
            this.entregaCEP = entregaCEP;
        }
        ///////////////////
        public String getEntregaRefer(String entregaRefer){
            return entregaRefer;
        }
        public void setEntregaRefer(String entregaRefer){
            this.entregaRefer = entregaRefer;
        }
        ///////////////////
        public String getValorTotal(String valorTotal){
            return valorTotal;
        }
        public void setValorTotal(String valorTotal){
            this.valorTotal = valorTotal;
        }
        ///////////////////
        public String getQtdItems(String qtdItems){
            return qtdItems;
        }
        public void setQtdItems(String qtdItems){
            this.qtdItems = qtdItems;
        }
        ///////////////////
        public String getdtDevolucao(String dtDevolucao){
            return dtDevolucao;
        }
        public void setDtDevolucao(String dtDevolucao){
            this.dtDevolucao = dtDevolucao;
        }
        ///////////////////
        public String getmotivoDevolucao(String motivoDevolucao){
            return motivoDevolucao;
        }
        public void setMotivoDevolucao(String motivoDevolucao){
            this.motivoDevolucao = motivoDevolucao;
        }
    }
