package main;

import main.shape.CheckShape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CheckShape shape = new CheckShape();
        int sides = 0;
        String auxSides = "";
        String option = "";
        String triangleType, cuadrilateralType;
        Scanner sc = new Scanner(System.in);


        do {
            try{
                System.out.print("Por favor ingrese 1 para continuar o una tecla diferente para terminar: ");
                option = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Has salido del programa");
                System.exit(0);
            }
            if(option.equals("1")) {
                    System.out.print("Por favor ingrese el total de lados de la figura: ");
                    auxSides = sc.nextLine();
                System.out.println(auxSides);
                    while(auxSides.equals("3") == false && auxSides.equals("4") == false) {
                        System.out.print("El número de lados ingresado no es permitido, por favor ingrese un valor igual a 3 o 4: ");
                        auxSides = sc.nextLine();
                    }
                sides = Integer.parseInt(auxSides);
                if(sides == 3) {
                    triangleType = shape.isTriangle(sides);
                    System.out.println("La figura es un triángulo " + triangleType);
                } else if (sides == 4) {
                    cuadrilateralType = shape.isCuadrilateral(sides);
                    System.out.println("La figura es un " + cuadrilateralType);
                }

            } else {
                System.out.println("Has salido del programa");
                return;
            }
        } while(option.equals("1"));


    }
}
