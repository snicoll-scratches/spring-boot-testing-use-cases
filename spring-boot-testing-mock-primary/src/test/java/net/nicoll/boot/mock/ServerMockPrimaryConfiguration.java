package net.nicoll.boot.mock;

import net.nicoll.boot.test.mock.BarService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.mock;

@Configuration
public class ServerMockPrimaryConfiguration {

	@Primary
	@Bean
	public BarService barService() {
		BarService barService = mock(BarService.class);
		given(barService.doIt("foo")).willReturn("bar");
		return barService;
	}

}
