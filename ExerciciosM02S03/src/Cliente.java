// Exercicio 3 - classe
public class Cliente {
    String nome;
    Double peso;
    Double altura;
    int idade;
    int id;


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

    @Override
    public String toString() {
        return " \n Cliente" + id + ": " + nome + "\n";
    }
}

// Instanciar significa criar um novo objeto de uma classe
