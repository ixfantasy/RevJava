public class ClienteApp {

    public static void main(String[] args){

        ClientePF clientepf1 = new ClientePF("xxx", "bairro tal", "111");

        ClientePJ clientepj1 = new ClientePJ("zzz", "bairro lá", "222");

        System.out.println("Dados do Cliente PF: " + clientepf1.getNome() + ", " + clientepf1.getEndereco());
    }
}
