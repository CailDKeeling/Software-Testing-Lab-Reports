package l2;

import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class gLtest1 {

	@Test
	void test() {
		//Creating a new getlucky1 object
		getLucky1 gl = new getLucky1();
		
		//Creating the 3 results that we need to compare to the expected output
		int res1 = gl.getLucky("",0);
		int res2 = gl.getLucky("aa", 1);
		int res3 = gl.getLucky("a", 0);	
		
		//Comparing the received vs expected output
		assertEquals(0, res1, "situation 1 was wrong");
		assertEquals(2, res2, "situation 1 was wrong");
		assertEquals(1, res3, "situation 1 was wrong");
	
		
	}

}
