package org.example;




import java.util.Scanner;

import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setDni("33");
        p.setNombre("Pepe");
        p.setApellidos("Sanchez");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la palabra para adivinar:");
        String palabra = scanner.nextLine();

        Ahorcado ahorcado = new Ahorcado(palabra);



        while (ahorcado.getIntentosRestantes() > 0 && !ahorcado.adivino()) {
            System.out.println("Palabra a adivinar: " + ahorcado.getPalabraAdivinada());
            System.out.println("Intentos restantes: " + ahorcado.getIntentosRestantes());
            System.out.println("Introduce una letra:");
            char letra = scanner.nextLine().charAt(0);




            try {
                ahorcado.intentar(letra);
            } catch (AhorcadoException e) {
                System.out.println(e.getMessage());
            }
        }

        if (ahorcado.adivino()) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + ahorcado.getPalabraAdivinar());
        } else {
            System.out.println("Lo siento, no has adivinado la palabra: " + ahorcado.getPalabraAdivinar());

        }

        scanner.close();
    }
}
