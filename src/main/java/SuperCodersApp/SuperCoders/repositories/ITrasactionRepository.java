package SuperCodersApp.SuperCoders.repositories;

import SuperCodersApp.SuperCoders.entities.Trasaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ITrasactionRepository extends JpaRepository<Trasaction, Long> {

}