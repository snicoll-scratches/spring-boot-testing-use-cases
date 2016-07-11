package net.nicoll.boot.test.mockbean;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.BDDMockito.given;

public class FooServiceTests extends AbstractIntegrationTests {

	@MockBean
	private BarService barService;

	@Autowired
	private FooService fooService;

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void validateFoo() {
		given(barService.doIt("foo")).willReturn("bar");

		assertThat(fooService.something("foo"), equalTo("bar"));

		// 1 BarService bean is defined
		assertThat(this.applicationContext.getBeansOfType(BarService.class).size(), equalTo(1));
	}

}
