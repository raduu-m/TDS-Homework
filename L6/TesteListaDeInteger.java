import poo.util.ListaDeInteger;
import java.util.Random;

public class TesteListaDeInteger{
    public static void main (String[] args){
        ListaDeInteger lista= new ListaDeInteger(Integer.valueOf(args[0]));
        int min=Integer.valueOf(args[1]);
        int max=Integer.valueOf(args[2]);
        lista.afisareElemente();
        Random rand=new Random();
        for(int i=0;i<10;i++){
            lista.adaugareElement((rand.nextInt(max-min)+min));
        }
        lista.afisareElemente();

        lista.sortareElemente();
        lista.afisareElemente();
    }
    
}