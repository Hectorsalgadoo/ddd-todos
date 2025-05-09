package br.com.fiap.models;

public class GerenciadorDespesa extends Despesas{
    private int qtdeAlimentacao;
    private int qtdeTransporte;
    private double totalAlimentacao;
    private double totalTransporte;
    private double totalDiaria;
    private double totalDespesa;



    public void analisarDespesa(Despesas despesa){
        if(despesa instanceof Transporte){
            qtdeTransporte++;
            totalTransporte+=despesa.getValorTotal();
        } else if (despesa instanceof Diaria) {
            qtdeDiaria++;
            totalDiaria+=despesa.getValorTotal();

        }
    }
    @Override
    public void cadastrarDespesa() {

    }

    @Override
    public double calcularDespesa() {
        return 0;
    }

    @Override
    public void listarDespesa() {

    }
}
