package au.com.irexchange.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.irexchange.model.Child;
import au.com.irexchange.service.CountService;
import au.com.irexchange.service.CountServiceConfig;

public class CountServiceImpl implements CountService {

	@Autowired
	CountServiceConfig countServiceConfig;
	
	LinkedList<Child> childrenCircle;
    
    ArrayList<Child> removedChildren;
    
    Iterator<Child> circularIterator;

    static class CircularIterator<E> implements Iterator<E> {
    	private List<E> list;
    	private Iterator<E> iter;

		public CircularIterator(List<E> list) {
			this.list = list;
			this.iter = list.iterator();
		}

		public boolean hasNext() {
			return this.list.size() > 1;
		}

		public E next() {
			if (!this.iter.hasNext()) {
				this.iter = this.list.iterator();
			}
			return this.iter.next();
		}

		public void remove() {
			this.iter.remove();
		}
    }
    
    public CountServiceImpl() {
    }

	public void initialize() {
		childrenCircle = new LinkedList<Child>();
        for (int i = 1; i <= countServiceConfig.getNumOfChildren(); i++) {
            childrenCircle.addLast(new Child(i));
        }
       
        removedChildren = new ArrayList<Child>();
        
        circularIterator = new CircularIterator<Child>(childrenCircle);
	}

	public void process() {
	    while (circularIterator.hasNext()) {
	    	// skip over children by traversing forward
            for (int step = 0; step < countServiceConfig.getNumOfCount() - 1; step++) {
                circularIterator.next();
            }
            Child removed = circularIterator.next();
	        circularIterator.remove();
	        
	        removedChildren.add(removed);
	    }	
	}

	public void report() {
		System.out.println();
		System.out.println();
		System.out.println("Number of Children (n): " + countServiceConfig.getNumOfChildren());
		System.out.println("Number of Count (k): " + countServiceConfig.getNumOfCount());
		
		System.out.print("Removed Child IDs: [");
		for (int i = 0; i < removedChildren.size() - 1; i++) {
			System.out.print(removedChildren.get(i).getId() + ", ");
		}
		System.out.print(removedChildren.get(removedChildren.size() - 1).getId());
		System.out.println(']');
				
		System.out.println("Winning Child ID: [" + childrenCircle.get(0).getId() + ']');
		System.out.println();
		System.out.println();
	}

}
