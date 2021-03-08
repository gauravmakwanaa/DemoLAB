class CLC
{
  public static void main(String args[])
   {
      Double a = Double.parseDouble(args[0]);
      String operation = args[1];
      Double b = Double.parseDouble(args[2]);
      Double c= 0.00;
      if (operation.equals("+"))
         {
            c=a+b;
         }
      else if (operation.equals("-"))
         {
            c=a-b;
         }
      else if (operation.equals("*"))
         {
            c=a*b;
         }
      else if (operation.equals("/"))
         {
            c=a/b;
         }  
      else   
         {  
            System.out.println("operator not exist");
         }
       System.out.println(c);
   }
}