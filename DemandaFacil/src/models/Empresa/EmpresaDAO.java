/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Empresa;

import controllers.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akira
 */
public class EmpresaDAO {
    
    Connection con;

    public EmpresaDAO() {
        this.con = ConnectionFactory.getConnection();
    }

    
    public void save(Empresa empresa){
        
        PreparedStatement stmt = null;
        String sql= "INSERT INTO Empresa (CNPJ, nome) VALUES (?,?)";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, empresa.getCNPJ());
            stmt.setString(2, empresa.getNome());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Erro: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Empresa> findAll(){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql= "SELECT * FROM Empresa";
        List<Empresa> empresas = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Empresa empresa = new Empresa();
                empresa.setCNPJ(rs.getString("CNPJ"));
                empresa.setNome(rs.getString("nome"));
                
                empresas.add(empresa);
                
            }

        } catch (SQLException ex) {
            System.err.println("Erro: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return empresas;
    }
    
    public void update(Empresa empresa){
        
        PreparedStatement stmt = null;
        String sql= "UPDATE Empresa SET ";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, empresa.getCNPJ());
            stmt.setString(2, empresa.getNome());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Erro: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
