package Lb4;

import java.util.List;


import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class l4Test {

	@Test
	void test() {
		makeFancy mf = new makeFancy();
		
		String t1 = "bbbabbbb"; String exp1 = "bbabb";
		String t2and6to11 = "aaabaaaa"; String exp2and6to11 = "aabaa";
		String t3 = "ab"; String exp3 = "ab";
		String t4 = "aabaaa"; String exp4 = "aabaa";
		
		assertAll("Testing suite", 
				/*original  t1*/()->assertEquals("origin 1", exp1, mf.makeFancyString(t1)),
				/*original t2+*/()->assertEquals("origin 2", exp2and6to11, mf.makeFancyString(t2and6to11)),
				/*original  t3*/()->assertEquals("origin 3", exp3, mf.makeFancyString(t3)),
				/*original  t4*/()->assertEquals("origin 4", exp4, mf.makeFancyString(t4)),
				/*original  t5*/()->assertEquals("origin 5", exp3, mf.makeFancyString(t3)),
				/*mut1        */()->assertEquals("mut1", exp1, mf.mut1(t1)),
				/*mut2        */()->assertEquals("mut2", exp2and6to11, mf.mut2(t2and6to11)),
				/*mut3        */()->assertEquals("mut3", exp3, mf.mut3(t3)),
				/*mut4        */()->assertEquals("mut4", exp4, mf.mut4(t4)),
				/*mut5        */()->assertEquals("mut5", exp3, mf.mut5(t3)),
				/*mut6        */()->assertEquals("mut6", exp2and6to11, mf.mut6(t2and6to11)),
				/*mut7        */()->assertEquals("mut7", exp2and6to11, mf.mut7(t2and6to11)),
				/*mut8        */()->assertEquals("mut8", exp2and6to11, mf.mut8(t2and6to11)), 
				/*mut9        */()->assertEquals("mut9", exp2and6to11, mf.mut9(t2and6to11)),
				/*mut10       */()->assertEquals("mut10", exp2and6to11, mf.mut10(t2and6to11)),
				/*mut11       */()->assertEquals("mut11", exp2and6to11, mf.mut11(t2and6to11))
		);
	}

}
