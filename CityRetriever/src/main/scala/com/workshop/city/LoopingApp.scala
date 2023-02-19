package com.workshop.city

import com.workshop.city.cache.CityCache

import scala.util.Random

/***
 * Don't modify this file :)
 */
object LoopingApp {

  def main(args: Array[String]) {
    println("Looping Starting....")
    val cache = new CityCache
    while (true) {
      cache.getCity(Random.nextInt(10))
    }
  }
}
