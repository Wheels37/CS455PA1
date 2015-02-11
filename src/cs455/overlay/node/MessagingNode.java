package cs455.overlay.node;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/*
Unlike the registry, there are multiple messaging nodes (minimum of 10) in the system. A messaging
node provides two closely related functions: it initiates and accepts both communications and
messages within the system.

Communications that nodes have with each other are based on TCP. Each messaging node needs to
automatically configure the port over which it listens for communications i.e. the server-socket port
numbers should not be hard-coded or specified at the command line. TCPServerSocket is used to
accept incoming TCP communications.

Once the initialization is complete, the node should send a registration request to the registry.
Each node in the system has a routing table that is used to route content along to the sink. This
routing table contains information about a small subset of nodes in the system. Nodes should use this
routing table to forward packets to the sink specified in the message. Every node makes local
decisions based on its routing table to get the packets closer to the sink. Care must be taken to
ensure you don’t change directions or overshoot the sink: in such a case, packets may continually
traverse the overlay.
*/
public class MessagingNode {
	protected ServerSocket server;
	protected Socket client;
	
	// TODO: needs a routing table. figure out a data type/ for this?
	
	public MessagingNode() throws IOException{
		// set up the server socket
		server = new ServerSocket(0);
		
		// send registration request to registry
		//TODO: make this happen
		
	}
	
	public void forwardMessage(){
		//TODO: method to forward on received packets
	}
	

}
