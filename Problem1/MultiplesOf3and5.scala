/*
 * MultiplesOf3and5.scala
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

import math._

object MultiplesOf3and5 {
  def isDivisbleby(a:Int, b:Int, c:Int): Int =
    if(c%a == 0|| c%b == 0) c else 0
    
  def mp3and5(f: (Int,Int,Int)=>Int, a: Int): Int = 
    if(a == 0) 0 else f(3,5,a) + mp3and5(f,a-1)

  def main(args: Array[String]) {
    println(mp3and5(isDivisbleby, 1000-1));//233168
  }
}
