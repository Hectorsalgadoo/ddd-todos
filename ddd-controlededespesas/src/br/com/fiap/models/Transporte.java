package br.com.fiap.models;

public class Transporte extends  Despesas{
    private double kmPercorrida;
    private double valorPedagio;

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }

    @Override
    public void cadastrarDespesa() {

    }

    @Override
    public void calcularDespesa() {
        int pedagio = 0;
        if (pedagio==valorPedagio){
            valorTotal=(kmPercorrida*3)+valorPedagio;
        }
        else
            valorTotal=(kmPercorrida*3);


    }

    @Override
    public void listarDespesa() {

    }
}
