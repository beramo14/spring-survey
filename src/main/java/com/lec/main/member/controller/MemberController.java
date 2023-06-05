package com.lec.main.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	
	@GetMapping("/login")
	public String loginForm() {
		return "member/login";
	}
	@GetMapping("/join")
	public String joinForm() {
		return "member/join";
	}
	
	
	@PostMapping("/login")
	public String doLogin() {
		return "";
	}
	
	@PostMapping("/join")
	public String doJoin() {
		return "";
	}
	
}
