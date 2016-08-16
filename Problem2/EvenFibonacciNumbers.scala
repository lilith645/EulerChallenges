/*
 * EvenFibonacciNumbers.scala
 * This file is part of EulerChallenges
 *
 * Copyright (C) 2016 - Akuma
 *
 * EulerChallenges is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * EulerChallenges is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EulerChallenges. If not, see <http://www.gnu.org/licenses/>.
 */ 

object EvenFibonacciNumbers {
  def isEven(a:Int):Int = if(a%2==0) a else 0
  def sumOfEvenFibonacci(prev1: Int, prev2: Int, limit: Int): Int = {
    val fib = prev1 + prev2
    if(fib > limit) 2 else isEven(fib) + sumOfEvenFibonacci(prev2, fib, limit);
  }
  
  def main(args: Array[String]) {
    println(sumOfEvenFibonacci(1, 2, 4000000))//4613732
  }
}
