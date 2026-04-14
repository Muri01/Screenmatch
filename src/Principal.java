import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(2070);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
//        System.out.println(meuFilme.somaDasAvaliacao);
        System.out.println("totas de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("média de avaliações: " +meuFilme.pegaMedia());
        // Podemos alterar diratemento no objeto, gerando conflito na classe inicial
//        meuFilme.somaDasAvaliacao = 10;
//        meuFilme.totalDeAvaliacoes = 1;
//        System.out.println(totalDeAvaliacoes);

//        System.out.println(meuFilme.nome);
//        System.out.println(meuFilme.anoDeLancamento);
//        System.out.println(meuFilme.duracaoEmMinutos);

        //usando a herança de Titulo
        Serie lost = new Serie();

        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        //metodos especificos de Serie
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
