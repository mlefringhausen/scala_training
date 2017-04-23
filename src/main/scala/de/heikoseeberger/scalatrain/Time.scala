package de.heikoseeberger.scalatrain

/**
  * Created by mlefringhausen on 20/03/2017.
  */
case class Time(hours: Int = 0, minutes: Int = 0) {
  require(hours >= 0 && hours < 24, "hours must be within [0, 24)!")
  require(minutes >= 0 && minutes < 60, "minutes must be within [0, 60)!")

  def minus(that: Time): Int = {
    def asMinutes(time: Time): Int = time.hours * 60 + time.minutes
    asMinutes(this) - asMinutes(that)
  }

  def -(that: Time): Int = this.minus(that)
}

object Time {
  def fromMinutes(minutes: Int): Time = new Time(minutes / 60, minutes % 60)
}
