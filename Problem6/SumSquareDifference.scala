import scala.annotation.tailrec

object SumSquareDifference {
  def square(x:Int):Int = x*x;
  
  @tailrec
  def sum(crnt: Int, max: Int, total: Int): Int = 
    if(crnt > max) total 
    else sum(crnt+1, max, total+crnt);
  
  def squareOfSum(min: Int, max: Int): Int = square(sum(min, max, 0))
  
  @tailrec
  def sumOfSquares(crnt: Int, max: Int, total: Int): Int =
    if(crnt > max) total 
    else sumOfSquares(crnt+1, max, total + square(crnt));
     
  def calculateSumSquareDifference(min: Int, max: Int): Int =
    squareOfSum(min, max)-sumOfSquares(min, max, 0);
     
  def main(args: Array[String]): Unit = {
    println(calculateSumSquareDifference(1, 100)) ; //25164150
  }
}
