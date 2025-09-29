/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impressao3d;

public class PedidoExterno extends Pedidos {
    private double taxaEnvio;

    public PedidoExterno(String nomeModelagem, int id, Cliente cliente, double altura, double comprimento, double peso, double volume,
            String tempoImpressao, String foto, String dataEntrega, String obs, String material,double valor, double taxaEnvio) {
        super(nomeModelagem,id, cliente, altura, comprimento, peso, volume, tempoImpressao, foto, dataEntrega, obs, material,valor);
        this.taxaEnvio = taxaEnvio;
    }

    public double getTaxaEnvio() {
        return taxaEnvio;
    }

    public void setTaxaEnvio(double taxaEnvio) {
        this.taxaEnvio = taxaEnvio;
    }

   
}
