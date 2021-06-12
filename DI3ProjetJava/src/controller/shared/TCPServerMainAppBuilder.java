package controller.shared;

import java.net.*;

import java.io.*; 

/**
 * 
 * @brief Class used to build a TCPServerMainApp.
 *
 */
public class TCPServerMainAppBuilder {

	protected InetAddress IPaddress;
	protected int numPort;
	protected ServerSocket ss; protected Socket s; // the passive and active sockets 
	protected InetSocketAddress isA; // the address 
	protected transient InputStream sIn;
	protected transient ObjectInputStream ois;
	protected transient OutputStream sOut;
	protected transient ObjectOutputStream oos;
	 
	/**
	 * @brief Constructor.
	 * @param IPaddress
	 * @param numPort
	 */
	TCPServerMainAppBuilder(InetAddress IPaddress, int numPort) { 
		this.IPaddress = IPaddress;
		this.numPort = numPort;
		ss = null; s = null; 
		isA = null; 
		sIn = null;
		ois = null;
	} 
	 
	/**
	 * @brief Method used to set the connection.
	 * @throws IOException
	 */
	public void setSocket() throws IOException { 
		
		isA = new InetSocketAddress(IPaddress , numPort);
		ss = new ServerSocket(isA.getPort());
		 
	}

}