import poo.test1.Comparabil;

public class Student implements Comparabil{
    private String nume;
    private int prezenta;
    

    //Getter
    public String getNume(){
        return nume;
    }

    //Setter
    public void setNume(String nume){
        this.nume=nume;
    }
     //Getter
     public int getPrezenta(){
        return prezenta;
    }

    //Setter
    public void setPrezenta(int prezenta){
        this.prezenta=prezenta;
    }

    

    @Override
    public int comparaCu(Comparabil c) {
        Student s1 = (Student)c;
        if(this.getPrezenta() == s1.getPrezenta()){
            return 0;
        }else if (this.getPrezenta() > s1.getPrezenta()){
            return 1;
        }else {
            return -1;
    }
    }

    @Override
    public String toString() {
        return nume;
    }
 
}