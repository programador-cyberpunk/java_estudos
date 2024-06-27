

//atributos dessa porra
public class carro {
 public String marca;
 public int ano;
 public int marcha;
 public boolean ligado;
 public int velocidade;
 public boolean freio;
 
/// metodos dessa porra

public void ligar () {
	if(this.ligado == false) {
   this.ligado = true;
	}else {
	System.out.println("carro já está ligado");
	
}

}
	
public void desligar () {
	if(this.ligado == true){
	this.ligado = false;
	System.out.println("Carro desligado");
	}else {
		System.out.println("Carro nao esta ligado");
	}
}

public void trocaMarcha () {
	
	this.marcha = this.marcha + 1;
}
public void acelerar (int velocidade) {
	if(this.marcha == 0) {
		
	}else if(this.marcha == 1){
		if(velocidade < 30){
			this.velocidade = velocidade;
			System.out.println(this.velocidade);
	}else if(this.marcha ==2){
	 if(velocidade < 50) {
		 this.velocidade = velocidade;
		 System.out.println(this.velocidade);
	 }else if(this.marcha == 3){
		 if(velocidade < 80) {
			 this.velocidade = velocidade;
			 System.out.println(this.velocidade);
		 }
	 }
	}
	}
	if(this.ligado == true) {
	if(this.freio ==  false) {	
	this.velocidade = velocidade;
	System.out.println(this.velocidade);
	}
	}
}
}