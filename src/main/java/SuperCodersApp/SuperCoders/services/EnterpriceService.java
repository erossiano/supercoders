package SuperCodersApp.SuperCoders.services;


import SuperCodersApp.SuperCoders.entities.Enterprise;

public class EnterpriceService {

    Enterprise num1;

    //constructor

    public EnterpriceService(){
        this.num1 = new Enterprise("Daryl","calle 5 # 12-50","3205445562","2659874");

        System.out.println(num1.toString());

    }


}
