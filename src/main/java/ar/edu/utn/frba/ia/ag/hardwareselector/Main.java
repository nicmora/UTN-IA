package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import main.java.ar.edu.utn.frba.ia.ag.Individuo;
import main.java.ar.edu.utn.frba.ia.ag.paro.AptitudMinima;

public class Main {

	public static void main(String[] args) {
		
        ConfiguracionDefault c = new ConfiguracionDefault();

        c.setCriterioDeParo(new AptitudMinima(100));

        AlgoritmoGenetico ag = new AlgoritmoGenetico(c, Hardware.class);

        Individuo individuo = ag.ejecutar();
        
        System.out.println("asd");
        
//        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Individuo final: " + individuo.toString());

	}

}
