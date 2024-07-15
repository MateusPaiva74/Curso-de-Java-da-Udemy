public class PessoaFisica extends Pessoa{

    private String cpf;

    public double desconto(){
        return super.getSalario()- super.getSalario()*0.5;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
}
