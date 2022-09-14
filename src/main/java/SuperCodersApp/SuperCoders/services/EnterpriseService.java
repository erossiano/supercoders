package SuperCodersApp.SuperCoders.services;

<<<<<<< HEAD
import SuperCodersApp.SuperCoders.entities.Employee;
=======
>>>>>>> origin/development-ddnarvaez
import SuperCodersApp.SuperCoders.entities.Enterprise;
import SuperCodersApp.SuperCoders.repositories.IEnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
<<<<<<< HEAD

@Service
public class EnterpriseService implements IEnterpriseService {

    private final IEnterpriseRepository enterpriseRepository;
   /* private EmployeeService employeeService;*/

    EnterpriseService(IEnterpriseRepository enterpriseRepository/*, EmployeeService employeeService*/) {
        this.enterpriseRepository = enterpriseRepository;
        /*this.employeeService = employeeService;*/
    }

    @Override
    public List<Enterprise> getAllEnterpriseS() {
        //List<Enterprise> enterprises = this.enterpriseRepository.findAll();
       return this.enterpriseRepository.findAll();
/*       for (Enterprise e: enterprises) {
           List<Employee> employesList = this.employeeService.getAllEmployeeS();
           System.out.println(" Empleados : " + employesList.toString());
           e.setEmployees(employesList);
       }*/

       // return enterprises;


    }

    @Override
    public Enterprise getEnterpriseS(long id) {
        return this.enterpriseRepository.findById(id);
    }

    @Override
    public Boolean createEnterpriseS(Enterprise enterprise) {
=======
import java.util.Optional;
@Service
public class EnterpriseService implements IEnterpriseService {
    private final IEnterpriseRepository enterpriseRepository;

    public EnterpriseService(IEnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;

    }
    @Override
    public List<Enterprise> getAllEnterprise(){
        return this.enterpriseRepository.findAll();
    }
    @Override
    public Enterprise getEnterprise(long id){
        Optional<Enterprise> enter= this.enterpriseRepository.findById(id);
        return  enter.orElse(null);
    }
    @Override
    public Boolean createEnterprise(Enterprise enterprise){
>>>>>>> origin/development-ddnarvaez
        try {
            enterprise.setId(0L);
            this.enterpriseRepository.save(enterprise);
            return true;
        }catch(Exception e){
            return false;
        }
    }
<<<<<<< HEAD

    @Override
    public Boolean updateEnterpriseS(Enterprise enterprise) {
=======
    @Override
    public Boolean updateEnterprise(Enterprise enterprise){
>>>>>>> origin/development-ddnarvaez
        try {
            this.enterpriseRepository.save(enterprise);
            return true;
        }catch(Exception e){
            return false;
        }
    }
<<<<<<< HEAD

    @Override
    public Boolean deleteEnterpriseS(long id) {
        try {
            this.enterpriseRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
=======
    @Override
    public Boolean deleteEnterprise(long id){
        try {
            this.enterpriseRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

>>>>>>> origin/development-ddnarvaez
}
