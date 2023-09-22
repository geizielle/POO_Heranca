public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(1, "Miguel", "Rua Babita Camargo");
        System.out.println("Código: " + pessoa.getCodigo());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        pessoa.setEndereco("Nova Rua B");
        System.out.println("Novo Endereço: " + pessoa.getEndereco());

        Aluno aluno = new Aluno(2, "Gabi", "Rua Jeupira", 12345);
        System.out.println("\nCódigo: " + aluno.getCodigo());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Matrícula: " + aluno.getMatricula());

        Professor professor = new Professor(3, "Lucas", "Rua PioXII", "Artes");
        System.out.println("\nCódigo: " + professor.getCodigo());
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Endereço: " + professor.getEndereco());
        System.out.println("Disciplina: " + professor.getDisciplina());
    }
}
