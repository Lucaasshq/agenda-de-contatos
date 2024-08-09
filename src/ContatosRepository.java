import java.util.HashSet;
import java.util.Set;

public class ContatosRepository {

    Set<Contato> contatoSet;

    public ContatosRepository() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContato(){
        if(contatoSet.isEmpty()) {
            System.out.println("Lista de contatos vazia");
        } else  {
            System.out.println(contatoSet);
        }
    }

    public Set<Contato> pesquisarPornome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoContato) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoContato);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}