import java.util.Scanner;

public class Menu  {
    public void showMenu(){


        Scanner sc = new Scanner(System.in);

        System.out.println("Menú:");
        System.out.println("1. Calcular área del cuadrado o rectangulo");
        System.out.println("2. Calcular perímetro cuadrado o rectangulo");
        System.out.println("3. Calcular hipotenusa del cuadrado o rectangulo");
        System.out.print("Ingrese su opción: ");
        int opcion = sc.nextInt();

        double alto = 0, ancho = 0;

        if (opcion <= 3) {
            System.out.print("Ingrese el alto: ");
            alto = sc.nextDouble();
            System.out.print("Ingrese el ancho: ");
            ancho = sc.nextDouble();
        } else {
            System.out.print("Ingrese una opción valida: ");
        }

        FiguraGeometrica figura;
        if (opcion == 3) {
            figura = new Rectangulo(alto, ancho);
        } else {
            figura = new FiguraGeometrica(alto, ancho);
        }

        double resultado;
        switch (opcion) {
            case 1:
                resultado = figura.calcularArea();
                System.out.println("El área es: " + resultado);
                break;
            case 2:
                resultado = figura.calcularPerimetro();
                System.out.println("El perímetro es: " + resultado);
                break;

            case 3:
                if (figura instanceof Rectangulo) {
                    resultado = ((Rectangulo) figura).calcularHipotenusa();
                    System.out.println("La hipotenusa es: " + resultado);
                } else {
                    System.out.println("La opción de calcular hipotenusa");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }




    }
}


