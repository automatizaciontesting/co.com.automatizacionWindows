package co.com.automatizacionWindows.pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import co.com.automatizacionWindows.utilidades.*;
import java.io.IOException;
import java.nio.file.Paths;
import co.com.automatizacionWindows.utilidades.DriverManager;

public class OperacionRestaPageObject extends PageObject{
	public void ingresarPrimerValor(int arg1) {
		try {
			DriverManager.ElementAppSessionWindows =DriverManager.AppSeWin.findElementByName("Cuatro");
			DriverManager.ElementAppSessionWindows.click();
			Serenity.recordReportData().withTitle("Download Image:").downloadable().fromFile(Paths.get(Utilidades.generarCodigos(DriverManager.AppSeWin)));
			System.out.println("termina screenShot");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void ingresarSegundoValor(int arg2) throws IOException {
		DriverManager.ElementAppSessionWindows =DriverManager.AppSeWin.findElementByName("Dos");
		DriverManager.ElementAppSessionWindows.click();
		Serenity.recordReportData().withTitle("Download Image:").downloadable().fromFile(Paths.get(Utilidades.generarCodigos(DriverManager.AppSeWin)));
 
	}

	public void elDeberiaDeVerElResultadoIgualA(int arg1) throws IOException {
		 //Assert.assertEquals(arg1, _GetCalculatorResultText());		
		Serenity.recordReportData().withTitle("Download Image:").downloadable().fromFile(Paths.get(Utilidades.generarCodigos(DriverManager.AppSeWin)));
	}

	public void operacionRestar() throws IOException {
		DriverManager.ElementAppSessionWindows =DriverManager.AppSeWin.findElementByName("Menos");
		DriverManager.ElementAppSessionWindows.click();
		Serenity.recordReportData().withTitle("Download Image:").downloadable().fromFile(Paths.get(Utilidades.generarCodigos(DriverManager.AppSeWin)));	
	}
    protected String _GetCalculatorResultText(){
    	try {
            // trim extra text and whitespace off of the display value
        	DriverManager.ElementAppSessionWindows =DriverManager.AppSeWin.findElementByAccessibilityId("CalculatorResults");
        	DriverManager.ElementAppSessionWindows.getText();

    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
        return DriverManager.ElementAppSessionWindows.getText().replace("Se muestra", "").trim();
    }

	public void operacionIgual() throws IOException {
//		DriverManager.ElementAppSessionWindows =DriverManager.AppSeWin.findElementByName("Es igual a");
//		DriverManager.ElementAppSessionWindows.click();
		Serenity.recordReportData().withTitle("Download Image:").downloadable().fromFile(Paths.get(Utilidades.generarCodigos(DriverManager.AppSeWin)));
		
	}

	public void ingresarPrimerValorMulti(int arg1) throws IOException {
//		DriverManager.ElementAppSessionWindows =DriverManager.AppSeWin.findElementByName("Tres");
//		DriverManager.ElementAppSessionWindows.click();
		Serenity.recordReportData().withTitle("Download Image:").downloadable().fromFile(Paths.get(Utilidades.generarCodigos(DriverManager.AppSeWin)));	
	}

	public void operacionMultiplicacion() throws IOException {
//		DriverManager.ElementAppSessionWindows =DriverManager.AppSeWin.findElementByName("Multiplicar por");
//		DriverManager.ElementAppSessionWindows.click();
		Serenity.recordReportData().withTitle("Download Image:").downloadable().fromFile(Paths.get(Utilidades.generarCodigos(DriverManager.AppSeWin)));		
	}

	public void ingresarSegundoValorMult(int arg2) throws IOException {
//		DriverManager.ElementAppSessionWindows =DriverManager.AppSeWin.findElementByName("Siete");
//		DriverManager.ElementAppSessionWindows.click();
		Serenity.recordReportData().withTitle("Download Image:").downloadable().fromFile(Paths.get(Utilidades.generarCodigos(DriverManager.AppSeWin)));	
	}
}
