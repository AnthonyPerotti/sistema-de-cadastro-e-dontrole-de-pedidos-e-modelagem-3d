/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impressao3d;

public class PedidoModelagemZero extends Pedidos {
   private String tempoModeladar;
   private double taxaDoTempo;

    public PedidoModelagemZero( String nomeModelagem, int id, Cliente cliente, double altura, double comprimento, double peso, double volume, 
            String tempoImpressao, String foto, String dataEntrega, String obs, String material, double valor,String tempoModeladar, double taxaDoTempo) {
        super(nomeModelagem,id, cliente, altura, comprimento, peso, volume, tempoImpressao, foto, dataEntrega, obs, material, valor);
        this.tempoModeladar = tempoModeladar;
        this.taxaDoTempo = taxaDoTempo;
    }

    public String getTempoModeladar() {
        return tempoModeladar;
    }

    public double getTaxaDoTempo() {
        return taxaDoTempo;
    }

    public void setTempoModeladar(String tempoModeladar) {
        this.tempoModeladar = tempoModeladar;
    }

    public void setTaxaDoTempo(double taxaDoTempo) {
        this.taxaDoTempo = taxaDoTempo;
    }

}
