package SuperCodersApp.SuperCoders.services;

import SuperCodersApp.SuperCoders.entities.Enterprise;

import java.util.List;

public interface IEnterpriseService {
<<<<<<< HEAD

    //Get all
    List<Enterprise> getAllEnterpriseS();

    //Get one
    Enterprise getEnterpriseS(long id);

    //Create
    Boolean createEnterpriseS(Enterprise enterprise);

    Boolean updateEnterpriseS(Enterprise enterprise);

    //Delete
    Boolean deleteEnterpriseS(long id);
=======
    List<Enterprise> getAllEnterprise();
    Enterprise getEnterprise(long id);
    Boolean createEnterprise(Enterprise enterprise);
    Boolean updateEnterprise(Enterprise enterprise);
    Boolean deleteEnterprise(long id);
>>>>>>> origin/development-ddnarvaez
}
