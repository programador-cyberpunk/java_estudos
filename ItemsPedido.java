package models;

public class ItemsPedido {


    public class ItemPedido {

        private int idItemPedido;
        private int idPedido;
        private int ordem;
        private int idEstoque;
        private int qtdItem;
        private String dtDevolucao;
        private String motivoDevolucao;

        public ItemPedido() {
        }

        public ItemPedido(int idItemPedido, int idPedido, int ordem, int idEstoque, int qtdItem, String dtDevolucao, String motivoDevolucao) {
            this.idItemPedido = idItemPedido;
            this.idPedido = idPedido;
            this.ordem = ordem;
            this.idEstoque = idEstoque;
            this.qtdItem = qtdItem;
            this.dtDevolucao = dtDevolucao;
            this.motivoDevolucao = motivoDevolucao;
        }

        // Getters e Setters
        public int getIdItemPedido(int idItemPedido) {
            return idItemPedido;
        }

        public void setIdItemPedido(int idItemPedido) {
            this.idItemPedido = idItemPedido;
        }

        public int getIdPedido(int idPedido) {
            return idPedido;
        }

        public void setIdPedido(int idPedido) {
            this.idPedido = idPedido;
        }

        public int getOrdem( int ordem) {
            return ordem;
        }

        public void setOrdem(int ordem) {
            this.ordem = ordem;
        }

        public int getIdEstoque(int idEstoque) {
            return idEstoque;
        }

        public void setIdEstoque(int idEstoque) {
            this.idEstoque = idEstoque;
        }

        public int getQtdItem(int qtdItem) {
            return qtdItem;
        }

        public void setQtdItem(int qtdItem) {
            this.qtdItem = qtdItem;
        }

        public String getDtDevolucao(String dtDevolucao) {
            return dtDevolucao;
        }

        public void setDtDevolucao(String dtDevolucao) {
            this.dtDevolucao = dtDevolucao;
        }

        public String getMotivoDevolucao(String motivoDevolucao) {
            return motivoDevolucao;
        }

        public void setMotivoDevolucao(String motivoDevolucao) {
            this.motivoDevolucao = motivoDevolucao;
        }
    }
}
