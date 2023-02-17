package com.cydeo.employeeregistrationproject.bootstrap;

import com.cydeo.employeeregistrationproject.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    private static List<Employee> employeeList = new ArrayList<>();

    public static void saveEmployee(Employee employee){
        employeeList.add(employee);
    }

    public static List<Employee> readAllEmployees(){
        return employeeList;
    }

    public static List<String> getAllStates(){
        return Arrays.asList(
                "Alaska",
                "Alabama",
                "Arkansas",
                "Arizona",
                "Colorado",
                "Connecticut",
                "Delaware",
                "Florida",
                "Georgia",
                "Hawaii",
                "Iowa",
                "Idaho"
        );
    }

}
