package net.nicoll.boot.test.mockbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {

	private final BarService barService;

	@Autowired
	public FooService(BarService barService) {
		this.barService = barService;
	}

	public String something(String input) {
		return this.barService.doIt(input);
	}

}
