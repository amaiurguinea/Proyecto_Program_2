package LP;

public class clsMenu {
    /**
     * Este es el menu con el que interactuaria el usuario para realizar su pedido
     * a traves de varias opciones que conllevara a pequeños menus hasta que elija la opcion de PAGAR
     * y se vayan efectuando otra serie de operaciones.
     */

    public static void MenuPrincipal(){

        int opcion = 0;

        System.out.println("Bienvenido");
        do {
            System.out.println("1.- Hamburguesas");
            System.out.println("2.- Bebidas");
            System.out.println("3.- Patatas");
            System.out.println();
            System.out.println("Elige una opcion: ");
            opcion = UtilidadesLP.leerEntero();


            switch (opcion) {
                case 1: opcion1();
                    break;
                case 2: opcion2();
                    break;
                case 3: opcion3();
                    break;
            }


        } while (opcion == '7');
        System.out.println("Adiós");

    }
    private static void opcion1() {

        System.out.println("1.- Big Chicken Supreme");
        System.out.println("2.- Big Chicken BBQ");
        System.out.println("3.- Big Creamy Cheese");
        System.out.println("4.- Big Double Cheese");
        System.out.println("5.- Atrás");
    }

    private static void opcion2() {

    }

    private static void opcion3() {

    }


}

