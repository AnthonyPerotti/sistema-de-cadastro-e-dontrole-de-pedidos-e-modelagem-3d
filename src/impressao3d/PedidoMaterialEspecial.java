/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impressao3d;

public class PedidoMaterialEspecial extends Pedidos {
     private double taxaMaterial;

    public PedidoMaterialEspecial(String nomeModelagem, int id, Cliente cliente, double altura, double comprimento, double peso, double volume, 
            String tempoImpressao, String foto, String dataEntrega, String obs, String material,double valor, double taxaMaterial) {
        super(nomeModelagem,id, cliente, altura, comprimento, peso, volume, tempoImpressao, foto, dataEntrega, obs, material,valor);
        this.taxaMaterial = taxaMaterial;
    }

   
    public double getTaxaMaterial() {
        return taxaMaterial;
    }
    public void setTaxaMaterial(double taxaMaterial) {
        this.taxaMaterial = taxaMaterial;
    }
     
}


