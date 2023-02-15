package com.wix.workshop.city

import com.wix.workshop.city.cache.CityCache

import scala.util.Random


object LoopingApp {

  def main(args: Array[String]) {
    println("Looping Starting....")
    val cache = new CityCache
    while (true) {
      cache.getCity(Random.nextInt(10))
    }
  }
}
