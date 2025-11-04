public class Menu {
  
  private ArrayList<Cafe> itens;
  
  public Menu(ArrayList<Cafe> ITENS)
  {
    this.itens = ITENS;
  }

  public void AddItem(Cafe cafe)
  {
    itens.add(cafe);
  }
}