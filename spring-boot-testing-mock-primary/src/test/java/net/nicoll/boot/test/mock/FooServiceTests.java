package net.nicoll.boot.test.mock;

import net.nicoll.boot.mock.ServerMockPrimaryConfiguration;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.*;

@SpringApplicationConfiguration(classes = ServerMockPrimaryConfiguration.class)
public class FooServiceTests extends AbstractIntegrationTests {

	@Autowired
	private FooService fooService;

	@Test
	public void validateFoo() {
		assertThat(fooService.something("foo"), equalTo("bar"));
	}

}
