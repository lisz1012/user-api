package com.lisz.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/user")
public interface UserApi {
	@GetMapping("/alive")
	public String alive();
}
