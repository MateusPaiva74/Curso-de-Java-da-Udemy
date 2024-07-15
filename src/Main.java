import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoaFisica = new PessoaFisica();
        Pessoa pessoaJuridica = new PessoaJuridica();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa fisica: ");
        pessoaFisica.setName(scanner.nextLine());
        System.out.println("Digite a idade da pessoa fisica: ");
        pessoaFisica.setIdade(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digite o salario da pessoa fisica: ");
        pessoaFisica.setSalario(Double.parseDouble(scanner.nextLine()));


        System.out.println("Digite o nome da pessoa juridica: ");
        pessoaJuridica.setName(scanner.nextLine());
        System.out.println("Digite a idade da pessoa juridica: ");
        pessoaJuridica.setIdade(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digite o salario da pessoa juridica: ");
        pessoaJuridica.setSalario(Double.parseDouble(scanner.nextLine()));

        System.out.println("Digite algum numero para aparecer o salario de ambos: ");

        double salarioDeAmbos = Double.parseDouble(scanner.nextLine());

        System.out.println("Pessoa fisica  " + pessoaFisica.desconto());
        System.out.println("Pessoa juridica "+ pessoaJuridica.desconto());
    }
}
