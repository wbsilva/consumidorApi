/**
 * 
 */
package consumidorapi;

import java.util.Map;



/**
 * @author willian.bezerra
 * 
 */

public class Cautela {
	private String patrimonio;
	private String tipo;
	private String serie;
	private String marca;
	private String modelo;
	private int item;
	
	
	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public String getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	@Override
	public String toString() {
		return "Cautela [item=" + item + ", patrimonio=" + patrimonio + ", tipo=" + tipo + ", serie=" + serie + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

}
