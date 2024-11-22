package sol;

import java.util.List;

import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class solTest {

	@Test
	void test() {
		Solution Sol = new Solution();
		int[] t1 = {1,2,3,6,7,8,9};
		int[] t1res = Sol.findEvenNumbers(t1);
		int[] exp1 = {132,312};		
		
		int[] t2 = {3,1,2};
		int[] t2res = Sol.findEvenNumbers(t2);
		int[] exp2 = {132,312};
		
		int[] t3 = {1};
		int[] t3res = Sol.findEvenNumbers(t3);
		int[] exp3 = {};
		
		assertAll("Testing suite", 
				()->assertEquals(Arrays.toString(exp1), Arrays.toString(t1res)),
				()->assertEquals(Arrays.toString(exp2), Arrays.toString(t2res)),
				()->assertEquals(Arrays.toString(exp3), Arrays.toString(t3res))
		);
	}

}
