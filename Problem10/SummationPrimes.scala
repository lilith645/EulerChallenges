import scala.annotation.tailrec

object summationPrimes {
  @tailrec
  def isPrime(a:Long, b:Long, limit:Long): Long =
    if(b > limit) a;
    else if(a%b == 0) 0;
    else isPrime(a, b+2, limit);
  
  @tailrec 
  def findSum(sum: Long, num: Long): Long =
    if(num == 2000000) sum;
    else if(num % 2 == 0) findSum(sum, num+1);
    else findSum(sum + isPrime(num, 3, num/2), num+1);
   
  def main(args: Array[String]) {
    println(findSum(2, 3));  // 142913828922
  }
}
