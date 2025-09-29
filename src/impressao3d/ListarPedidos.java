/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impressao3d;

import java.util.ArrayList;

public class ListarPedidos {
        public ArrayList<PedidosTotais> ListaTotal = new ArrayList();
        
        
        public void listarTotal(PedidosTotais PT){
            ListaTotal.add(PT);
        }
         
}
