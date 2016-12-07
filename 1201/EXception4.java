class FushuIndex extends Exception
{
    FushuIndex(String s)
    {
        super(s);
    }
}

class Demo
{
    public int method(int arr[],int index) throws FushuIndex
   { if (index<0)
    {
        throw new FushuIndex("数组脚标不能为负");
    }
        return arr[index];}
}



class Exception4
{
    public static void main(String[] args)
    {
        int arr[] ={1,2,3};
        try
        {
           int a = new Demo().method(arr,-1);
           System.out.print("num="+a);
        }
        catch (FushuIndex e)
        {
            String s = e.getMessage();
            System.out.print(s);
            
            System.out.print("fuck");
        }
    }
}