import analitic.NumarComplex;

public class TestNumereComplexe {
    public static void main (String[] args) {
        NumarComplex n = new NumarComplex();
        n.setReal(3);
        n.setImaginar(4);
        System.out.println("Modulul numarului complex este "+n.getModul());
        System.out.println("Numarul complex este "+n.getReal()+"+"+n.getImaginar()+"i");
    }
}