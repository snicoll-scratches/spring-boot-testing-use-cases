package net.nicoll.boot.test.mock;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.*;

@SpringApplicationConfiguration(classes = ServerMockConfiguration.class)
public class FooServiceTests extends AbstractIntegrationTests {

	@Autowired
	private FooService fooService;

	@Test
	public void validateFoo() {
		assertThat(fooService.something("foo"), equalTo("bar"));
	}

}
