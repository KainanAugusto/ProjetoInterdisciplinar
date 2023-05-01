
package br.com.garagem.ctr;
import java.sql.ResultSet;
import br.com.garagem.dto.ClienteDTO;
import br.com.garagem.dao.ClienteDAO;
import br.com.garagem.dao.ConexaoDAO;
public class ClienteCTR {
    
    public ClienteCTR() {
    }

    ClienteDAO clienteDAO = new ClienteDAO();
    ClienteDTO clienteDTO = new ClienteDTO();
    ConexaoDAO conexaoDAO = new ConexaoDAO();

    public String inserirCliente(ClienteDTO clienteDTO) {
        try {
            //chama o metodo que esta na calsse DAO agurdando uma repsota (true ou false)

            if (clienteDAO.inserirCliente(clienteDTO)) {
                return "Cliente cadastrado com sucesso!!!";
            } else {
                return "Cliente NÃO cadastrado";
            }
        } //caso tenhaalgum erro no codigo é enviado uma mensagem no console o que esta acontecendo
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO cadastrado";
        }
    }
    
     public String alterarCliente(ClienteDTO clienteDTO) {
        try {
            // chama o metodo que esta na calsse DAO aguardando uma resposta (true ou false)
            if (clienteDAO.alterarCliente(clienteDTO)) {
                return "Cliente ALTERADO com sucesso!!! ";
            } else {
                return "Cliente NÃO alterado!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente NÃO alterado!!!";
        }
    }
 public String excluirCliente(ClienteDTO clienteDTO) {
        try {
            //chama o metodo que essta na classe DAO aguardando uma repsosta true ou false

            if (clienteDAO.excluirCliente(clienteDTO))   {
                return "Cliente excluido com sucesso!!!";
            } else {
                return "Cliente NAO excluido!";
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
            return "Cliente NÃO excluido";
        } 
    }
 
 public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao) {
        // É Criado um atributo do tipo REsultSet, pois este metodo recebe o resultado de uma consulta
        ResultSet rs = null;
        // O Atributo rs recevbe a consulta realizada pelo metodo da calsse DAO
        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        return rs;
    }// fecha o metodo consultarCliente
 public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
