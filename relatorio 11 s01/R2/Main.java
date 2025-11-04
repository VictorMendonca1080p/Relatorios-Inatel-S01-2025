import java.util.*;

public class Main {
    public static void main(String[] args) {
      Cafe cafeComum = new Cafe("cafe comum", 5.99);
      CafeGourmet cafePremium = new CafeGourmet("cafe premium", 10.30, 5.99);
      
       
      Menu menu = new Menu(new ArrayList<Cafe>[]);
      
      menu.AddItem(cafeComum);
      menu.AddItem(cafePremium);
      
      CafeLeBlank loja = new CafeLeBlank(menu);
      
      
      
      
      
      
      
      
      
  }
}