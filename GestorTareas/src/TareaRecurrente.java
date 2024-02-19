
public class TareaRecurrente extends Tarea{
	
	public String tipo = "Recurrente";
	public String repetirTarea;
	
	public TareaRecurrente(String id, String descripcion, String fechaLimite, String estado, String string) {
		super(id,descripcion,fechaLimite,estado); 
		this.repetirTarea = "";
	}
	
	public void mostrarDatos3() {
		System.out.println("\nid:"+getId()+"\ndescripcion:"+getDescripcion()+"\nfecha limite:"+getFechaLimite()
		+"\nproxima fecha limite:"+repetirTarea+"\nestado:"+getEstado()+"\ntipo:"+tipo);
		
	}
}
