import java.rmi.*;

public interface TrafficCircleSimulationInterface extends Remote {
	public String say(String msg) throws RemoteException;

	public void set_chances(float[][] chances) throws RemoteException;

	public boolean is_done() throws RemoteException;

	public void run() throws RemoteException;

	public int[][] get_results() throws RemoteException;

}
