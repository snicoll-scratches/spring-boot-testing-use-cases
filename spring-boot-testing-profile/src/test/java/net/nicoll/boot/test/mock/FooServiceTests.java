package net.nicoll.boot.test.mock;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.*;

public class FooServiceTests extends AbstractIntegrationTests {

	@Autowired
	private FooService fooService;

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void validateFoo() {
		assertThat(fooService.something("foo"), equalTo("bar"));

		// Only one bean is defined
		assertThat(this.applicationContext.getBeansOfType(BarService.class).size(), equalTo(1));
	}

}
