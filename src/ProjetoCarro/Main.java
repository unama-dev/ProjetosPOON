package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Paulo";
        proprietario.bairro = "Jurunas";
        proprietario.cep = "660033";
        proprietario.cidade = "Belém";
        proprietario.cpf = "9382432894";
        proprietario.dataNascimento = "09/10/2017";
        proprietario.estado = "Pará";
        proprietario.rg = "3423324";
        proprietario.complemento = "casa";

        Carro carro = new Carro();
        carro.nPortas = 5;
        carro.nMarchas = 5;
        carro.marchaAtual = 1;
        carro.proprietario = proprietario;
        carro.velocidadeAtual = 10;

        System.out.println(carro.velocidadeAtual);
        carro.acelera();
        carro.acelera();
        carro.freia();
        System.out.println(carro.velocidadeAtual);

        System.out.println(carro.marchaAtual);
        carro.trocaMarcha(3);
        System.out.println(carro.marchaAtual);







    }
}
