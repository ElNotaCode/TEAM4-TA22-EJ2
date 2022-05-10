package models.dto;

public class CientificosDto {

	//esto es un objeto Cientifico, que recogerá todos los datos,
	//el data transfer object se mandará como parametro al data access object
	
	//buena practica declararlas en private
	private String dni;
	private String nomApels;
	
	//constructor con sus parametros
	public CientificosDto(String dni, String nomApels) {
		this.dni = dni;
		this.nomApels = nomApels;
	}

	//geters y setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	
	
}
