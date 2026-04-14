public class Produto {

    String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        double precoFinal;
        if (pagamentoViaPix == true) {
            precoFinal = preco - descontoParaPix;
        } else {
            precoFinal = preco;
        }
        return precoFinal;
    }

}