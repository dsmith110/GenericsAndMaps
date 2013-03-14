/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.*;

/**
 *
 * @author dsmith110
 */
public class StartUp {
    
    public static void main(String[] args) {
        // Create employee objects
        Employee e1 = new Employee(4, "Smith", "Dan", "222-22-2222");
        Employee e2 = new Employee(1, "Jones", "Bob", "333-33-3333");
        Employee e3 = new Employee(2, "Holmes", "Sherlock", "222-22-2222");
        Employee e4 = new Employee(3, "Campbell", "Bruce", "111-11-1111");
        
        // Create a map to store employees
        // Key used is empID
        Map<String, Employee> empMap = new HashMap<String, Employee>();

        // Put employees in the Map
        empMap.put(e1.getSsn(), e1);
        empMap.put(e2.getSsn(), e2);
        empMap.put(e3.getSsn(), e3);
        empMap.put(e4.getSsn(), e4);
        
        Set<String> empSet = empMap.keySet();
        
        System.out.println("-----Keys-----");
        
        for(String e : empSet) {
            System.out.println("Employee SSN: " + e);
        }
        
        Collection<Employee> employees = empMap.values();
        List<Employee> list = new ArrayList<Employee>(employees);
        
        System.out.println("-----Values-----");
        
        for(Employee e : list) {
            System.out.println(e);
        }
        
        // Challenge 3
        Map<String, Employee> empTreeMap = new TreeMap<String, Employee>();
        
        // Putting objects in a TreeMap
        empTreeMap.put(e1.getSsn(), e1);
        empTreeMap.put(e2.getSsn(), e2);
        empTreeMap.put(e3.getSsn(), e3);
        empTreeMap.put(e4.getSsn(), e4);
        
        // Declared with <String>
        empSet = empTreeMap.keySet();
        
        System.out.println("-----TreeMap - Sorted Keys-----");
        
        for(String emp : empSet) {
            System.out.println("Employee SSN: " + emp);
        }
        
        Collections.sort(list, new EmployeeByLastName());
        
        System.out.println("------Sorted by last name-----");
        
        for (Employee employee : list) {
            System.out.println(employee);
        }
        
        // Challenge 4
        Set<Employee> empTreeSet = new TreeSet<Employee>();
        e2.setEmpID(2);
        
        empTreeSet.add(e1);
        empTreeSet.add(e2);
        empTreeSet.add(e3);
        empTreeSet.add(e4);
        
        System.out.println("-----TreeSet-----");
        for (Employee e : empTreeSet) {
            System.out.println(e);
        }
        
        List<Employee> employeeList = new ArrayList<Employee>(empTreeSet);
        Collections.sort(employeeList, new EmployeeBySsn());
        
        System.out.println("-----Alternate Sort-----");
        
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
