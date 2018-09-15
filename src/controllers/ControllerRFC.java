/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewRFC;
import models.ModelRFC;
import extras.DataValidation;
/**
 *
 * @author LENOVO
 */
public class ControllerRFC implements ActionListener{
    ModelRFC modelRFC;
    ViewRFC viewRFC;
    ActionListener actionlistener;
    DataValidation datavalidation = new DataValidation();

    public ControllerRFC(ModelRFC modelRFC, ViewRFC viewRFC) {
        this.modelRFC = modelRFC;
        this.viewRFC = viewRFC;
        this.viewRFC.jb_pedir_rfc.addActionListener(this);
        initComponents();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewRFC.jb_pedir_rfc){
            jb_calcular_action_performed();
        }
        
    }

    public void ObtenerValores() {
        modelRFC.setNombre(viewRFC.jtf_nombre.getText());
        modelRFC.setApellidop(viewRFC.jtf_appaterno.getText());
        modelRFC.setApellidom(viewRFC.jtf_apmaterno.getText());
        modelRFC.setAnioo(viewRFC.jtf_anio.getText());
        modelRFC.setMess(viewRFC.jtf_mes.getText());
        modelRFC.setDiaa(viewRFC.jtf_dia.getText());
        modelRFC.setAnio(datavalidation.stringInt(viewRFC.jtf_anio.getText()));
        modelRFC.setMes(datavalidation.stringInt(viewRFC.jtf_mes.getText()));
        modelRFC.setDia(datavalidation.stringInt(viewRFC.jtf_dia.getText()));
    }
    public void Asignacion() {
        
        viewRFC.jl_rfc.setText("RFC: " + modelRFC.getRfc().toUpperCase());
    }
    

    public void jb_calcular_action_performed() {
        this.ObtenerValores();
        modelRFC.rfc();
        this.Asignacion();
    }
   
    public void initComponents() {
        viewRFC.setVisible(true);
    }
}
