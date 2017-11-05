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
public class EmpresaControlSave extends EmpresaControl{
    
    public boolean saveEmpresa(String nome, String CNPJ){
        if(saveDados(nome, CNPJ)){
            returnPerfilEmpresa();
            return true;
        }
        return false;
    }
    
    public boolean saveDados(String nome, String CNPJ){
        
        
        if(validaDados(nome, CNPJ)){
            getEmpresa().setNome(nome);
            getEmpresa().setCNPJ(CNPJ);
            getEmpresa().setUsuario(getUsuario());
            
            EmpresaDAO dao = new EmpresaDAO();
            
            return dao.create(getEmpresa());
        }
        return false;
    }
}
