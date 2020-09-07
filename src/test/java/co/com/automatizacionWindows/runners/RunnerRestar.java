package co.com.automatizacionWindows.runners;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ibm.icu.impl.InvalidFormatException;

import co.com.automatizacionWindows.utilidades.DriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.After;
import cucumber.runtime.junit.SanityChecker;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Screenshots;

public class RunnerRestar {
	private static final Logger LOGGER = Logger.getLogger(RunnerRestar.class.getName());
	
@Test
@Screenshots(disabled=true)

public void tests() throws InvalidFormatException{
	SanityChecker.run(runnerRestar.class, true);
}

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/operaciones.feature",
        glue = "co.com.automatizacionWindows",
        tags = {"@ejecutarResta"},
        snippets = SnippetType.CAMELCASE
)
public class runnerRestar {

}

@After
public void cierraAplicativo() {
	try {
		DriverManager.CloseApp();
	} catch (Exception e) {
		LOGGER.info(" After Runner: cierraAplicativo: ");
	}
}

@AfterClass
public static void generarEvidencia() {
	try {
		Runtime.getRuntime().exec("cmd.exe /c mvn serenity:aggregate"); 
	} catch (Exception e) {
		LOGGER.info(" AfterClass Runner: generarEvidencia: ");
	}
}

public static void cerrarDriver() {
	try {
		DriverManager.AppSeWin.close();
	} catch (Exception e) {
		LOGGER.info(" AfterClass Runner: generarEvidencia: ");
	}
}







}