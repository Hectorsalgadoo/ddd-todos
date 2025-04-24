package br.com.fiap.models;

/*abstract nao pode ser instanciada, pq o obijeto nao existe no mundo real*/

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String numeroCtps;
    protected double salario;

    // so exite em classes abstratas obriga as subclasses implementa o metodo

    public abstract void calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroCtps() {
        return numeroCtps;
    }

    public void setNumeroCtps(String numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
