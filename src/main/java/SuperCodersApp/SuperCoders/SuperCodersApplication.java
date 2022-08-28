package SuperCodersApp.SuperCoders;
import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.time.LocalDate;
@SpringBootApplication
public class SuperCodersApplication {

	public static void main(String[] args) {

		SpringApplication.run(SuperCodersApplication.class, args);

		LocalDate ahora = LocalDate.now();
		LocalDate ahora1 = LocalDate.now();
		Enterprise aEnterprise = new Enterprise("MiEntidad", "CAlle 777", "3002326666", "8233584-3");
		Employee anEmployee = new Employee("Edward", "edwardrossiano@gmail.com");

		Profile unProfile= new Profile("1",":)","3016703090","jac123");
		Profile unProfile1= new Profile("2",":)","3016703091","Daniel");

		Trasaction unaTransaction= new Trasaction(unProfile,
				"se me fue la paloma",300000f,unProfile1,aEnterprise);

		anEmployee.setEnterprise(aEnterprise);
		anEmployee.setRole(Role.Admin);

		System.out.println(aEnterprise.toString());
		System.out.println(anEmployee.toString());
	}

}
