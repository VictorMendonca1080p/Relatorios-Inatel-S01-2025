public class registros {

  public String nomeEquipe;
  private HashMap<entidade, String> avistamentos;
  
  public registros(String NOME)
  {
    this.nomeEquipe = NOME;
  }
  
  public Boolean RegistrarAvistamento(entidade Entidade, String nome)
  {
    if(avistamentos.add(Entidade, nome))
    {
      return true;
    }
    else 
    {
      return false;
    }
  }

}