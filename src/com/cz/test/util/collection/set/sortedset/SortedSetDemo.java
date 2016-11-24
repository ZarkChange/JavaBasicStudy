package com.cz.test.util.collection.set.sortedset;


import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortedSet<Player> players=new TreeSet<Player>();
		
		Player tom=new Player("Tom", 1, 2, 3);
		Player toms=new Player("Tom", 2, 2, 3);
		Player jack=new Player("jack", 3, 2, 1);
		Player rose=new Player("rose", 3, 1, 1);
		Player jerry=new Player("jerry", 3, 2, 3);
		Player merry=new Player("merry", 1, 1, 2);
		Player chrils=new Player("chrils", 4, 2, 3);
		
		players.add(chrils);
		players.add(merry);
		players.add(jerry);
		players.add(rose);
		players.add(jack);
		players.add(tom);
		players.add(toms);
		
		for(Player player:players){
			System.out.println("Player:"+player);
		}
		
 		

	}

}
