object Main extends App{
  val pi:Double=math.Pi

  def AreaOfDisc(r:Double)={
    val area=pi*r*r
    println(area)
  }

  AreaOfDisc(5)
}
