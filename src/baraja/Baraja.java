
package baraja;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {

  private List<Carta> lista;
  
  public Baraja()
  {
      Carta[] mazo = new Carta[52];
      int cuenta = 0; //numero de cartas
      
      for(Carta.Palo palo:Carta.Palo.values())
      {
          for(Carta.Cara cara : Carta.Cara.values())
          {
              mazo[cuenta] = new Carta(cara, palo);
              cuenta++;
          }
      }
      
      lista = Arrays.asList(mazo);
      Collections.shuffle(lista);
  }
  
  public void imprimirCartas()
  {
      for(int i = 0; i < lista.size(); i++)
      {
          System.out.printf("%-20s%s", lista.get(i),
                  ((i+1)%2==0?"\n":"\t"));
      }
  }
  
  public static void main(String []args)
  {
      Baraja cartas = new Baraja();
      cartas.imprimirCartas();
  }
    
}
