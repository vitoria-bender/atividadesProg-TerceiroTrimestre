package aula33.ExercicioHospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
    public class Main {
        private static ArrayList<Paciente> pacientes = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int opcao;
            do {
                System.out.println("\n[1]incluir paciente");
                System.out.println("[2] alterar paciente");
                System.out.println("[3] realizar atendimento");
                System.out.println("[4] listar pacientes ativos");
                System.out.println("[5] mostrar paciente (listar atendimentos)");
                System.out.println("[6] apagar paciente");
                System.out.println("[0] Sair");
                System.out.print("escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1: incluirPaciente();
                    break;
                    case 2: alterarPaciente();
                    break;
                    case 3: realizarAtendimento();
                    break;
                    case 4: listarPacientes();
                    break;
                    case 5: mostrarPaciente();
                    break;
                    case 6: apagarPaciente();
                    break;
                    case 0: System.out.println("Saindo...");
                    break;
                    default: System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
        }

        private static void incluirPaciente() {
            System.out.print("Nome do paciente: ");
            String nome = scanner.nextLine();
            System.out.print("Data de nascimento (dd/MM/yyyy): ");
            String dataStr = scanner.nextLine();
            LocalDate dataNascimento = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Paciente paciente = new Paciente(nome, dataNascimento);
            pacientes.add(paciente);
            System.out.println("paciente cadastrado!");
        }

        private static void alterarPaciente() {
            System.out.print("Nome do paciente: ");
            String nome = scanner.nextLine();
            Paciente paciente = encontrarPaciente(nome);
            if (paciente != null) {
                System.out.print("Novo nome: ");
                paciente.setNome(scanner.nextLine());
                System.out.println("nome alterado com sucesso!");
            } else {
                System.out.println("paciente não encontrado.");
            }
        }

        private static void realizarAtendimento() {
            System.out.print("Nome do paciente: ");
            String nome = scanner.nextLine();
            Paciente paciente = encontrarPaciente(nome);
            if (paciente != null) {
                System.out.print("Descrição do atendimento: ");
                String descricao = scanner.nextLine();
                Atendimento atendimento = new Atendimento(LocalDate.now(), descricao);
                paciente.adicionarAtendimento(atendimento);
                System.out.println("Atendimento registrado!");
            } else {
                System.out.println("Paciente não encontrado.");
            }
        }

        private static void listarPacientes() {
            for (Paciente paciente : pacientes) {
                if (paciente.isAtivo()) {
                    System.out.println(paciente);
                }
            }
        }

        private static void mostrarPaciente() {
            System.out.print("Nome do paciente: ");
            String nome = scanner.nextLine();
            Paciente paciente = encontrarPaciente(nome);
            if (paciente != null) {
                System.out.println(paciente);
                for (Atendimento atendimento : paciente.getAtendimentos()) {
                    System.out.println(atendimento);
                }
            } else {
                System.out.println("Paciente não encontrado.");
            }
        }

        private static void apagarPaciente() {
            System.out.print("Nome do paciente: ");
            String nome = scanner.nextLine();
            Paciente paciente = encontrarPaciente(nome);
            if (paciente != null) {
                paciente.desativar();
                System.out.println("paciente desativado!");
            } else {
                System.out.println("Paciente não encontrado.");
            }
        }

        private static Paciente encontrarPaciente(String nome) {
            for (Paciente paciente : pacientes) {
                if (paciente.getNome().equalsIgnoreCase(nome) && paciente.isAtivo()) {
                    return paciente;
                }
            }
            return null;
        }
}
