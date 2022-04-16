package com.ozan.saribaloglu.example.demoForOzan.Controller;

import com.ozan.saribaloglu.example.demoForOzan.Entity.Employee;
import com.ozan.saribaloglu.example.demoForOzan.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //@RequestMapping("/employees")
    @GetMapping("/employees")
    public List<Employee> findAllEmployee(){

        return employeeService.getAllEmployees();

    }

    //@RequestMapping("/employees/{id}")
    @GetMapping("/employees/{id}")
    public Employee findEmployeeWithId(@PathVariable int id){

        return employeeService.getEmployeeWithId(id);

    }

    //@RequestMapping(value = "/employees", method = RequestMethod.POST)
    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee){

        employeeService.createEmployee(employee);

    }

    //@RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee){

        employeeService.updateEmployee(employee);

    }

    //@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/employees/{id}")
    public List<Employee> deleteEmployee(@PathVariable int id){

        employeeService.deleteEmployee(id);

        return employeeService.getAllEmployees();

    }

}
