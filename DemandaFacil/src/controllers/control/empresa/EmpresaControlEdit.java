/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.control.empresa;

import models.empresa.Empresa;
import models.empresa.EmpresaDAO;

/**
 *
 * @author akira
 */
public class EmpresaControlEdit extends EmpresaControl {
    
    public boolean editEmpresa(Empresa empresa, String nome){
        
        setEmpresa(empresa);
        
        if(editDados(nome)){
            returnPerfilEmpresa();
            
            return true;
        }
        return false;
    }
    
    public boolean editDados(String nome){
                
        if(validaNome(nome)){
            getEmpresa().setNome(nome);
            
            EmpresaDAO dao = new EmpresaDAO();
            
            return dao.update(getEmpresa());
        }
        return false;
    }
}
