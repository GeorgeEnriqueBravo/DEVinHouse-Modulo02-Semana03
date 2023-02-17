public class Main {
    public static void main(String[] args) {

        Clinica novaClinica = new Clinica("George");
        Cliente cliente1 = new Cliente("Lionel",1.86, 110.0, 29, 1);
        Cliente cliente2 = new Cliente("João",2.02, 200.0, 21, 2);

        for (int i = 0; i < novaClinica.listaClientes.size(); i++) {
            novaClinica.calculoIMC(novaClinica.listaClientes.get(i).peso, novaClinica.listaClientes.get(i).altura);
        }

//        novaClinica.calculoIMC(cliente1.peso, cliente1.altura);

        novaClinica.adicionarCliente(cliente1);
        novaClinica.adicionarCliente(cliente2);
//        System.out.println(novaClinica);

        novaClinica.tratamento(cliente1.id);
//        System.out.println(novaClinica);

        novaClinica.tratamento(cliente2, 20.0);
//        System.out.println(novaClinica);

        novaClinica.imprimirLista();
    }

}