package fr.galeriedelatifa.absences;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

public class AbsencesManagementApplication {

	private static final Logger logger = LoggerFactory.getLogger(AbsencesManagementApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
		
		logger.info("##### Application démarée ######");
	}
}
