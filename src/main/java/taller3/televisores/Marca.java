package taller3.televisores;

public final class Marca { // Clase inmutable
    private final String nombre; // Atributo final

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}