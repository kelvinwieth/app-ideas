package org.example

// Create a method that accepts a list and an item, and returns true if the item belongs to the list, otherwise false.
// https://www.codewars.com/kata/545991b4cbae2a5fda000158/train/kotlin

class EnumerableMagic {
	companion object {
		fun include(arr: IntArray, item : Int): Boolean {
			for (num in arr) {
				if (num == item) {
					return true;
				}
			}
		
			return false;
		}
	}
}
