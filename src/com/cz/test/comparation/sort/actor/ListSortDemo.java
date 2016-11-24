package com.cz.test.comparation.sort.actor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Actor actor1 = new Actor("Mischa", "Barton");
        Actor actor2 = new Actor("Christian", "Bale");
        Actor actor3 = new Actor("Joan", "Collins");
        Actor actor4 = new Actor("Gemma", "Arterton");
        Actor actor5 = new Actor("Daniel", "Craig");
        
        List<Actor> actors=new ArrayList<Actor>();
        
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);
        actors.add(actor4);
        actors.add(actor5);
        
        Collections.sort(actors);
        
        for(Actor actor:actors){
        	System.out.println(actor.getFirstName()+" "+actor.getLastName());
        }
	}

}
