/*
 * LargestPalindrome.scala
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

object LargestPalindrome {
  @tailrec
  def palindrome(a:Int, reverse:Int, num: Int): Int = 
    if(a == 0)
      if(reverse == num) num
      else 0
    else
      palindrome(a/10, reverse*10+a%10, num);
    
  @tailrec 
  def findLargestPalindrome(a:Int, b:Int, highestPalindrome: Int): Int = {
    val num = a*b
    if(a == 1)
      highestPalindrome
    else if(b == 1) 
      findLargestPalindrome(a-1, a, highestPalindrome);
    else if(palindrome(num, 0, num) > highestPalindrome) 
      findLargestPalindrome(a, b-1, num)
    else
      findLargestPalindrome(a, b-1, highestPalindrome)    
  }
  
  def main(args: Array[String]): Unit = {
    println(findLargestPalindrome(999, 999, 0)); //906609
  } 
}
