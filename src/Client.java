import java.rmi.Naming;

public class Client {
	/**
	 * Client program for the "Hello, world!" example.
	 * 
	 * @param argv
	 *            The command line arguments which are ignored.
	 */
	public static void main(String[] argv) {
		try {

			System.out.println("Localhost ip address: "
					+ java.net.InetAddress.getLocalHost());
			TrafficCircleSimulationManager trafficCircleSimulationManager = new TrafficCircleSimulationManager();

			TrafficCircleSimulationInterface hello = (TrafficCircleSimulationInterface) Naming
					.lookup("//127.0.0.1/Hello");
			System.out.println(hello.say("Panie, podłączony klient."));

			hello.set_chances(trafficCircleSimulationManager
					.load_data("../params.txt"));
			System.out.println(hello.say("Panie, parametry odebrane."));

			hello.start();
			System.out.println(hello.say("Panie, koniec symulacji."));

			int[][] res = hello.get_results();
			System.out.println(hello.say("Panie, Wypisuje wyniki."));
			for (int[] tab_res : res) {
				for (int num : tab_res) {
					System.out.print(num + "  -- ");
				}
				System.out.println("");
			}

		} catch (Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}
}
