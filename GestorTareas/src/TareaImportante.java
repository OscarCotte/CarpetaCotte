
public class TareaImportante extends Tarea {
	
	private String limiteFecha = "16/02/2024";
	public String tipo = "Importante";
	
	public TareaImportante(String id, String descripcion, String fechaLimite, String estado) {
		super(id,descripcion,fechaLimite,estado); 
		
	}
	
	public void mostrarDatos2() {
		System.out.println("\nid:"+getId()+"\ndescripcion:"+getDescripcion()+"\nfecha limite:"+limiteFecha+"\nestado:"
	+getEstado()+"\ntipo:"+tipo);
		
	}
}
