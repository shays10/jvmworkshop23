package com.wix.workshop.city.model

class CityId(val id: Long) {
  override def hashCode(): Int = id.hashCode()

  def getId: Long = id
}

case class City(id: Long, shortName: String, name: String, country: String, population: Int, arr: Array[String])