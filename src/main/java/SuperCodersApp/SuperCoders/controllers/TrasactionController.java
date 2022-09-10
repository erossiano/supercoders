package SuperCodersApp.SuperCoders.controllers;


import SuperCodersApp.SuperCoders.entities.Trasaction;
import SuperCodersApp.SuperCoders.services.TrasactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("trasaction")
public class TrasactionController {
    private final TrasactionService trasactionService;

    public TrasactionController(TrasactionService trasactionService) {

        this.trasactionService = trasactionService;
    }
    @GetMapping
    public List<Trasaction> getAllTrasaction (){
        return this.trasactionService.getAllTrasaction();
    }
    @GetMapping("/{id}")
    public Trasaction getTrasaction(@PathVariable("id") long id){ return this.trasactionService.getTrasactionS(id); }
    @PostMapping
    public Boolean createTrasaction(@RequestBody Trasaction trasaction){
        return this.trasactionService.createTrasaction(trasaction);
    }
    @PatchMapping("/{id}")

    public Boolean updateTrasaction(@PathVariable("id") long id, @RequestBody Trasaction trasaction){
        Trasaction e1 = this.trasactionService.getTrasaction(id);
        if(e1 != null){
            try{
                return this.trasactionService.updateTrasaction(trasaction);
            }catch(Exception e){
                return false;
            }
        }else{
            return false;
        }
    }
    @DeleteMapping("/{id}")
    public Boolean deleteTrasaction (@PathVariable("id") long id){ return this.trasactionService.deleteTrasaction(id);}
}







