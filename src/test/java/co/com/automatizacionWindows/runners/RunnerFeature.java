package co.com.automatizacionWindows.runners;

import java.util.logging.Logger;


import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.runtime.junit.SanityChecker;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Screenshots;

public class RunnerFeature {

	private static final Logger LOGGER = Logger.getLogger(RunnerFeature.class.getName()); 
	 /**
	  * Fecha:27-03-2020
	  * Autor: TCS
	  * Descripción: Pruebas automatizadas 
	  * @throws Exception
	  */
	 @Test()
	 @Screenshots(disabled=true)
	 private void automationTest(){			 

		SanityChecker.run(EjecutarPrueba.class, true);
	 }
	 
	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(
		        features = "src/test/resources/features/menuPortal/",
		        tags = {"@ejecutarMultiplicacion"}
		        ,snippets = SnippetType.CAMELCASE
		        ,glue = "com.itau.automatizacion"
		        ,plugin = {"json:target/cucumber.json"}
		        )
	 
	private class EjecutarPrueba{}
	
	@AfterEach
	static void generarEvidencia(){
		try {
			Runtime.getRuntime().exec("cmd.exe /c mvn serenity:aggregate");
		}catch(Exception e){
			LOGGER.info(" AfterEach RunnerPortalPn: generarEvidencia: ");			
		}
	}

}
