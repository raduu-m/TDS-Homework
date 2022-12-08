package poo.util;

import java.util.*;

public class ListaDeInt{
    int nr_max;
    int[] elemente;
    int numarCurentDeElemente;
    public ListaDeInt(int nr_max){
        this.nr_max=nr_max;
        numarCurentDeElemente=0;
        elemente= new int[nr_max];
    }

    public void afisareElemente(){
        if(numarCurentDeElemente>0){
            System.out.println(Arrays.toString(elemente));
        }
    else{
            System.out.println("Vectorul nu contine valori");
        }

    }
    public void adaugareElement(int element_adaugat) throws ListaPlina{
        if(numarCurentDeElemente<nr_max){
            elemente[numarCurentDeElemente]=element_adaugat;
            numarCurentDeElemente++;
            System.out.println("Elementul a fost adaugat.\n Au mai ramas: "+(nr_max-numarCurentDeElemente)+" valori de adaugat");
        }else{
            throw new ListaPlina();
        }
        }

    public void stergereElement()throws ListaGoala{
        if(numarCurentDeElemente>0){
            numarCurentDeElemente--;
            System.out.println("Elementul a fost sters.\n Au mai ramas: "+(nr_max-numarCurentDeElemente)+" valori");
            }else{
            throw new ListaGoala();
            }
        }
     
        public void sortareElemente() { 
        //Bubble Sort
        int[]elemente=this.elemente;
        int n = elemente.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(elemente[j-1] > elemente[j]){   
                                 temp = elemente[j-1];  
                                 elemente[j-1] = elemente[j];  
                                 elemente[j] = temp;  
                         }  
                          
                 }  
         }  
}
}