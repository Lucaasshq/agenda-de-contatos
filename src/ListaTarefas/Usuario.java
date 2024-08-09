package ListaTarefas;

public class Usuario {

    public static void main(String[] args) {

        TarefaRepository tarefa = new TarefaRepository();

        tarefa.adicionarTarefa("Aprender java");
        tarefa.adicionarTarefa("Aprender java");
        tarefa.adicionarTarefa("Realizar atividade da faculdade");
        tarefa.adicionarTarefa("Estudar");
        tarefa.adicionarTarefa("Correr no parque da cidade");
        tarefa.adicionarTarefa("Beber agua");
        tarefa.adicionarTarefa("procurar estagio");

        System.out.println(tarefa.exibirTarefas());
        System.out.println(tarefa.contarTarefas());
        tarefa.marcaTarefaConcluida("Aprender java");
        tarefa.marcaTarefaConcluida("Estudar");
        System.out.println(tarefa.obterTarefasConcluidas());
        System.out.println(tarefa.obterTarefasPendente());
        tarefa.limparListaTarefas();
        System.out.println(tarefa.exibirTarefas());
    }
}
