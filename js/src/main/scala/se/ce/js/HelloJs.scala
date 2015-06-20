package se.ce.js

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

/**
 * @author Carl
 */
object HelloJs extends JSApp {
  def main(): Unit = {
    println("Hello world!")
  }
 
  @JSExport
  def total(i : Int) = {
    val total = Service.calculate(i)
    s"total = $total"
  }
}