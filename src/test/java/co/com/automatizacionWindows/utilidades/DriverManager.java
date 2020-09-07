package co.com.automatizacionWindows.utilidades;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;


public class DriverManager {
	
	public static WindowsDriver<WindowsElement> AppSeWin = null;
	public static WebElement ElementAppSessionWindows = null;
    static Process p;
    private static final Logger LOGGER = Logger.getLogger(DriverManager.class.getName()); 
    
    private DriverManager() {
        throw new IllegalStateException("No se puede establecer el driver");
    }

	public static WindowsDriver<WindowsElement> startAppSessionWindows() throws MalformedURLException {
	  try {
		  Utilidades.cerrarAplicacion("WinAppDriver.exe");	
		String command = "C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe";
		ProcessBuilder builder = new ProcessBuilder(command).inheritIO();
		p = builder.start();
		
		DesiredCapabilities capabilities;
		  capabilities = new DesiredCapabilities();
		  capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
		  capabilities.setCapability("deviceName", "WindowsPC");
		  capabilities.setCapability("platformName", "Windows");
		  AppSeWin = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723"), capabilities);
		  AppSeWin.manage().timeouts().implicitlyWait(68, TimeUnit.SECONDS);

	  } catch (Exception e) {
		  LOGGER.info(" DriverManager : startAppSessionWindows: ");			
	  }
	  return AppSeWin;
	}
	
	public static void CloseApp() throws IOException {
		AppSeWin.closeApp();
	}
	public void elementAppWindows() {
		
	}

	
	
}