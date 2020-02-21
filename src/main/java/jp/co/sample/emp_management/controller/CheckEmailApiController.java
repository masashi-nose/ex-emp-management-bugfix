package jp.co.sample.emp_management.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.sample.emp_management.domain.Employee;
import jp.co.sample.emp_management.service.EmployeeService;

@RestController
@RequestMapping(value = "/check-email-api")
public class CheckEmailApiController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/emailcheck", method = RequestMethod.POST)
	public Map<String, String> emailcheck(String mailAddress) {
		Map<String, String> map = new HashMap<>();
		
		String duplicateMessage = null;

		List<Employee> employeeList = employeeService.showList();

		for (Employee employee : employeeList) {

			if (employee.getMailAddress().equals(mailAddress)) {
				duplicateMessage = "[ " + mailAddress + " ]" + "はすでに登録されています。";

			} else {
				duplicateMessage = "[ " + mailAddress + " ]" + "は登録されていません。";

			}
		}

		map.put("duplicateMessage", duplicateMessage);
		return map;
	}

}
