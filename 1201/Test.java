class DeadLock implements Runnable
{
    private boolean flag;
    DeadLock(boolean flag)
    {
        this.flag=flag;
    }
    public void run()
    {   
        if (flag)
     {
            
        {
            synchronized (Lock.locka)
            {
                System.out.println("if........get locka");
                synchronized (Lock.lockb)
                {
                    System.out.println("if........get lockb");
                }
            }
        }
     }
        else
        {   
            synchronized (Lock.lockb)
            {
                System.out.println("else.........get lockb");
                synchronized (Lock.locka)
                {
                    System.out.println("else.........get locka");
                }
            }

        }
    }
}

class Lock
{
    public static Object locka = new Object();
    public static Object lockb = new Object();
}

class Test
{   
    public static void main(String[] args)
    {   
        DeadLock a = new DeadLock(true);
        DeadLock b = new DeadLock(false);
        Thread  c =  new Thread(a);
        Thread  d =  new Thread(b);
        c.start();
        d.start();
    }
    


}