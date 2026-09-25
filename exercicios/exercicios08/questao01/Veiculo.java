package exercicios.exercicios08.questao01;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo (String marca, String Modelo) {
        this.marca=marca;
        this.modelo=modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}