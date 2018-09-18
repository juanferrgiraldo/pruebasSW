package main;

import main.shape.CheckShape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CheckShape shape = new CheckShape();
        int sides = 0, option = 1;
        String triangleType, cuadrilateralType;
        Scanner sc = new Scanner(System.in);


        do {
            try{
                System.out.print("Por favor ingrese 1 para continuar o una tecla diferente para terminar: ");
                option = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Has salido del programa");
                System.exit(0);
            }
            if(option == 1) {
                try {
                    System.out.print("Por favor ingrese el total de lados de la figura: ");
                    sides = sc.nextInt();
                    while(sides != 3 || sides != 4) {
                        System.out.print("El número de lados ingresado no es permitido, por favor ingrese un valor igual a 3 o 4: ");
                        sides = sc.nextInt();
                    }
                } catch (Exception e) {
                    System.out.println("Salí");
                }
                if(sides == 3) {
                    triangleType = shape.isTriangle(sides);
                    System.out.println("La figura es un triángulo " + triangleType);
                } else if (sides == 4) {
                    cuadrilateralType = shape.isCuadrilateral(sides);
                    System.out.println("La figura es un " + cuadrilateralType);
                }

            } else {
                return;
            }
        } while(option == 1);


    }
}
