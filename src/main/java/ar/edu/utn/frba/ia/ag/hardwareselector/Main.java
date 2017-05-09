package main.java.ar.edu.utn.frba.ia.ag.hardwareselector;

import java.util.logging.Logger;

import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import main.java.ar.edu.utn.frba.ia.ag.Individuo;
import main.java.ar.edu.utn.frba.ia.ag.cruzamiento.Simple;
import main.java.ar.edu.utn.frba.ia.ag.mutacion.MutacionSimple;
import main.java.ar.edu.utn.frba.ia.ag.paro.CantidadDeCiclos;
import main.java.ar.edu.utn.frba.ia.ag.seleccion.Ranking;

public class Main {

	public static void main(String[] args) {
		
        ConfiguracionDefault c = new ConfiguracionDefault();

        c.setPoblacionInicial(999);
        c.setCriterioDeParo(new CantidadDeCiclos(499L));
        c.setMetodoDeSeleccion(new Ranking(50));
        c.setCruzamiento(new Simple());
        c.setMutacion(new MutacionSimple(0.2));
        
        AlgoritmoGenetico ag = new AlgoritmoGenetico(c, Hardware.class);

        Individuo individuo = ag.ejecutar();
                
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Individuo final: " + individuo.toString());

	}

}
