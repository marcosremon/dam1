import java.lang.reflect.Array;
import java.time.Year;
import java.util.*;
import java.text.DecimalFormat;

public class Ejercicios_UD2_01 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Ejercicio: ");
            int ej = scanner.nextInt();
            scanner.nextLine();

            switch (ej) {
                case 1 -> ej1();
                case 2 -> ej2();
                case 3 -> ej3();
                case 4 -> ej4();
                case 5 -> ej5();
                case 6 -> ej6();
                case 7 -> ej7();
                case 8 -> ej8();
                case 9 -> ej9();
                case 10 -> ej10();
                case 11 -> ej11();
                case 12 -> ej12();
                case 13 -> ej13();
                case 14 -> ej14();
                case 15 -> ej15();
                case 16 -> ej16();
                case 17 -> ej17();
                case 18 -> ej18();
                case 19 -> ej19();
                case 20 -> ej20();
                case 21 -> ej21();
                case 22 -> ej22();
                case 23 -> ej23();
                case 24 -> ej24();
                case 25 -> ej25();
                case 26 -> ej26();
                case 27 -> ej27();
                case 28 -> ej28();
                case 29 -> ej29();
                case 30 -> ej30();
                case 31 -> ej31();
                case 32 -> ej32();
                case 33 -> ej33();
                case 34 -> ej34();
                case 35 -> ej35();
                case 36 -> ej36();
                case 37 -> ej37();
                case 38 -> ej38();
                default -> System.out.println("Ejercicio no válido");
            }

            System.out.print("\n¿Continuar? [y/n] ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 1:
    //Calcula la superficie y el perímetro de un cuadrado cuyo lado pediremos por teclado.

    private static void ej1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("elije el lado de un cuadrado");
        int lado = scanner.nextInt();

        int perimetro = lado*4;
        int area = lado*2;

        System.out.println("el area del cuadrado es: " + area + "\nel perimetro del cuadrado es: " + perimetro);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio2:
    //Calcula la superficie y el perímetro de un rectángulo cuyos datos pediremos por teclado.

    private static void ej2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("de la altura de un rectangulo:");
        int altura = scanner.nextInt();
        System.out.println("de la base del rectangulo:");
        int base = scanner.nextInt();

        int perimetro = base*2 + altura*2;
        int area = base * altura;

        System.out.println("el area del rectangulo es " + area + "\nel perimetro del rectangulo es " + perimetro);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Calcula el área y la circunferencia de un círculo cuyo radio se debe preguntar al usuario.

    private static void ej3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime el radio de un circulo:");
        double radio = scanner.nextDouble();

        double area = Math.PI*(Math.pow(radio,2));
        double circunferencia = 2 * Math.PI * radio;

        System.out.println("el area del circulo es: " + area + "\nla circunferencia del circulo es: " + circunferencia);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
    //Diseña un algoritmo que calcule la media de tres números que pediremos al usuario. Se deben dar dos resultado:
    //la media con decimales y redondeada

    private static void ej4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos numeros quiere poner");
        int cantidadDeNumeros = scanner.nextInt();
        double suma = 0;
        for (int i = 1; i < cantidadDeNumeros+1; i++) {
            System.out.println("dime el numero " + i);
            double numero = scanner.nextDouble();
            suma += numero;
        }
        int mediaSinDecimales = (int) suma;
        System.out.println("la media es: " + suma/cantidadDeNumeros + "\nla media sin decimales es: "
                + mediaSinDecimales/cantidadDeNumeros);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 5:
    //Determinar si un número leído por teclado es positivo o negativo

    private static void ej5() {
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("el numero es negativo");
        } else System.out.println("el numero es positivo");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 6:
    //Calcula la raíz cuadrada de un número que pedimos por teclado,
    //teniendo la precaución de que el número no sea negativo; en este caso se debe informar de que la
    //operación no es posible.

    private static void ej6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime un numero y calcularemos su raiz cuadrada");
        double numero = scanner.nextDouble();

        double raizcuadrada = Math.sqrt(numero);

        System.out.println("la raiz cuadrada de: " + numero + " es " + raizcuadrada);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 7:
    //Determinar si un año pedido por teclado es bisiesto o no. (para determinarlo usar:

    //PASO1: Si el año es divisible por 4, vaya al paso 2. De lo contrario, vaya al paso 5.
    //PASO2: Si el año es divisible por 100, vaya al paso 3. De lo contrario, vaya al paso 4.
    //PASO3: Si el año es divisible por 400, vaya al paso 4. De lo contrario, vaya al paso 5.
    //PASO4: El año es un año bisiesto (tiene 366 días). true
    //PASO5: El año no es un año bisiesto (tiene 365 días).) false

    private static void ej7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime un año y te digo si es bisiesto");
        int anyo = scanner.nextInt();

        if (anyo % 4 == 0) {
            if (anyo % 100 == 0) {
                if (anyo % 400 == 0) {
                    System.out.println("el año " + anyo + " es bisiesto");
                } else System.out.println("el año " + anyo + " no es bisiesto");
            } else System.out.println("el año " + anyo + " es bisiesto");
        } else System.out.println("el año " + anyo + " no es bisiesto");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 8:
    //determinar si un número real pedido por teclado tiene decimales o no.

    private static void ej8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime un numero real");
        double numeroreal = scanner.nextDouble();

        if (numeroreal % 1 != 0) {
            System.out.println("tiene decimales");
        } else System.out.println("no tiene decimales");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 9:
    //Leídos dos números por teclado, restar al mayor el menor. Por ejemplo, sí A=9 y B=3 entonces se debe mostrar:
    //"El primero es mayor y la resta es 6.

    private static void ej9() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("dime el segundo numero");
        int numero2 = scanner.nextInt();

        if (numero1 != numero2) {
            if (numero1 > numero2) {
                int resta = numero1 - numero2;
                System.out.println("el primero es mayor y la resta es " + resta);
            } else {
                int resta = numero2 - numero1;
                System.out.println("el segundo es mayor y la resta es " + resta);
            }
        } else System.out.println("el numero: " + numero1 + " y el numero 2: " + numero2 + " son iguales");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 10:
    //Realiza un conversor de grados Centígrados a grados Farenheit. Nuestro algoritmo
    //debe poder hacer la conversión en ambos sentidos ºF = 9/8 * ºC + 32

    private static void ej10() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("elige entre grados farenheit o celsius [f/c] para cambiar a la otra medida");
        String medida = scanner.nextLine().toLowerCase();
        System.out.println("cuantos grados quieres en convertir a la otra medida");
        Double grados = scanner.nextDouble();

        if (medida.equals("f")) {
            double conversion = (grados - 32) / 1.8;
            System.out.println("tenias originalmente " + grados + " grados farenheit ahora tines " + conversion
                    + " grados celsius");
        } else {
            double conversion = (9/8) * grados + 32;
            System.out.println("tenias originalmente " + grados + " grados celsius ahora tines " + conversion
                    + " grados farenheit");
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 11:
    //Diseña un algoritmo que determine si tres números que pedimos por teclado están
    //ordenados de menor a mayor (NO consiste en ordenar, solo indicar si están ordenados o no).

    private static void ej11() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime el numero numero 1");
        Double numero1 = scanner.nextDouble();
        System.out.println("dime el numero numero 2");
        Double numero2 = scanner.nextDouble();
        System.out.println("dime el numero numero 3");
        Double numero3 = scanner.nextDouble();

        if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3) {
            System.out.println("estan ordenados de menor a mayor");
        } else System.out.println("no estan ordenados de menor a mayor");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 12:
    //Diseña un algoritmo parecido al anterior en el que se indique si tres números pedidos son consecutivos o no.

    private static void ej12() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime el numero numero 1");
        Double numero1 = scanner.nextDouble();
        System.out.println("dime el numero numero 2");
        Double numero2 = scanner.nextDouble();
        System.out.println("dime el numero numero 3");
        Double numero3 = scanner.nextDouble();

        if ((numero1 + 1 == numero2 && numero2 + 1 == numero3)||
                (numero1 - 1 == numero2 && numero2 - 1 == numero3)) {
            System.out.println("son numeros consecutrivos");
        } else System.out.println("no son numeros consecutivos");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 13:
    //Dados dos números enteros realizar el algoritmo que calcule el cociente y el resto mediante restas sucesivas.
    //Ejemplo: 18 : 4
    //Se irá restando 18-4 = 14; 14-4 = 10; 10-4 = 6; 6-4 = 2
    //Hasta que el resultado de la resta (2) es menor que el divisor (4).
    //Por lo tanto el cociente es elnúmero de restas que se han hecho (4)
    //y el resto es el valor de la última resta (2)

    private static void ej13() {
        int dividendo = 18;
        int divisor = 4;
        int resta = divisor + 1;
        int contador = 0;

        while (true) {
            if (divisor < resta) {
                resta = dividendo - divisor;
                contador++;
                dividendo -= 4;
            } else break;
        }
        System.out.println("el cociente de la resta es: " + contador + " y el resto de la division es: " + resta);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 14:
    //Determinar el número de cifras de un número de, como máximo, cinco cifras.
    //Ejemplos: 9560 debe indicar que tiene 4 cifras; -369 tiene 3 cifras.

    private static void ej14() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime un numero entero");
        int numero = scanner.nextInt();
        String numeroStr = String.valueOf(numero);
        int numeroDeCaracteres;

        if (numero >= 0) {
            numeroDeCaracteres = numeroStr.length();
        } else numeroDeCaracteres = numeroStr.length() - 1;
        System.out.println("el numero que indicaste tiene " + numeroDeCaracteres + " cifras");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 15:
    //Calcula cual es el mayor, menor y mediano de tres números que se piden por teclado.

    private static void ej15() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime el numero numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("dime el numero numero 2");
        int numero2 = scanner.nextInt();
        System.out.println("dime el numero numero 3");
        int numero3 = scanner.nextInt();

        int mayor1 = Math.max(numero1, numero2);
        int mayor2 = Math.max(mayor1, numero3);
        int menor1 = Math.min(numero1, numero2);
        int menor2 = Math.min(menor1, numero3);

        if (numero1 != mayor2 && numero1 != menor2) {
            int mediano = numero1;
            System.out.println("-------------------------------------");
            System.out.println(" el mayor es el numero " + mayor2 + " el mediano es el numero " + mediano +
                    " y el mediano es el numero " + menor2);
        } else if (numero2 != mayor2 && numero2 != menor2) {
            int mediano = numero2;
            System.out.println("-------------------------------------");
            System.out.println(" el mayor es el numero " + mayor2 + " el mediano es el numero " + mediano +
                    " y el mediano es el numero " + menor2);
        } else {
            int mediano = numero3;
            System.out.println("-------------------------------------");
            System.out.println(" el mayor es el numero " + mayor2 + " el mediano es el numero " + mediano +
                    " y el mediano es el numero " + menor2);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 16:
    //Dada una hora por teclado (horas, minutos y segundos) realiza un algoritmo que
    //muestre la hora después de incrementarle un segundo.

    private static void ej16() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime una hora");
        int hora = scanner.nextInt();
        System.out.println("dime una cantidad de minutos");
        int minutos = scanner.nextInt();
        System.out.println("cuantos segundos hay");
        int segundos = scanner.nextInt();
        System.out.println("vamos a sumar un segundo");
        segundos += 1;

        while (hora > 24 || minutos > 60 || segundos > 60) {
            System.out.println("hay un numero invalido vuelva a introducir los parametros pero de manera correcta");
            System.out.println("dime una hora");
            hora = scanner.nextInt();
            System.out.println("dime una cantidad de minutos");
            minutos = scanner.nextInt();
            System.out.println("cuantos segundos hay");
            segundos = scanner.nextInt();
            System.out.println("vamos a sumar un segundo");
            segundos += 1;
        }
        if (segundos == 60) {
            segundos = 0;
            minutos += 1;
            if (minutos == 60) {
                minutos = 0;
                hora += 1;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
        System.out.println("hora " + hora + " minuto " + minutos + " y " + segundos + " segundos");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 17:
    //Realiza un algoritmo que resuelva una ecuación de segundo grado.
    //el programa pedirá por teclado los tres coeficientes y mostrará las posibles soluciones:
    //No tiene solución, una única solución (y su valor) o dos soluciones (y sus valores).

    private static void ej17() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime el valor de a:");
        int valorA = scanner.nextInt();
        System.out.println("dime el valor de b:");
        int valorB = scanner.nextInt();
        System.out.println("dime el valor de c:");
        int valorC = scanner.nextInt();

        double interiorRaiz = Math.pow(valorB,2)-(4 * valorA * valorC);
        double raiz = Math.sqrt(interiorRaiz);
        double ecuacionSegundoGradoPositiva = (-valorB + raiz) / (2 * valorA);
        double ecuacionSegundoGradoNegativa = (-valorB - raiz) / (2 * valorA);
        if (interiorRaiz >= 0) {
            System.out.println("los resutados de la raiz cuadrada de segundo grado son: "
                    + ecuacionSegundoGradoPositiva + " " + ecuacionSegundoGradoNegativa);
        } else System.out.println("no se puede resolver por que da un numero negativo");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 18:
    //Determinar el precio de un billete de tren, conociendo la distancia a recorrer y sabiendo
    //que si el número de días de estancia es superior a 7 y la distancia superior a 800 km
    //el billete tiene una reducción del 30%. El precio por km es de 2,5 €.

    private static void ej18() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("cunatos km quieres recorrer");
        int km = scanner.nextInt();
        System.out.println("en cuantos dias?");
        int dias = scanner.nextInt();
        double precio = km * 2.5;

        if (km > 800 && dias > 7) {
            double descuento = precio * 0.3;
            System.out.println("has tenido un descuento de " + descuento + "€");
            precio -= descuento;
        }
        System.out.println("el precio final del viaje es de " + precio + "€");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 19:
    //Los empleados de una fábrica trabajan por turnos: diurno y nocturno. Se debe calcular
    //el jornal diario de acuerdo con los siguientes puntos:
    //- La tarifa por horas diurnas es de 20 €.
    //- La tarifa por horas nocturnas es de 35 €.
    //- Caso de ser domingo, la tarifa se incrementará en 10 € más para el turno diurno y 15 € más para el nocturno.

    private static void ej19() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("cuantas horas has trabajado");
        int horastrabajadas = scanner.nextInt();
        System.out.println("en que turno las has trabajado, nocturno o diurno [n/d]");
        String turno = scanner.nextLine();
        System.out.println("ese dia era domingo?[y/n]");
        String domingo = scanner.nextLine();
        turno.toLowerCase();
        domingo.toLowerCase();

        if (turno.equals("n") || turno.equals("nocturno")) {
            horastrabajadas *= 35;
            if (domingo.equals("y") || domingo.equals("si")) {
                horastrabajadas += 15;
            }
        } else if (turno.equals("d") || turno.equals("diurno")) {
            horastrabajadas *= 25;
            if (domingo.equals("y") || domingo.equals("si")) {
                horastrabajadas += 10;
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 20:
    //Dado el nombre (o número) de un mes y el año (comprobando si es o no bisiesto),
    //deducir el número de días del mes.

    private static void ej20() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> añobisiesto = Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        List<Integer> añoNoBisiesto = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        List<String> mesesNombre = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
                "agosto", "septiembre", "octubre", "noviembre", "diciembre");
        List<Integer> mesesNumero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        System.out.println("introduce un año");
        int año = scanner.nextInt();
        System.out.print("dime un mes, ¿como lo vas a introducir? [nombre/numero]: ");
        String eleccion = scanner.next().toLowerCase();
        boolean bisiesto;

        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    bisiesto = true;
                } else bisiesto = false;
            } else bisiesto = true;
        } else bisiesto = false;

        if (eleccion.equals("nombre")) {
            System.out.println("dime el nombre del mes");
            String mes = scanner.next();
            int valor = mesesNombre.indexOf(mes);
            if (bisiesto) {
                System.out.println("el mes: " + mes + " tiene " + añobisiesto.get(valor) + " dias.");
            } else System.out.println("el mes: " + mes + " tiene " + añoNoBisiesto.get(valor) + " dias.");
        } else if (eleccion.equals("numero")) {
            System.out.println("dime el numero del mes");
            int mes = scanner.nextInt();
            int valor = mesesNumero.indexOf(mes);
            if (bisiesto) {
                System.out.println("el mes: " + mes + " tiene " + añobisiesto.get(valor) + " dias.");
            } else System.out.println("el mes: " + mes + " tiene " + añoNoBisiesto.get(valor) + " dias.");
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 21:
    //Escribe todos los números pares entre 1 y 20.

    private static void ej21() {
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 22:
    //Suma todos los números impares que hay entre 1 y 20 mostrando el resultado al final.
    //Generaliza luego este ejercicio para dos números cualquiera pedidos por teclado, deberá ir del
    //menor al mayor.

    private static void ej22() {
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        System.out.println("la suma de todos los numeros impares desde 0 hasta el 20 da: " + suma);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 23:
    //Calcula el factorial de un número entero. El factorial es el resultado de multiplicar ese
    //número por todos los números menores que él. Ejemplo: 4! = 4*3*2*1 = 24.

    private static void ej23() {
        int numero = 4;
        int factorial = 1;
        for (int i = numero; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 24:
    //Calcula la media de diez números que pedimos por teclado. Generaliza la solución para
    //una cantidad cualquiera de números que pediremos al principio.

    private static void ej24() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("cuantos numeros quieres generar para saber su media");
        int cantidadDeNumeros = scanner.nextInt();
        double suma = 0;

        for (int i = 1; i < cantidadDeNumeros + 1; i++) {
            System.out.println("dime el numero numero " + i);
            double numero = scanner.nextDouble();
            suma += numero;
        }
        System.out.println("la media de los " + cantidadDeNumeros +
                " numeros que elegiste es " + suma/cantidadDeNumeros);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 25:
    //Calcula la media para una cantidad indefinida de números. El programa parará de pedir
    //números cuando se le introduzca un número negativo, en ese momento nos dará la media de
    //los números introducidos hasta ese momento y la cantidad de los mismos (sin incluir al
    //negativo que usamos para acabar).

    private static void ej25() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        while (true) {
            System.out.println("dime un numero:");
            double numero = scanner.nextDouble();
            if (numero > 0)  {
                contador += 1;
                suma += numero;
            } else break;
        }
        System.out.println("has introducido " + contador + " numeros antes de introducir un numero negativo a " +
                "si que la media de todos los numeros que introduciste es " + suma/contador );
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 26:
    //Mostrar el mensaje: "¿Desea terminar (s/n)?". El programa terminará cuando el
    //usuario teclee 's' o 'S'; en otro caso el programa continuará indefinidamente.

    private static void ej26() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("desea terminar?");
            String acabar = scanner.next();
            acabar = acabar.toLowerCase();
            if (acabar.equals("s")) {
                break;
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 27:
    //Diseña un algoritmo que pida números hasta que se le introduzca un número mayor que 100.

    private static void ej27() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("dime un numero");
            Double numero = scanner.nextDouble();
            if (numero > 100) {
                break;
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 28:
    //Piensa un algoritmo que pida números hasta que el número leído esté entre 1 y 5, en
    //ese momento se debe salir.

    private static void ej28() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("dime un numero");
            Double numero = scanner.nextDouble();
            if (numero >= 1 && numero <= 5) {
                break;
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 29:
    //Realiza un algoritmo que introducidas las notas de N alumnos nos indicará cuantos
    //aprobados y cuantos suspensos hay. Generaliza este ejercicio para una cantidad indefinida de
    //notas (pararemos con una nota negativa). Amplia el ejercicio indicando no solo cuantos
    //aprobados hay, también cuantos sobresalientes, notables, bienes, aprobados y suspensos.

    private static void ej29() {
        Scanner scanner = new Scanner(System.in);
        List<Double> aprobados = new ArrayList<>();
        List<Double> suspensos = new ArrayList<>();

        System.out.println("cuantos alumnos tienes");
        int numeroAlumnos = scanner.nextInt();
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("dime la nota de tu alumno numero: " + i);
            Double nota = scanner.nextDouble();
            if (nota > 0) {
                if (nota >= 5) {
                    aprobados.add(nota);
                } suspensos.add(nota);
            } break;
        }
        int nueroDeAprobados = aprobados.size();
        int nueroDeSuspensos = suspensos.size();
        System.out.println("el numero de aprobados es: " + nueroDeAprobados + " y el numero de suspensos es:" +
                nueroDeSuspensos);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 30:
    //Diseña el algoritmo que indique el mayor de una serie de números que introducimos por teclado.
    //Crea dos versiones: en la primera la cantidad está definida en la segunda será indefinida.

    private static void ej30() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una cantidad de números:");
        int cantidadDeNumeros = scanner.nextInt();
        double mayor = 0;

        for (int i = 0; i < cantidadDeNumeros; i++) {
            System.out.println("dime el numero " + (i + 1) + ":");
            double numero = scanner.nextDouble();
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El mayor número ingresado es: " + mayor);
    }


//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 31:
    //Determinar si un número introducido por teclado es primo o no. Un número primo
    //solo es divisible por él mismo y por la unidad.

    private static void ej31() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime un numero y te digo si es primo:");
        int numero = scanner.nextInt();
        if (esPrimo(numero)) {
            System.out.println("es primo");
        } System.out.println("no es primo");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 32:
    //Reutiliza el ejercicio anterior para mostrar los números primos que hay del 1 al 100.

    private static void ej32() {
        List<Integer> listaDePrimos = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            if (esPrimo(i)) {
                listaDePrimos.add(i);
            }
        }
        System.out.println("la lista de numeros primos del 0 al 100 es: " + listaDePrimos);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 33:
    //Genera una combinación al azar para la lotería primitiva. Los números de la lotería
    //son 6, comprendidos del 1 al 49. En esta versión no importa si se repite algún número.

    private static void ej33() {
        Random random = new Random();
        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int numeroAleatorio = random.nextInt(49) + 1;
            stringbuilder.append(numeroAleatorio + " ");
        }
        System.out.println(stringbuilder);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 34:
    //Genera combinaciones al azar para una quiniela de fútbol. Recordemos que son 15
    //resultados: 1, X y 2.

    private static void ej34() {
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            int numeroAleatorio1 = random.nextInt(1,3);
            int numeroAleatorio2 = random.nextInt(1,3);
            System.out.println(numeroAleatorio1 + " x " + numeroAleatorio2);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 35:
    //Reutiliza el ejercicio anterior: genera una apuesta al azar y unos resultados también
    //al azar; después indica cuantos aciertos se han producido.

    private static void ej35() {
        Random random = new Random();
        int contador = 0;

        System.out.println("los reultados de la apuesta son:");
        for (int i = 0; i < 15; i++) {
            int apuesta1 = random.nextInt(1,3);
            int apuesta2 = random.nextInt(1,3);
            int numeroAleatorio1 = random.nextInt(1,3);
            int numeroAleatorio2 = random.nextInt(1,3);
            System.out.println(numeroAleatorio1 + " x " + numeroAleatorio2);
            if (apuesta1 == numeroAleatorio1 && apuesta2 == numeroAleatorio2) {
                contador++;
            }
        }
        System.out.println("has tenido " + contador + " aciertos");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 36:
    //La calculadora. Diseña un algoritmo que pida dos números y un operador (una
    //operación aritmética básica: sumar, restar, multiplicar o dividir). Se debe mostrar el resultado
    //de dicha operación. Controla el posible error como la división por cero, en este caso se indicará
    //que no se puede realizar. El ejercicio se debe repetir indefinidamente hasta que el usuario
    //decida terminar.

    private static void ej36() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime el primer numero");
        Double numero1 = scanner.nextDouble();
        System.out.println("dime el segundo numero");
        Double numero2 = scanner.nextDouble();
        Double resultado;

        System.out.println("que quieres hacer: \n\t suma --> s \n\t resta --> r \n\t division --> d \n\t " +
                "multiplicacion --> m");
        String operacion = scanner.next().toLowerCase();
        if (operacion.equals("s")) {
            resultado = numero1 + numero2;
            System.out.println("el resultado de la suma es: " + resultado);
        } else if (operacion.equals("r")) {
            resultado = numero1 - numero2;
            System.out.println("el resultado de la resta es: " + resultado);
        } else if (operacion.equals("d")) {
            resultado = numero1 / numero2;
            System.out.println("el resultado de la division es: " + resultado);
        } else if (operacion.equals("m")) {
            resultado = numero1 * numero2;
            System.out.println("el resultado de la multiplicacion es: " + resultado);
        } else System.out.println("lo que introdujiste no esta contemplado");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 37:
    //Juego del número secreto. El ordenador 'pensará' un número del 1 al 100. El usuario
    //tendrá 5 intentos para averiguarlo. El programa le irá dando pistas del tipo mayor o menor. Al
    //final, pase lo que pase (gane o pierda), se le preguntará al usuario si quiere continuar.

    private static void ej37() {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        while (true) {
            for (int i = 1; i < 5; i++) {
                System.out.println("intento numero: " + i + "/5 para adivinar el numero");
                int adivinarNumero = scanner.nextInt();
                if (adivinarNumero == numeroAleatorio) {
                    System.out.println("felicidades has adivinado el numero");
                    numeroAleatorio = random.nextInt(100) + 1;
                    break;
                }
            }
            System.out.println("quieres continuar? [yes/no]");
            String continuar = scanner.next();
            if (continuar.toLowerCase().equals("no")) {
                break;
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 38:
    //Realiza un ejercicio en el que se muestre un menú que indique que ejercicio quiere
    //realizar: 23, 29, 31 o salir. El programa realizará esos ejercicios hasta que el usuario indique
    //que quiere salir

    private static void ej38() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ejercicio: ");
            int ej = scanner.nextInt();
            scanner.nextLine();

            switch (ej) {
                case 1 -> ej1();
                case 2 -> ej2();
                case 3 -> ej3();
                default -> System.out.println("Ejercicio no válido");
            }

            System.out.print("\n¿Continuar? [y/n] ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));
        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}