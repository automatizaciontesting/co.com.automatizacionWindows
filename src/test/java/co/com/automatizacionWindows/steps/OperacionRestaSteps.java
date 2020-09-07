package co.com.automatizacionWindows.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.net.MalformedURLException;
import co.com.automatizacionWindows.pageobjects.*;
import co.com.automatizacionWindows.utilidades.DriverManager;

public class OperacionRestaSteps {

	@Steps
	OperacionRestaPageObject operacionRestaPageObject; 
	
	@Step("que Juan se encuentra en la calculadora de Windows")
	public void queJuanSeEncuentraEnLaCalculadoraDeWindows() throws MalformedURLException {
		DriverManager.startAppSessionWindows();
		
	}

	public void juanRealizaLaRestaDeY(int arg1, int arg2) throws IOException {
		operacionRestaPageObject.ingresarPrimerValor(arg1);
		operacionRestaPageObject.operacionRestar();
		operacionRestaPageObject.ingresarSegundoValor(arg2);
		operacionRestaPageObject.operacionIgual();
		
	}

	public void elDeberiaDeVerElResultadoIgualA(int arg1) throws IOException {
		operacionRestaPageObject.elDeberiaDeVerElResultadoIgualA(arg1);
		
	}

	public void juanRealizaLaMultiplicacionDeY(int arg1, int arg2) throws IOException {
		operacionRestaPageObject.ingresarPrimerValorMulti(arg1);
		operacionRestaPageObject.operacionMultiplicacion();
		operacionRestaPageObject.ingresarSegundoValorMult(arg2);
		operacionRestaPageObject.operacionIgual();
	}

}
