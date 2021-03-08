class C_O
{
    int a;
    public void input(int b,int c)
    {
        a=b+c;
    }
    public void print()
    {
        System.out.println("sum = "+a);
    }
    public static void main(String args[]) 
    {
     C_O g= new C_O();
     g.input(10,20);
     g.print();
    }
}