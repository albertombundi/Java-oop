package aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private  boolean status;

    // Métodos personalizados
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t =="CC") {
            this.setSaldo(50);
        } else if(t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta de "+this.getDono()+" aberta com sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("A conta de "+this.getDono()+" não pode ser fechada porque ainda tem dinheiro.");
        }else if (this.getSaldo() < 0){
            System.out.println("A conta de "+this.getDono()+" não pode ser fechada pois tem débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta de "+this.getDono()+" fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if(this.getStatus() == true){
//            this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de "+this.getDono());
        } else{
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }
    public void sacar(float v) {
        if(this.getStatus()) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }else {
                System.out.println("Saldo insuficiente para sacar valores na conta de "+this.getDono());
            }
        }else {
            System.out.println("Impossível sacar valores de uma cota fechada.");
        }
    }
    public void pagarMensalidade(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+this.getDono());
        }else{
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }

    // Métodos especiais
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }
}
