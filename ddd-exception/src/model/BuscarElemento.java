package model;

public class BuscarElemento {

    private int[] arrey={1,2,3,4,5};

    public static int buscarElemento(int[]arrey, int posicao){
        return arrey[posicao];
    }

    public int[] getArrey() {
        return arrey;
    }

    public void setArrey(int[] arrey) {
        this.arrey = arrey;
    }
}
