package funcionarios;

import java.util.Scanner;

/*

a. Com atributos privados para nome, função, setor.
b. Com método sem retorno que imprima no console as informações dos funcionários.
c. Com método estático que retorne um novo animal, e que seja possível informar os dados do
funcionário via console.

 */
public class Funcionario {
    private String nome;
    private String funcao;
    private String setor;

    public void imprimirInfo() {
        System.out.println("Nome do funcionário: "+ nome);

        System.out.println("A função do funcionário é: "+ funcao);

        System.out.println("O setor do funcionário é: "+ setor);
    }

    public static Funcionario inserirDados() {
        Funcionario f = new Funcionario();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        f.nome = s.nextLine();

        System.out.println("Digite a função do funcionário: ");
        f.funcao = s.nextLine();

        System.out.println("Digite o setor do funcionário: ");
        f.setor = s.nextLine();

        return f;
    }
}
