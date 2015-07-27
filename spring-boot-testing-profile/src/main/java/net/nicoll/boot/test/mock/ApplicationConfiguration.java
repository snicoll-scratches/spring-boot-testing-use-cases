package net.nicoll.boot.test.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author Stephane Nicoll
 */
@Configuration
@Profile("!test")
public class ApplicationConfiguration {

	@Bean
	public BarService barService() {
		return new BarServiceImpl();
	}

}
