package ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class TarefaRepository {

    Set<Tarefa> tarefaSet;

    public TarefaRepository() {
        this.tarefaSet = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        if (descricao != null && descricao.isEmpty()) {
            System.out.println("Por favor coloque uma descricao valida!!!");
        } else {
            tarefaSet.add(new Tarefa(descricao));
        }
    }

    public void removerTarefa(String descricao) {
        if (descricao.isEmpty()) {
            System.out.println("A tarefa não existe ou a descrição esta invalida");
        } else {
            tarefaSet.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
        }
    }

    public Set<Tarefa> exibirTarefas() {
        return tarefaSet;
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public void marcaTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(true);
            }
        }
    }

    public void marcaTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(false);
            }
        }
    }

    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("Lista já esta vazia");
        } else {
            tarefaSet.clear();
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcludas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.getStatus() == true) {
                tarefasConcludas.add(t);
            }
        }
        return tarefasConcludas;
    }

    public Set<Tarefa> obterTarefasPendente() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.getStatus()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }
}
