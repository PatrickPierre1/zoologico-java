package funcionarios;

import java.util.Arrays;
import java.util.List;


/*

a. Com método main.
b. Que seja possível cadastrar 5 funcionário e que ao final liste os dados de cada um imprimindo no
console.

*/
public class Programa {
    public static void main(String[] args) {
        List<Funcionario> lista = Arrays.asList(
                Funcionario.inserirDados(),
                Funcionario.inserirDados(),
                Funcionario.inserirDados(),
                Funcionario.inserirDados(),
                Funcionario.inserirDados()
        );

        lista.forEach(Funcionario::imprimirInfo);
    }
}
