    package models;

    public class Produtos {
        int idProduto;
        String fabricante;
        String nome;
        String marca;
        String modelo;
        int idCategoria;
        String descricao;
        String unidadeMedida;
        float largura;
        float altura;
        float profundidade;
        float peso ;
        String cor ;

     public Produtos(){

     }

        public Produtos(String fabricante, String nome, String modelo, String marca, int IdCategoria) {
            this.setFabricante(fabricante);
            this.setNome(nome);
            this.setModelo(modelo);
            this.setMarca(marca);
            this.setIdCategoria(idCategoria);
        }


        public Produtos(String fabricante, String nome, String modelo, String marca, int IdCategoria, String descricao, String unidadeMedida,int largura, int altura,float profundidade, int peso, String cor ) {
            this.setFabricante(fabricante);
            this.setNome(nome);
            this.setModelo(modelo);
            this.setMarca(marca);
            this.setIdCategoria(idCategoria);
            this.setDescricao(descricao);
            this.setUnidadeMedida(unidadeMedida);
            this.setLargura(largura);
            this.setAltura(altura);
            this.setProfundidade(profundidade);
            this.setPeso(peso);
            this.setCor(cor);
        }


        //setando os bagulho
       public int getIdProduto(int idProduto){
         return idProduto;
       }
       public void setIdProduto(int idProduto){
          this.idProduto = idProduto;
       }

       //////////////////////////////////
        public String getFabricante(String fabricante){
            return fabricante;
        }
        public void setFabricante(String fabricante){
            this.fabricante = fabricante;
        }

       ////////////////////////////////////////
       public String getNome(String nome){
         return nome;
       }

       public void setNome(String nome){
         this.nome = nome;
       }
       ////////////////////////////
        public String getModelo(){
         return modelo;
        }
        public void setModelo(String modelo){
         this.modelo = modelo;
        }
        ////////////////////////
        public String getMarca(String marca){
         return marca;
        }
        public void setMarca(String marca){
         this.marca = marca;
        }
        //////////////////////////
        public int getIdCategoria(){
         return idCategoria;
        }
        public void setIdCategoria(int idCategoria){
         this.idCategoria = idCategoria;
        }
        //////////////////////////
        public String getDescricao(){
         return descricao;
        }
        public void setDescricao(String descricao){
         this.descricao = descricao;
        }
        ///////////////////////////
        public String getUnidadeMedida(String unidadeMedida){
         return unidadeMedida;
        }
        public void setUnidadeMedida(String unidadeMedida){
         this.unidadeMedida = unidadeMedida;
        }
        //////////////////////
        public float getLargura( float getLargura){
         return largura;
        }
        public void setLargura(float largura){
          this.largura = largura;
        }
        ///////////////////
        public float getAltura( float getAltura){
         return altura;
        }
        public void setAltura(float altura){
         this.altura = altura;
        }
        //////////////////////////
        public float getProfundidade(float profundidade){
         return profundidade;
        }
        public void setProfundidade(float profundidade){
         this.profundidade = profundidade;
        }
        /////////////////////////
        public float getPeso(float peso){
         return peso;
        }
        public void setPeso(float peso){
         this.peso = peso;
        }
        ///////////////////
        public String getCor(String cor){
         return cor;
        }
        public void setCor(String cor){
         this.cor = cor;
        }
    }
