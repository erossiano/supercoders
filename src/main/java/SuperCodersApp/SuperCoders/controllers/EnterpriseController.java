package SuperCodersApp.SuperCoders.controllers;

import SuperCodersApp.SuperCoders.entities.Enterprise;
import SuperCodersApp.SuperCoders.services.EnterpriseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("enterprise")
public class EnterpriseController {
    private final EnterpriseService enterpriseService;

    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }
    @GetMapping
    public List<Enterprise> getAllEnterprise(){
        return this.enterpriseService.getAllEnterprise();
    }
    @GetMapping("/{id}")
    public Enterprise getEnterprise (@PathVariable("id") long id) {
        return this.enterpriseService.getEnterprise(id);
    }
    @PostMapping
    public Boolean CreateEnterprise(@RequestBody Enterprise enterprise){
        return this.enterpriseService.createEnterprise(enterprise);
    }
    @PatchMapping("/{id}")
    public Boolean updateEnterprise(@PathVariable("id") long id,@RequestBody Enterprise enterprise){
       Enterprise emp= this.enterpriseService.getEnterprise(id);
       if(emp !=null){
           try{
               return this.enterpriseService.updateEnterprise(enterprise);
           }catch(Exception e){
               return false;
           }
       }else{
           return false;
       }
    }
    @DeleteMapping("/{id}")
    public Boolean deleteEnterprise(@PathVariable("id") long id){
        return this.enterpriseService.deleteEnterprise(id);
    }
}
