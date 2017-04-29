package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;

public class Cromosoma extends Individuo {

	//--- Atributos ---//
	private Integer procesador;
	private Integer motherboard;
	private Integer ram;
	private Integer disco;
	private Integer so;
	
	//--- Getters & Setters ---//
	public Integer getProcesador() {
		return procesador;
	}

	public void setProcesador(Integer procesador) {
		this.procesador = procesador;
	}

	public Integer getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Integer motherboard) {
		this.motherboard = motherboard;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getDisco() {
		return disco;
	}

	public void setDisco(Integer disco) {
		this.disco = disco;
	}

	public Integer getSo() {
		return so;
	}

	public void setSo(Integer so) {
		this.so = so;
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
//    public Individuo generarRandom() {
//
//    }
	
//    @Override
//    public String toString() {
//	
//    }
	
}
