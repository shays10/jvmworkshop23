package com.workshop.city

import com.workshop.city.servlet.CacheServlet
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletHandler

/***
 * Don't modify this file :)
 */
object App {

  def main(args: Array[String]) {

    println("CityRetriever Starting....")
    val server = new Server(8080)
    val handler = new ServletHandler()
    server.setHandler(handler)
    handler.addServletWithMapping(classOf[CacheServlet], "/*")
    server.start()
    server.join()
  }


}
