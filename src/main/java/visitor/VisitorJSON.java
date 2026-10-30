package visitor;

public class VisitorJSON implements Visitor {

    @Override
    public String exibirAluno(Aluno aluno) {
        return "{"
                + "\"tipo\":\"Aluno\","
                + "\"nome\":\"" + aluno.getNome() + "\","
                + "\"matricula\":\"" + aluno.getMatricula() + "\","
                + "\"curso\":\"" + aluno.getNomeCurso() + "\""
                + "}";
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return "{"
                + "\"tipo\":\"Professor\","
                + "\"nome\":\"" + professor.getNome() + "\""
                + "}";
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "{"
                + "\"tipo\":\"Funcionario\","
                + "\"nome\":\"" + funcionario.getNome() + "\""
                + "}";
    }
}