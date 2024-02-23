package com.microservice.loans;

import com.microservice.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.microservice.loans.controller") })
@EnableJpaRepositories("com.microservice.loans.repository")
@EntityScan("com.microservice.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})

@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "JainBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Nitansshu Jain",
						email = "nitansshujain@gmail.com",
						url = "https://www.linkedin.com/in/nitansshujain/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/nitansshujain/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "JainBank Loans microservice REST API Documentation",
				url = "https://www.linkedin.com/in/nitansshujain/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
