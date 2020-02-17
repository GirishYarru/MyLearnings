package com.hashmap.examples;

public class Employee {
       private int id;
       private String name;

       public Employee(int id, String name) {
             super();
             this.id = id;
             this.name = name;
       }

       @Override
       public int hashCode() {
             return 1;
       }

}
