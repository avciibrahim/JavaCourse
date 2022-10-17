package kodlamaIO.core.logger;

public class MailLogger implements Logger {

	@Override
	public void Logging(String data) {

		System.out.println("Mail Loglama Yapıldı - " + data);
		
	}

}
