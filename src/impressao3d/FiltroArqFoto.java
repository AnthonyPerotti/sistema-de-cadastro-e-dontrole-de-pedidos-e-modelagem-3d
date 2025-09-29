/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impressao3d;

import java.io.File;

public class FiltroArqFoto extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getAbsolutePath().endsWith(".jpg") 
                || f.getAbsolutePath().endsWith(".jpeg") || f.getAbsolutePath().endsWith(".png");
    }

    @Override
    public String getDescription() {
       return "Arquivos Fotos (*.png)";
    }
    
    
}
