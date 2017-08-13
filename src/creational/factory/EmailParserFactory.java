package creational.factory;

public class EmailParserFactory {

	public EmailParser getEmailParser(EmailParserType emailParserType) {
		EmailParser emailParser = null;
		switch (emailParserType) {
		case INFOSTUD:
			emailParser = new InfostudEmailParser();
			break;
		case POSLOVIRS:
			emailParser = new PosloviRsEmailParser();
			break;
		}
		return emailParser;
	}
}
