package pluq.eoghan.chargingsms;

import com.fasterxml.jackson.core.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pluq.eoghan.chargingsms.utils.JsonToDatabaseService;

import java.io.InputStream;


@SpringBootApplication
public class ChargingSmsApplication {

	private static final Logger log = LoggerFactory.getLogger(ChargingSmsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ChargingSmsApplication.class, args);

	}

	@Bean
	public ApplicationRunner initializer(JsonToDatabaseService jsonToDatabaseService) {
		return args -> {
			log.info("Running initializer...");
			InputStream jsonStream = TypeReference.class.getResourceAsStream("/init-json-data/locations.json");
			if (jsonStream == null) {
				log.warn("JSON stream is null. Check if the file exists in the classpath.");
			} else {
				log.info("JSON stream is not null. Proceeding to parse and load to database.");
				jsonToDatabaseService.parseJsonFileToDatabase(jsonStream);
			}
		};
	}
}
