import java.util.List;

public class Pessoa {

    private String id;

    private String nome;

    private String sexo;

    private int idade;

    // Construtor padrão
    public Pessoa() {

    }

    //construtor com parâmetros
    public Pessoa(String id, String nome, String sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    //Métodos Get e Set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1" , "Matheus Henrique", "Masculino", 18);
        Pessoa pessoa2 = new Pessoa("p2" , "Ana Lívia", "Feminino", 22);
        Pessoa pessoa3 = new Pessoa("p3" , "Mario Fernandes","Masculino", 25);
        Pessoa pessoa4 = new Pessoa("p4" , "Maria Eduarda", "Feminino", 20);
        Pessoa pessoa5 = new Pessoa("p5" , "Neymar Junior", "Masculino", 30);
        Pessoa pessoa6 = new Pessoa("p6" , "Dany Souza", "Feminino", 32);
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6);
    }


}