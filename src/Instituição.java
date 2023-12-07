package TrabalhoFinal.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Instituição {
    private String nome;
    private List<Aluno> Alunos;
    private List<Professor> Professores;
    private List<Adm> Administradores;
    Scanner ler = new Scanner(System.in);

    //Constructor
    public Instituição(String nome){
        this.nome = nome;
        this.Alunos = new ArrayList<Aluno>();
        this.Professores = new ArrayList<Professor>();
        this.Administradores = new ArrayList<Adm>();
    }

    //Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    //Método para adicionar usuarios
    public void adicionarCadastro(){
        System.out.println("\nQual tipo de usuário você deseja cadastrar?");
        System.out.println("1 - Administrador");
        System.out.println("2 - Professor");
        System.out.println("3 - Aluno");
        int op = ler.nextInt();
        ler.nextLine();

        switch(op){
            case 1:
                System.out.println("\nDigite o nome do administrador: ");
                String nomeAdministrador = ler.nextLine();
                System.out.println("Defina o nome de usuario: ");
                String nomeUsuarioAdm = ler.nextLine();
                System.out.println("Defina a senha: ");
                String senhaAdm = ler.nextLine();
                System.out.println("Digite o cpf: ");
                String cpfAdm = ler.nextLine();
                System.out.println("Digite o telefone: ");
                String telefoneAdm = ler.nextLine();
                System.out.println("Digite o dia do seu nascimento: ");
                int diaNascAdm = ler.nextInt();
                System.out.println("Digite o mes do seu nascimento: ");
                int mesNascAdm = ler.nextInt();
                System.out.println("Digite o ano do seu nascimento: ");
                int anoNascAdm = ler.nextInt();
                System.out.println("Digite o valor do seu salario: ");
                float salarioAdm = ler.nextFloat();
                System.out.println("Digite sua carga horaria mensal de trabalho: ");
                int cargaHorariaAdm = ler.nextInt();
                System.out.println("Digite o dia da sua admissão na empresa: ");
                int diaAdmisAdm = ler.nextInt();
                System.out.println("Digite o mes da sua admissão na empresa: ");
                int mesAdmisAdm = ler.nextInt();
                System.out.println("Digite o ano que você entrou na empresa: ");
                int anoAdmisAdm = ler.nextInt();
                ler.nextLine();

                Adm adm = new Adm(nomeAdministrador, nomeUsuarioAdm, senhaAdm, cpfAdm, telefoneAdm, diaNascAdm, mesNascAdm, anoNascAdm, salarioAdm, cargaHorariaAdm, diaAdmisAdm, mesAdmisAdm, anoAdmisAdm);
                Administradores.add(adm);
                System.out.println("\nCadastro de administrador realizado com sucesso!\n\n");
                break;
            case 2:
                System.out.println("\nDigite o nome do professor: ");
                String nomeProfessor = ler.nextLine();
                System.out.println("Defina o nome de usuario: ");
                String nomeUsuarioP = ler.nextLine();
                System.out.println("Defina a senha: ");
                String senhaP = ler.nextLine();
                System.out.println("Digite o cpf: ");
                String cpfP = ler.nextLine();
                System.out.println("Digite o telefone: ");
                String telefoneP = ler.nextLine();
                System.out.println("Digite o dia do seu nascimento: ");
                int diaNascP = ler.nextInt();
                System.out.println("Digite o mes do seu nascimento: ");
                int mesNascP = ler.nextInt();
                System.out.println("Digite o ano do seu nascimento: ");
                int anoNascP = ler.nextInt();
                System.out.println("Digite sua carga horaria mensal de trabalho: ");
                int cargaHorariaP = ler.nextInt();
                System.out.println("Digite o dia da sua admissão na empresa: ");
                int diaAdmisP = ler.nextInt();
                System.out.println("Digite o mes da sua admissão na empresa: ");
                int mesAdmisP = ler.nextInt();
                System.out.println("Digite o ano que você entrou na empresa: ");
                int anoAdmisP = ler.nextInt();
                System.out.println("Digite a disciplina ministrada por esse professor: ");
                String disciplina = ler.nextLine();
                ler.nextLine();

                Professor prof = new Professor(nomeProfessor, nomeUsuarioP, senhaP, cpfP, telefoneP, diaNascP, mesNascP, anoNascP, 0, cargaHorariaP, diaAdmisP, mesAdmisP, anoAdmisP, disciplina);
                Professores.add(prof);
                System.out.println("\nCadastro de professor realizado com sucesso\n\n");
                break;
            case 3:
                System.out.println("\nDigite o nome do aluno: ");
                String nomeAluno = ler.nextLine();
                System.out.println("Defina o nome de usuario: ");
                String nomeUsuarioA = ler.nextLine();
                System.out.println("Defina a senha: ");
                String senhaA = ler.nextLine();
                System.out.println("Digite o cpf: ");
                String cpfA = ler.nextLine();
                System.out.println("Digite o telefone: ");
                String telefoneA = ler.nextLine();
                System.out.println("Digite o dia do seu nascimento: ");
                int diaNascA = ler.nextInt();
                System.out.println("Digite o mes do seu nascimento: ");
                int mesNascA = ler.nextInt();
                System.out.println("Digite o ano do seu nascimento: ");
                int anoNascA = ler.nextInt();
                System.out.println("Digite a quantidade de disciplinas que o aluno está pegando: ");
                int qtdDisciplina = ler.nextInt();
                System.out.println("Digite o dia que foi feita a matricula: ");
                int diaMatr = ler.nextInt();
                System.out.println("Digite o mes que foi feita a matricula: ");
                int mesMatr = ler.nextInt();
                System.out.println("Digite o ano que foi feita a matricula: ");
                int anoMatr = ler.nextInt();
                ler.nextLine();

                Aluno aluno = new Aluno(nomeAluno, nomeUsuarioA, senhaA, cpfA, telefoneA, diaNascA, mesNascA, anoNascA, qtdDisciplina, diaMatr, mesMatr, anoMatr);
                Alunos.add(aluno);
                System.out.println("\nCadastro de aluno realizado com sucesso\n\n");
                break;
            default:
                System.out.println("\nOpção inválida. Nenhum cadastro foi adicionado.\n\n");
                break;
        }
    }

    public void pesquisarUsuarios(String nomeUsuario){
        boolean encontrado = false;

        //Pesquisar em administradores
        for(Adm adm : Administradores){
            if(adm.getNomeUsuario().equalsIgnoreCase(nomeUsuario)){
                encontrado = true;
                System.out.println("\n\nUsuario encontrado: Administrador");
                adm.imprimirDados();
                break;
            }
        }

        //Pesquisar em professores
        if(!encontrado){
            for(Professor prof : Professores){
                if(prof.getNomeUsuario().equalsIgnoreCase(nomeUsuario)){
                    encontrado = true;
                    System.out.println("\n\nUsuario encontrado: Professor");
                    prof.imprimirDados();
                    break;
                }
            }
        }

        //Pesquisar em alunos
        if(!encontrado){
            for(Aluno aluno : Alunos){
                if(aluno.getNomeUsuario().equalsIgnoreCase(nomeUsuario)){
                    encontrado = true;
                    System.out.println("\n\nUsuário encontrado: Aluno");
                    aluno.imprimirDados();
                    break;
                }
            }
        }

        if(!encontrado){
            System.out.println("\n\nUsuario não encontrado.");
        }
    }

    public void excluirUsuario(){
        System.out.println("\nConfirme seu nome de usuário administrador: ");
        String nomeUsuario = ler.nextLine();
        System.out.println("Confirme sua senha de administrador: ");
        String senha = ler.nextLine();

        //Verifica se o usuario é um administrador válido
        boolean valido = false;
        if(!valido){
            for(Adm adm : Administradores){
                if(adm.getNomeUsuario().equals(nomeUsuario) && adm.getSenha().equals(senha)){
                    valido = true;
                    break;
                }
            }
        }

        if(valido){
            System.out.println("Digite o nome de usuário que deseja excluir: ");
            String nomeExcluir = ler.nextLine();

            //Remover usuario da lista apropriada
            boolean usuarioRemovido = false;

            for(Iterator<Adm> iterator = Administradores.iterator(); iterator.hasNext();){
                Adm administrador = iterator.next();
                if(administrador.getNomeUsuario().equalsIgnoreCase(nomeExcluir)){
                    iterator.remove();
                    usuarioRemovido = true;
                    break;
                }
            }

            if(!usuarioRemovido){
                for(Iterator<Professor> iterator = Professores.iterator(); iterator.hasNext();){
                    Professor prof = iterator.next();
                    if(prof.getNomeUsuario().equalsIgnoreCase(nomeExcluir)){
                        iterator.remove();
                        usuarioRemovido = true;
                        break;
                    }
                }
            }

            if(!usuarioRemovido){
                for(Iterator<Aluno> iterator = Alunos.iterator(); iterator.hasNext();){
                    Aluno aluno = iterator.next();
                    if(aluno.getNomeUsuario().equalsIgnoreCase(nomeExcluir)){
                        iterator.remove();
                        usuarioRemovido = true;
                        break;
                    }
                }
            }

            if(usuarioRemovido){
                System.out.println("\nUsuario removido com sucesso!\n\n");
            }else{
                System.out.println("\nUsuario não encontrado.\n\n");
            }
        }else{
            System.out.println("\nApenas administradores podem excluir usuários\n\n");
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Instituição IES = new Instituição("Estacio");
        Adm master = new Adm("Leomir Aires Silva de Lima", "leomir", "leomir123", "123.456.789-00", "62 91234-5678", 25, 4, 1989, 3500, 44, 22, 6, 2010);
        IES.Administradores.add(master);

        //Login de autenticação
        System.out.println("******* Autenticação ********");
        System.out.println("Digite seu nome de usuário:");
        String nomeUsuario = ler.nextLine();
        System.out.println("Digite sua senha:");
        String senha = ler.nextLine();

        //Verificar se o usuario é valido
        boolean valido = false;
        
        for(Adm adm : IES.Administradores){
            if(adm.getNomeUsuario().equals(nomeUsuario) && adm.getSenha().equals(senha)){
                valido = true;
                break;
            }
        }

        if(!valido){
            for(Professor prof : IES.Professores){
                if(prof.getNomeUsuario().equals(nomeUsuario) && prof.getSenha().equals(senha)){
                    valido = true;
                    break;
                }
            }
        }

        if(!valido){
            for(Aluno aluno : IES.Alunos){
                if(aluno.getNomeUsuario().equals(nomeUsuario) && aluno.getSenha().equals(senha)){
                    valido = true;
                    break;
                }
            }
        }

        if(valido){
            System.out.println("\n\nAutenticação bem-sucedida! Acesso ao sistema concedido\n");
            boolean sair = false;

            while(!sair){
                System.out.println("===== Menu =====");
                System.out.println("1 - Adicionar cadastro");
                System.out.println("2 - Pesquisar usuário");
                System.out.println("3 - Excluir usuário");
                System.out.println("0 - Sair\n");
                System.out.println("Escolha uma opção: ");

                int opcao = ler.nextInt();
                ler.nextLine();

                switch(opcao){
                    case 1:
                        IES.adicionarCadastro();
                        break;
                    case 2: 
                        System.out.println("\nDigite o nome de usuario que deseja pesquisar: ");
                        String nomePesquisa = ler.nextLine();
                        IES.pesquisarUsuarios(nomePesquisa);
                        break;
                    case 3:
                        IES.excluirUsuario();
                        break;    
                    case 0: 
                        sair = true;
                        System.out.println("Saindo do sistema.... Até logo!");
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                        break;
                }
            }
        }else{
            System.out.println("Autenticação falhou! Acesso negado.");
        }
        ler.close();
    }
}
