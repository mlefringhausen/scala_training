package de.heikoseeberger.scalatrain

/**
  * Created by mlefringhausen on 20/03/2017.
  * COMMAND + SHIFT + a --> shortcuts
  * val name: String = s"$firstName $lastName"
  * statement = no value has sideffects
  * expression returns value (almost everything in scala is a expression)
  */
case class Train(kind: String, number: Int, schedule: Seq[Station]) {
  require(kind.nonEmpty, "kind must not be empty!")
  require(schedule.length >= 2, "schedule must have at least two stops!")
  require(schedule.distinct == schedule, "schedule must not contain duplicate stations!")
}

case class Station(name: String) {
  require(name.nonEmpty, "name must not be empty!")

}


