public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public double  desconto(){
        return super.getSalario();
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
}
