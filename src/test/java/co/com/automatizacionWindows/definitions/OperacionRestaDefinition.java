package co.com.automatizacionWindows.definitions;

import java.io.IOException;
import java.net.MalformedURLException;

import co.com.automatizacionWindows.steps.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OperacionRestaDefinition {

	@Steps
	OperacionRestaSteps operacionRestaSteps;
	
	@Given("^que Juan se encuentra en la calculadora de Windows$")
	public void queJuanSeEncuentraEnLaCalculadoraDeWindows() throws MalformedURLException {
		operacionRestaSteps.queJuanSeEncuentraEnLaCalculadoraDeWindows();
	}


	@When("^Juan realiza la resta de (\\d+) y (\\d+)$")
	public void juanRealizaLaRestaDeY(int arg1, int arg2) throws IOException {
		operacionRestaSteps.juanRealizaLaRestaDeY(arg1,arg2);
	}

	@Then("^el deberia de ver el resultado igual a (\\d+)$")
	public void elDeberiaDeVerElResultadoIgualA(int arg1) throws IOException {
		operacionRestaSteps.elDeberiaDeVerElResultadoIgualA(arg1);
	}
	@When("^Juan realiza la multiplicacion de (\\d+) y (\\d+)$")
	public void juanRealizaLaMultiplicacionDeY(int arg1, int arg2) throws IOException {
		operacionRestaSteps.juanRealizaLaMultiplicacionDeY(arg1, arg2);
	}
}
