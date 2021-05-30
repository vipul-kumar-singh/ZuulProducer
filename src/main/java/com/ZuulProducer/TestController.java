package com.ZuulProducer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstPage() {

        Employee emp = new Employee();
        emp.setName("Vipul Kumar Singh");
        emp.setDesignation("Developer");
        emp.setEmpId("855");
        emp.setSalary(100000);

        return emp;
    }

}