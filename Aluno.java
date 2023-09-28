public class Aluno {
    // criando os parametros do objeto
    private String nome;
    private int matricula;
    private int idade;

    // metodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // métodos getters
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    // construtores
    public Aluno(String nome, int matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    // construtor vazio(ele segue o padrão da linguagem)
    public Aluno() {
        // vazio
    }
}
