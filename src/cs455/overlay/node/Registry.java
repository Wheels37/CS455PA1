package cs455.overlay.node;
/*There is exactly one registry in the system. The registry provides the following functions:
	A. 	Allows messaging nodes to register themselves. This is performed when a messaging node
		starts up for the first time.
	B. 	Assign random identifiers (between 0-127) to nodes within the system; the registry also has
		to ensure that two nodes are not assigned the same IDs i.e., there should be no collisions in
		the ID space.
	C. 	Allows messaging nodes to de-register themselves. This is performed when a messaging node
		leaves the overlay.
	D. 	Enables the construction of the overlay by populating the routing table at the messaging
	nodes. The routing table dictates the connections that a messaging node initiates with other
	messaging nodes in the system.
The registry maintains information about the registered messaging nodes; you can use any data
structure for managing this information but make sure that your choice can support all the operations
that you will need.

The registry does not play any role in the routing of data within the overlay. Interactions between the
messaging nodes and the registry are via request-response messages. For each request that it
receives from the messaging nodes, the registry will send a response back to the messaging node
(based on the IP address associated with Socket’s input stream) where the request originated. The
contents of this response depend on the type of the request and the outcome of processing this
request. 
*/
public class Registry {

}
