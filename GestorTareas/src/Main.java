
public class Main {

	public static void main(String[] args) {
		TareaSimple tareaSimple = new TareaSimple("1","hacer la tarea de programacion","14/02/2024","en curso");

		tareaSimple.mostrarDatos();
		
		TareaImportante tareaImportante = new TareaImportante("2","revisar classroom de matematicas","16/02/2024","pendiente");
		
		tareaImportante.mostrarDatos2();
		
		TareaRecurrente tareaRecurrente = new TareaRecurrente("3","trabajo de base de datos","10/02/2024","13/02/2024","terminada");
		
		tareaRecurrente.mostrarDatos3();
	}
	

}
