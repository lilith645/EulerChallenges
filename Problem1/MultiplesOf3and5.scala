import math._

object MultiplesOf3and5 {
  def isDivisbleby(a:Int, b:Int, c:Int): Int =
    if(c%a == 0|| c%b == 0) c else 0
    
  def mp3and5(f: (Int,Int,Int)=>Int, a: Int): Int = 
    if(a == 0) 0 else f(3,5,a) + mp3and5(f,a-1)

  def main(args: Array[String]) {
    println(mp3and5(isDivisbleby, 1000-1));//233168
  }
}
