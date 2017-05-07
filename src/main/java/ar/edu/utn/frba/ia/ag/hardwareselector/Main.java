package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

import java.util.logging.Logger;

import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import main.java.ar.edu.utn.frba.ia.ag.Individuo;
import main.java.ar.edu.utn.frba.ia.ag.paro.CantidadDeCiclos;

public class Main {

	public static void main(String[] args) {
		
        ConfiguracionDefault c = new ConfiguracionDefault();

//        c.setCriterioDeParo(new AptitudMinima(100));
        c.setCriterioDeParo(new CantidadDeCiclos(new Long(99)));

        AlgoritmoGenetico ag = new AlgoritmoGenetico(c, Hardware.class);

        Individuo individuo = ag.ejecutar();
                
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Individuo final: " + individuo.toString());

	}

}
