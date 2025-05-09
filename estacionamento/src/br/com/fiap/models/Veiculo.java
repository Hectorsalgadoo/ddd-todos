package br.com.fiap.models;

public class Veiculo {
    private double valorHora;
    private double valorAdicional;
    private double horas;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double doTotal(){
      return valorHora*valorAdicional*(horas);
    }

    public String doViewcupom(){
        System.out.println("O tempo que fico no estacionamento foi de: "+horas);
        System.out.println("O valor total do foi de: "+doTotal());
    }
}
