package com.gang;

import com.gang.api.GangApis;
import com.gang.config.MvcConfig;
import com.gang.config.SwaggerConfig;
import com.gang.domain.Domains;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Import({
		SwaggerConfig.class,
		MvcConfig.class
})
@EntityScan(
		basePackageClasses = { Jsr310JpaConverters.class, Domains.class })
@ComponentScan(basePackageClasses = { GangApis.class, Domains.class })
@EnableJpaAuditing
@EnableJpaRepositories(basePackageClasses = { Domains.class })
@SpringBootApplication
@PropertySource({ "classpath:DB.yml" })
@PropertySource({ "classpath:FaceBook.yml"})
public class GangApplication {

	public static void main(String[] args) {
		SpringApplication.run(GangApplication.class, args);
	}
}
