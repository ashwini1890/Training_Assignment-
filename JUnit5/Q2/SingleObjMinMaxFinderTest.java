package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SingleObjMinMaxFinderTest {
	SingleObjMinMaxFinder finder;
	@BeforeEach
	void beforeEach() {
		finder=new SingleObjMinMaxFinder();
	}

	@Nested
	class Finder{
		@Test
		@DisplayName("Test1")
		public void Test1() {
			assertAll(
					()->assertEquals(1, finder.findMin(new int[] {2,3,1,6,5})),
					()->assertEquals(6, finder.findMax(new int[] {2,3,1,6,5}))
					);			
		}
		
		@Test
		@DisplayName("Test2")
		public void Test2() {
			assertAll(
					()->assertEquals(3, finder.findMin(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53} )),
					()->assertEquals(56, finder.findMax(new int[]{56, 34, 7,3, 54, 3, 34, 34, 53} ))
					);
		}
		
		@Test
		@DisplayName("Test3")
		public void Test3() {
			assertAll(
					()->assertEquals(11, finder.findMin(new int[] {32,98,11,52,101,71})),
					()->assertEquals(101, finder.findMax(new int[] {32,98,11,52,101,71} ))
					);
		}
	}

}