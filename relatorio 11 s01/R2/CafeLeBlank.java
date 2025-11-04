public class CafeLeBlank {

  private Menu _menu;
  
  public CafeLeBlank(Menu MENU)
  {
    this._menu = MENU;
  }

  public void ReceberPedido(Cafe cafe)
  {
    System.out.println("seu ", cafe, "esta sendo feito");
  }
}