package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

public class Disco extends Componente {

	private String teconologia;
	private Integer capacidad; // Medido en : GB

	public Disco(Integer i) {
		switch (i) {
			case 0: {
				this.setId(0);
				this.setModelo("WD_CAVIAR_BLACK");
				this.setPrecio(1800);
				this.capacidad = 1024;
				this.teconologia = "HDD";
			}
			case 1: {
				this.setId(1);
				this.setModelo("WD_CAVIAR_BLUE");
				this.setPrecio(1000);
				this.capacidad = 500;
				this.teconologia = "HDD";
			}
			case 2: {
				this.setId(2);
				this.setModelo("SSD_WD_GREEN");
				this.setPrecio(3500);
				this.capacidad = 500;
				this.teconologia = "SSD";
			}
			case 3: {
				this.setId(3);
				this.setModelo("SSD_WD_BLACK");
				this.setPrecio(4200);
				this.capacidad = 1024;
				this.teconologia = "SSD";
			}
			case 4: {
				this.setId(4);
				this.setModelo("TOSHIBA");
				this.setPrecio(700);
				this.capacidad = 250;
				this.teconologia = "HDD";
			}
			case 5: {
				this.setId(5);
				this.setModelo("TOSHIBA");
				this.setPrecio(1100);
				this.capacidad = 320;
				this.teconologia = "HDD";
			}
			case 6: {
				this.setId(6);
				this.setModelo("INVALIDO");
				this.setPrecio(null);
				this.capacidad = null;
				this.teconologia = null;
			}
			case 7: {
				this.setId(7);
				this.setModelo("INVALIDO");
				this.setPrecio(null);
				this.capacidad = null;
				this.teconologia = null;
			}
		}
	}
	
	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getTeconologia() {
		return teconologia;
	}

	public void setTeconologia(String teconologia) {
		this.teconologia = teconologia;
	}

}
