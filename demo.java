package githup;

interface X
{
   public void myMethod();
}
interface Y
{
   public void myMethod();
}
class demo implements X, Y
{
   public void myMethod()
   {
       System.out.println(" Multiple inheritance example using interfaces");
   }
}
