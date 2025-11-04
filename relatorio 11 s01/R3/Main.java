import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      
      Youkai espirito = new Youkai("vinicius", "Tailandia", new poder("fogo"));
      Alien verdinho = new Alien("marcelo", "Mandalor", "Cl4747");
      
      registros equipe = new registros("equipe1");
      
      equipe1.RegistrarAvistamento(espirito, "vinicius");
      equipe1.RegistrarAvistamento(verdinho, "marcelo");
  }
}