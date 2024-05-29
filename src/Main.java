import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1", "Matheus Henrique", "Masculino", 18);
        Pessoa pessoa2 = new Pessoa("p2", "Ana Lívia", "Feminino", 22);
        Pessoa pessoa3 = new Pessoa("p3", "Mario Fernandes", "Masculino", 25);
        Pessoa pessoa4 = new Pessoa("p4", "Maria Eduarda", "Feminino", 20);
        Pessoa pessoa5 = new Pessoa("p5", "Neymar Junior", "Masculino", 30);
        Pessoa pessoa6 = new Pessoa("p6", "Dany Souza", "Feminino", 32);
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6);
    }

    public static List<Pessoa> filtraPessoasPorSexo(List<Pessoa> pessoas, String sexo) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals(sexo))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Pessoa> lista = populaPessoas();
        lista = filtraPessoasPorSexo(lista, "Feminino");

        lista.forEach(p -> System.out.println(p.getNome() + ", " + p.getSexo()));
    }
}
