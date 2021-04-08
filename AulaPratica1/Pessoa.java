public class Pessoa {
    
    private int codigo;
    private String nome;

    /* MÉTODO CONSTRUTOR */
    public Pessoa(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }


    /* GETTERS AND SETTERS */

    // GET -> método para acessar os atributos
    public String getNome(){
        return nome;
    }

    // SET -> método para modificar os atributos
    public void setNome(String nome){
        this.nome = nome;
    }


    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

}
