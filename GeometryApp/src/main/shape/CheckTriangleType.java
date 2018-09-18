package main.shape;

public class CheckTriangleType {
    public boolean isEquilateral(int a, int b, int c) {
        if(a == b && b == c) {
            return true;
        }
        return false;
    }

    public boolean isIsosceles(int a, int b, int c) {
        if(a == b && c != b) {
            return true;
        } else if (b == c && a != c) {
            return true;
        } else if(a == c && b != c) {
            return true;
        }
        return false;
    }

    public boolean isScalene(int a, int b, int c) {
        if(a != b && b != c){
            return true;
        }
        return false;
    }
}
