import java.rmi.Naming;
import java.rmi.RMISecurityManager;

class Server {
	/**
	 * Server program for the "Hello, world!" example.
	 * 
	 * @param argv
	 *            The command line arguments which are ignored.
	 */
	public static void main(String[] argv) {
		try {
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}
			Naming.rebind("Hello", new TrafficCircleSimulation("Hello, world!"));
			System.out.println("Hello Server is ready.");
		} catch (Exception e) {
			System.out.println("Hello Server failed: " + e);
		}
	}
}