package Servicios;

import java.util.Scanner;

public class MesSecretoServicios {


    String[] vectorMeses = {"enero", "febrero", "marzo", "abril", "mayo",
            "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    Scanner sc = new Scanner(System.in);

    public void adivinarMes() {

        String mes = vectorMeses[(int) (Math.random() * 12)];
        int intentos = 0;
        boolean acertado = false;
        System.out.println("Adivina el mes secreto");
        String mesIngresado = sc.next();

        do {
            if (!mesIngresado.equalsIgnoreCase(mes)) {
                System.out.println("No has acertado. Inténtalo de nuevo");
                mesIngresado = sc.next();
                intentos++;
            } else {
                System.out.println("Has acertado!");
                intentos += 2;
                acertado = true;
            }
        } while (intentos < 2);

        if (acertado) {
            System.out.println("Felicitaciones por haber acertado, el mes secreto era " + mes);
        } else {
            System.out.println("Lo siento, no has acertado, el mes secreto era " + mes);
        }


    }


}
