package com.jsp.empdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.empdb.model.Jspemp;
import com.jsp.empdb.service.JspEmpService;

@RestController
public class JspEmpController {
	
	@Autowired
	JspEmpService empService;
	
	@PostMapping("AddJspEmp")
	public ResponseEntity<Jspemp> saveJspemp(@RequestBody Jspemp jspemp){
		return new ResponseEntity<Jspemp>(empService.saveJspemp(jspemp),HttpStatus.CREATED);
	}

}
