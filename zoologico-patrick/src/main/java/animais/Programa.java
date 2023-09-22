package animais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

a. Com método main.
b. Que seja possível cadastrar 5 animais e que ao final liste os dados de cada animal imprimindo no
console.

*/
public class Programa {
    public static void main(String[] args) {
        List<Animal> lista = Arrays.asList(

                Animal.inserirDados(),
                Animal.inserirDados(),
                Animal.inserirDados(),
                Animal.inserirDados(),
                Animal.inserirDados()
        );
        lista.forEach(Animal::imprimirInfo);
    }
}
