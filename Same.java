public class Same {
    public Same()
    {
        this._public();
        this._protected();
        // this._default();
        this._private();
    }

    public void _public()
    {
        System.out.println("public");
    }
    
    protected void _protected()
    {
        System.out.println("protected");
    }

    // default void _default()
    // {
    //     System.out.println("default");
    // }

    private void _private()
    {
        System.out.println("private");
    }

    public static void main(String[] args)
    {
        Calculator28 c28 = new Calculator28();
        c28.setOprands(10, 20);
        // c28._sum();
        c28.sumDecoPlus();
        c28.sumDecoMinus();
    }
}
