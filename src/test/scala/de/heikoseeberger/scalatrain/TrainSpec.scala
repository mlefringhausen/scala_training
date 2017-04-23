package de.heikoseeberger.scalatrain

import org.scalatest.{Matchers, WordSpec}

class TrainSpec extends WordSpec with Matchers {

  "Creating a Train" should {
    "throw an IllegalArgumentException for an empty kind" in {
      val schedule = List(Station("Berlin"), Station("Munich"))
      an[IllegalArgumentException] should be thrownBy Train("", 42, schedule)
    }
  }

  "Creating a Train" should {
    "throw an IllegalArgumentException for an empty kind" in {
      val schedule = List(Station("Berlin"), Station("Munich"))
      an[IllegalArgumentException] should be thrownBy Train("", 42, schedule)
    }
  }
}