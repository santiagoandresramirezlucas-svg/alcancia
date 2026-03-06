import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   //Desarrollar un arlgoritmo que permita simular el funcionamiento de una alcancia, en dicha alcancia se pueden gaurdar monedas  las siguientes denominaciones:
        //20, 50, 100, 200, 500 y 1000 no se pueden guardar billetes ni monedas de otras denominaciones.
        //Al dueño de la alcancia le parece util conocer cuanto dinero tiene ahorrado sin romper la alcancia,
        // es mas él quiere saber cuantas monedas tiene de cada denominacion y cual es el monto acumulado de cada una de ellas

        //El sistema debe contar con un menú de interaccion que permita:
        //1. Agregar monedas de cada una de las denominaciones
        //2. Contar cuantas monedas de cada denominacion
        //3. Indagar cual es el valor acumulado por cada una de las denominaciones
        //4. Calcualr el valor total de dinero ahorrado
        //5. Establecer una meta de ahorro mostrando el progreso

        Scanner lector = new Scanner(System.in);

        boolean menor = true;

        int moneda1 = 20;
        int moneda2 = 50;
        int moneda3 = 100;
        int moneda4 = 200;
        int moneda5 = 500;
        int moneda6 = 1000;

        int hacer = 0;
        int hechar;
        int meta = 0;
        int total = 0;
        int ahorrado;

        int den1=0;
        int den2=0;
        int den3=0;
        int den4=0;
        int den5=0;
        int den6=0;

        int sumaden1 = 0;
        int sumaden2 = 0;
        int sumaden3 = 0;
        int sumaden4 = 0;
        int sumaden5 = 0;
        int sumaden6 = 0;

        //Meta
        System.out.println("Establecer una meta de ahorro mayor o igual a 20: ");
        meta = lector.nextInt();

        while (hacer != 6){
        //Menu
        System.out.println("Esciba:\n1. Ahorrar\n2. Contar monedas de cada denominacion\n3. Monto por cada denominación" +
                "\n4. Monto total\n5. Mostrar meta de ahorro\n6. salir");

        //Acciones
        hacer = lector.nextInt();
        switch (hacer) {
            case 1:
                System.out.println("Opciones para agregar monedas:\n1). 20\n2). 50\n3). 100\n4). 200\n5). 500\n6). 1000\n");
                hechar = lector.nextInt();
                if (hechar == 1) {
                    if( (total+20) <= meta) {
                        den1 += 1;
                        total += 20;
                        sumaden1 = den1 * moneda1;
                        ahorrado = meta - total;
                        System.out.println("Faltan: " + ahorrado + " para alcanzar la meta");
                    }else{
                        System.out.println("Hechar una moneda de menos valor");
                    }
                } else if (hechar == 2) {
                    if( (total+50) <= meta) {
                        den2 += 1;
                        total += 50;
                        sumaden2 = den2 * moneda2;
                        ahorrado = meta - total;
                        System.out.println("Faltan: " + ahorrado + " para alcanzar la meta");
                    }
                    else{
                        System.out.println("Hechar una moneda de menos valor");
                    }
                } else if (hechar == 3) {
                    if( (total+100) <= meta) {
                        den3 += 1;
                        total += 100;
                        sumaden3 = den3 * moneda3;
                        ahorrado = meta - total;
                        System.out.println("Faltan: " + ahorrado + " para alcanzar la meta");
                    }
                    else{
                        System.out.println("Hechar una moneda de menos valor");
                    }
                } else if (hechar == 4) {
                    if( (total+200) <= meta) {
                        den4 += 1;
                        total += 200;
                        sumaden4 = den4 * moneda4;
                        ahorrado = meta - total;
                        System.out.println("Faltan: " + ahorrado + " para alcanzar la meta");
                    }
                    else{
                        System.out.println("Hechar una moneda de menos valor");
                    }
                }
                else if (hechar == 5) {

                    if( (total+500) <= meta) {
                        den5 += 1;
                        total += 500;
                        sumaden5 = den5 * moneda5;
                        ahorrado = meta - total;
                        System.out.println("Faltan: " + ahorrado + " para alcanzar la meta");
                    }
                    else{
                        System.out.println("Hechar una moneda de menos valor");
                    }
                } else if (hechar == 6) {
                    if( (total+1000) <= meta) {
                        den6 += 1;
                        total += 1000;
                        sumaden6= den6*moneda6;
                        ahorrado = meta - total;
                        System.out.println("Faltan: " + ahorrado + " para alcanzar la meta");
                    }else{
                        System.out.println("Hechar una moneda de menos valor");
                    }
                }
                else
                {
                    System.out.println("Opcion no existente");
                }
                break;
            case 2:
                System.out.println("Opciones para mostrar la cantidad de monedas:\n1). 20\n2). 50\n3). 100\n4). 200\n5). 500\n6). 1000\n");
                hechar = lector.nextInt();
                if (hechar == 1) {
                    System.out.println("La cantidad de monedas de 20 es: " + den1 +"\n");
                } else if (hechar == 2) {
                    System.out.println("La cantidad de monedas de 50 es: " + den2+"\n");
                } else if (hechar == 3) {
                    System.out.println("La cantidad de monedas de 100 es: " + den3+"\n");
                } else if (hechar == 4) {
                    System.out.println("La cantidad de monedas de 200 es: " + den4+"\n");
                } else if (hechar == 5) {
                    System.out.println("La cantidad de monedas de 500 es: " + den5+"\n");
                } else if (hechar == 6) {
                    System.out.println("La cantidad de monedas de 1000 es: " + den6+"\n");
                }
                break;
            case 3:
                System.out.println("Opciones para mostrar la suma de monedas:\n1). 20\n2). 50\n3). 100\n4). 200\n5). 500\n6). 1000\n");
                hechar = lector.nextInt();
                if (hechar == 1) {
                    System.out.println("La suma de monedas de 20 da: " + sumaden1+"\n");
                } else if (hechar == 2) {
                    System.out.println("La suma de monedas de 50 da: " + sumaden2+"\n");
                } else if (hechar == 3) {
                    System.out.println("La suma de monedas de 100 da: " + sumaden3+"\n");
                } else if (hechar == 4) {
                    System.out.println("La suma de monedas de 200 da: " + sumaden4+"\n");
                } else if (hechar == 5) {
                    System.out.println("La suma de monedas de 500 da: " + sumaden5+"\n");
                } else if (hechar == 6) {
                    System.out.println("La suma de monedas de 1000 da: " + sumaden6+"\n");
                }
                break;
            case 4:
                System.out.println("Tiene un total de: " + total + " en su alcancia");
                break;
            case 5:
                System.out.println("Su meta es: " +  meta);
                break;
        }
        if (meta==total){
            System.out.println("Meta alcanzada");
            while(hacer != 2){
                System.out.println("Escribir:\n1. Mostrar total\n2. Salir");
                hacer= lector.nextInt();
                if(hacer==1){System.out.println("Total: " + total);}
            }
            break;
        }
    }


    }
}