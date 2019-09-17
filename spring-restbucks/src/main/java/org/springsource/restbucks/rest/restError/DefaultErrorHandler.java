package org.springsource.restbucks.rest.restError;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class DefaultErrorHandler implements ErrorController {
	private static final String PATH = "/error";

	@GetMapping(value = PATH)
	public String error() {
		return "Error Have taken place";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}
}
