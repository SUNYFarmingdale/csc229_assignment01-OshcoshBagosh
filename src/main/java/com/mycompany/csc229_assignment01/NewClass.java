
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
        Course ob1 = new Course();
        Course ob2 = new Course(1723, "Simon", "6U9O2P");
        Course ob3 = new Course();

        // Object 1
        ob1.setID(10);
        System.out.println(ob1.getID());

        ob1.setName("Oscar");
        System.out.println(ob1.getName());

         ob1.setCode("A36C7F");
         System.out.println(ob1.getCode());

         // Object 2
         System.out.println(ob2.getID());
         System.out.println(ob2.getName());
         System.out.println(ob2.getCode());

         // Object 3
         System.out.println(ob3.getID());
         System.out.println(ob3.getName());
         System.out.println(ob3.getCode());
    }
    
}
