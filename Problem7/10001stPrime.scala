import scala.annotation.tailrec

object TenThousandAndFirstPrime {
  @tailrec
  def isPrime(a:Int, b:Int, limit:Int): Boolean =
    if(b > limit) true;
    else if(a%b == 0) false;
    else isPrime(a, b+2, limit);
  
  def findTenThousandAndFirstPrime(num:Int, numOfPrimes: Int): Int =
    if(numOfPrimes == 10001)
      num-1
    else if(num%2 == 0)
      findTenThousandAndFirstPrime(num+1, numOfPrimes);
    else if(isPrime(num, 3,num/2))
      findTenThousandAndFirstPrime(num+1, numOfPrimes+1);
    else findTenThousandAndFirstPrime(num+1, numOfPrimes);
    
  def main(args: Array[String]) {
    println(findTenThousandAndFirstPrime(1, 0)); //104743
  }
}
