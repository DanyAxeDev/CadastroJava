package TrabalhoFinal.src;

import java.util.Calendar;

public class Funcionario extends Usuario{
    protected float salario;
    private Calendar diaDeAdmissao;
    private String tempoDeTrab;
    private int cargaHoraria;

    //Constructor
    Funcionario(String nome, String nomeUsuario, String senha, String cpf, String telefone, int diaNasc, int mesNasc, int anoNasc, float salario, int cargaHoraria, int diaAdmis, int mesAdmis, int anoAdmis){
        super(nome, nomeUsuario, senha, cpf, telefone, diaNasc, mesNasc, anoNasc);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.diaDeAdmissao = setDiaDeAdmissao(diaAdmis, mesAdmis, anoAdmis);
    }

    //Setters
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Calendar setDiaDeAdmissao(int dia, int mes, int ano) {
        Calendar data = Calendar.getInstance();
        data.set(ano, mes, dia);
        this.diaDeAdmissao = data;
        return diaDeAdmissao;
    }
    public void setTempoDeTrab() {
        this.tempoDeTrab = calcularTempoDeTrabalho();
    }

    private String calcularTempoDeTrabalho(){
        int anos;
        int meses;
        Calendar hoje = Calendar.getInstance();
        anos = hoje.get(Calendar.YEAR) - diaDeAdmissao.get(Calendar.YEAR);
        meses = hoje.get(Calendar.MONTH) - diaDeAdmissao.get(Calendar.MONTH);

        if(meses < 0 || (meses == 0 && hoje.get(Calendar.DAY_OF_MONTH) < diaDeAdmissao.get(Calendar.DAY_OF_MONTH))){
            anos--;
            meses += 12;
        }

        if(anos > 0 && meses > 0){
            return anos + " anos e " + meses + " meses";
        }else if(anos > 0){
            return anos + " anos";
        }else{
            return meses + " meses";
        }
    }

    //Getters
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public Calendar getDiaDeAdmissao() {
        return diaDeAdmissao;
    }
    public float getSalario() {
        return salario;
    }
    public String getTempoDeTrab() {
        return tempoDeTrab;
    }

    //Metodos
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Salario: R$" + getSalario());
        System.out.println("Dia de admissão: " + getDiaDeAdmissao().get(Calendar.DAY_OF_MONTH) + "/" + getDiaDeAdmissao().get(Calendar.MONTH) + "/" + getDiaDeAdmissao().get(Calendar.YEAR));
        System.out.println("Carga horária semanal: " + getCargaHoraria());
        setTempoDeTrab();
        System.out.println("Tempo de trabalho na IES: " + getTempoDeTrab());
    }
}
