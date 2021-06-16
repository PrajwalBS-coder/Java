class main{
    main()
    {
        
        this(4);
        System.out.println("The default Constructer");
        
        
    }
    main(int x)
    {
        this(4,15);
        System.out.println(x);
    }
    main(int x, int y)
    {
        System.out.println(x*y);
    }
    public static void main(String args[])
    {
        new main();
    }
}