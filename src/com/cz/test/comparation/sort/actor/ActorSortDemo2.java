package com.cz.test.comparation.sort.actor;

import java.util.Arrays;

public class ActorSortDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Actor actor1 = new Actor("Mischa", "Barton");
        Actor actor2 = new Actor("Christian", "Bale");
        Actor actor3 = new Actor("Joan", "Collins");
        Actor actor4 = new Actor("Gemma", "Arterton");
        Actor actor5 = new Actor("Daniel", "Craig");
        
        Actor[] actors=new Actor[]{actor1,actor2,actor3,actor4,actor5};
        
        Arrays.sort(actors);
        
        for (int i = 0; i < actors.length; i++) {
        	System.out.println(actors[i].getFirstName()+" "+actors[i].getLastName());
		}
        
	}

}
