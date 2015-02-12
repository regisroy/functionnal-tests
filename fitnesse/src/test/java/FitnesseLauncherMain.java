import fitnesseMain.FitNesseMain;

public class FitnesseLauncherMain {

	public static void main(String[] args) throws Exception {
		FitNesseMain.main(new String[]{"-p", "80"});

		Runtime runtime = Runtime.getRuntime();
		runtime.exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe localhost");
	}
}
