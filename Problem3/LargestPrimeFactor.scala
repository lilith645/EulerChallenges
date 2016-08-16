/*
 * LargestPrimeFactor.scala
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

import scala.annotation.tailrec

object LargestPrimeFactor {  
  @tailrec
  def modOdd(a: Long, b:Long, limit: Long): Long =
    if(b > limit) 1
    else if(a%b == 0) 0
    else modOdd(a, b+2, limit);
  
  @tailrec
  def testDivisable(a:Long, b:Long): Long = 
    if(b == 1)
      b;
    else if(b*(a/b) == a) {  
      println("factor: " + b); 
      if(b % 2 == 0)
        testDivisable(a, b-1);
      else if(modOdd(b, 3, b/2) != 1)
        testDivisable(a, b-1);
      else
        b;
    } else
      testDivisable(a, b-1);   
  
  def largestPrimeFactor(a:Long): Long = {
    val b = a/2; // Do a/100 or a/70 to speed up process
    testDivisable(a, b);
  }
  
  def main(args: Array[String]): Unit = {
    val now = System.nanoTime;
    println("Answer: " + largestPrimeFactor(600851475143L));//6857
    val micros = (System.nanoTime - now) / 1000;
    println("%d microseconds".format(micros));
  }
}
