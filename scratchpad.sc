import de.heikoseeberger.scalatrain.{Time, Train}

val now = new Time(11, 30)
val lunch = new Time(12, 59)

new Time(minutes = 50)

lunch.minus(now)
lunch - now

Time.fromMinutes(125).minutes

val re = Train("bla", 12)




