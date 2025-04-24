package br.com.fiap.models;

public class Adiministrativo extends Funcionario{
    private int jornada;

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    @Override
    public void calcularSalario() {

    }
}
