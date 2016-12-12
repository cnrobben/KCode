class Demo extends Thread
{   private String name;
    Demo(String name)
    {
        this.name = name;
    }
    public void run()
    {   
       
        for (int i=0;i<10;i++)
       {    
           for (int k=-999999999;k<99999999;k++);
           for (int k=-99999999;k<999999999;k++);
           for (int k=-99999999;k<999999999;k++);
           System.out.println(name+".........."+i);

       } 
    }
} 

class ThreadDemo
{
    public static void main (String [] args )
    {
        Demo d1 = new Demo("一");
        Demo d2 = new Demo("贰");
        d1.start();
          for (int i=0;i<10;i++)
       {    
           for (int k=-999999999;k<99999999;k++);
           for (int k=-99999999;k<999999999;k++);
           for (int k=-99999999;k<999999999;k++);
            System.out.println("这个在哪里");

       } 
        d2.start();
    }
}