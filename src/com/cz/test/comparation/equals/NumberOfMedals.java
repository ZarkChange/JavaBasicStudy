package com.cz.test.comparation.equals;


/**
 * 奖牌数量实体类
 * 重写equals方法
 * @author admin
 *
 */
public class NumberOfMedals {
	
	//Number of goldMedals
	private int goldCount;
	
	//Number of silverMedals
	private int silverCount;
	
	//Number of BronzeMedals
	private int bronzeCount;

	/**
	 * @param goldCount
	 * @param silverCount
	 * @param bronzeCount
	 */
	public NumberOfMedals(int goldCount, int silverCount, int bronzeCount) {
		super();
		this.goldCount = goldCount;
		this.silverCount = silverCount;
		this.bronzeCount = bronzeCount;
	}

	public int getGoldCount() {
		return goldCount;
	}

	public void setGoldCount(int goldCount) {
		this.goldCount = goldCount;
	}

	public int getSilverCount() {
		return silverCount;
	}

	public void setSilverCount(int silverCount) {
		this.silverCount = silverCount;
	}

	public int getBronzeCount() {
		return bronzeCount;
	}

	public void setBronzeCount(int bronzeCount) {
		this.bronzeCount = bronzeCount;
	}
	
	
	@Override
	public boolean equals(Object other){
		
		if(other==null){
			return false;
		}
		
		if(!(other instanceof NumberOfMedals)){
			return false;
		}
		
		
		NumberOfMedals nMedals=(NumberOfMedals) other;
		
		if(this.goldCount==nMedals.goldCount
				&&this.silverCount==nMedals.silverCount
				&&this.bronzeCount==nMedals.bronzeCount){
			
			return true;	
		}
		return false;
		
	}
	
	

}
