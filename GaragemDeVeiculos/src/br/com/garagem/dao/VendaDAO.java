
package br.com.garagem.dao;

import br.com.garagem.dto.ClienteDTO;
import br.com.garagem.dto.VendaDTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class VendaDAO {
    
    public VendaDAO() {
    }
    
    //Atibuto do tipo nResultSet utilizado para arealizar consultas
    private ResultSet rs = null;
    //Manipular o anco de dados
    Statement stmt = null;
    Statement stmt1 = null;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");



    public boolean inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, JTable produtos){
    try{
        ConexaoDAO.ConectDB();
        stmt = ConexaoDAO.con.createStatement();
        stmt1 = ConexaoDAO.con.createStatement();
        
        
        String comando1 = "Insert into Venda(data_vend, val_vend, "
                + "id_cliente) values ("
                + "to_date('" +date.format(vendaDTO.getDat_vend()) + "', 'DD//MM/YYYY), "
                + vendaDTO.getVal_vend()+ ", "
                + clienteDTO.getId_cliente() + ")";
        
        stmt.execute(comando1.toUpperCase(),Statement.RETURN_GENERATED_KEYS);
        rs = stmt.getGeneratedKeys();
        rs.next();
        
        for(int cont=0; cont < produtos.getRowCount(); cont++){
            String comando2 = "Insert into produto_venda (id_vend, id_vend, "
                    + "val_prod, qtd_prod) values ( "
                    + rs.getInt("id_vend") + ", "
                    + produtos.getValueAt(cont, 0) + ", "
                    + produtos.getValueAt(cont, 2) + ", "
                    + produtos.getValueAt(cont, 3) + "); ";
            
            stmt1.execute(comando2);
            }
        
        ConexaoDAO.con.commit();
        stmt.close();
        rs.close();
        return true;
    }    
    catch(Exception e){
                System.out.println(e.getMessage());
                return false;
    }
    finally{
                ConexaoDAO.CloseDB();
    }
    }
}