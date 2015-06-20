package se.ce.scala

import javax.ws.rs.Path
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.PathParam

/**
 * @author Carl
 */
@Path("/greet/{greeting}")
class HelloResource {
  
  @GET
  @Produces(Array("text/plain"))
  def hello (@PathParam("greeting") greeting: String) = s"Your greeting is '$greeting'!"
}