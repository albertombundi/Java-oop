package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma Caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampanda? " + this.tampada);
    }
    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        }else {
            System.out.println("Estou a rabiscar.");
        }
    }

    void tampar() {
        this.tampada = true; //verdadeiro /SIM
    }

    void destampar() {
        this.tampada = false; //falso /NÃO
    }
}
