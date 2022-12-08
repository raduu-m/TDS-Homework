
public class TestNumereComplexe {
    public static void main (String[] args) {
        NumarComplex n = new NumarComplex();
        n.real = 3;
        n.imaginar = 4;
        System.out.println("Modulul numarului complex este "+n.getModul());
        System.out.println("Numarul complex este "+n.real+"+"+n.imaginar+"i");
        n.aduna(2,3);
    }
}