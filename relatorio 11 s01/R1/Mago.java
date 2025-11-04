public class Mago extends Personagem{

  private String magia;
  
  public Mago(String NOME, Integer IDADE, String MAGIA)
  {
    super(NOME, IDADE);
    this.magia = MAGIA;
  }
  
  public String LancarFeitico()
  {
    System.out.println(magia);
  }

}