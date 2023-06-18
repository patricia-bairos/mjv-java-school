import java.time.LocalDate;

public class Cadastro {
    String nome;
    String cpf;
    LocalDate dataNascimento;
    Enum genero;
    String endereco;
    String cidade;
    String estado;
    String email;
    Long telefone;
    Boolean celularWhats;
    String profissao;
    Boolean empregoAtual;
    Double pretencaoSalarial;
    String habilidade;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public Enum getGenero(){
        return genero;
    }
    public void setGenero(Enum genero){
        this.genero = genero;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Long getTelefone(){
        return telefone;
    }
    public void setTelefone(Long telefone){
        this.telefone = telefone;
    }
    public Boolean getCelularWhats(){
        return celularWhats;
    }
    public void setCelularWhats(Boolean celularWhats){
        this.celularWhats = celularWhats;
    }
    public String getProfissao(){
        return profissao;
    }
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    public Boolean getEmpregoAtual(){
        return empregoAtual;
    }
    public void setEmpregoAtual(Boolean empregoAtual1){
        this.empregoAtual = empregoAtual;
    }
    public Double getPretencaoSalarial(){
        return pretencaoSalarial;
    }
    public void setPretencaoSalarial(Double pretencaoSalarial){
        this.pretencaoSalarial = pretencaoSalarial;
    }
    public String getHabilidade(){
        return habilidade;
    }
    public void setHabilidade(String habilidade){
        this.habilidade = habilidade;
    }
}
