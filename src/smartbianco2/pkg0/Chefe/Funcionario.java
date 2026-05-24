package smartbianco2.pkg0.Chefe;

public class Funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private String dataNascimento; // O dado "oculto" que vamos salvar!

    // Construtor para criar o funcionário com todos os dados
    public Funcionario(String nome, String cpf, String telefone, String genero, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters (Necessários para ler e atualizar os dados depois)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
}