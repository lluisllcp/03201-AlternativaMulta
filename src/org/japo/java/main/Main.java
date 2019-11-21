/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

//REFERENCIAS
        final double IMPORTE_MULTA = 60.0;
        final int TIPO_DESCUENTO = 20;
        final int DIAS_DESCUENTO = 30;

//variables auxiliares
        double importeFinal = 0;
        double importeDecto = 0.0;
        int diasDemora;
        boolean testOK;

        try {
            //cabecera
            System.out.println("Alternativa de Multa");
            System.out.println("====================");

            //introduccion dato
            System.out.printf("Dias de demora ............: ");
            diasDemora = SCN.nextInt();

            //separador
            System.out.println("---");

            //comparacion
            testOK = diasDemora <= DIAS_DESCUENTO;

            //CALCULA EL DESCUENTO
            if (testOK) {
                importeDecto = IMPORTE_MULTA * TIPO_DESCUENTO / 100;

            }
//Calcula el importe final

            importeFinal = IMPORTE_MULTA - importeDecto;

//muestra importe multa
            System.out.printf(Locale.ENGLISH, "Importe inicial multa .....: %.2f €%n", IMPORTE_MULTA);
            System.out.println("---");
            System.out.printf("Plazo con descuento .......: %d días%n", DIAS_DESCUENTO);
            System.out.printf("Tanto descuento....: %d %%%n", TIPO_DESCUENTO);

            System.out.println("---");

            System.out.printf(Locale.ENGLISH, "importe final multa...: %.2f €%n", importeFinal);

        } catch (Exception e) {

            System.out.println("---");
            System.out.println("Entrada erronea");

        }

    }

}
