package analitic;

public class NumarComplex{
    private int real;
    private int imaginar;

    public NumarComplex(){}
    
    public NumarComplex(int real, int imaginar){
        this.real=real;
        this.imaginar=imaginar;
    }
    //Getter
    public int getReal(){
        return real;
    }

    //Setter
    public void setReal(int new_real){
        this.real=new_real;
    }

    //Getter
    public int getImaginar(){
        return imaginar;
    }

    //Setter
    public void setImaginar(int new_imaginar){
        this.real=new_imaginar;
    }

    public double getModul(){
        double m = Math.sqrt(real*real+imaginar*imaginar);
        return m;
    }
    public double Phase(){
        double phase = Math.atan(imaginar/real);
        return phase;
    }
    public static NumarComplex imparte(NumarComplex n1,NumarComplex n2){
        int rez_real=n1.getReal()/n2.getReal();
        int rez_imaginar=n1.getImaginar()/n2.getImaginar();
        NumarComplex rezultat_impartire= new NumarComplex(rez_real,rez_imaginar);
        return rezultat_impartire;
        
    }
}