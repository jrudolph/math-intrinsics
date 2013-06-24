

object TestIntrinsics extends App {
  def myMax(d1: Double, d2: Double): Double =
    if (d1 > d2) d1 else d2

  def myMax2(d1: Double, d2: Double): Double =
    if (d1 < d2) d2 else d1

  def runWithMax(): Unit = {
    var i = 0d
    while(i<1000000d) {
      val x = Math.max(i, 50.2328)
      if(x + 12 < 15) println("Hello!")
      i += 1d
    }
  }
  def runWithMyMax(): Unit = {
    var i = 0d
    while(i<1000000d) {
      val x = myMax(i, 50.2328)
      if(x + 12 < 15) println("Hello!")
      i += 1d
    }
  }
  def runWithMyMax2(): Unit = {
    var i = 0d
    while(i<1000000d) {
      val x = myMax2(i, 50.2328)
      if(x + 12 < 15) println("Hello!")
      i += 1d
    }
  }

  (0 to 100).foreach(_ => runWithMax())
  (0 to 100).foreach(_ => runWithMyMax())
  (0 to 100).foreach(_ => runWithMyMax2())
}
