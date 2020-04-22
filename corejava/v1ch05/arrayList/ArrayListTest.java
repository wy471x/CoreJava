package arrayList;

import java.util.*;

import org.omg.CORBA.IntHolder;

/**
 * This program demonstrates the ArrayList class.
 * @version 1.11 2012-01-26
 * @author Cay Horstmann
 */
public class ArrayListTest
{
	// String... equals to String[] in main's arguments.
   public static void main(String... args)
   {
      // fill the staff array list with three Employee objects
      ArrayList<Employee> staff = new ArrayList<>();

      staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
      staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
      staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

      // raise everyone's salary by 5%
      for (Employee e : staff)
         e.raiseSalary(5);

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
               + e.getHireDay());
      
      /*
      int i = 0;
      Employee e = (Employee)staff.get(i);
      staff.set(i, "Harry Hacker");
      */
      
      Integer xInteger = 4;
      tripleInteger(xInteger);
      System.out.println(xInteger);
      
      int xInt = 4;
      tripleInt(xInt);
      System.out.println(xInt);
      
      IntHolder xIntHolder = new IntHolder(4);
      tripleIntHolder(xIntHolder);
      System.out.println(xIntHolder.value);
      
      double[] num = {1, 2, 3, 44};
      System.out.println(max(num));
       
   }
   
   public static void tripleInteger(Integer x)
   {
   	   x = 3 * x;
   }
   
   public static void tripleInt(int x)
   {
	   x = 3 * x;
   }
   
   public static void tripleIntHolder(IntHolder x)
   {
	   x.value =  3 * x.value;
   }
   
   // define method whose number of argument is variable
   public static double max(double... values)
   {
	   double largest = Double.NEGATIVE_INFINITY;
	   for(double v : values) if (v > largest) largest = v;
	   return largest;
   }
   
}