package Classes;

public class Rodas {
    private int numeroDeRodas;
    private char tipoDeRoda;

    public Rodas(int numeroDeRodas, char tipoDeRoda) {
        this.numeroDeRodas = numeroDeRodas;
        this.tipoDeRoda = tipoDeRoda;
    }

    public void setNumeroDeRodas(int numeroDeRodas) {
        this.numeroDeRodas = numeroDeRodas;
    }

    public void setTipoDeRoda(char tipoDeRoda) {
        this.tipoDeRoda = tipoDeRoda;
    }

    public int getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public char getTipoDeRoda() {
        return tipoDeRoda;
    }

    @Override
    public String toString() {
        return numeroDeRodas + " rodas (Tipo: " + tipoDeRoda + ")";
    }
}