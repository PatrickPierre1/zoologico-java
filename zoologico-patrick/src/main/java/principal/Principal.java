package principal;

import animais.Animal;
import funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*

a. Com método main.
b. Onde o usuário possa escolher se quer cadastrar novos Funcionários ou Animais.
c. Onde o usuário possa cadastrar quantos desejar (Funcionários ou Animais).
d. Que ao final liste os dados de cada um imprimindo no console.

*/
public class Principal {
    public static void main(String[] args) {
        int escolha;
        int escolhaContinuar;

        Scanner s = new Scanner(System.in);

        System.out.println("O que você deseja inserir ? Funcionários = 1  Animais = 2");
        escolha = s.nextInt();

        switch(escolha) {
            case 1:
                do {
                    List<Funcionario> lista = Arrays.asList(
                            Funcionario.inserirDados()
                    );

                    System.out.println("Deseja continuar inserindo ? Sim = 1 Não = 2");
                    escolhaContinuar = s.nextInt();

                    if (escolhaContinuar == 2) {
                        lista.forEach(Funcionario::imprimirInfo);
                    }
                }while(escolhaContinuar == 1);

                break;
            case 2:
                do {
                    /*List<Animal> lista = Arrays.asList(
                            Animal.inserirDados()
                    );*/

                    ArrayList<Animal> lista = new ArrayList();
                    lista.add(Animal.inserirDados());

                    System.out.println("Deseja continuar inserindo ? Sim = 1 Não = 2");
                    escolhaContinuar = s.nextInt();

                    if (escolhaContinuar == 2) {
                        lista.forEach(Animal::imprimirInfo);
                    }

                }while(escolhaContinuar == 1);
                break;

            default:
                System.out.println("Escolha entre 1 ou 2!");
                break;
        }
    }
}
