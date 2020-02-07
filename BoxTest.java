import java.util.Scanner;

public class BoxTest
{
   public static void main(String args[])
   {
   //input 
      Scanner in=new Scanner(System.in);
      Box b1 = new Box(11.25, 8.75, 6.0);
      
 
      Box b2 = new Box(15.0,20.0,10.5);
      
      
      Box b3 = new Box(0.0,0.0,0.0);
      
      System.out.println(b1);
      System.out.println(b2);
      System.out.println(b3);
      
      //Update box 3 dimensions
      System.out.print("Enter box 3 dimensions because it is an empty box: ");

      double d1= in.nextDouble();
      double d2= in.nextDouble();
      double d3= in.nextDouble();

      b3.setL(d1);

      b3.setW(d2);
 
      b3.setH(d3);
      
      
      //input the value of the dimensions
      
      System.out.println("Enter the dimension of an item (separated by spaces): ");

     

      double new1= in.nextDouble();
      double new2= in.nextDouble();

      double new3= in.nextDouble();


   //condition to check the length, width and height of the item
   if((b1.getLength()>new1)&&(b1.getWidth()>new2)&& (b2.getheight()>new3))
   {
      b1.setF(true);
      System.out.println("Item can fit in Box 1");
   }
   else if((b2.getLength()>new1)&&(b2.getWidth()>new2)&& (b2.getheight()>new3))
   {
      b2.setF(true); 
      System.out.println("Item can fit in Box 2");
   }
   else if ((b3.getLength()>new1)&&(b3.getWidth()>new2)&& (b3.getheight()>new3))
   {
      b3.setF(true);
      System.out.println("Item can fit in Box 3");
   }
   System.out.println(b1);
   System.out.println(b2);
   System.out.println(b3);
   }
   /*“I pledge my Honor that I have not cheated, and will not cheat, on this assignment”

      Huy Duong, U65372481. */
   
   
}