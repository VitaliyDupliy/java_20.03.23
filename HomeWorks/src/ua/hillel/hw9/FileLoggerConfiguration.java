package ua.hillel.hw9;



public class FileLoggerConfiguration {

	
    String file;
	LoggingLevel level;
	int maxSize;
	String fileFormat;
	
	public FileLoggerConfiguration(String file, LoggingLevel level, int maxSize, String fileFormat) {
		super();
		this.file = file;
		this.level = level;
		this.maxSize = maxSize;
		this.fileFormat = fileFormat;
	}
	
	
	
	 
	
	
	
}
