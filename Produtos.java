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
    int largura;
    int altura;
    float profundidade;
    int peso ;
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
    public int getIdUsuariio(){
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }



}
