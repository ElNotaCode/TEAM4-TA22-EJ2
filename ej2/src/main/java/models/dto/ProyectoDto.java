package models.dto;

public class ProyectoDto {
	
	private String id;
	private String nombre;
	private String horas;
	
	
	public ProyectoDto() {
		
	}
	
	public ProyectoDto(String id, String nombre, String horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}
	
	@Override
	public String toString() {
		return "ProyectoDto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}
	
}
