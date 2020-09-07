package co.com.automatizacionWindows.utilidades;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import co.com.automatizacionWindows.runners.RunnerRestar;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class Utilidades {

	private static  String rutaEvidencias;
	public static void setRUTAEVIDENCIAS(String nuevaRuta){ rutaEvidencias = nuevaRuta;}
	public static String getRUTAEVIDENCIAS(){ return rutaEvidencias;}
	private static final Logger LOGGER = Logger.getLogger(RunnerRestar.class.getName()); 
	
	public static String generarCodigos(WindowsDriver<WindowsElement> calculatorSession) throws IOException {
	    String datoAleatorio= UUID.randomUUID().toString();
	    File miDir = new File(".");
	    String rutaImagen=miDir.getCanonicalPath()+"\\target\\site\\serenity\\"+datoAleatorio+".png";
		File scrFile = ((TakesScreenshot)calculatorSession).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(rutaImagen));	
		return rutaImagen;
		
	}

	public static void cerrarAplicacion(String nombreAplicacion) throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM <"+nombreAplicacion+">.exe");
		
	}

}
