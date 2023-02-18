// Exercicio 3 - classe
public class Cliente {
    private String nome;
    private Double peso;
    private Double altura;
    private int idade;
    private int id;


    // Exercicio 5 - Construtores
    public Cliente(String nome, Double altura, Double peso, int idade, int id) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.id = id;
    }
    public Cliente(String nome, Double altura, Double peso, int id) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " \n Cliente" + id + ": " + nome + "\n";
    }
}

// Instanciar significa criar um novo objeto de uma classe
