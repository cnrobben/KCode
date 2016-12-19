class Resource
{   
    private boolean flag =false;
    private String name;
    private int count = 0;
    public synchronized void set(String name)
    {   
        while(this.flag)
        try{this.wait();}catch(InterruptedException e){}
        count++;
        this.name =name+count;
        System.out.println(Thread.currentThread().getName()+".........生产第"+this.count+"只"+this.name);
        this.flag = true ;
        notify();     
    }
    public synchronized void out()
    {
        while(!this.flag)
        try{this.wait();}catch(InterruptedException e){}
        System.out.println(Thread.currentThread().getName()+".........消费了第"+this.count+"只"+this.name);
        this.flag = false ;
        notify();
    }
}
class Producer  implements Runnable
{
    Resource r;
    Producer(Resource r)
    {
        this.r=r;
    }
    public void run()
    {   
        while(true)
        r.set("烤鸭");
    }
}

class Comsumer implements Runnable
{
    Resource r;
    Comsumer(Resource r)
    {
        this.r=r;
    }
    public void run()
    {   
        while(true)
        r.out();
    }
}

class ProCom
{   
    public static void main(String[] args)
    {   
        Resource r = new Resource();
        Producer a = new Producer(r);
        Comsumer b = new Comsumer(r);
        Thread  t0 = new Thread(a);
        Thread  t1 = new Thread(a);
        Thread  t2 = new Thread(b);
        Thread  t3 = new Thread(b);
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }}