package org.example;

public class Juego {
    private int intentosRestantes;
    private EstadoAhorcado estadoAhorcado;

    public Juego() {
        this.intentosRestantes = 6;
        this.estadoAhorcado = EstadoAhorcado.INICIAL;
    }

    public boolean intentoFallido() {
        if (intentosRestantes > 0) {
            intentosRestantes--;
            estadoAhorcado = EstadoAhorcado.values()[EstadoAhorcado.values().length - intentosRestantes - 1];
            System.out.println(estadoAhorcado);
            return true;
        }
        return false;
    }


    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public void reducirIntentosRestantes() {
        intentosRestantes--;
    }
}
