package com.example.demo.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */

public class SignUpRequest {
	@NotBlank
	@Size(min = 3, max = 15)
	private String username;

	@NotBlank
	@Size(min = 6, max = 20)
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}