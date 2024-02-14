package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, float p) { // Este é o metodo Constructor()
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();

    }


    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("cor: " + this.cor);
        System.out.println("Tampada " + this.tampada);
    }
}
