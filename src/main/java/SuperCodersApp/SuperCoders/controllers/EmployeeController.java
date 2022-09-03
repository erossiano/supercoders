package SuperCodersApp.SuperCoders.controllers;

import SuperCodersApp.SuperCoders.entities.Employee;
import SuperCodersApp.SuperCoders.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employee")
    public List getEmployees (){
        List<Employee> e = this.employeeService.getAllEmployees();
        return e;
    }
}
