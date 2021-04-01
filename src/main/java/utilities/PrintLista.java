package utilities;

import java.util.ArrayList;
import java.util.List;

public class PrintLista<T> {

    //Declarando lista
    private List<T> lista = new ArrayList<T>();

    //Adding elements to the list
    public void addValue(T valor){
        lista.add(valor);
    }

    //Printing the values of the list
    public void printValue(){
        for(T elementos : this.lista){
            System.out.println(elementos);
        }
    }





}
