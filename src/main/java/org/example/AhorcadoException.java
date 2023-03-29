package org.example;


public class AhorcadoException extends RuntimeException {
    public AhorcadoException(String mensaje) {
        super("Ahorcado Exception:" + mensaje);
    }
    public AhorcadoException() {
        super("Ahorcado Exception...");
    }
}