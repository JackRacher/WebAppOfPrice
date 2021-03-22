package com.ojas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ojas.models.Employee;

@Controller
public class ControllerCfgEmp {

	@RequestMapping(value = "/empdata", method = RequestMethod.GET)
	public String getEmp(ModelMap map) {
		Employee employee = new Employee();
		map.put("employee", employee);
		return "emp";
	}
	
	@RequestMapping(value = "/empdata", method = RequestMethod.POST)
	public String getEmp(Employee employee, ModelMap map) {
		String result = employee.toString();
		map.put("result", result);
		return "emp";
	}
}
