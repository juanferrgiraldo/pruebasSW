package geometryuiapp;

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
    
    public boolean isIrregularCuadrilateral(int a, int b, int c, int d) {
        if (a != b && b != c && c != d && a != d && a != c && b != d) {
            return true;
        }
        return false;
    }
    
    public boolean isTrapezoid (int a, int b, int c, int d) {
        if(a == b && c != d) {
            return true;
        } else if(b == c && a != d) {
            return true;
        } else if(c == d && a != b) {
            return true;
        } else if(a == d && b != c) {
            return true;
        } else if(b == d && a != c) {
            return true;
        } else if(a == c && b != d) {
            return true;
        }
        return false;
    }
    
    

    /*public boolean isTrapeze(int a, int b, int c, int d) {
    }*/
}