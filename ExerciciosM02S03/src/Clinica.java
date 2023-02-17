import java.util.ArrayList;

public class Clinica {
    String nomeDono;
    String nomeClinica;
    int CNPJ;
    String endereco;
    String codigoClinica;

    // Exercicio 3 - lista de clientes
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();


    // Exercicio 5 - Construtores
    public Clinica(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public Clinica(String nomeDono, ArrayList<Cliente> listaClientes) {
        this.nomeDono = nomeDono;
        this.listaClientes = listaClientes;
    }


    // Exercício 2 método de calculo de IMC
    public Double calculoIMC(Double peso, Double altura) {

        Double imc = peso / Math.pow(altura, 2); // altura elevado ao quadrado

        if (imc < 18.5) {
            System.out.println("Abaixo do peso normal");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <=29.9) {
            System.out.println("Excesso de peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade classe 1");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade classe 2");
        } else if (imc >= 40) {
            System.out.println("Obesidade classe 3");
        }

        return imc;
    }


    // Exercício 4
    public void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }


    // Exercício 6 - Tratamento
    public Double tratamento(int idCliente) {
        Double peso = 0.0;
        Boolean pacienteNaoExiste = true;

        for (int i = 0; i < this.listaClientes.size(); i++) {

            if (this.listaClientes.get(i).id == idCliente) {
                this.listaClientes.get(i).peso -= 5;
                peso = this.listaClientes.get(i).peso;

                pacienteNaoExiste = false;
                break;
            }
        }

        if (pacienteNaoExiste) {
            System.out.println("Cliente não identificado");
        }

        return peso;
    }

    // Exercício 7 - Sobrecarga do Tratamento
    public Double tratamento(Cliente cliente, Double valor) {
        Double peso = 0.0;
        Boolean pacienteNaoExiste = true;

        for (int i = 0; i < this.listaClientes.size(); i++) {

            if (this.listaClientes.get(i).id == cliente.id) {
                this.listaClientes.get(i).peso -= valor;
                peso = this.listaClientes.get(i).peso;

                pacienteNaoExiste = false;
                break;
            }
        }

        if (pacienteNaoExiste) {
            System.out.println("Cliente não identificado");
        }

        return peso;
    }

    @Override
    public String toString() {
        return "Clinica{" +
                "listaClientes=" + listaClientes +
                '}';
    }

    // Exercício 8 - Listagem de Clientes
    public ArrayList<Cliente> imprimirLista() {
        System.out.println(this.listaClientes);
        return this.listaClientes;
    }
}
