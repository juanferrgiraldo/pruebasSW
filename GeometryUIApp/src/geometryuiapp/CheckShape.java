package geometryuiapp;

import java.util.Scanner;

public class CheckShape {
    Scanner sc = new Scanner(System.in);
    CheckCuadrilateralType ct = new CheckCuadrilateralType();
    CheckTriangleType tt = new CheckTriangleType();

    public String isTriangle(int[] sidesVec) {

            if (tt.isEquilateral(sidesVec[0], sidesVec[1], sidesVec[2]) != false) {
                return "equilátero";
            } else if (tt.isIsosceles(sidesVec[0], sidesVec[1], sidesVec[2]) != false) {
                return "isósceles";
            } else if (tt.isScalene(sidesVec[0], sidesVec[1], sidesVec[2]) != false) {
                return "escaleno";
            }
            return "";
    }

    public String isCuadrilateral(int[] sidesVec) {        

        if(ct.isSquare(sidesVec[0], sidesVec[1], sidesVec[2], sidesVec[3]) != false) {
            return "cuadrado";
        } else if(ct.isRectangle(sidesVec[0], sidesVec[1], sidesVec[2], sidesVec[3]) != false) {
            return "rectángulo";
        } else if(ct.isIrregularCuadrilateral(sidesVec[0], sidesVec[1], sidesVec[2], sidesVec[3]) != false) {
            return "cuadrilátero irregular";
        } else if(ct.isTrapezoid(sidesVec[0], sidesVec[1], sidesVec[2], sidesVec[3]) != false) {
            return "trapezoide";
        }
        return "";
    }

    public int[] fillSides(int sides) {
        int[] sidesVec = new int[sides];
        System.out.println("Por favor ingrese el tamaño de cada lado: ");
        try {
            for (int i = 0; i < sides; i++) {
                System.out.print("Lado " + (i+1) + ": ");
                sidesVec[i] = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Solo se permite el ingreso de números enteros.");
        }
        return sidesVec;
    }
}