package SuperCodersApp.SuperCoders.services;

import SuperCodersApp.SuperCoders.entities.Enterprise;
import SuperCodersApp.SuperCoders.repositories.IEnterpriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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
        try {
            enterprise.setId(0L);
            this.enterpriseRepository.save(enterprise);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    @Override
    public Boolean updateEnterprise(Enterprise enterprise){
        try {
            this.enterpriseRepository.save(enterprise);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    @Override
    public Boolean deleteEnterprise(long id){
        try {
            this.enterpriseRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
