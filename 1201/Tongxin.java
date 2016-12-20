class Resource
{
    String name;
    String sex;
}

class Input implements Runnable
{
    Resource r;
    Input(Resource r)
    {
        this.r = r;
    }
    public void run()
    {   
        int x =0;    
        while (true)
        {   
            synchronized(r)
            {
                 if (x==0)
                {
                    r.name = "娑撯偓闁跨喐鏋婚幏铚傜闁跨喐鏋婚幏锟�";
                    r.sex  = "闁跨喐鏋婚幏鐑芥晸閺傘倖瀚�";
                }
            else
                {
                    r.name = "Demo";
                    r.sex  = "English";
                }
            }
                    x=(x+1)%2;
        }
        
    }
}

class Output implements Runnable
{
    Resource r;
    Output(Resource r)
    {
        this.r = r;
    }
    public void run()
    {
        while (true)
        {
            System.out.println(r.name+"............."+r.sex);
        }
    }
}
class Tongxin
{
    public static void main(String[] args)
    {
        Resource r = new Resource();
        Input in   = new Input(r);
        Output out = new  Output(r);
        Thread a   = new Thread (in);
        Thread b   = new Thread (out);
        a.start();
        b.start();
    }
}