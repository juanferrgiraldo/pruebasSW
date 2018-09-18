package main.shape;

public class CheckCuadrilateralType {

    public boolean isSquare(int a, int b, int c, int d) {
        if(a == b && b == c && c == d) {
            return true;
        }
        return false;
    }

    public boolean isRectangle(int a, int b, int c, int d) {
        if(a == b && c == d) {
            return true;
        } else if(a == c && b == d) {
            return true;
        } else if(a == d && b == c) {
            return true;
        }
        return false;
    }

    /*public boolean isTrapeze(int a, int b, int c, int d) {

    }*/
}
