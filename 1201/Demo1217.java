class Demo1217
{
    public static void main(String[] args)
    {
        new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Runnable");
            }
        })
        {
            /*public void run()
            {
                System.out.println("Thread");
            }*/
        }.start();
    }
}