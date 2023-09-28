public class TestaAluno {
    public static void main(String[] args) {

        // criação dos objetos
        Aluno a = new Aluno();
        Aluno b = new Aluno();
        // criando utilizando um construtor
        Aluno c = new Aluno("Fulano", 2014203213, 27);

        // setando os dados do objeto a
        a.setNome("Rafael");
        a.setMatricula(2011202322);
        a.setIdade(27);

        // setando os dados do objeto a
        b.setNome("Lais");
        b.setMatricula(2011202700);
        b.setIdade(25);

        // printando os objetos
        System.out.println("Nome do Aluno: " + a.getNome());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Idade: " + a.getIdade());

        System.out.println("Nome do Aluno: " + b.getNome());
        System.out.println("Matricula: " + b.getMatricula());
        System.out.println("Idade: " + b.getIdade());

        System.out.println("Nome do Aluno: " + c.getNome());
        System.out.println("Matricula: " + c.getMatricula());
        System.out.println("Idade: " + c.getIdade());
    }
}
