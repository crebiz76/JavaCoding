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
}
