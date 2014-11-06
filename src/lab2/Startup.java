package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dworgolet
 */
public class Startup {

    public static void main(String[] args) {
        
       Employee e1 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e2 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e3 = new Employee("Buth", "Steven", "444-444-4444", "189211"); 
       Employee e4 = new Employee("Buth", "Matthew", "555-555-5555", "983813"); 
        
        
        List employeeList = new ArrayList();
        //adding object to list
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        //size of list
        System.out.println(employeeList.size());
        
        //casting info from list to another object
        Employee specialE = (Employee)employeeList.get(2);        
        System.out.println(specialE.toString());
        
        //old style loop
        for(int i = 0; i < employeeList.size(); i++){           
            System.out.println(employeeList.get(i));
        }
        
        //experimental methods
        System.out.println(employeeList.indexOf(e3));
        
        employeeList.remove(e2);
        for(int i = 0; i < employeeList.size(); i++){           
            System.out.println(employeeList.get(i));
        }
        
    }
    
}
