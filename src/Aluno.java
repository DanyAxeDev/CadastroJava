package TrabalhoFinal.src;

import java.util.Calendar;

public class Aluno extends Usuario {
    private int qtdDisciplina;
    private float ValorMensalidade;
    private Calendar dataDeMatricula;
    
    //Constructor
    public Aluno(String nome, String nomeUsuario, String senha, String cpf, String telefone, int diaNasc, int mesNasc, int anoNasc, int qtdDisciplina, int diaMatr, int mesMatr, int anoMatr){
        super(nome, nomeUsuario, senha, cpf, telefone, diaNasc, mesNasc, anoNasc);
        this.qtdDisciplina = qtdDisciplina;
        this.dataDeMatricula = setDataDeMatricula(diaMatr, mesMatr, anoMatr);
        atualizarMensalidade();
    }

    //Setters
    public Calendar setDataDeMatricula(int dia, int mes, int ano) {
        Calendar data = Calendar.getInstance();
        data.set(ano, mes, dia);
        this.dataDeMatricula = data;
        return dataDeMatricula;
    }
    public void setQtdDisciplina(int qtdDisciplina) {
        this.qtdDisciplina = qtdDisciplina;
    }

    //Getters
    public int getQtdDisciplina() {
        return qtdDisciplina;
    }
    public float getValorMensalidade() {
        return ValorMensalidade;
    }
    public Calendar getDataDeMatricula() {
        return dataDeMatricula;
    }

    //Metodos
    public void atualizarMensalidade(){
        this.ValorMensalidade = calcularMensalidade();
    }
    private float calcularMensalidade(){
        float mensalidade;
        mensalidade = 180 * qtdDisciplina;
        return mensalidade;
    }
    private int calcularTempoFormação(){
        Calendar hoje = Calendar.getInstance();
        int anos = (dataDeMatricula.get(Calendar.YEAR) + 4) - hoje.get(Calendar.YEAR);
        return anos;
    }
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Cursando " + getQtdDisciplina() + " disciplinas");
        System.out.println("Valor da mensalidade: R$" + getValorMensalidade());
        System.out.println("Data da matricula: " + getDataDeMatricula().get(Calendar.DAY_OF_MONTH) + "/" + getDataDeMatricula().get(Calendar.MONTH) + "/" + getDataDeMatricula().get(Calendar.YEAR));
        System.out.println("Tempo para se formar: " + calcularTempoFormação() + " anos");
    }
}
