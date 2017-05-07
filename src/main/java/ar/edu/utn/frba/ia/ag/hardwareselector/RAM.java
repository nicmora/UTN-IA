package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

public class RAM extends Componente {

	private Integer frecuencia;
	private Integer capacidad;
	private String tecnologia;

	public RAM(Integer i) {
		switch (i) {
			case 0: {
				this.setId(0);
				this.setModelo("CORSAIR_XMS2");
				this.setPrecio(800);
				this.capacidad = 2;
				this.frecuencia = 800;
				this.tecnologia = "DDR2";
				break;
			}
			case 1: {
				this.setId(1);
				this.setModelo("KINGSTON_HYPERX_FURY");
				this.setPrecio(1700);
				this.capacidad = 8;
				this.frecuencia = 1866;
				this.tecnologia = "DDR3";
				break;
			}
			case 2: {
				this.setId(2);
				this.setModelo("KINGSTON_HYPERX_FURY");
				this.setPrecio(2400);
				this.capacidad = 16;
				this.frecuencia = 1866;
				this.tecnologia = "DDR3";
				break;
			}
			case 3: {
				this.setId(3);
				this.setModelo("KINGSTON_HYPERX_FURY");
				this.setPrecio(3200);
				this.capacidad = 16;
				this.frecuencia = 2400;
				this.tecnologia = "DDR4";
				break;
			}
		}
	}

	public Integer getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Integer frecuencia) {
		this.frecuencia = frecuencia;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
}
