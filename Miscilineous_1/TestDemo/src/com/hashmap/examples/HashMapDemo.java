package com.hashmap.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

       public static void main(String[] args) {
             Employee emp1 = new Employee(1, "hiccup");
             Employee emp2 = new Employee(1, "toothless");
             Employee emp3 = new Employee(2, "atom");

             Map<Employee, String> map = new HashMap<Employee, String>();
             map.put(emp1, "hiccup map");
             map.put(emp2, "toothless map");

             System.out.println(map.size()); //Guess size
             System.out.println(map.remove(emp3)); //output?
             System.out.println(map.size()); //Guess size

       }

}
