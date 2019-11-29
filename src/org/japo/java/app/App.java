/*
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
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
package org.japo.java.app;

import java.util.Random;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public final class App {

    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

    //Datos
    public static final int N1;
    public static final int N2;

    static {
        //Random

        final Random RND = new Random();

        //Constantes
        final int NUM_MAX = 10;
        final int NUM_MIN = 1;

        //Valores > constantes
        N1 = RND.nextInt(NUM_MAX - NUM_MIN + 1) + NUM_MIN;
        N2 = RND.nextInt(NUM_MAX - NUM_MIN + 1) + NUM_MIN;

    }

    public final void launchApp() {

        System.out.printf("OPERACIÓN NUMÉRICA %n======================%n"
                + "Número 1 ....: %d%n "
                + "Número 2 .....: %d%n ---%n"
                + "el mayor es .: %d%n", N1, N2, (int) operar(N1, N2, OP_MAY));

    }

    public final double operar(double n1, double n2, int op) {
        double result = 0;

        switch (op) {

            case OP_SUM:
                result = n1 + n2;
                break;
            case OP_RES:
                result = n1 - n2;
                break;
            case OP_MUL:
                result = n1 * n2;
                break;
            case OP_DIV:
                result = n1 / n2;
                break;
            case OP_MOD:
                result = n1 % n2;
                break;
            case OP_MED:
                result = (n1 + n2) / 2;
                break;
            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                break;
            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                break;

        }

        return result;

    }

}
