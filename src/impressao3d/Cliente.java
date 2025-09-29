/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impressao3d;

public class Cliente {
    private String nome;
    private String email;
    private String CPF;
    private String contato;
    private String rua;
    private String numeroCasa;
    private String CEP;
    private String bairro;
    private String cidade;
    private String estado;

    public Cliente(String nome, String email, String CPF, String contato, String rua,
            String numeroCasa, String CEP, String bairro, String cidade, String estado) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.contato = contato;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.CEP = CEP;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getCPF() {
        return CPF;
    }
    public String getContato() {
        return contato;
    }
    public String getRua() {
        return rua;
    }
    public String getNumeroCasa() {
        return numeroCasa;
    }
    public String getCEP() {
        return CEP;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
