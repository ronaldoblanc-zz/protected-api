package com.redhat.rhsso.oidemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/unsecured-api")
	public String unsecuredApi() {
		return "Unsecured API";
	}

	@GetMapping("/secured-api")
	@PreAuthorize("hasRole('admin')")
	public String securedApi() {
		return "OAuth2 secured API";
	}
}