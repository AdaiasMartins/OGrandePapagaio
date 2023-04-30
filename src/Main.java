import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        OGrandePapagaio papagaio = new OGrandePapagaio();

        final int criar = 1;
        final int entrar = 2;
        final int postar = 3;
        final int seguir = 4;
        final int ver = 5;
        final int sair = 6;

        boolean sairdoprograma = false;

        while (sairdoprograma == false){
            System.out.println("""
                1. Criar
                2. Entrar
                3  Postar
                4. Seguir
                5. Ver
                6. sair
                """);


            for(int i = 0; i<papagaio.getMural().size(); i++){
                List<Usuario> mural = papagaio.getMural();
                Usuario usuariodomural = mural.get(i);
                for(int i1 = 0; i1<usuariodomural.getPosts().size(); i1++){
                    List<String> postsdousuario = usuariodomural.getPosts();
                    System.out.print(usuariodomural.getNome() + "-->");
                    System.out.println(postsdousuario.get(i1));
                }
            }

            int escolha = sc.nextInt();
            sc.nextLine();

            if(escolha == 1){
                papagaio.criarUsuario();
            } else if (escolha == 2) {
                papagaio.entrar();
            } else if (escolha == 3) {
                papagaio.postar();
            } else if (escolha == 4) {
                papagaio.seguirUsuario();
            } else if (escolha == 5) {
                papagaio.verUsuário();
            } else if (escolha == 6) {
                sairdoprograma = true;
            }
        }



    }
}
