
public class TareaSimple extends Tarea {

	public String tipo = "Simple";
	
	public TareaSimple(String id, String descripcion, String fechaLimite, String estado) {
		super(id,descripcion,fechaLimite,estado); 
		
	}
	
	public void mostrarDatos() {
		System.out.println("id:" + getId() + "\ndescripcion:"+ getDescripcion() + "\nfecha limite:" + getFechaLimite()
		+ "\nestado:" + getEstado() + "\ntipo:" + tipo);
		
	}
}
