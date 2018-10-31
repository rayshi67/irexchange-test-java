package au.com.irexchange.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Child {

	private int id;
	
	public Child(final int id) {
		this.id = id;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
	    		.append(this.id)
	    		.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Child == false) {
	        return false;
	    }
		
	    if (this == obj) {
	    	return true;
	    }
	      
	    final Child otherObject = (Child) obj;

	    return new EqualsBuilder()
	    		.append(this.id, otherObject.id)
	    		.isEquals();
	}

}
