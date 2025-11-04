public class entidade implements Interface {

  public String nome;
  private String localizacao;
  
  public entidade(String NOME, String LOCAL)
  {
    this.nome = NOME; 
    this.localizacao = LOCAL;
  }

  @Override
  public String obterCoordenadas()
  {
    System.out.println(this.localizacao);
  }
}