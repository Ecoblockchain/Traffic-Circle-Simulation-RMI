import java.rmi.*;

/**
 * Interfejs dla klasy przeprowadzających symulacje.
 * 
 * @author Robert Gaca i Tomasz Giereś
 * 
 */
public interface TrafficCircleSimulationInterface extends Remote {
	public String say(String msg) throws RemoteException;

	/**
	 * Pozwala na przekazanie obiektowi parametrów symulacji.
	 * 
	 * @param chances
	 * @throws RemoteException
	 */
	public void set_chances(float[][] chances) throws RemoteException;

	/**
	 * Pozwala sprawdzić czy program został uruchomiony i zakończył obliczenia.
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public boolean is_done() throws RemoteException;

	/**
	 * Metoda przeprowadzająca właściwe obliczenia.
	 * 
	 * @throws RemoteException
	 */
	public void start() throws RemoteException;

	/**
	 * Zwraca wyniki obliczeń, tablica int[5][4]
	 * 
	 * @return
	 * @throws RemoteException
	 */
	public int[][] get_results() throws RemoteException;

}
