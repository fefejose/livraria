public class Livro {
  //atributos
    // + titulo : string
    // + -> Modificador de acesso (public)
    // titulo -> nome do atributo
    public String titulo;
    public String autor;
    public Editora editora;
    public String resumo;
    public String tipoCapa;
    public double  valor;
    public int paginas;

public void  exibirDadosLivro(){

  System.out.println("----------");
  System.out.println("Nome:" + titulo);
  System.out.println("Resumo :" + resumo);
  System.out.println("Preço :" + valor);
  System.out.println("Paginas :" + paginas);
  if (temEditora()==true)
  System.out.println("Editora :" + editora.nome);

}
public  boolean temEditora(){
  if (editora == null)
    return false;
  else
    return true;


}
    //Métodos
}