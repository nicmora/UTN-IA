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
		
		//TODO: se puede mejorar modificando los atributos
		//Si el procesador es Core i7, sumar 100 puntos.
		if(this.procesador.getId().equals(1) 
			|| this.procesador.getId().equals(4)
			|| this.procesador.getId().equals(7)) {
				puntosAptitud += 100;
		}
		
		//TODO: se puede mejorar modificando los atributos
		//Si el procesador es Core i5, sumar 60 puntos.
		if(this.procesador.getId().equals(0) 
			|| this.procesador.getId().equals(6)) {
				puntosAptitud += 60;
		}
		
		//Si el procesador es 7ma Gen, sumar 40 puntos.
		if(this.procesador.getGeneracion().equals(7)) {
			puntosAptitud += 40;
		}
		
		//Si el procesador es 6ta Gen, sumar 25 puntos.
		if(this.procesador.getGeneracion().equals(6)) {
			puntosAptitud += 25;
		}
		
		//Si la RAM es DDR4, sumar 20 puntos.
		if(this.ram.getTecnologia().equals("DDR4")) {
			puntosAptitud += 20;
		}
		
		//Si el Disco R�gido es SSD, sumar 15 puntos.
		if(this.disco.getTeconologia().equals("SSD")) {
			puntosAptitud += 15;
		}
		
		return puntosAptitud;
	}
	
	private double verificarRestriccionesVioladas() {

		double puntosAptitud = 0;
		
		//Si la RAM es superior a 8 GB y tiene Windows 10 Home Edition, pero no tiene arquitectura x64, restar 50 puntos.
		if(this.ram.getCapacidad() > 8
			&& this.so.getModelo().equals("WINDOWS_10_HOME_EDITION")
			&& !this.so.getArquitectura().equals("x64")) {
			puntosAptitud -= 50;
		}
		
		////Cualquier soluci�n que no cumpla al menos con las CN resta 500 puntos.
		//El procesador debe ser Intel Core i3 o i5 o i7.
		
		
		//El procesador debe ser 4ta, 6ta o 7ma Gen.
		
		
		//La RAM debe ser DDR3 o DDR4.
		
		
		//La RAM debe ser superior a 2 GB.
		
		
		//El Disco R�gido debe ser superior a 320 GB.
		
		
		//El SO debe ser Windows 10 Home Edition.

		
		
		//Si la suma total del precio de todas las prestaciones es mayor a 18.500$ resta 500 puntos.

		
		return puntosAptitud;
	}

	private double verificarCombinacionesInvalidas() {

		double puntosAptitud = 0;
		
		return puntosAptitud;
	}
	
//    @Override
//    public String toString() {
//	
//    }
	
}