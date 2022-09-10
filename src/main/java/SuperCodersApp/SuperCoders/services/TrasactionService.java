package SuperCodersApp.SuperCoders.services;

import SuperCodersApp.SuperCoders.entities.Trasaction;
import SuperCodersApp.SuperCoders.repositories.ITrasactionRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TrasactionService implements ITrasactionService {

    private ITrasactionRepository trasactionRepository;

    public List<Trasaction> TrasactionService(ITrasactionRepository trasactionRepository) {
        this.trasactionRepository = trasactionRepository;


    }



}



















