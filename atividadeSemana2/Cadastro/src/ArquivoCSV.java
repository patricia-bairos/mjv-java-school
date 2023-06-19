import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Set;

public class ArquivoCSV
    {public void gerarArquivoCsv(Set<Cadastro> cadastros) {
       try {
           StringBuilder reg = new StringBuilder();
           for (Cadastro cadastro : cadastros) {
               reg.append("Nome: " + cadastro.getNome() + ",");
               reg.append("CPF: " + cadastro.getCpf() + ",");
               reg.append("Data de Nascimento: " + cadastro.getDataNascimento() + ",");
               reg.append("Genero: " + cadastro.getGenero() + ",");
               reg.append("Endereço: " + cadastro.getEndereco() + ",");
               reg.append("Cidade: " + cadastro.getCidade() + ",");
               reg.append("Estado: " + cadastro.getEstado() +",");
               reg.append("Email: " + cadastro.getEmail() + ",");
               reg.append("Telefone: " + cadastro.getTelefone() + ",");
               reg.append("CelularWhats: " + cadastro.getCelularWhats() + ",");
               reg.append("Profissão: " + cadastro.getProfissao() + ",");
               reg.append("Emprego Atual: " + cadastro.getEmpregoAtual() + ",");
               reg.append("Pretenção Salarial: " + cadastro.getPretencaoSalarial() + ",");
               reg.append("Habilidades: " + cadastro.getHabilidade() + ".");
           }
           System.out.println(reg.toString());

           Path arquivoDestino = Paths.get("D:\\mjv\\mjv-java-school\\atividadeSemana2\\Cadastro\\lista-candidatos.csv");

           Files.write(arquivoDestino, reg.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

       }catch (Exception ex){
           ex.printStackTrace();
       }
   }
}

