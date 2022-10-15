package futbol;

public class Jugador extends Futbolista{
    // Atributes
    public short golesMarcados;
    public byte dorsal;

    // Constructors

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        this.golesMarcados = 289;
        this.dorsal = 7;
    }


    // Methods
    @Override
    public boolean jugarConLasManos() {
        return false;
    }



    // toString
    @Override
    public String toString() {
        return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+dorsal+ ". Ha marcado "+golesMarcados;
    }

    @Override
    public int compareTo(Object o) {
        Futbolista f = (Futbolista) o;
        return Math.abs(this.getEdad() - f.getEdad());
    }
}
