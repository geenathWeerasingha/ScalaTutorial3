object Main extends App{

val coverPrice:Double=24.95
val discount=0.4

def TotCoverP(no:Int):Double={
  no*coverPrice
}

def TotshipCost(no:Int):Double={
  if(no>50) 50*3+(no-50)*0.75 else no*3
}

def Discount(x:Double):Double={
  x*discount
}

def wholesaleCost(no:Int):Double={
    TotCoverP(no)+TotshipCost(no)-Discount(TotCoverP(no))
}

println(wholesaleCost(60))

}
