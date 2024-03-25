/*
Name: William Olsen
Formula Calculator
*/

import java.util.Scanner;
import java.util.Arrays;
public class Calculator
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      String q = "x";
      while (!q.equals("q"))
      {
         System.out.println("Type bc for basic calculator");
         System.out.println("Type qf for Quadratic formula");
         System.out.println("Type fd for finding derivative");
         System.out.println("Type v for finding volume of an object");
         System.out.println("Type c for finding critical points");
         System.out.println("Type expG for finding exponential growth");
         System.out.println("Type m for finding mean/median/mode");
         System.out.println("Type q to quit");
         String choice = sc.nextLine();
         if (choice.equals("qf"))
         {
               System.out.println("Quadratic formula: ax^2 + bx + c = 0");
               
               System.out.println("Please enter coefficient a: ");
               double a = sc.nextDouble();
               
               System.out.println("Please enter coefficient b: ");
               double b = sc.nextDouble();
               
               System.out.println("Please enter coefficient c: ");
               double c = sc.nextDouble();
               
               double squared = Math.pow(b, 2) - (4 * a * c);
               
               if (squared > 0)
               {
                  double firstroot = (-b + (Math.sqrt(squared)) / (2 * a));
                  double secondroot = (-b - (Math.sqrt(squared)) / (2 * a));
                  System.out.println("First root: " + firstroot + " Second root: " + secondroot);
               }
               else if (squared == 0)
               {
                  double bothroot = (-b / (2 * a));
                  System.out.println("Both roots are: " + bothroot);
               }
               else
               {
                  System.out.println("The square root is not a real number");
               }
         }
         else if (choice.equals("bc"))
         {
               double answer = 0;
               System.out.println("Enter the first number");
               double n1 = sc.nextDouble();
               System.out.println("Enter the second number");
               double n2 = sc.nextDouble();
               System.out.println("Choose an operation");
               String op = sc.next();
               if (op.equals("+"))
               {
                  answer = n1+n2;
               }
               else if (op.equals("-"))
               {
                  answer = n1-n2;
               }
               else if (op.equals("*"))
               {
                  answer = n1*n2;
               }
               else if (op.equals("/"))
               {
                  answer = n1/n2;
               }
               else 
               {
                  System.out.println("Invalid operation");
               }
               System.out.println("Answer: " + answer); 
         }              
         else if (choice.equals("fd"))
         {
               
               System.out.println("Formula: ax^n");
               System.out.println("Enter coefficient a: ");
               int cons = sc.nextInt();
               System.out.println("Enter exponent n: ");
               int exp = sc.nextInt();
               if (exp == 0)
               {
                  System.out.println("The derivative is 0");
               }
               else
               {
                  int newCons = cons * exp;
                  int newExp = exp - 1;
                  System.out.println("Derived constant is " + newCons + ", and the new exponent is " + newExp);
               }
         }
         else if (choice.equals("v"))
         {
               System.out.println("Enter co for cone volume");
               System.out.println("Enter cy for cylinder volume");
               System.out.println("Enter cu for cube volume");
               System.out.println("Enter sp for sphere volume");
               String vChoice = sc.nextLine();

               if (vChoice.equals("co"))
               {
                     System.out.println("Cone volume formula: V = (1/2)πr^2h");
                     System.out.println("Enter a radius");
                     double rad = sc.nextDouble();
                     System.out.println("Enter a height");
                     double hght = sc.nextDouble();
                     if (hght == 0)
                     {
                        System.out.println("The volume is zero");
                     }
                     else
                     {
                        double v = (3.14159 * Math.pow(rad, 2.0) * hght * ((double)1/3));
                        System.out.println("Volume: " + v);
                     }
               }
               else if (vChoice.equals("cu"))
               {
                     System.out.println("Cube formula: x^3");
                     System.out.println("Enter a side to cube");
                     double side = sc.nextInt();
                     double cube = (Math.pow(side, 3));
                     System.out.print("Volume: " + cube);
               }
               else if (vChoice.equals("cy"))
               {
                     System.out.println("Cylinder formula: πr^2(h)");
                     System.out.println("Enter a radius");
                     double radius = sc.nextDouble();
                     System.out.println("Enter a height");
                     double height = sc.nextDouble();
                     double cyResult = (3.14159 * Math.pow(radius, 2.0) * height);
                     System.out.println("Volume: " + cyResult);
               }
               else if (vChoice.equals("sp"))
               {
                     System.out.println("Sphere formula: 4/3π(r^3)");
                     System.out.println("Enter a radius");
                     double r = sc.nextDouble();
                     double spResult = (4/3) * (3.14159) * (Math.pow(r, 3));
                     System.out.println("Volume: " + spResult);
               }
               sc.nextLine();
         }
         else if (choice.equals("c"))
         {
                System.out.println("Quadratic function: ax^2 + bx + c");
                System.out.println("Enter coefficient a");
                double a = sc.nextDouble();
                System.out.println("Enter coefficient b");
                double b = sc.nextDouble();
                System.out.println("Enter coefficient c");
                double c = sc.nextDouble();
                
                double derA = 2*a;
                double derB = b;
                if (derA == 0)
                {
                  System.out.println("The function is linear and does not have a critical point");
                }
                else
                {
                  double critPoint = (-derB) / (2 * derA);
                  System.out.println("Answer: " + critPoint);
                }
         }
         else if (choice.equals("fa"))
         {
               System.out.println("Enter a factorial");
               int n = sc.nextInt();
               double result = 1;
               for (int i = 2; i<=n; i++)
               {
                  result *= i;
               }
               System.out.println("Answer:" + result);
         }
         else if (choice.equals("expG"))
         {
               System.out.println("Exponential growth formula: P * e^rt");
               System.out.println("Enter the initial value (P)");
               double P = sc.nextDouble();
               System.out.println("Enter the rate of growth as a decimal (.01 = 1%)");
               double r = sc.nextDouble();
               System.out.println("Enter the time period of growth");
               double t = sc.nextDouble();
               double finalAmt = P * Math.exp(r * t);
               System.out.println("The final amount after " + t + " in your units of time is " + finalAmt);
         }
         else if (choice.equals("m"))
         {
               //mean
               System.out.println("How many numbers are you going to be taking?");
               int L = sc.nextInt();
               double[] numArray = new double[L];
               double sum = 0;
               for (int i = 0; i < L; i++)
               {
                  System.out.println("Add a number to the list");
                  double n = sc.nextDouble();
                  numArray[i] = n;
               }
               for (int j = 0; j < numArray.length; j++)
               {
                  sum += numArray[j];
               }
               double mean = sum / numArray.length;
                               
               //median
               Arrays.sort(numArray);
               double median = 0;
               if (numArray.length%2 == 0)
               {
                  median = (numArray[numArray.length/2] + numArray[numArray.length/2 -1]) / (2);
               }
               else if (numArray.length%2 != 0)
               {
                  median = numArray[numArray.length/2];
               }
               
               //mode
               double mode = numArray[0];
               int maxCount = 1;
               int curCount = 1;
               for (int i = 0; i < numArray.length - 1; i++)
               {  
                  if (numArray[i] == numArray[i+1])
                  {
                     curCount++;
                  }
                  else
                  {
                     curCount = 1;
                  }
                  if (maxCount < curCount)
                  {
                     maxCount = curCount;
                     mode = numArray[i];
                  }
               }  
               System.out.println("Mean: " + mean);
               System.out.println("Median: " + median);
               System.out.println("Mode: " + mode);
         }
         else if (choice.equals("q"))
         {
             System.out.println("Closing calculator...");
             q = "q";
         }  
         sc.nextLine();
    System.out.println("");
    System.out.println("----------"); 
    System.out.println("");
}     
}   
}

