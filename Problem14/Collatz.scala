import scala.annotation.tailrec

object Collatz {  
  @tailrec
  def getChainLength(testNum: Int, num: Int, chainLength: Int): Int = {
    if(num == 1) chainLength   
    else if(num % 2 == 0) 
      getChainLength(testNum, num/2, chainLength+1);
    else 
      getChainLength(testNum, 3*num+1, chainLength+1);    
  }
  
  @tailrec
  def Collatz(startNum: Int, highestStart: Int, chainLength: Int): Int = {
    val chain = getChainLength(startNum, startNum, 0)
    println(startNum)
    if(startNum > 1000000)
      highestStart
    else if(chain > chainLength) 
      Collatz(startNum+1, startNum, chain)
    else
      Collatz(startNum+1, highestStart, chainLength)
  }
  
  def main(args: Array[String]) {
    println(Collatz(13, 0, 0));
  }
}
