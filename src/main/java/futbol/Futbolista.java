package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
    // Attributes
    private String nombre;
    private int edad;
    private final String posicion;


    // Constructores
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    // Getter & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }


    // Methods

    public boolean equals (Futbolista f) {
        if (this.compareTo(f) == 0){return true;};
        return false;
    }

    public abstract boolean jugarConLasManos();


    @Override
    public String toString() {
        return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion();
    }

}
