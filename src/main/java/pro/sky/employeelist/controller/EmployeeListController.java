package pro.sky.employeelist.controller;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;
        import pro.sky.employeelist.data.Employee;
        import pro.sky.employeelist.service.EmployeeListService;

        import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeListController {
    private final EmployeeListService employeeListService;

    public EmployeeListController(EmployeeListService employeeListService) {
        this.employeeListService = employeeListService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam("firstName") String firstName,
                        @RequestParam("lastName") String lastName) {
        return employeeListService.add(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName) {
        return employeeListService.remove(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam("firstName") String firstName,
                         @RequestParam("lastName") String lastName) {
        return employeeListService.find(firstName, lastName);
    }

    @GetMapping("/list")
    public List<Employee> showListOfEmployee() {
        return employeeListService.showListOfEmployee();
    }
}
