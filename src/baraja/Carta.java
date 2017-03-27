
package baraja;

public class Carta {
    
    public static enum Cara {As, Dos, Tres, Cuatro, Cinco, Seis,
                             Siete, Ocho, Nueve, Diez, Joto, Quina, Rey};
    
    public static enum Palo {Bastos, Diamantes, Corazones, Espadas};
    
    private final Cara cara; //cara de la carta
    private final Palo palo;
    
    public Carta(Cara caraCarta, Palo paloCarta)
    {
        cara = caraCarta;
        palo = paloCarta;
    }
    
    public Cara obtenerCara()
    {
        return cara;
    }
    
    public Palo obtenerPalo()
    {
        return palo;
    }
    
    public String toString()
    {
        return String.format("%s de %s", cara, palo);
    }      
}

