/**
 * 
 */
package au.com.irexchange.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import au.com.irexchange.service.CountServiceConfig;

public class CountServiceImplTest {
	CountServiceImpl target;

	@Before
	public void setUp() throws Exception {
		CountServiceConfig countServiceConfig = new CountServiceConfig();
		countServiceConfig.setNumOfChildren(20);
		countServiceConfig.setNumOfCount(3);
		
		target = new CountServiceImpl();		
		target.countServiceConfig = countServiceConfig;
	}

	@Test
	public void testInitialize() {
		target.initialize();
		
		assertTrue(target.childrenCircle.size() == 20);
		
        for (int i = 1; i <= 20; i++) {
        	assertTrue(target.childrenCircle.get(i-1).getId() == i);
        }
        
		assertTrue(target.removedChildren.size() == 0);

		int i = 1;
	    while (target.circularIterator.hasNext() && i <= 20) {
			assertTrue(target.circularIterator.next().getId() == i++);
	    }
	}

	@Test
	public void testProcess() {
		target.initialize();
		
		assertTrue(target.childrenCircle.size() == 20);
		assertTrue(target.removedChildren.size() == 0);
		
		target.process();
		
		assertTrue(target.childrenCircle.size() == 1);
		assertTrue(target.removedChildren.size() == 19);
	}

}
