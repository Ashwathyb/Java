/*
 * TestingRandomStuff.java
 * 
 * Copyright 2020 Ansh <ansh@10-72-127-176.wifi.8.s.pas.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.*;

public class SortingAlgoDemo 
{
	
	public static void main (String[] args) {
		
		int input = IBIO.inputInt("How many random numbers do you want to input into an array : ");
		
		int[] randomArray = new int[input];
		
		for (int i = 0; i < input; i++) {
			
			int randomInt = (int)(Math.random()*100);
			randomArray[i] = randomInt;
			
		}
		 
        System.out.println("The Resulting Array Is : " + Arrays.toString(randomArray)); 

	}
	
}

