package animais;

import java.util.Scanner;

/*

a. Com atributos privados para nome, espécie, alimentação.
b. Com método sem retorno que imprima no console as informações dos animais.
c. Com método estático que retorne um novo animal, e que seja possível informar os dados do
animal via console.

*/
public class Animal {

    private String nome;

    private String especie;
    private String alimentacao;

public void imprimirInfo(){
    System.out.println("O nome do animal é: "+ nome);

    System.out.println("A espécie do animal é: "+ especie);

    System.out.println("A alimentação do animal é: "+ alimentacao);

    }

    public static Animal inserirDados() {
        Animal animal = new Animal();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do animal: ");
        animal.nome = s.nextLine();

        System.out.println("Digite a espécie do animal: ");
        animal.especie = s.nextLine();

        System.out.println("Digite a alimentação do animal: ");
        animal.alimentacao = s.nextLine();

        return animal;
    }
}
