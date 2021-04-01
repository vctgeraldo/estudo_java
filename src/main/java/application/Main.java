package application;
import utilities.*;


public class Main {

    public static void main(String[] args) {

        //Declaring a list with a generic type
        PrintLista<String> minhaLista = new PrintLista<String>();

        //Adding an element in the list
        minhaLista.addValue("Victor");
        minhaLista.addValue("Henrique");
        minhaLista.addValue("Anna Clara");
        minhaLista.addValue("Dolores");

        minhaLista.printValue();







    }

}
