interface  Area
{
    public double getArea();
}


class Rectangle implements Area
{   
    private double length;
    private double width;
    Rectangle(double length,double width)
    {   if(length<0 ||width<0)
        throw new Fushu("不能为负数");
        this.length=length;
        this.width=width;
    }
    public double getArea ()
    {
        return  length*width;
    }
}

class Cirle implements Area
{
   public static final double PI = 3.14;
   private double radius;
   Cirle(double radius)
   {    
       if (radius < 0)
       {
           throw new Fushu("半径不能为负");
       }
       this.radius = radius;
   }
   public double getArea()
   {
       return radius*radius*PI;
   }
}
class Fushu extends RuntimeException
{
    Fushu (String s)            // 子类要覆盖 父类构造函数 默认super(空参数) 
    {
       super(s);
    }
}

class AreaDemo
{
    public static void main (String [] args)
    {   
        Rectangle b = new Rectangle(-1,-2);
        Cirle a = new Cirle (-1);
       
    }
}