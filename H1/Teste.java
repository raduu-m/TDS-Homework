import poo.test1.util.ListaDeComparabil;

public class Teste{
    public static void main (String[] args){
        ListaDeComparabil list= new ListaDeComparabil(Integer.valueOf(args[0]));
        for(int i =0; i< 4;i++){
            Student student = new Student();
            student.setPrezenta(i);
            student.setNume("Stud_ELTH_"+i);
            list.adaugareElement(student);
         }
         list.afisareElemente();
        }
    }