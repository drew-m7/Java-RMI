import java.rmi.Naming;
// Drew Martin
// HW 5
/** Client class that will use the remote service */
public class Client{

public static void main (String[] args) {

    try {

        Compute comp =
        (Compute) Naming.lookup("//localhost/Server");

        // tested with some variables 
        System.out.println (comp.sayHello());
        System.out.println("Remote sum: "+comp.sum(3,5)); // outputs 8
        System.out.println("Remote subtraction: "+comp.subtraction(5,3)); // outputs 2
        System.out.println("Remote multiplication: "+comp.multiplication(3,5)); // outputs 15
        System.out.println("Remote division: "+comp.division(5,2)); // outputs 2
        System.out.println("Remote gcd: "+comp.gcd(10,5)); // outputs 5

        // tested with command line args
        String str1 = args[0];
        String str2 = args[1];
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        System.out.println("Command line ints for testing are: "+a+", "+b);
        System.out.println("Remote sum: "+comp.sum(a,b));
        System.out.println("Remote subtraction: "+comp.subtraction(a,b));
        System.out.println("Remote multiplication: "+comp.multiplication(a,b));
        System.out.println("Remote division: "+comp.division(a,b));
        System.out.println("Remote gcd: "+comp.gcd(a,b));

    } catch (Exception e) {
        System.out.println ("Client exception: " + e);
    }
  }
}