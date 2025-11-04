import java.util.*;

public class Castelo {

  public String nome;
  
  private ArrayList<Divisao> divisoes
  
  public Castelo(String NOME, ArrayList<Divisao> DIVISOES)
  {
    this.nome = NOME;
    this.divisoes = DIVISOES;
  }

  public void AddDivisao(Divisao new_divisao)
  {
    divisoes.add(new_divisao);
  }



}