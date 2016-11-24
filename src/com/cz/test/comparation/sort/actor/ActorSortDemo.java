package com.cz.test.comparation.sort.actor;

public class ActorSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Actor actor1 = new Actor("Mischa", "Barton");
        Actor actor2 = new Actor("Christian", "Bale");
        Actor actor3 = new Actor("Joan", "Collins");
        Actor actor4 = new Actor("Gemma", "Arterton");
        Actor actor5 = new Actor("Daniel", "Craig");
        
        Actor[] actors=new Actor[]{actor1,actor2,actor3,actor4,actor5};
        
        for (int i = 0; i < actors.length; i++) {
			for (int j = 1+1; j < actors.length; j++) {
				if(actors[j].compareTo(actors[i])<0){
					Actor temp=actors[j];
					actors[j]=actors[i];
					actors[i]=temp;
				}
			}
		}
        
        for (int i = 0; i < actors.length; i++) {
			System.out.println(actors[i].getFirstName()+" "+actors[i].getLastName());
		}
	}

}
