public class Box
{
   private double length;
   private double width;
   private double height;
   private boolean full;

//constructor method that accept no parameters
   public Box()
   {
      length = 11.25;
      width = 8.75;
      height = 6;
      full = false;
   }
  //constructor that accept length, width, and height
   public Box(double length, double width, double height)
   {
      this.length = length;
      this.width = width;
      this.height = height;
      this.full = false;
      
   
   }
   //accesssor for all of instance data
   public double getLength()
   {
      return length;
   }   
   public double getWidth()
   {
      return width;
   }
   public double getheight()
   {
      return height;
   }
   public boolean getfull()
   {
      return full;
   }
   
   // mutator method for all instacne data
   public void setL(double l)
   {
      length = l;
   }
   public void setW(double w)
   {
      width = w;
   }
   public void setH(double h)
   {
      height = h;
   }
   public void setF(boolean f)
   {
      full = f;
   }
   
   public String toString()
   {
   if(full == true)
   return("Box size: " +length + " X " + width + " X " + height +" inches" + "\nthe box is full");
   else 
   return("Box size: " +length + " X " + width + " X " + height +" inches" + "\nthe box is empty");

   }

 /*“I pledge my Honor that I have not cheated, and will not cheat, on this assignment”

      Huy Duong, U65372481. */

}