package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

public class Motherboard extends Componente {

	private String socketProcesador;
	private String socketMemoria;
	
	public Motherboard(Integer i) {
		switch (i) {
			case 0: {
				this.setId(0);
				this.setModelo("ASUS_H97-PRO");
				this.setSocketProcesador("LGA_1150");
				this.setSocketMemoria("DDR3");
				this.setPrecio(2200);
			}
			case 1: {
				this.setId(1);
				this.setModelo("ASUS_B150-PLUS");
				this.setSocketProcesador("LGA_1151");
				this.setSocketMemoria("DDR4");
				this.setPrecio(2500);
			}
			case 2: {
				this.setId(2);
				this.setModelo("ASUS_H170-PRO");
				this.setSocketProcesador("LGA_1151");
				this.setSocketMemoria("DDR4");
				this.setPrecio(3100);
			}
			case 3: {
				this.setId(3);
				this.setModelo("ASUS_Z170-DELUXE");
				this.setSocketProcesador("LGA_1151");
				this.setSocketMemoria("DDR4");
				this.setPrecio(7700);
			}
			case 4: {
				this.setId(4);
				this.setModelo("ASUS_MAXIMUS VII FORMULA");
				this.setSocketProcesador("LGA_1150");
				this.setSocketMemoria("DDR3");
				this.setPrecio(9000);
			}
			case 5: {
				this.setId(5);
				this.setModelo("H87M-PLUS");
				this.setSocketProcesador("LGA_1150");
				this.setSocketMemoria("DDR2");
				this.setPrecio(1800);
			}
			case 6: {
				this.setId(6);
				this.setModelo("INVALIDO");
				this.setSocketProcesador(null);
				this.setSocketMemoria(null);
				this.setPrecio(null);
			}
			case 7: {
				this.setId(7);
				this.setModelo("INVALIDO");
				this.setSocketProcesador(null);
				this.setSocketMemoria(null);
				this.setPrecio(null);
			}
		}
	}
	
	public String getSocketProcesador() {
		return socketProcesador;
	}
	public void setSocketProcesador(String socketProcesador) {
		this.socketProcesador = socketProcesador;
	}
	public String getSocketMemoria() {
		return socketMemoria;
	}
	public void setSocketMemoria(String socketMemoria) {
		this.socketMemoria = socketMemoria;
	}
		
}
