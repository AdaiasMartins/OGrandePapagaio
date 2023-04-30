import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);
    private String nome;
    private List<String> mural;

    public Usuario(String nome){
        this.nome = nome;
        mural = new ArrayList<>();
    }

    public void adicionarpost(){
        System.out.println("Digite o que deseja postar");
        String novopost =  sc.nextLine();
        mural.add(novopost);
    }

    public void verUsuario(){
        System.out.printf(nome, mural);
    }

    public String getNome(){
        return nome;
    }

    public List getPosts(){
        return mural;
    }
}
