public class NumarComplex{
    double real;
    double imaginar;

    public NumarComplex(double real, double imaginar){
        this.real = real;
        this.imaginar = imaginar;
    }
    public NumarComplex(double faza, int grade){
        this.real = Math.cos(Math.toRadians(faza));
        this.imaginar = Math.sin(Math.toRadians(faza));
    }
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