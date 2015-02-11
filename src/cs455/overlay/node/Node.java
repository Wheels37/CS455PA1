package cs455.overlay.node;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Node {
	
	private ServerSocket serverSocket;
	private int port;
	public int uniqueID;
	
	public Node() throws IOException{
		// TODO: create constructor
		this.initialize();
		this.port = serverSocket.getLocalPort();

	}
	
	// initialize the node
	public void initialize() throws IOException{
		// TODO: write
		serverSocket = new ServerSocket(0);
	}
	
	/****** Getter/Setter methods *******/
	
	// returns port number assigned to the ServerSocket
	public int getServerPort(){
		return this.port;
	}
	
	// returns the toString representation of the initial server address bound to the serverPort
	public String getAddress(){
		if(!serverSocket.isBound()){
			return null;
		}
		return serverSocket.getLocalSocketAddress().toString();
		
	}
	/******* End Getter/Setter methods *******/
	
	// functional method to run the serverSocket for the Node
	public void run() throws IOException{
		while(true){
			Socket socket = serverSocket.accept();
			while(socket.isConnected()){
				//TODO: make it do stuff while connected
			}
		}
	}
	
	// returns a String representation of the Node
	public String toString(){
		if(!this.serverSocket.isBound()){
			return "Server Status: not yet bound";
		}
		return "".concat("Server Status: ").concat("bound\nServer Port: ").concat(Integer.toString(new Integer(this.getServerPort())))
				.concat("\nServer Address: ").concat(this.getAddress());
	}
	
	// main purely for testing purposes
	public static void main(String[] args) throws IOException{
		Node test = new Node();
		System.out.println(test);
	}

}
