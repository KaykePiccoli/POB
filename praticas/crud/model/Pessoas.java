package praticas.crud.model;

public class Pessoas{
    private Int id;
    private String nome;
    private Int idade;
    private Double altura;

    public Pessoas(Int id, String nome, Int idade, Double altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public Int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toFileString() {
        return id + ";" + nome + ";" + idade + ";" + Altura;
    }

 public static Pessoas fromFileString(String line) {

        String[] data = line.split(";");

        // Verifica se a linha contém exatamente 4 partes
        if (data.length != 4) {
            throw new IllegalArgumentException("Linha de dados inválida para criação de Produto: " + line);
        }

        try {
            //pos 1
            int id = Integer.parseInt(data[0]);
            //pos 2
            String nome = data[1];
            //pos 3
            int idade = Integer.parseInt(data[2]);
            //pos 4
            double altura = Double.parseDouble(data[3]);


            // Cria e retorna uma nova instância de Produto com os dados extraídos da linha
            return new Pessoas(id, nome, idade, altura);
        } 
        
        catch (NumberFormatException e) {
            throw new IllegalArgumentException("Formato numérico inválido em: " + line, e);
        }
    }
}