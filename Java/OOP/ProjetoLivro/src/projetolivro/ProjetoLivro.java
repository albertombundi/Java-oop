package projetolivro;

public class ProjetoLivro {
   public static void main(String[] args){
      Pessoa[] p = new Pessoa[2];
      Livro[] l = new Livro[3];

      p[0] = new Pessoa(" Alberto Soneha Mbundi ",21, " M ");

      p[1] = new Pessoa(" Daniela Dias ", 20, " F ");


      l[0] = new Livro(" Questionando a nossa existencia ", " Alberto Mbundi ", 300, p[0]);

      l[1] = new Livro(" A vida como um todo ", " João Ribeiro ", 500, p[1]);

      l[2] = new Livro("Inteligencia Natural ", " Daniela Assíria ", 800, p[0]);

      l[0].abrir();
      l[0].folhear(100);
      l[0].avancarPag();
      System.out.println(l[0].detalhes());

      System.out.print("\n");

      System.out.println(l[1].detalhes());
   }

}
