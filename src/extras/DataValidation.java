/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;
import views.ViewRFC;
import models.ModelRFC;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Felix
 */
public class DataValidation {
    ModelRFC modelcalculadora;
    ViewRFC viewcalculadora;
    ActionListener actionlistener;
    public int stringInt(String value){
        int numero=0;
        try{
        numero=Integer.parseInt(value);
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Solo se permite numeros y numeros enteros");
            numero=0;
        }
        return numero;
    }
    public double stringDouble(String value){
        int numero=0;
        try{
        numero=(int) Double.parseDouble(value);
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Solo se permite numeros");
            numero=0;
        }
        return numero;
    }
    public float stringFloat(String value){
        float numero=0.0f;
        try{
        numero=Float.parseFloat(value);
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Solo se permite numeros");
            numero=0;
        }
        return numero;
    }
}
