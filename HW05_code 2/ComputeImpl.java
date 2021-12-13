import java.rmi.*;
import java.rmi.server.*;
import java.lang.Math;
// Drew Martin
// HW 5
/** 
 * Remote server class that implements Compute
*/
public class ComputeImpl extends UnicastRemoteObject implements Compute{
    private String message;
    /** Constructor for remote object */
    public ComputeImpl (String msg) throws RemoteException{
        message = msg;
    }

    /** Implementation of remotely invocable method*/
    public String sayHello() throws RemoteException{
        return message;
    }

    // addition, subtraction, multiplication, division, and GCD

    public int sum(int a, int b) throws RemoteException{
        return (a+b);
    }

    public int subtraction(int a, int b) throws RemoteException{
        return (a-b);
    }

    public int multiplication(int a, int b) throws RemoteException{
        return (a*b);
    }

    // division of two ints that returns the floor of the two ints
    public int division(int a, int b) throws RemoteException{
        return Math.floorDiv(a, b);
    }

    // gcd using the euclidian algorithm
    public int gcd(int a, int b) throws RemoteException{
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}