import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTestCase {
	
	

	@Test
	public void testpushFront1() {
		
		LinkedList1 list1 = new LinkedList1();		
		assertEquals(0,list1.size);

	}
	
	@Test
	public void testpushFront2() {
		
		LinkedList1 list = new LinkedList1();
		
		
		list.pushFront(1);
		assertEquals(1,list.size);
		
	}
	
	@Test
	public void testpushFront3() {
		
		LinkedList1 list = new LinkedList1();
		
		
		list.pushFront(2);
		list.pushFront(3);
	
		assertEquals(2,list.size);
		
	}
	
	@Test
	public void testpushFront4() {
		
		LinkedList1 list = new LinkedList1();
		
		for(int i=0;i<4;i++) {
			list.pushFront(i);
		}
		
		assertEquals(4,list.size);
		
	}
	
	@Test
	public void testpushBack1() {
		
		LinkedList1 list = new LinkedList1();
		assertEquals(0,list.size);
		
	}
	
	@Test
	public void testpushBack2() {
		
		LinkedList1 list = new LinkedList1();
		list.pushBack(1);
		assertEquals(1,list.size);
		
	}
	
	@Test
	public void testpushBack3() {
		
		LinkedList1 list = new LinkedList1();
		
		for(int i=0;i<40;i++) {
			list.pushBack(i);
		}
		
		assertEquals(40,list.size);
		
	}
	
	@Test
	public void testpushBack4() {
		
		LinkedList1 list = new LinkedList1();
		list.pushBack(41);
		list.pushBack(42);
		assertEquals(2,list.size);
		
	}
	
	@Test
	public void testpopFront1() {
		
		LinkedList1 list = new LinkedList1();
		list.pushFront(1);
		list.popFront();
		assertEquals(0,list.size);
		
	}
	
	@Test
	public void testpopFront2() {
			
			LinkedList1 list = new LinkedList1();
			list.pushFront(1);
			list.pushFront(2);
			list.pushFront(3);
			list.popFront();
			list.popFront();
			assertEquals(1,list.size);
			
		}
	
	@Test
	public void testpopFront3() {
			
			LinkedList1 list = new LinkedList1();
			for(int i=0;i<5;i++) {
				list.pushFront(i);
				list.popFront();
			}
			assertEquals(0,list.size);
			
		}
	
	@Test
	public void testpopFront4() {
			
			LinkedList1 list = new LinkedList1();
			for(int i=0;i<5;i++) {
				list.pushFront(i);
				
			}
			
			list.popFront();
			assertEquals(4,list.size);
			
		}
	
	@Test
	public void testpopFront5() {
			
			LinkedList1 list = new LinkedList1();
			for(int i=0;i<5;i++) {
				list.pushFront(i);
				
			}
			
			for(int i=0;i<2;i++) {	
				list.popFront();
			}
			assertEquals(3,list.size);
			
		}
	
	@Test
	public void testpopBack1() {
		
		LinkedList1 list = new LinkedList1();
		list.pushBack(1);
		list.popBack();
		assertEquals(0,list.size);
		
	}
	
	@Test
	public void testpopBack2() {
			
			LinkedList1 list = new LinkedList1();
			list.pushBack(1);
			list.pushBack(2);
			list.pushBack(3);
			list.popBack();
			list.popBack();
			assertEquals(1,list.size);
			
		}
	
	@Test
	public void testpopBack3() {
			
			LinkedList1 list = new LinkedList1();
			for(int i=0;i<5;i++) {
				list.pushBack(i);
				list.popBack();
			}
			assertEquals(0,list.size);
			
		}
	
	@Test
	public void testpopBack4() {
			
			LinkedList1 list = new LinkedList1();
			for(int i=0;i<5;i++) {
				list.pushBack(i);
				
			}
			
			list.popBack();
			assertEquals(4,list.size);
			
		}
	
	@Test
	public void testpopBack5() {
			
			LinkedList1 list = new LinkedList1();
			for(int i=0;i<5;i++) {
				list.pushBack(i);
				
			}
			
			for(int i=0;i<2;i++) {	
				list.popBack();
			}
			assertEquals(3,list.size);
			
		}
	
	@Test
	public void testpop1() {
		
		LinkedList1 list = new LinkedList1();
		list.pushBack(1);
		list.pop(0);
		assertEquals(0,list.size);
		
	}
	
	@Test
	public void testpop2() {
			
			LinkedList1 list = new LinkedList1();
			list.pushBack(1);
			list.pushBack(2);
			list.pushBack(3);
			list.pop(2);

			assertEquals(2,list.size);
			
		}
	
	@Test
	public void testpop3() {
			
			LinkedList1 list = new LinkedList1();
			for(int i=0;i<5;i++) {
				list.pushBack(i);
			}
			
			for(int i=0;i<3;i++) {
				list.pop(i);
			}
			assertEquals(2,list.size);
			
		}
	
	@Test
	public void testpop4() {
			
			LinkedList1 list = new LinkedList1();
			for(int i=0;i<5;i++) {
				list.pushBack(i);
				
			}
			
			list.pop(4);
			assertEquals(4,list.size);
			
		}
	
	@Test
	public void testpop5() {
			
			LinkedList1 list = new LinkedList1();
			for(int i=0;i<5;i++) {
				list.pushBack(i);
				
			}
			
			for(int i=0;i<2;i++) {	
				list.pop(i);
			}
			assertEquals(3,list.size);
			
		}
	
	
	
}
