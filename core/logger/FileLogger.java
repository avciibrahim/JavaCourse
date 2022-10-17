package kodlamaIO.core.logger;

public class FileLogger implements Logger{

	@Override
	public void Logging(String data) {

		System.out.println("Dosya Loglama Yapıldı - " + data);
		
	}

}
