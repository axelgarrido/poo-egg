package Entidades;

public class Ahorcado {
    String[] palabra;
    int letrasEncontradas;
    int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int intentos) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
}
