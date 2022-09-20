package SuperCodersApp.SuperCoders.controllers;

import SuperCodersApp.SuperCoders.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class FrontEmployeeController {

    final
    EnployeeController employeeController;

    public FrontEmployeeController(EnployeeController employeeController) {
        this.employeeController = employeeController;
    }

    @GetMapping("/employee")
    public String indexEmployee(Model model, @ModelAttribute("message") String message) {

        List<Employee> listEmployee = employeeController.getAllEmployee();
        model.addAttribute("listEmployee", listEmployee);
        model.addAttribute("message", message);
        return "employee/index"; //Llamamos al HTML
    }

    @GetMapping("/employee/new")
    public String addEmployee(Model model, @ModelAttribute("message") String message) {
        Employee employee= new Employee();
        model.addAttribute("enterprise", enterprise);
        model.addAttribute("message", message);
        return "employee/add";
    }

    @PostMapping("/employee")
    public String saveEnterprise(Employee employee, RedirectAttributes redirectAttributes) {
        if (employeeController.createEmployee(employee)) {
            redirectAttributes.addFlashAttribute("message", "saveOK");
            return "redirect:/employee";
        }
        redirectAttributes.addFlashAttribute("message", "saveError");
        return "redirect:/employee/add";
    }

    @GetMapping("/employee/{id}/edit")
    public String editEmployee(Model model, @PathVariable long id, @ModelAttribute("message") String message) {
        Employee employee = employeeController.getEmployee(id);
        //Creamos un atributo para el modelo, que se llame igualmente emp y es el que ira al html para llenar o alimentar campos
        model.addAttribute("employee", employee);
        model.addAttribute("message", message);
        return "employee/edit";
    }

    @PostMapping("/employee/{id}")
    public String updateEmployee(@PathVariable long id, @ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
        if (employeeController.updateEmployee(id, employee)) {
            redirectAttributes.addFlashAttribute("message", "updateOK");
            return "redirect:/employee";
        }
        redirectAttributes.addFlashAttribute("message", "updateError");
        return "redirect:/employee/edit";
    }

    @PostMapping("/employee/{id}/delete")
    public String deleteEmployee(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        if (employeeController.deleteEmployee(id)) {
            redirectAttributes.addFlashAttribute("message", "deleteOK");
            return "redirect:/employee";
        }
        redirectAttributes.addFlashAttribute("message", "deleteError");
        return "redirect:/employee";
    }
}
