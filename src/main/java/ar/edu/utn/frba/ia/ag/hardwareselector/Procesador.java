package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

public class Procesador extends Componente {

	private Integer generacion;

	public Procesador(Integer i) {
		switch (i) {
			case 0: {
				this.setId(0);
				this.setModelo("INTEL_CORE_I5_4690_PROCESSOR");
				this.setGeneracion(4);
				this.setPrecio(4000);
			}
			case 1: {
				this.setId(1);
				this.setModelo("INTEL_CORE_I7_4790_PROCESSOR");
				this.setGeneracion(4);
				this.setPrecio(6800);
			}
			case 2: {
				this.setId(2);
				this.setModelo("INTEL_CORE_I3_6320_PROCESSOR");
				this.setGeneracion(6);
				this.setPrecio(3200);
			}
			case 3: {
				this.setId(3);
				this.setModelo("AMD_APU_A10_7890K");
				this.setGeneracion(null);
				this.setPrecio(3300);
			}
			case 4: {
				this.setId(4);
				this.setModelo("INTEL_CORE_I7-6700_PROCESSOR");
				this.setGeneracion(6);
				this.setPrecio(7200);
			}
			case 5: {
				this.setId(5);
				this.setModelo("INTEL_PENTIUM_G4400");
				this.setGeneracion(null);
				this.setPrecio(1600);
			}
			case 6: {
				this.setId(6);
				this.setModelo("INTEL_CORE_I5-7600_PROCESSOR");
				this.setPrecio(5200);
			}
			case 7: {
				this.setId(7);
				this.setModelo("INTEL_CORE_I7-7700_PROCESSOR");
				this.setGeneracion(7);
				this.setPrecio(8000);
			}
		}
	}
	
	public Integer getGeneracion() {
		return generacion;
	}

	public void setGeneracion(Integer generacion) {
		this.generacion = generacion;
	}
	
}