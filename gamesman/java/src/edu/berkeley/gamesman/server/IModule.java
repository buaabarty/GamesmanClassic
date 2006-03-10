package edu.berkeley.gamesman.server;

/**
 * Represents a pluggable module for the Gamesman server web application. All 
 * high level components must create and implement an IModule.
 * 
 * @author Matt Jacobsen
 *
 */
public interface IModule
{
	/**
	 * Returns true if the specified request type name is supported by this 
	 * IModule, false otherwise.
	 * 
	 * @param requestTypeName name of the request being processed
	 * @return true if the specified request type name is supported by this 
	 * 			IModule, false otherwise
	 */
	public boolean typeSupported(String requestTypeName);

	/**
	 * Handles the specified request. Reads the request data from the specified
	 * IModuleRequest and writes the response to the specified IModuleResponse.
	 * 
	 * @param req request to read data from
	 * @param res response to write data to
	 */
	public void handleRequest(IModuleRequest req, IModuleResponse res);

}
