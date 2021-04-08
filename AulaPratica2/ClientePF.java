//SubClasse
public class ClientePF extends Cliente {

    private String cpf;


    public ClientePF(String nome, String endereco, String cpf){
        super(nome, endereco); // herda da classe pai

        this.cpf = cpf;
    }


    /* GETTERS + SETTERS */
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    } 
    
}