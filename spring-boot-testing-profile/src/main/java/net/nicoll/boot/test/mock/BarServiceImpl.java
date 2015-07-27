package net.nicoll.boot.test.mock;

import org.springframework.stereotype.Service;

public class BarServiceImpl implements BarService {

	@Override
	public String doIt(String param) {
		throw new IllegalArgumentException("Should not be called");
	}
}
