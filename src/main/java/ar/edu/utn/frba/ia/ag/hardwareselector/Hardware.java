package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

import java.util.Random;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;

public class Hardware extends Individuo {

	//--- Atributos ---//
	private Procesador procesador;
	private Motherboard motherboard;
	private RAM ram;
	private Disco disco;
	private SO so;
	
	//--- Getters & Setters ---//
	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco disco) {
		this.disco = disco;
	}
	
	public SO getSo() {
		return so;
	}

	public void setSo(SO so) {
		this.so = so;
	}

	@Override
    public Individuo generarRandom() {
    	
    	Hardware hardware = new Hardware();
    	Random random = new Random();
    	
        // random.nextInt(max - min + 1) + min
    	hardware.setProcesador(new Procesador(random.nextInt(7 - 0 + 1) + 0));
    	hardware.setMotherboard(new Motherboard(random.nextInt(7 - 0 + 1) + 0));
    	hardware.setRam(new RAM(random.nextInt(3 - 0 + 1) + 0));
    	hardware.setDisco(new Disco(random.nextInt(7 - 0 + 1) + 0));
    	hardware.setSo(new SO(random.nextInt(3 - 0 + 1) + 0));

    	return hardware;
    }
    

	//--- Funcion de aptitud ---//
	@Override
	public double aptitud() {

		double total = 0;
		
		total += this.verificarCondicionesDeseables();
		total += this.verificarRestriccionesVioladas();
		total += this.verificarCombinacionesInvalidas();
		
		return total;
	}

	private double verificarCondicionesDeseables() {

		double puntosAptitud = 0;
		
		//Si el procesador es Core i7, sumar 100 puntos.
		if(this.procesador.getModelo().contains("INTEL_CORE_I7")) {
			puntosAptitud += 590;
		}
		
		//Si el procesador es Core i5, sumar 60 puntos.
		if(this.procesador.getModelo().contains("INTEL_CORE_I5")) {
			puntosAptitud += 510;
		}
		
		//Si el procesador es 7ma Gen, sumar 40 puntos.
		if(this.procesador.getGeneracion().equals(7)) {
			puntosAptitud += 490;
		}
		
		//Si el procesador es 6ta Gen, sumar 25 puntos.
		if(this.procesador.getGeneracion().equals(6)) {
			puntosAptitud += 410;
		}
		
		//Si la RAM es DDR4, sumar 20 puntos.
		if(this.ram.getTecnologia().equals("DDR4")) {
			puntosAptitud += 390;
		}
		
		//Si el Disco Rígido es SSD, sumar 15 puntos.
		if(this.disco.getTecnologia().equals("SSD")) {
			puntosAptitud += 290;
		}
		
		return puntosAptitud;
	}
	
	private double verificarRestriccionesVioladas() {

		double puntosAptitud = 0;
		
		//Si la RAM es superior a 8 GB, pero el SO no tiene arquitectura x64, restar 50 puntos.
		if(this.ram.getCapacidad() > 8 && !this.so.getArquitectura().equals("x64")) {
			puntosAptitud -= 60;
		}
		
		return puntosAptitud;
	}

	private double verificarCombinacionesInvalidas() {

		boolean combinacionInvalida = false;
		double puntosAptitud = 0;
		
		// Cualquier Motherboard que posea una característica marcada como inválida (con valor 110 o 111), resta 500 puntos.	
		if (this.getMotherboard().getModelo().equals("INVALIDO")) {
			combinacionInvalida = true;
		}
		
		// Cualquier Disco que posea una característica marcada como inválida (con valor 110 o 111), resta 500 puntos.
		if(this.disco.getModelo().equals("INVALIDO")) {
			combinacionInvalida = true;
		}
		
		// Si el procesador es 4ta Gen y el Motherboard no tiene Socket 1150, resta 500 puntos.
		if(this.procesador.getGeneracion() == 4 && !this.motherboard.getSocketProcesador().equals("LGA_1150")) {
			combinacionInvalida = true;
		}
		
		// Si el procesador es 6ta Gen o 7ma Gen y el Motherboard no tiene Socket 1151, resta 500 puntos.
		if((this.procesador.getGeneracion() == 6 || this.procesador.getGeneracion() == 7) && !this.motherboard.getSocketProcesador().equals("LGA_1151")) {
			combinacionInvalida = true;
		}
		
		// Si la RAM es DDR4 y el Motherboard no soporta la tecnología DDR4, resta 500 puntos.
		if(this.ram.getTecnologia().equals("DDR4") && !this.motherboard.getSocketMemoria().equals("DDR4")) {
			combinacionInvalida = true;
		}
			
		// El procesador debe ser Intel Core i3 o i5 o i7.
		if(!this.procesador.getModelo().contains("INTEL_CORE_I")) {
			combinacionInvalida = true;
		}
		
		// El procesador debe ser 4ta, 6ta o 7ma Gen.
		if(!(this.procesador.getGeneracion() == 4 || this.procesador.getGeneracion() == 6 || this.procesador.getGeneracion() == 7)) {
			combinacionInvalida = true;
		}
				
		// La RAM debe ser DDR3 o DDR4.
		if(!(this.ram.getTecnologia().equals("DDR3") || this.ram.getTecnologia().equals("DDR4"))) {
			combinacionInvalida = true;
		}
			
		// La RAM debe ser superior a 2 GB.
		if(this.ram.getCapacidad() <= 2) {
			combinacionInvalida = true;
		}
			
		// El Disco Rígido debe ser superior a 320 GB.
		if(this.disco.getCapacidad() <= 320) {
			combinacionInvalida = true;
		}
		
		// El SO debe ser Windows 10 Home Edition.
		if(!this.so.getModelo().equals("WINDOWS_10_HOME_EDITION")) {
			combinacionInvalida = true;
		}
		
		//Si la suma total del precio de todas las prestaciones es mayor a 18.500$ resta 500 puntos.
		if(this.procesador.getPrecio() != null 
			&& this.motherboard.getPrecio() != null
			&& this.ram.getPrecio() != null
			&& this.disco.getPrecio() != null
			&& this.so.getPrecio() != null) {
			
			Integer precioTotal = this.procesador.getPrecio() + this.motherboard.getPrecio() + this.ram.getPrecio() + this.disco.getPrecio() + this.so.getPrecio();
			
			if(precioTotal > 18500) {
				combinacionInvalida = true;
			}
		}
		
		if(combinacionInvalida) {
			puntosAptitud -= 5000;			
		}
		
		return puntosAptitud;
	}
	
    @Override
    public String toString() {
      
       StringBuilder strBuilder = new StringBuilder();
       strBuilder.append("\n");
       strBuilder.append("Procesador: ").append(this.procesador.getModelo()).append("\n");
       strBuilder.append("Motherboard: ").append(this.motherboard.getModelo()).append("\n");
       strBuilder.append("RAM: ").append(this.ram.getModelo()).append(" ").append(this.ram.getCapacidad()).append("GB").append(" ").append(this.ram.getFrecuencia()).append("MHZ").append(" ").append(this.ram.getTecnologia()).append("\n");
       strBuilder.append("Disco: ").append(this.disco.getModelo()).append(" ").append(this.disco.getCapacidad()).append("GB").append(" ").append(this.disco.getTecnologia()).append("\n");
       strBuilder.append("SO: ").append(this.so.getModelo()).append(" ").append(this.so.getArquitectura()).append("\n");
       strBuilder.append("Precio = ").append(this.procesador.getPrecio() + this.motherboard.getPrecio() + this.ram.getPrecio() + this.disco.getPrecio() + this.so.getPrecio()).append("\n");
      
       return strBuilder.toString();
    }
	
}