package projetopessoas;

public class Aluno extends Pessoa{
    private int mat;
    private String curso;

    public static void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
