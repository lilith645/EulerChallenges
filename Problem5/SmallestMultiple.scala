import scala.annotation.tailrec

object SmallestMultiple {
  @tailrec
  def isEvenlyDisible(crnt: Int, end: Int,  num: Int): Boolean =
    if(crnt > end) true
    else if(num%crnt == 0) isEvenlyDisible(crnt+1, end, num);
    else false
  @tailrec
  def findSmallestMultiple(min: Int, max: Int, num: Int): Int = 
    if(isEvenlyDisible(min, max, num)) num
    else findSmallestMultiple(min, max, num+1)
    
  def main(args: Array[String]) {
    println(findSmallestMultiple(1, 20, 1)) //232792560
  }
}
