package org.example

// Given a random non-negative number, you have to return the digits of this number within an array
// in reverse order.
// https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/kotlin

class NumberToReversedArray {
    companion object {
        fun digitize(n: Long): IntArray {
			return n.toString().map(Char::digitToInt).reversed().toIntArray();
        }
    }
}
