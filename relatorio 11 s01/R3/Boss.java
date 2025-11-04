public class Boss{

  public String nome;
  
  private String IDboss;
  private String PontoFraco;
  private LinkedHashSet<ataque> moveset;
  
  public Boss(String NOME, Integer ID, String PFRACO)
  {
    this.nome = NOME;
    this.IDboss = ID;
    this.PontoFraco = PFRACO;
  }
  
  public void AddATK(ataque newATK)
  {
    moveset.add(newATK);
  }
  
  public void iniciarFase()
  {
    
  }

}