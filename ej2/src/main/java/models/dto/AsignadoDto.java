package models.dto;

public class AsignadoDto {

	private String dni;
	private String id;
	
	
	
	
	public AsignadoDto(String dni, String id) {
		super();
		this.dni = dni;
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
