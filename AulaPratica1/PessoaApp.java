public class PessoaApp {
    
    public static void main(String[] args){

        /* CRIANDO OBJETOS DA CLASSE PESSOA */
        Pessoa pessoa1 = new Pessoa(1, "Elder");

        Pessoa pessoa2 = new Pessoa(2, "Ana");

        System.out.println("O nome do objeto pessoa1 é: " + pessoa1.getNome());

        pessoa1.setNome("Helder");

        System.out.println("O nome do objeto pessoa1 é: " + pessoa1.getNome());
    }
}
