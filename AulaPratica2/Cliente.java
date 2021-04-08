// SuperClasse
public class Cliente {

    private String nome;
    private String endereco;

    /* MÉTODO CONSTRUTOR */
    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }


     /* GETTERS + SETTERS */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
  
    
}
