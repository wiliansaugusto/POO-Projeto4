package Dados;

public class Fornecedor {
    private String nome, razao, CNPJ, email, telefone, endereco;
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRazao() { return razao; }
    public void setRazao(String razao) { this.razao = razao; }

    public String getCNPJ() { return CNPJ; }
    public void setCNPJ(String CNPJ) { this.CNPJ = CNPJ; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
