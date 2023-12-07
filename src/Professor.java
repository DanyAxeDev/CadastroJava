package TrabalhoFinal.src;

public class Professor extends Funcionario{
    private String disciplina;

    //Constructor
    public Professor(String nome, String nomeUsuario, String senha, String cpf, String telefone, int diaNasc, int mesNasc, int anoNasc, float salario, int cargaHoraria, int diaAdmis, int mesAdmis, int anoAdmis, String disciplina){
        super(nome, nomeUsuario, senha, cpf, telefone, diaNasc, mesNasc, anoNasc, salario, cargaHoraria, diaAdmis, mesAdmis, anoAdmis);
        this.disciplina = disciplina;
        this.salario = calcularSalario();
    }

    //Setters
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    //Getters
    public String getDisciplina() {
        return disciplina;
    }

    //Métodos
    private float calcularSalario(){
        float salario;
        salario = 65 * getCargaHoraria();
        return salario;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Disciplina ministrada: " + getDisciplina());
    }
}
