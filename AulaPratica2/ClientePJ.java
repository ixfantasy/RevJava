// herda da classe pai

//SubClasse
public class ClientePJ extends Cliente {
    
    private String cnpj;


    public ClientePJ(String nome, String endereco, String cnpj){
        super(nome, endereco); // herda da classe pai

        this.cnpj = cnpj;
    }


    /* GETTERS + SETTERS */
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    } 
}