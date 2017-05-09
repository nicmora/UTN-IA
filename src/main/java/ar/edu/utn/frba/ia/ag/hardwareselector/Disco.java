package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

public class Disco extends Componente {

	private String tecnologia;
	private Integer capacidad; // Medido en : GB

	public Disco(Integer i) {
		switch (i) {
			case 0: {
				this.setId(0);
				this.setModelo("WD_CAVIAR_BLACK");
				this.setPrecio(1800);
				this.capacidad = 1024;
				this.tecnologia = "HDD";
				break;
			}
			case 1: {
				this.setId(1);
				this.setModelo("WD_CAVIAR_BLUE");
				this.setPrecio(1000);
				this.capacidad = 500;
				this.tecnologia = "HDD";
				break;
			}
			case 2: {
				this.setId(2);
				this.setModelo("SSD_WD_GREEN");
				this.setPrecio(3500);
				this.capacidad = 500;
				this.tecnologia = "SSD";
				break;
			}
			case 3: {
				this.setId(3);
				this.setModelo("SSD_WD_BLACK");
				this.setPrecio(4200);
				this.capacidad = 1024;
				this.tecnologia = "SSD";
				break;
			}
			case 4: {
				this.setId(4);
				this.setModelo("TOSHIBA");
				this.setPrecio(700);
				this.capacidad = 250;
				this.tecnologia = "HDD";
				break;
			}
			case 5: {
				this.setId(5);
				this.setModelo("TOSHIBA");
				this.setPrecio(1100);
				this.capacidad = 320;
				this.tecnologia = "HDD";
				break;
			}
			case 6: {
				this.setId(6);
				this.setModelo("INVALIDO");
				this.setPrecio(null);
				this.capacidad = 0;
				this.tecnologia = "";
				break;
			}
			case 7: {
				this.setId(7);
				this.setModelo("INVALIDO");
				this.setPrecio(null);
				this.capacidad = 0;
				this.tecnologia = "";
				break;
			}
		}
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
