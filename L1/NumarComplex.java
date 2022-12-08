public class NumarComplex{
    int real;
    int imaginar;
    double getModul(){
        double m = Math.sqrt(real*real+imaginar*imaginar);
        return m;
    }
    void aduna (int a, int b){
        real = real + a;
        imaginar = imaginar + b;
        System.out.println("Adunare:"+real+"+"+imaginar+"i");
    
    }
}