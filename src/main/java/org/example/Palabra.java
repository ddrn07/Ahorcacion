package org.example;


public class Palabra {

    private String palabra;
    private boolean[] adivinado;

    public Palabra(String palabra) {
        this.palabra = palabra;
        this.adivinado = new boolean[palabra.length()];
    }

    public String getPalabra() {
        return palabra;
    }

    public boolean intentar(char letra) {
        boolean adivino = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra && !adivinado[i]) {
                adivinado[i] = true;
                adivino = true;
            }
        }
        return adivino;
    }

    public boolean adivinado() {
        for (boolean adivinado : adivinado) {
            if (!adivinado) {
                return false;
            }
        }
        return true;
    }

    public String getPalabraAdivinada() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            if (adivinado[i]) {
                sb.append(palabra.charAt(i));
            } else {
                sb.append("_");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
