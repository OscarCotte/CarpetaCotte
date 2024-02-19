
public class Tarea {

	public String id;
	public String descripcion; 
	public String fechaLimite;
	public String estado;
	
	public Tarea(String id, String descripcion, String fechaLimite, String estado) {
		this.id = id;
		this.descripcion = descripcion;
		this.fechaLimite = fechaLimite;
		this.estado = estado;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getFechaLimite() {
		return fechaLimite;
	}
	
	public String getEstado() {
		return estado;
	}
}
