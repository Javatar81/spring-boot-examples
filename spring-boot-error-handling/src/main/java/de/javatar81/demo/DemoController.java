package de.javatar81.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public void test() {
		throw new IllegalArgumentException("An exception");
	}

}
