
package br.com.garagem.ctr;

import br.com.garagem.dao.ConexaoDAO;
import br.com.garagem.dao.VendaDAO;
import br.com.garagem.dto.ClienteDTO;
import br.com.garagem.dto.VendaDTO;
import javax.swing.JTable;

public class VendaCTR {
    VendaDAO vendaDAO = new VendaDAO();
    
    public String inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, JTable produtos) {
    try{
        if(vendaDAO.inserirVenda(vendaDTO, clienteDTO, produtos))
            return "Venda cadastrada com sucesso";
        
        else
            return "venda NÃO cadastrada";
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Venda NÃO cadastrada";
        } 
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
}