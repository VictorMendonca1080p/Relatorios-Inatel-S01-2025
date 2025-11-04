public class Cafe {

  public String nome;
  public Double precoBase;
  
  public Cafe(String NOME, Double PRECO)
  {
    this.nome = NOME;
    this.precoBase = PRECO;
  }
  
  public Double calcularPreco()
  {
    System.out.println(precoBase);
  }

}