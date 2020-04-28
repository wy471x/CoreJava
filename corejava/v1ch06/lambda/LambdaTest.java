package lambda;

import java.awt.event.ActionListener;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates the use of lambda expressions.
 * @version 1.0 2015-05-12
 * @author Cay Horstmann
 */
public class LambdaTest
{
   public static void main(String[] args)
   {
      String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", 
            "Jupiter", "Saturn", "Uranus", "Neptune" };
      System.out.println(Arrays.toString(planets));
      System.out.println("Sorted in dictionary order:");
      Arrays.sort(planets);
      System.out.println(Arrays.toString(planets));
      System.out.println("Sorted by length:");
      BiFunction<String, String, Integer> comp = (first, second) -> first.length() - second.length();
      Arrays.sort(planets, (first, second) -> first.length() - second.length());
      System.out.println(Arrays.toString(planets));
            
      Timer t = new Timer(1000, event ->
         System.out.println("The time is " + new Date()));
      t.start();   

      ArrayList<String> list = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars",
              "Jupiter", "Saturn", "Uranus", "Neptune", "Earth"));
      System.out.println(list.toString());
      list.removeIf(e-> e == "Earth");
      System.out.println(list.toString());
      /*for(int i = 0; i < list.size(); i++)
         System.out.print(list.get(i));*/


      ArrayList<String> names = new ArrayList<String>(Arrays.asList("Wang", "Li", "Zhang"));
      Stream<Person> stream = names.stream().map(Person::new);
      //List<Person> people = stream.collect(Collectors.toList());
      Person[] people1 = stream.toArray(Person[]::new);
      for(Person p : people1)
         System.out.println(p.getName());

      // keep program running until user selects "Ok"
      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }

   /*public static void countDown(int start, int delay)
   {
      ActionListener listener = event -> {
         start--;
         System.out.println(start);
      };
      new Timer(delay, listener).start();
   }*/
}

class Person{
   String name;
   int age;

   /*Person(String name, int age){
      this.name = name;
      this.age = age;
   }*/

   Person(String name){
      this.name = name;
   }

   public String getName() { return this.name; }
   public int getAge() { return this.age; }
}