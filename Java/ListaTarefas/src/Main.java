import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Menu -----");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descricao da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite a data de conclusao da tarefa (dd/mm): ");
                    String dataConclusao = scanner.nextLine();
                    Tarefa novaTarefa = new Tarefa(descricao, dataConclusao);
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso! ID: " + novaTarefa.getId());
                    break;
                case 2:
                    System.out.print("Digite o ID da tarefa a ser removida: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();

                    Tarefa tarefaRemover = null;
                    for (Tarefa tarefa : tarefas) {
                        if (tarefa.getId() == idRemover) {
                            tarefaRemover = tarefa;
                            break;
                        }
                    }

                    if (tarefaRemover != null) {
                        System.out.print("Tem certeza que deseja remover a tarefa? (1 - sim, 2 - nao): ");
                        int confirmacao = scanner.nextInt();
                        scanner.nextLine();

                        if (confirmacao == 1) {
                            tarefas.remove(tarefaRemover);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Remocao cancelada.");
                        }
                    } else {
                        System.out.println("Tarefa nao encontrada na lista!");
                    }
                    break;
                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Lista de tarefas vazia!");
                    } else {
                        System.out.println("Lista de tarefas:");
                        for (Tarefa tarefa : tarefas) {
                            System.out.println("- ID: " + tarefa.getId() + ", Descricao: " + tarefa.getDescricao() +
                                    ", Conclusao: " + tarefa.getDataConclusao());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
    }
}