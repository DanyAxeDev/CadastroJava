package TrabalhoFinal.src;

import java.util.Calendar;

public class Usuario{
    private String nome;
    private String nomeUsuario;
    private String senha;
    private String cpf;
    private String telefone;
    private Calendar data_nascimento;

    //Constructor
    public Usuario(String nome, String nomeUsuario, String senha, String cpf, String telefone, int dia, int mes, int ano){
        this.nome = nome;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nascimento = setData_nascimento(dia, mes, ano);
    }

    //Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Calendar setData_nascimento(int dia, int mes, int ano) {
        Calendar data = Calendar.getInstance();
        data.set(ano, mes, dia);
        this.data_nascimento = data;
        return data_nascimento;
    }

    //Getters
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public String getTelefone() {
        return telefone;
    }
    public Calendar getData_nascimento() {
        return data_nascimento;
    }
    public String getSenha() {
        return senha;
    }

    //Métodos
    public void imprimirDados(){
        System.out.println("************DADOS DA CONTA**************\n");
        System.out.println("Nome: " + getNome());
        System.out.println("Nome de usuario: " + getNomeUsuario());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Data de nascimento: " + getData_nascimento().get(Calendar.DAY_OF_MONTH) + "/" + getData_nascimento().get(Calendar.MONTH) + "/" + getData_nascimento().get(Calendar.YEAR));
    }
}