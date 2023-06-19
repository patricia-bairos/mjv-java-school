import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<Cadastro> registro = new LinkedHashSet<>();

        Cadastro registro1 = new Cadastro();

        registro1.setNome("Patricia");
        registro1.setCpf("000.000.000-00");
        registro1.setDataNascimento(LocalDate.of(1996,10,27));
        registro1.setGenero(Genero.FEMENINO);
        registro1.setEndereco("Rua das Araras, n°00, Bairo Palmeiras");
        registro1.setCidade("Laranjeiras do Sul");
        registro1.setCidade("PR");
        registro1.setEmail("patricia.s.bairos@gmail.com");
        registro1.setTelefone(42900000000L);
        registro1.setCelularWhats(true);
        registro1.setProfissao("Analista de Suporte");
        registro1.setEmpregoAtual(true);
        registro1.setPretencaoSalarial(4000.00);
        registro1.setHabilidade("Consultas SQL, experiência em banco Oracle, Experiência em atendimetno ao cliente, familiariadade com Git, Lógica de Programação, Java");

        registro.add(registro1);

        ArquivoCSV csv = new ArquivoCSV();
        csv.gerarArquivoCsv(registro);

    }
}
