package SuperCodersApp.SuperCoders.services;

import SuperCodersApp.SuperCoders.entities.Trasaction;

import java.util.List;

public interface ITrasactionService {
    public interface ITrasaction {
        List<Trasaction> getAllTrasaction();
        Trasaction getTrasaction(long id);
        Boolean createTrasaction(Trasaction trasaction);
        Boolean updateTrasaction(Trasaction trasaction);
        Boolean deleteTrasaction(long id);
    }
}
