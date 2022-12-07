import poo.util.ListaDeInt;
import java.util.Random;

public class TesteListaDeInt{
    public static void main (String[] args){
        ListaDeInt lista= new ListaDeInt(Integer.valueOf(args[0]));
        lista.afisareElemente();
        lista.adaugareElement(0);
        Random rand=new Random();
        for(int i=0;i<7;i++){
            lista.adaugareElement(rand.nextInt(100));
        }
        lista.afisareElemente();
        for(int i=0;i<3;i++){
            lista.adaugareElement(rand.nextInt(100));
        }
        lista.afisareElemente();

        lista.sortareElemente();
        lista.afisareElemente();
    }
    
}