package com.imi.tax.cal.taxcaliculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * @author bhuvan
 *
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employees Tax Cal API", version = "2.0", description = "Employees Tax Cal Information"))
public class TaxcaliculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxcaliculatorApplication.class, args);
	}

}
