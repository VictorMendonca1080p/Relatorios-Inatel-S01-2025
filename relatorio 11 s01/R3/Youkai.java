public class Alien extends entidade{

  public String nome;
  private String Planeta
  private String Ovini;
  
  public Alien(String NOME, String PLANETA, String OVINI)
  {
    super(NOME, PLANETA);
    this.Ovini = OVINI;
  }
  @Override
  public interface String obterCoordenadas()
  {
    System.out.println("esse Alien se encontra em: ",this.local);
  }
}