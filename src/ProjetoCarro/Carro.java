package ProjetoCarro;

public class Carro {
    String modelo, cor, marca, chassi;
    int ano, nPortas, nMarchas, marchaAtual;
    double velocidadeMaxima, velocidadeAtual,
            volumeCombustivel;
    boolean tetoSolar, cambioAtomatico;
    Proprietario proprietario;

    void acelera(){
        velocidadeAtual = velocidadeAtual + 1;
    }

    void freia(){
        velocidadeAtual = 0;
    }

    void trocaMarcha(int marchaDesejada){
        if(marchaDesejada > nMarchas){
            System.out.println("Marcha Inexistente");
        }else{
            marchaAtual = marchaDesejada;
        }
    }

    void reduzMarcha(){
        marchaAtual = marchaAtual - 1;
    }

}
