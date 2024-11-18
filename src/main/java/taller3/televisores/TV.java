package taller3.televisores;

class TV { // Cambiado a default 
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;

    TV(Marca marca, boolean estado) { // Cambiado a default 
        this.marca = marca;
        this.estado = estado;
        incrementarNumTV();
    }

    public Marca getMarca() {
        return this.marca;
    }

    public int getCanal() {
        return this.canal;
    }

    public int getPrecio() {
        return this.precio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public Control getControl() {
        return this.control;
    }

    public boolean getEstado() {
        return this.estado;
    }

    void setPrecio(int precio) { // Cambiado a default 
        this.precio = precio;
    }

    void setControl(Control control) { // Cambiado a default 
        this.control = control;
    }

    static int getNumTV() {
        return numTV;
    }

    private static void incrementarNumTV() { // Método privado para modificar el contador
        numTV++;
    }

    void turnOn() { // Cambiado a default 
        this.estado = true;
    }

    void turnOff() { // Cambiado a default 
        this.estado = false;
    }

    void setCanal(int canal) { // Cambiado a default 
        if (this.estado && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }

    void setVolumen(int volumen) { // Cambiado a default 
        if (this.estado && volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    void canalUp() { // Cambiado a default 
        if (this.estado && this.canal < 120) {
            this.canal++;
        }
    }

    void canalDown() { // Cambiado a default 
        if (this.estado && this.canal > 1) {
            this.canal--;
        }
    }

    void volumenUp() { // Cambiado a default 
        if (this.estado && this.volumen < 7) {
            this.volumen++;
        }
    }

    void volumenDown() { // Cambiado a default 
        if (this.estado && this.volumen > 0) {
            this.volumen--;
        }
    }
}