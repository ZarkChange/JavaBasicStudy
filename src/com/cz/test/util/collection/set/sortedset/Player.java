package com.cz.test.util.collection.set.sortedset;

public class Player implements Comparable<Player>{
	private String name;
	private int goldMedal;
	private int silverMedal;
	private int bronzeMedal;
	
	
	public Player(String name, int goldMedal, int silverMedal, int bronzeMedal) {
		super();
		this.name = name;
		this.goldMedal = goldMedal;
		this.silverMedal = silverMedal;
		this.bronzeMedal = bronzeMedal;
	}

	//由于Player类实现了Comparable接口，所以Player类必须重写compareTo方法
	@Override
	public int compareTo(Player o) {
		
		int value=this.goldMedal-o.goldMedal;
		if(value!=0){
			return value;
		}
		
		value=this.silverMedal-o.silverMedal;
		if(value!=0){
			return value;
		}
		
		value=this.bronzeMedal-o.bronzeMedal;
		return value;
		
	}
	
	@Override
	public String toString(){
		  return "[" + this.name + ", Gold: " + this.goldMedal + ", Silver: " + this.silverMedal + ", Bronze: "
        + this.bronzeMedal + "]";
	}
	
	

}
