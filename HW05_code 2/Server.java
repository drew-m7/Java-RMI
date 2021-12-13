import java.rmi.Naming;
// Drew Martin
// HW 5
public class Server {
    public static void main(String args[])
    {
        try
        {
            ComputeImpl obj = new ComputeImpl("Hello There!!");
            // Bind this object instance to the name "Server"
            Naming.rebind("//localhost/Server", obj);
            System.out.println("Server is ready");
        }
        catch (Exception e)
        {
            System.out.println("Server failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

}