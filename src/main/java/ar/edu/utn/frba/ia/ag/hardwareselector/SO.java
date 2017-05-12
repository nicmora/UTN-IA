package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

public class SO extends Componente {

	private String arquitectura;
	
	public SO(Integer i) {
		switch (i) {
			case 0: {
				this.setId(0);
				this.setModelo("WINDOWS_10_HOME_EDITION");
				this.setPrecio(1500);
				this.arquitectura = "x86";
				break;
			}
			case 1: {
				this.setId(1);
				this.setModelo("WINDOWS_10_HOME_EDITION");
				this.setPrecio(2400);
				this.arquitectura = "x64";
				break;
			}
			case 2: {
				this.setId(2);
				this.setModelo("WINDOWS_7_ENTERPRISE_EDITION");
				this.setPrecio(1100);
				this.arquitectura = "x86";
				break;
			}
			case 3: {
				this.setId(3);
				this.setModelo("WINDOWS_7_ENTERPRISE_EDITION");
				this.setPrecio(2000);
				this.arquitectura = "x64";
				break;
			}
		}
	}

	public String getArquitectura() {
		return arquitectura;
	}

	public void setArquitectura(String arquitectura) {
		this.arquitectura = arquitectura;
	}
	
}
