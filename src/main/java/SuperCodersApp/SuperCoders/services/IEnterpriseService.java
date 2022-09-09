package SuperCodersApp.SuperCoders.services;

import SuperCodersApp.SuperCoders.entities.Enterprise;

import java.util.List;

public interface IEnterpriseService {
    List<Enterprise> getAllEnterprise();
    Enterprise getEnterprise(long id);
    Boolean createEnterprise(Enterprise enterprise);
    Boolean updateEnterprise(Enterprise enterprise);
    Boolean deleteEnterprise(long id);
}
