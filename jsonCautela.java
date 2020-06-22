/**
 * 
 */
package consumidorapi;

import java.util.Map;


/**
 * @author willian.bezerra
 * 
 */
public class JsonCautela {

	
	private Integer status_code;
	private String status_message;
	private Boolean success;	
	private Integer itens;
	private Map<Integer, Cautela> lista;

	public Integer getStatus_code() {
		return status_code;
	}


	public void setStatus_code(Integer status_code) {
		this.status_code = status_code;
	}


	public String getStatus_message() {
		return status_message;
	}


	public void setStatus_message(String status_message) {
		this.status_message = status_message;
	}


	public Boolean getSuccess() {
		return success;
	}



	public void setSuccess(Boolean success) {
		this.success = success;
	}


	public Integer getItens() {
		return itens;
	}


	public void setItens(Integer itens) {
		this.itens = itens;
	}


	public Map<Integer, Cautela> getLista() {
		return lista;
	}



	public void setLista(Map<Integer, Cautela> lista) {
		this.lista = lista;
	}	

}