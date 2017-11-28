package models.consumo;

import controllers.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import models.produto.Produto;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aluno
 */

public class ConsumoDAO {

    Connection con;
    
    public ConsumoDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    
    public boolean create(Consumo consumo, JTable tabela){
        
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sqlEmpresa = "INSERT INTO Consumo (quantidade, data, periodo, Produto_idProduto) VALUES (?,?,?,?)";
        String sqlQuery = "SELECT MAX(idConsumo) id FROM Consumo WHERE periodo like concat(?,'%')";
        
        try {
            stmt = con.prepareStatement(sqlEmpresa);
            stmt.setInt(1, consumo.getQuantidade());
            stmt.setDate(2, new java.sql.Date(consumo.getData().getTime()));
            stmt.setString(3, consumo.getPeriodo());
            stmt.setInt(4, consumo.getProduto().getIdProduto());
            
            stmt.executeUpdate();
            
            int id;
            stmt = con.prepareStatement(sqlQuery);
            stmt.setString(1, consumo.getPeriodo());
            rs = stmt.executeQuery();
            rs.first();
            id = rs.getInt("id");
            consumo.setIdConsumo(id);
            
            this.listaConsumo(tabela, consumo);
            JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
            
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro ao Inserir: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    
    public void listaConsumo(JTable tabela, Consumo consumo){
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String sql = "SELECT idConsumo id, quantidade, periodo FROM Consumo, Produto WHERE Produto_idProduto = ? GROUP BY id";
            
            try{
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, consumo.getProduto().getIdProduto());
                rs = stmt.executeQuery();
                tabela.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(SQLException ex){
                System.out.println(ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
    }
    
    public boolean haveConsumo(Produto produto){
        
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sqlQuery = "SELECT MAX(idConsumo) id FROM Consumo WHERE Produto_idProduto = ?";
        
        try{
            stmt = con.prepareStatement(sqlQuery);
            stmt.setInt(1, produto.getIdProduto());
            rs = stmt.executeQuery();
            if(rs.next()){
                return true;
            }
        }catch(SQLException ex){
            System.err.println("Erro ao encontrar resultado de consumo: "+ ex);
        }
        return false;
    }

    public String findPeriodoAnterior(Produto produto) {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sqlQuery = "SELECT MAX(idConsumo) id, periodo FROM Consumo WHERE Produto_idProduto like concat(?,'%') GROUP BY periodo";
        String periodo = null;
        
        try{
            stmt = con.prepareStatement(sqlQuery);
            stmt.setInt(1, produto.getIdProduto());
            rs = stmt.executeQuery();
            while(rs.next()){
                periodo = rs.getString(2);
            }
            return periodo;
        }catch(SQLException ex){
            System.err.println("Erro ao procurar periodo do consumo: "+ ex);
        }
        return null;
    }
}

