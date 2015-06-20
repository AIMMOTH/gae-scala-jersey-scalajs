package se.ce.scala

import se.ce.js.Service
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.GET

/**
 * @author Carl
 */
@Path("/json")
class JsonProducer {
  
  @GET
  @Produces(Array("text/plain"))
  def something = {
    val l = (1 until 12).map(Service.calculate(_)).sum
    s"""{"haj":$l,"saj":true}"""
  }
}