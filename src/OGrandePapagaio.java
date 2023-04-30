import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OGrandePapagaio {

    Scanner sc =  new Scanner(System.in);

    private Usuario usuariologado;
    private List<Usuario> listadeusuarios = new ArrayList<>();
    private List<Usuario> mural = new ArrayList<>();

    public void criarUsuario(){
        System.out.println("Digite o nome de usuário");
        String nome = sc.nextLine();
        Usuario novousuario = new Usuario(nome);
        listadeusuarios.add(novousuario);
    }
    public void entrar(){
        System.out.println("Digite o nome de usuário");
        String nomeprocurado = sc.nextLine();

        for(int i = 0; i<listadeusuarios.size(); i++){
            Usuario usuarioprocurado = listadeusuarios.get(i);
            if(usuarioprocurado.getNome().equals(nomeprocurado)){
                Usuario usuarioencontrado = usuarioprocurado;
                usuariologado = usuarioencontrado;
                mural.add(usuariologado);
            }else{
                System.out.println("Usuário não encontrado");
            }
        }
    }
    public void postar(){
        usuariologado.adicionarpost();
    }

    public void seguirUsuario(){
        System.out.println("Digite o nome do usuário que deseja seguir");
        String nomeprocurado = sc.nextLine();

        for(int i = 0; i<listadeusuarios.size(); i++){
            Usuario usuarioprocurado = listadeusuarios.get(i);
            if(usuarioprocurado.getNome().equals(nomeprocurado)){
                Usuario usuarioencontrado = usuarioprocurado;
                mural.add(usuarioencontrado);
            }else{
                System.out.println("Usuário não encontrado");
            }
        }
    }
    public void verUsuário(){
        System.out.println("Digite o nome do usuário que deseja ver");
        String nomeprocurado = sc.nextLine();

        for(int i = 0; i<listadeusuarios.size(); i ++ ){
            Usuario usuarioprocurado = listadeusuarios.get(i);
            if(usuarioprocurado.getNome().equals(nomeprocurado)){
                Usuario usuarioencontrado = usuarioprocurado;
                usuarioencontrado.verUsuario();
            }else{
                System.out.println("Usuário não encontrado");
            }
        }
    }
    public List getMural(){
        return mural;
    }
}
