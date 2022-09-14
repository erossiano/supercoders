package SuperCodersApp.SuperCoders.repositories;

import SuperCodersApp.SuperCoders.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import java.util.List;

public interface IEnterpriseRepository extends JpaRepository<Enterprise, Long> {
    List<Enterprise> findEnterpriseByNIT(String NIT);

    Enterprise findById(long Id);
=======
import org.springframework.stereotype.Repository;

@Repository
public interface IEnterpriseRepository extends JpaRepository<Enterprise, Long> {
>>>>>>> origin/development-ddnarvaez

}
