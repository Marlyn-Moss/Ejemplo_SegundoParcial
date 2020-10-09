package Entidades;

public class objeto {

    private String nombre;
    private int intentos;
    private int dificultad;

    public objeto(String nombre, int intentos, int dificultad) {
        this.nombre = nombre;
        this.intentos = intentos;
        this.setDificultad(dificultad);

    }


    public objeto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
}


