package net.nicoll.boot.test.mockbean;

import org.springframework.stereotype.Service;

@Service
public class BarServiceImpl implements BarService {

	@Override
	public String doIt(String param) {
		throw new IllegalArgumentException("Should not be called");
	}
}
