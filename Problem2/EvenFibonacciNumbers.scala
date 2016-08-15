object EvenFibonacciNumbers {
  def isEven(a:Int):Int = if(a%2==0) a else 0
  def sumOfEvenFibonacci(prev1: Int, prev2: Int, limit: Int): Int = {
    val fib = prev1 + prev2
    if(fib > limit) 2 else isEven(fib) + sumOfEvenFibonacci(prev2, fib, limit);
  }
  
  def main(args: Array[String]) {
    println(sumOfEvenFibonacci(1, 2, 4000000))
  }
}
