package SuperCodersApp.SuperCoders.services;

import SuperCodersApp.SuperCoders.entities.Employee;
import SuperCodersApp.SuperCoders.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        System.out.println(this.employeeRepository.findAll());
        return this.employeeRepository.findAll();
    }
}

