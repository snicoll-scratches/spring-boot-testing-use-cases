package net.nicoll.boot.test.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.mock;

/**
 *
 * @author Stephane Nicoll
 */
@Configuration
@Profile("test")
public class TestConfiguration {

	@Bean
	public BarService barService() {
		BarService barService = mock(BarService.class);
		given(barService.doIt("foo")).willReturn("bar");
		return barService;
	}
}
