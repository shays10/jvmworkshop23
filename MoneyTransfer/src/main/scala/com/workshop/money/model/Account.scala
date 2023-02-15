package com.workshop.money.model

import scala.util.Random

case class Account(id: Long, name: String, var balance: Double)

object Account {
  def apply(name: String, balance: Double): Account =
    Account(Random.nextLong(), name, balance)
}
