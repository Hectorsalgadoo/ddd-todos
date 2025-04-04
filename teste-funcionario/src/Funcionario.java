public class Funcionario {
    private String nome;
    private double salario;
    private int quantidadeAnos;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getQuantidadeAnos() {
        return quantidadeAnos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if (quantidadeAnos==0) {
            this.salario = salario;
        }
        else{
            this.salario = salario* 1.1;
        }

    }

    public void setQuantidadeAnos(int quantidadeAnos) {
        this.quantidadeAnos = quantidadeAnos;
        if (quantidadeAnos>0)
            setSalario(this.salario);
    }

    public String exibirFuncionario(){
        return "Nome funcionario: "+nome+ "\n Salario:" +salario+ "\nTempo de casa: "+quantidadeAnos;
    }

}
