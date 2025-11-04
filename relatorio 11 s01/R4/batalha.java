public class batalha {

  private HashMap<String, Boss> arena;
  
  public batalha(HashMap<String, Boss> ARENA)
  {
    this.arena = ARENA;
  }
  
  public void addBoss(Boss newBoss)
  {
    arena.add(newBoss);
  }

  public void iniciarBatalha(String BossID)
  {
    
  }
}