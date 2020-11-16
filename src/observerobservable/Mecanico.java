package observerobservable;

import java.awt.List;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Mecanico implements Observer{

			private String presupuesto;
			private String nombre;
			private String solucion;
			
			
			public Mecanico(String presu,String nombre,String solucion)
			{
				this.presupuesto=presu;
				this.nombre=nombre;
				this.solucion=solucion;	
			}
			
	public String getPresupuesto() {
				return presupuesto;
			}
			public void setPresupuesto(String presupuesto) {
				this.presupuesto = presupuesto;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getSolucion() {
				return solucion;
			}

			public void setSolucion(String solucion) {
				this.solucion = solucion;
			}




	@Override
	public void update(Observable o, Object arg1) {
		
		System.out.println("Niveles"+((Auto)o).toString());
	}

}
