public class CafeGourmet extends Cafe {
  
  public Double bonus;
  
  public CafeGourmet(String NOME, Double PRECO, Double BONUS)
  {
    super(NOME,PRECO);
    this.bonus = BONUS;
  }
  
  @Override
  public Double calcularPreco()
  {
    System.out.println(precoBase + bonus);
  }

}