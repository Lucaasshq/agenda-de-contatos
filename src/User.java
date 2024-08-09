import java.sql.SQLOutput;

public class User {
    public static void main(String[] args) {

        ContatosRepository contatos = new ContatosRepository();

        contatos.exibirContato();

        contatos.adicionarContato("Lucas Barros", 12365478);
        contatos.adicionarContato("Lucas Henrique", 4524227);
        contatos.adicionarContato("Matheus", 789654321);
        contatos.adicionarContato("Gerson", 277464);
        contatos.adicionarContato("Paula", 8521478);
        contatos.adicionarContato("Carlinhos", 35795148);

        contatos.exibirContato();

        for (Contato c : contatos.exibirContato()){
            System.out.println(c);
        }

        System.out.println("===============================");

        System.out.println(contatos.pesquisarPornome("Lucas"));

        System.out.println(contatos.atualizarNumeroContato("Lucas henrique", 11111111));

        contatos.exibirContato();




    }
}
