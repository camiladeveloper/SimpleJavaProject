package Projects;

import java.util.Scanner;

public class Exercicios_Heranca {

    // ======================================================
    // Exercício 1 – Criando uma superclasse e uma subclasse simples
    /*
    Crie a classe Veiculo com atributos marca e ano.
    Crie a subclasse Carro que herda de Veiculo e adicione o atributo portas.
    No main, instancie Carro e mostre seus atributos.
    */
    // ======================================================
    public static void exercicio1(Scanner sc) {
        class Veiculo {
            String marca;
            int ano;
        }

        class Carro extends Veiculo {
            int portas;
        }

        Carro c = new Carro();

        System.out.print("Digite a marca do carro: ");
        c.marca = sc.nextLine();

        System.out.print("Digite o ano do carro: ");
        c.ano = sc.nextInt();

        System.out.print("Digite a quantidade de portas: ");
        c.portas = sc.nextInt();
        sc.nextLine();

        System.out.println("Marca: " + c.marca + ", Ano: " + c.ano + ", Portas: " + c.portas);
    }

    // ======================================================
    // Exercício 2 – Usando extends
    /*
    Implemente uma superclasse Pessoa com atributos nome e idade.
    Depois, crie Aluno que herda de Pessoa e adicione matricula.
    Instancie Aluno e mostre os dados herdados e o novo atributo.
    */
    // ======================================================
    public static void exercicio2(Scanner sc) {
        class Pessoa {
            String nome;
            int idade;
        }

        class Aluno extends Pessoa {
            String matricula;
        }

        Aluno a = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        a.nome = sc.nextLine();

        System.out.print("Digite a idade do aluno: ");
        a.idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a matrícula: ");
        a.matricula = sc.nextLine();

        System.out.println("Nome: " + a.nome + ", Idade: " + a.idade + ", Matrícula: " + a.matricula);
    }

    // ======================================================
    // Exercício 3 – Chamando o construtor da superclasse com super
    /*
    Na classe Veiculo, crie um construtor que recebe marca e ano.
    Em Carro, crie um construtor que receba marca, ano e portas,
    chamando super(marca, ano).
    */
    // ======================================================
    public static void exercicio3(Scanner sc) {
        class Veiculo {
            String marca;
            int ano;

            Veiculo(String marca, int ano) {
                this.marca = marca;
                this.ano = ano;
            }
        }

        class Carro extends Veiculo {
            int portas;

            Carro(String marca, int ano, int portas) {
                super(marca, ano);
                this.portas = portas;
            }
        }

        System.out.print("Digite a marca: ");
        String marca = sc.nextLine();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        System.out.print("Digite o número de portas: ");
        int portas = sc.nextInt();
        sc.nextLine();

        Carro c = new Carro(marca, ano, portas);
        System.out.println("Marca: " + c.marca + ", Ano: " + c.ano + ", Portas: " + c.portas);
    }

    // ======================================================
    // Exercício 4 – Usando super para métodos
    /*
    Crie Animal com o método emitirSom().
    Crie a subclasse Cachorro que sobrescreve esse método,
    mas também chama super.emitirSom().
    */
    // ======================================================
    public static void exercicio4() {
        class Animal {
            void emitirSom() {
                System.out.println("Algum som genérico...");
            }
        }

        class Cachorro extends Animal {
            @Override
            void emitirSom() {
                super.emitirSom();
                System.out.println("Latindo: Au Au!");
            }
        }

        Cachorro dog = new Cachorro();
        dog.emitirSom();
    }

    // ======================================================
    // Exercício 5 – Sobrescrita de métodos com @Override
    /*
    Crie Funcionario com o método trabalhar("Trabalhando").
    Crie Gerente que herda de Funcionario e sobrescreve trabalhar("Gerenciando").
    */
    // ======================================================
    public static void exercicio5() {
        class Funcionario {
            String trabalhar() {
                return "Trabalhando...";
            }
        }

        class Gerente extends Funcionario {
            @Override
            String trabalhar() {
                return "Gerenciando...";
            }
        }

        Funcionario f = new Funcionario();
        Gerente g = new Gerente();

        System.out.println("Funcionario: " + f.trabalhar());
        System.out.println("Gerente: " + g.trabalhar());
    }

    // ======================================================
    // Exercício 6 – Benefício da reutilização de código
    /*
    Crie Veiculo com o método acelerar().
    Crie Carro e Moto herdando de Veiculo, mas sem reescrever acelerar().
    */
    // ======================================================
    public static void exercicio6() {
        class Veiculo {
            void acelerar() {
                System.out.println("Acelerando...");
            }
        }

        class Carro extends Veiculo {}
        class Moto extends Veiculo {}

        Carro c = new Carro();
        Moto m = new Moto();

        c.acelerar();
        m.acelerar();
    }

    // ======================================================
    // Exercício 7 – Organização e hierarquia
    /*
    Crie Pessoa, Aluno e Professor. Todos herdam nome e idade.
    Adicione métodos específicos (estudar() em Aluno, ensinar() em Professor).
    */
    // ======================================================
    public static void exercicio7(Scanner sc) {
        class Pessoa {
            String nome;
            int idade;
        }

        class Aluno extends Pessoa {
            void estudar() {
                System.out.println(nome + " está estudando...");
            }
        }

        class Professor extends Pessoa {
            void ensinar() {
                System.out.println(nome + " está ensinando...");
            }
        }

        Aluno a = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        a.nome = sc.nextLine();
        a.estudar();

        Professor p = new Professor();
        System.out.print("Digite o nome do professor: ");
        p.nome = sc.nextLine();
        p.ensinar();
    }

    // ======================================================
    // Exercício 8 – Demonstrando que construtores não são herdados
    /*
    Crie ContaBancaria com construtor que recebe saldoInicial.
    Crie ContaCorrente herdando de ContaBancaria, mas sem declarar construtor.
    Depois, crie um construtor em ContaCorrente chamando super().
    */
    // ======================================================
    public static void exercicio8() {
        class ContaBancaria {
            double saldo;

            ContaBancaria(double saldoInicial) {
                this.saldo = saldoInicial;
            }
        }

        class ContaCorrente extends ContaBancaria {
            ContaCorrente(double saldoInicial) {
                super(saldoInicial);
            }
        }

        ContaCorrente cc = new ContaCorrente(1000);
        System.out.println("Saldo inicial: " + cc.saldo);
    }

    // ======================================================
    // Exercício 9 – Usando private na superclasse
    /*
    Torne cpf private em Pessoa e use getters e setters.
    */
    // ======================================================
    public static void exercicio9() {
        class Pessoa {
            private String cpf;

            public String getCpf() {
                return cpf;
            }

            public void setCpf(String cpf) {
                this.cpf = cpf;
            }
        }

        class Aluno extends Pessoa {}

        Aluno a = new Aluno();
        a.setCpf("123.456.789-00");
        System.out.println("CPF do aluno: " + a.getCpf());
    }

    // ======================================================
    // Exercício 10 – Exercício integrado
    /*
    Veiculo (atributos: marca, ano; método: mostrarInfo()).
    Carro (atributo: portas; sobrescreva mostrarInfo()).
    Moto (atributo: cilindradas; sobrescreva mostrarInfo()).
    */
    // ======================================================
    public static void exercicio10() {
        class Veiculo {
            String marca;
            int ano;

            void mostrarInfo() {
                System.out.println("Marca: " + marca + ", Ano: " + ano);
            }
        }

        class Carro extends Veiculo {
            int portas;

            @Override
            void mostrarInfo() {
                System.out.println("Carro -> Marca: " + marca + ", Ano: " + ano + ", Portas: " + portas);
            }
        }

        class Moto extends Veiculo {
            int cilindradas;

            @Override
            void mostrarInfo() {
                System.out.println("Moto -> Marca: " + marca + ", Ano: " + ano + ", Cilindradas: " + cilindradas);
            }
        }

        Carro c = new Carro();
        c.marca = "Ford";
        c.ano = 2022;
        c.portas = 4;

        Moto m = new Moto();
        m.marca = "Yamaha";
        m.ano = 2023;
        m.cilindradas = 250;

        c.mostrarInfo();
        m.mostrarInfo();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU HERANÇA =====");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            System.out.println("4 - Exercício 4");
            System.out.println("5 - Exercício 5");
            System.out.println("6 - Exercício 6");
            System.out.println("7 - Exercício 7");
            System.out.println("8 - Exercício 8");
            System.out.println("9 - Exercício 9");
            System.out.println("10 - Exercício 10");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    exercicio1(sc);
                    break;
                case 2:
                    exercicio2(sc);
                    break;
                case 3:
                    exercicio3(sc);
                    break;
                case 4:
                    exercicio4();
                    break;
                case 5:
                    exercicio5();
                    break;
                case 6:
                    exercicio6();
                    break;
                case 7:
                    exercicio7(sc);
                    break;
                case 8:
                    exercicio8();
                    break;
                case 9:
                    exercicio9();
                    break;
                case 10:
                    exercicio10();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }

}
