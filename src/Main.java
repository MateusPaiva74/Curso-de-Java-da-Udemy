public class Main {
    public static void main(String[] args) {

        Pessoa pessoaFisica = new PessoaFisica();
        Pessoa pessoaJuridica = new PessoaJuridica();

        recebePessoa(pessoaJuridica);
        recebePessoa(pessoaFisica);
    }

    public static void recebePessoa(Pessoa pessoa){
        System.out.println("recebeu a pessoa");
    }
}
