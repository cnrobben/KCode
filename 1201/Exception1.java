class LanPing extends Exception
{
    LanPing(String s)
    {
        super(s);
    }
}
class MaoYan extends Exception
{
    MaoYan(String s)
    {
        super(s);
    }
}

class Slow extends Exception 
{   
    public void change()
    {
        System.out.print("????");
    }
}

class Computer 
{   int state = 2;
    void run() throws LanPing,MaoYan
    {   
        System.out.print("????????");
        if (state==1)
        {
            throw new LanPing("??????????");
        }
        if(state==2)
        {
            throw new MaoYan("?????????");
        }
     
    }
       void rest()
        {
            state = 0;
            System.out.print("??????????");
        }
}
class Teacher
{
    private String name;
    Teacher(String name)
    {
        this.name = name;
    }
    void teach() throws Slow
    {
        try
        {
            new Computer().run();
            System.out.print(name+"???????");
        }
        catch (LanPing c)
        {
            System.out.print(c.toString());
            teach();
        }
        catch (MaoYan c)
        {
            System.out.print(c.toString());
            test(); 
            throw new Slow();
        }
    
    }
    public void test()
    {
        System.out.print("?????????");
    }
}
class  Exception1
{
    public static void main(String [] args )
    {
        Teacher a = new Teacher("?????");
        try
        {
            a.teach();
        }
        catch(Slow c)
        {
            System.out.print("????????????????");
            c.change();
        }
        
    }
}