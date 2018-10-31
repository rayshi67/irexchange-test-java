package au.com.irexchange.service;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Component;

@Component("countServiceConfig")
public class CountServiceConfig {

	private int numOfChildren;
	private int numOfCount;
	
	public CountServiceConfig() {
		numOfChildren = NumberUtils.toInt(System.getProperty("numOfChildren"), 20);
		numOfCount = NumberUtils.toInt(System.getProperty("numOfCount"), 3);
	}

	public int getNumOfChildren() {
		return numOfChildren;
	}
	
	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}
	
	public int getNumOfCount() {
		return numOfCount;
	}	

	public void setNumOfCount(int numOfCount) {
		this.numOfCount = numOfCount;
	}
}
