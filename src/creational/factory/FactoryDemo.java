package creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {

		EmailParserFactory emailParserFactory = new EmailParserFactory();

		for (EmailParserType emailParserType : EmailParserType.values()) {
			EmailParser emailParser = emailParserFactory.getEmailParser(emailParserType);
			emailParser.parse();
		}
	}

}
