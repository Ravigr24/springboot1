package com.jsp.empdb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.empdb.model.Jspemp;
import com.jsp.empdb.repository.JspEmpRepoJpa;
import com.jsp.empdb.service.JspEmpService;

@Service
public class JspEmpServiceImpl implements JspEmpService {
	
	@Autowired
	JspEmpRepoJpa empRepoJpa;

	@Override
	public Jspemp saveJspemp(Jspemp jspemp) {
		
			return	empRepoJpa.save(jspemp);
		
		
	}

}
