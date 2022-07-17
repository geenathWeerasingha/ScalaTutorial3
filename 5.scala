object Main extends App{

  def easyPaceT(x:Double):Double= 8*x

  def TempoT(x:Double):Double= 7*x


  def TotRunning()={
      easyPaceT(2)+TempoT(3)+easyPaceT(2)
  }

  println(TotRunning())

}
