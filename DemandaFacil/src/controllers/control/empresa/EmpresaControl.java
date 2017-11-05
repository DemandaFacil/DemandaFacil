/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.controlView;

import models.empresa.Empresa;
import models.empresa.EmpresaDAO;
import views.empresa.PerfilEmpresa;

/**
 *
 * @author akira
 */
public class EmpresaControl extends CoreControl {
    
    public boolean saveEmpresa(String nome, String CNPJ){
        
        Empresa empresa = new Empresa();
        EmpresaDAO dao = new EmpresaDAO();
        
        empresa.setNome(nome);
        empresa.setCNPJ(CNPJ);
        //empresa.setUsuario(this.getUsuario());
        
        if(dao.create(empresa)){
            PerfilEmpresa perfilEmpresa = new PerfilEmpresa();
        
            perfilEmpresa.setObject(empresa);
        
            perfilEmpresa.setVisible(true);
            
            return true;
        }
        return false;
    }
    
    
    
}
