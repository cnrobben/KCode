class Demo
{
    public int method (int arr[],int index) throws FushuException
    {
        if (index>=arr.length)
        {
            throw new ArrayIndexOutOfBoundsException("����ű�Խ��");
        }
        if (index<0)
        {
            throw new FushuException("���ű�Ϊ������");
        }
        return index;
    }
}

class ExceptionDemo
{   
    public static void main(String [] args) throws FushuException
    {
    int arr[]={1,3,4,5,6,7};
    new Demo().method(arr,-1);
    }
}

class FushuException extends Exception 
{
    FushuException(String s)
    {
           super(s);
    }
}