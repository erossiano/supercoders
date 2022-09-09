package SuperCodersApp.SuperCoders.services;

import SuperCodersApp.SuperCoders.entities.Employee;
import SuperCodersApp.SuperCoders.repositories.IEmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{

    private final IEmployeeRepository employeeRepository;

    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return this.employeeRepository.findAll();
    }

    @Override
    public List<Employee> getAllEmployeeS() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeS(long id) {
        Optional<Employee> e1 = this.employeeRepository.findById(id);
        return e1.orElse(null);
    }

    @Override
    public Boolean createEmployeeS(Employee employee) {
        try {
            employee.setId(0l);
            this.employeeRepository.save(employee);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public Boolean updateEmployeeS(Employee employee) {
        try {
            this.employeeRepository.save(employee);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public Boolean deleteEmployeeS(long id) {
        try {
            this.employeeRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}





