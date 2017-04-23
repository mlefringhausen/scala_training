package de.heikoseeberger.scalatrain
import org.scalatest.{Matchers, WordSpec}

class TimeSpec extends WordSpec with Matchers {

  "Calling fromMinutes" should {
    "return Time(0, 10) for 10 minutes" in {
     Time.fromMinutes(10) shouldBe Time(0, 10)
    }
  }

  "Calling fromMinutes" should {
    "return Time(1, 10) for 70 minutes" in {
      Time.fromMinutes(70) shouldBe Time(1, 10)
    }
  }

  "Calling minus or -" should {
    "return 0 for equal Times" in {
      Time(1,0) - Time(1,0) shouldBe 0
    }
  }

  "Calling minus or -" should {
    "return 60 for Time(1, 10) and Time(0, 10)" in {
      Time(1,10) - Time(0,10) shouldBe 60
    }
  }

}


