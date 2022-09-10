package SuperCodersApp.SuperCoders.services;

import SuperCodersApp.SuperCoders.entities.Trasaction;
import SuperCodersApp.SuperCoders.repositories.ITrasactionRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TrasactionService implements ITrasactionService {

    private final ITrasactionRepository trasactionRepository;
    public Trasaction(ITrasactionRepository trasactionRepository) {
        this.trasactionRepository = trasactionRepository;
    }



    public List<Trasaction> getAllTrasactions (){
        return this.TrasactionRepository.findAll();
    }

    @Override
    public List<Trasaction> getAllTrasactionS() {
        return this.TrasactionRepository.findAll();
    }

    @Override
    public Trasaction getTrasactionS(long id) {
        Optional<Trasaction> e1 = this.trasactionRepository.findById(id);
        return e1.orElse(null);
    }

    @Override
    public Boolean createTrasactionS(Trasaction trasaction) {
        try {
            Trasaction.setId(01);
            this.TrasactionRepository.save(trasaction);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public Boolean updateTrasactionS(Trasaction trasaction) {
        try {
            this.trasactionRepository.save(trasaction);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public Boolean deleteTrasactionSD(long id) {
        try {
            this.trasactionRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

































