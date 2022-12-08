import poo.util.*;
import java.util.Random;

public class TesteListaDeInt{
    public static void main (String[] args){
        ListaDeInt lista= new ListaDeInt(Integer.valueOf(args[0]));
       try{
        lista.adaugareElement(0);
        Random rand=new Random();
        for(int i=0;i<6;i++){
            lista.adaugareElement(rand.nextInt(100));
        }
        for(int i=0;i<8;i++){
            lista.stergereElement();
        }
        }catch(ListaPlina L){
            System.err.println("Exceptie prinsa Lista Plina");
        }catch(ListaGoala G){
            System.err.println("Exceptie prinsa Lista Goala");
        }
    }
    
} 