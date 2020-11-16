package observerobservable;

import java.util.Observable;
import java.util.Observer;

public class Auto extends Observable{
			
		private String marca;
		private String motor;
		private String color;
		private String modelo;
	 	private String nivelAceite;
	 	private String nivelDeAgua;
	 	private String presionNeumaticos;
	 	
	 	public Auto(String marca,String motor,String color,String modelo,String nivelAceite,String nivelAgua,String Presion )
	 	{
	 		this.marca=marca;
	 		this.motor=motor;
	 		this.color=color;
	 		this.modelo=modelo;
	 		this.nivelAceite=nivelAceite;
	 		this.nivelDeAgua=nivelAgua;
	 		this.presionNeumaticos=Presion;
	 		
	 	}
	 	
	 	
	public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getMotor() {
			return motor;
		}
		public void setMotor(String motor) {
			this.motor = motor;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getNivelAceite() {
			return nivelAceite;
		}
		public void setNivelAceite(String nivelAceite) {
			this.nivelAceite = nivelAceite;
			this.setChanged();
			this.notifyObservers();
		}
		public String getNivelDeAgua() {
			return nivelDeAgua;
		}
		public void setNivelDeAgua(String nivelDeAgua) {
			this.nivelDeAgua = nivelDeAgua;
			this.setChanged();
			this.notifyObservers();
		}
		public String getPresionNeumaticos() {
			return presionNeumaticos;
		}
		public void setPresionNeumaticos(String presionNeumaticos) {
			this.presionNeumaticos = presionNeumaticos;
			this.setChanged();
			this.notifyObservers();
		}


		@Override
		public String toString() {
			String mensaje="Agua:"+this.getNivelDeAgua()+" Aceite:"+this.getNivelAceite()+" Presion:"+this.getPresionNeumaticos();
			return mensaje;
		}


}
