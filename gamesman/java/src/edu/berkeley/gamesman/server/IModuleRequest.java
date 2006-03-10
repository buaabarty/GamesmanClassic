package edu.berkeley.gamesman.server;

import java.io.IOException;
import java.io.InputStream;

/**
 * This class represents the request object that is passed to IModule instances.
 * The request headers can be read from this instance, as can the body of the
 * request (as an InputStream).
 * 
 * @author Matt Jacobsen
 *
 */
public interface IModuleRequest
{
	/**
	 * Returns the value of the specified request header or null if none 
	 * exists with the specified name.
	 * 
	 * @param name name of the header to retrieve
	 * @return value of the named header
	 */
	public String getHeader(String name);

	/**
	 * Returns the InputStream representing the body of the request.
	 * 
	 * @return InputStream representing the body of the request.
	 * @throws IOException 
	 */
	public InputStream getInputStream() throws IOException;
}
