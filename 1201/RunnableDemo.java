class ticket implements Runnable 
{
   private int num = 2;
   public void run ()
   {
       sell();
   }
   public void sell ()
   {
       while (true)
       {
           if (num>0)
           {     
               System.out.println(Thread.currentThread().getName()+"......."+num--);  
           }
       }
   }    
}   

class RunnableDemo
{
    public static void main (String [] args )
    {
        ticket  a = new ticket();
        Thread  a1 = new Thread(a);
        Thread  b1 = new Thread(a);
        Thread  c1 = new Thread(a);
        Thread  d1 = new Thread(a);
        a1.start();
        b1.start();
        c1.start();
        d1.start();


    }
}