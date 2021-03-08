//Creating the Class
//Hello git
class largest_of_3
{
   public static void main(String args[])
{
   int a=5; // assign 5 to a
   int b=7; // assign 7 to b 
   int c=6; // assign 6 to c
   
   if ( (a>b) && (b>c) )
     {
       System.out.println(a + " is the largest number.");
     }
   else if ( (b>a) && (b>c)) 
     { 
       System.out.println(b + " is the largest number.");
     }    
   else 
     {
       System.out.println(c + " is the largest number.");
     }
}     
} 