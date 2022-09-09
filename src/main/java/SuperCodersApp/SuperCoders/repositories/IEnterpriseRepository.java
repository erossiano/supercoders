package SuperCodersApp.SuperCoders.repositories;

import SuperCodersApp.SuperCoders.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnterpriseRepository extends JpaRepository<Enterprise, Long> {

}
