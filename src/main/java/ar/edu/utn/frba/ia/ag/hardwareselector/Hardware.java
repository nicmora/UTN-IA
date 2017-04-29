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
    	hardware.setDisco(new Disco(random.nextInt(8 - 0 + 1) + 0));
    	hardware.setSo(new SO(random.nextInt(3 - 0 + 1) + 0));

    	return hardware;
    }
    

	//--- Funcion de aptitud ---//
	@Override
	public double aptitud() {

		double total = 0;
		
		total += this.verificarCondicionesNecesarias();
		total += this.verificarCondicionesDeseables();
		total += this.verificarRestriccionesVioladas();
		total += this.verificarCombinacionesInvalidas();
		
		return total;
	}

	private double verificarCondicionesNecesarias() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private double verificarCondicionesDeseables() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private double verificarRestriccionesVioladas() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double verificarCombinacionesInvalidas() {
		// TODO Auto-generated method stub
		return 0;
	}
	
//    @Override
//    public String toString() {
//	
//    }
	
}