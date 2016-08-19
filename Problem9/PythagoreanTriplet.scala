/*
 * PythagoreanTriplet.scala
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

object PythagoreanTriplet {
  def equals1000(a: Int, b: Int, c: Int): Boolean = if((a+b+c) == 1000) true else false;
  def lessThan1000(a: Int, b: Int, c: Int): Boolean = if((a+b+c) <= 1000) true else false;
  def testPythagorean(a: Int, b: Int, c: Int): Boolean = if((a*a)+(b*b) == (c*c)) true else false;
  
  @tailrec
  def findTriplet(a: Int, b: Int, c: Int): Int = {
    if(a <= 1000) {
      if(lessThan1000(a,b,c)) 
        if(equals1000(a,b,c)) 
          if(testPythagorean(a,b,c))
            (a*b*c)
          else 
            findTriplet(a, b, c+1); 
        else 
          findTriplet(a, b, c+1); 
      else if(b > 1000)
        findTriplet(a+1, 1, 1);       
      else 
        findTriplet(a, b+1, 1);
    } else -3
  } 
  
  def main(args: Array[String]) {
    println(findTriplet(1,1,1)) // 31875000
  }
}
