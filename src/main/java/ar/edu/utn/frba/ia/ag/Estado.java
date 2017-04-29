package main.java.ar.edu.utn.frba.ia.ag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estado {
	
	private List<Double> aptitudesPromedio = new ArrayList<Double>();
	private List<Double> totalAptitudes = new ArrayList<Double>();
	private List<Individuo> mejoresIndividuos = new ArrayList<Individuo>();
	private List<Individuo> peoresIndividuos = new ArrayList<Individuo>();
	private int ciclos = 0;
	private int cantMutaciones = 0;
	
	public void agregarTotalAptitudes(Double totalAptitudes) {
		this.totalAptitudes.add(totalAptitudes);
	}
	
	public void agregarAptitudesPromedio(Double promedio) {
		this.aptitudesPromedio.add(promedio);
	}
	public void agregarMejorIndividuo(Individuo mejorIndividuo) {
		this.mejoresIndividuos.add(mejorIndividuo);
	}
	
	public void agregarPeorIndividuo(Individuo peorIndividuo) {
		this.peoresIndividuos.add(peorIndividuo);
	}
	
	public Individuo getMejorIndividuo() {
		
		List<Individuo> mejoresIndividuos = this.mejoresIndividuos; // para no romer el orden original
		
		Collections.sort(this.mejoresIndividuos);
		
		return mejoresIndividuos.isEmpty() ? null : mejoresIndividuos.get(0);
	}
	
	public Individuo getPeorIndividuo() {
		
		List<Individuo> peoresIndividuos = this.peoresIndividuos; // para no romer el orden original
		
		Collections.sort(this.peoresIndividuos);
		
		return peoresIndividuos.isEmpty() ? null : peoresIndividuos.get(peoresIndividuos.size() - 1);
	}
	
	public List<Individuo> getMejoresIndividuos() {
		return mejoresIndividuos;
	}

	public List<Individuo> getPeoresIndividuos() {
		return peoresIndividuos;
	}

	public List<Double> getAptitudesPromedio() {
		return aptitudesPromedio;
	}
	
	public List<Double> getTotalAptitudes() {
		return totalAptitudes;
	}
	
	public Double getTotalUltimaAptitud() {
		return totalAptitudes.get(totalAptitudes.size() - 1);
	}

	public int getCiclos() {
		return ciclos;
	}

	public void setCiclos(int ciclos) {
		this.ciclos = ciclos;
	}

	public void sumarMutacion() {
		this.cantMutaciones  ++;
	}
	
	public int getCantMutaciones() {
		return this.cantMutaciones;
	}

}
