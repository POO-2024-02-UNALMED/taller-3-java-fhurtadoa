package taller3.televisores;

class Control { // Cambiado a default (package-private)
    private TV tv;

    void enlazar(TV tv) { // Cambiado a default (package-private)
        this.tv = tv;
        tv.setControl(this);
    }

    TV getTv() { // Cambiado a default (package-private)
        return this.tv;
    }

    void setTv(TV tv) { // Cambiado a default (package-private)
        this.tv = tv;
    }

    void turnOn() { // Cambiado a default (package-private)
        if (this.tv != null) {
            this.tv.turnOn();
        }
    }

    void turnOff() { // Cambiado a default (package-private)
        if (this.tv != null) {
            this.tv.turnOff();
        }
    }

    void canalUp() { // Cambiado a default (package-private)
        if (this.tv != null) {
            this.tv.canalUp();
        }
    }

    void canalDown() { // Cambiado a default (package-private)
        if (this.tv != null) {
            this.tv.canalDown();
        }
    }

    void volumenUp() { // Cambiado a default (package-private)
        if (this.tv != null) {
            this.tv.volumenUp();
        }
    }

    void volumenDown() { // Cambiado a default (package-private)
        if (this.tv != null) {
            this.tv.volumenDown();
        }
    }

    void setCanal(int canal) { // Cambiado a default (package-private)
        if (this.tv != null) {
            this.tv.setCanal(canal);
        }
    }

    void setVolumen(int volumen) { // Cambiado a default (package-private)
        if (this.tv != null) {
            this.tv.setVolumen(volumen);
        }
    }
}