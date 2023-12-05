import exrecicios.Produto;
import exrecicios.Usuario;


public class Main {
    public static void main(String[] args) {
       Usuario usuario = new Usuario();
       Produto produto = new Produto();

        usuario.nome = "Valtino";
        usuario.sobreNome = "Nazareth";
        System.out.println(usuario.nome);

        produto.nome = "Lampada";
        produto.preco = 9.59d;
        produto.disponibilidade = true;
        System.out.println(produto.nome);
        System.out.println(produto.preco);
        System.out.println(produto.disponibilidade);
                     
    }
}
