interface USB
{
    public void open();
    public void close();
}

class BookPC
{
    public static void main (String[] args)
    {

    }
    public static void useUSB(USB u)
    {
        u.open();
        u.close();
    }
}


class UPan implements USB
{
    public void open()
    {
        System.out.println("upan open")
    }
     public void close()
    {
        System.out.println("upan close")
    }
}