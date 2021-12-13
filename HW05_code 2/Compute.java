import java.rmi.*;

// Drew Martin
// HW 5

/** Remote interface declares each of the methods
 that can be called remotely */
public interface Compute extends Remote {
    
    /** Remotely invocable methods */
    String sayHello() throws RemoteException;
    
    int sum(int a, int b) throws RemoteException;
    int subtraction(int a, int b) throws RemoteException;
    int multiplication(int a, int b) throws RemoteException;
    int division(int a, int b) throws RemoteException;
    int gcd(int a, int b) throws RemoteException;
}