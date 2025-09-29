/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impressao3d;

public class PedidosTotais {
    private String nomeModelagem;
    private int id; //gerada a cada pedido
    private Cliente cliente;
    private double altura;
    private double comprimento;
    private double peso;
    private double volume;
    private String tempoImpressao;
    private String foto;
    private String dataEntrega;
    private String obs;
    private String material;
    private double valor;
    private String tempoModeladar;
    private double taxaDoTempo;
    private double taxaMaterial;
    private double taxaEnvio;

    public PedidosTotais(String nomeModelagem, int id, Cliente cliente, double altura, double comprimento, double peso, double volume,
            String tempoImpressao, String foto, String dataEntrega, String obs, String material, double valor, String tempoModeladar,
            double taxaDoTempo, double taxaMaterial, double taxaEnvio) {
        this.nomeModelagem = nomeModelagem;
        this.id = id;
        this.cliente = cliente;
        this.altura = altura;
        this.comprimento = comprimento;
        this.peso = peso;
        this.volume = volume;
        this.tempoImpressao = tempoImpressao;
        this.foto = foto;
        this.dataEntrega = dataEntrega;
        this.obs = obs;
        this.material = material;
        this.valor = valor;
        this.tempoModeladar = tempoModeladar;
        this.taxaDoTempo = taxaDoTempo;
        this.taxaMaterial = taxaMaterial;
        this.taxaEnvio = taxaEnvio;
    }
    public String getTempoModeladar() {
        return tempoModeladar;
    }
    public double getTaxaDoTempo() {
        return taxaDoTempo;
    }
    public double getTaxaMaterial() {
        return taxaMaterial;
    }
    public double getTaxaEnvio() {
        return taxaEnvio;
    }
    public String getNomeModelagem() {
        return nomeModelagem;
    }
    public double getValor() {
        return valor;
    }
    public String getMaterial() {
        return material;
    }  
    public int getId() {
        return id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public double getAltura() {
        return altura;
    }
    public double getComprimento() {
        return comprimento;
    }
    public double getPeso() {
        return peso;
    }
    public double getVolume() {
        return volume;
    }
    public String getTempoImpressao() {
        return tempoImpressao;
    }
    public String getFoto() {
        return foto;
    }
    public String getDataEntrega() {
        return dataEntrega;
    }
    public String getObs() {
        return obs;
    }

    public void setTempoModeladar(String tempoModeladar) {
        this.tempoModeladar = tempoModeladar;
    }
    public void setTaxaDoTempo(double taxaDoTempo) {
        this.taxaDoTempo = taxaDoTempo;
    }
    public void setTaxaMaterial(double taxaMaterial) {
        this.taxaMaterial = taxaMaterial;
    }
    public void setTaxaEnvio(double taxaEnvio) {
        this.taxaEnvio = taxaEnvio;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void setTempoImpressao(String tempoImpressao) {
        this.tempoImpressao = tempoImpressao;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public void setObs(String obs) {
        this.obs = obs;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setNomeModelagem(String nomeModelagem) {
        this.nomeModelagem = nomeModelagem;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    

  

   
}
