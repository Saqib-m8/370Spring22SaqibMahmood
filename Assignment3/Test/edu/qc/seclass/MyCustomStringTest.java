package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null; 
    }
        
    @Test
    public void testCountNumbers1() {
    	//Test for correctly finding 7 numbers
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers2() {
    	//Test for finding 0 numbers for empty string

    	mycustomstring.setString("");
    	assertEquals(0, mycustomstring.countNumbers());
    	
    }

    @Test
    public void testCountNumbers3() {
    	//Test for finding 2 numbers
   	 	mycustomstring.setString("numbers are 27 and 90");
   	 	assertEquals(2, mycustomstring.countNumbers());
    	
    }

    @Test(expected = NullPointerException.class)
    public void testCountNumbers4() {
    	//Test for NullPointerException
    	
    	mycustomstring.setString(null);
    	mycustomstring.countNumbers();
    }

    @Test
    public void testCountNumbers5() {
    	//Tests if the line has no numbers

    	mycustomstring.setString("This line has no number");
     	assertEquals(0, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers6() {
    	//Test for counting 5 numbers that are not continuous

    	 mycustomstring.setString("876 54 321 765 77");
      	assertEquals(5, mycustomstring.countNumbers());
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
    	//test for every character in every 3nth position from the beginning
    	
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
    	
    	//test for every character in every 3nth position from the end

        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test(expected =NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    	
    	//test for NullPointerException when the string is null

    	 mycustomstring.setString(null);
         mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true);
    }

    @Test(expected= IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	
    	//test for illegalArgumentException when n <0

    	 mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
         mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1, true);
    }

    @Test(expected= IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	
    	//test for illegalArgumentException when n= 0

    	 mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
         mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    }

    @Test(expected= IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	//test for illegalArgumentException when n =0 and string is null

    	 mycustomstring.setString(null);
         mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    }

    @Test(expected= IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	//test for illegalArgumentException when n =0 and string is null

    	 mycustomstring.setString(null);
         mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1, true);
    }

    @Test(expected =NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	//test for NullPointerExc when n >0 but string is null

    	 mycustomstring.setString(null);
         mycustomstring.getEveryNthCharacterFromBeginningOrEnd(50, true);
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	//test for printing empty string when n>0 and startfromend is false

    	 mycustomstring.setString("");
    	 assertEquals("",mycustomstring.getEveryNthCharacterFromBeginningOrEnd(30, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	//test for printing empty string when n>0 and startfromend is true

    	 mycustomstring.setString("");
    	 assertEquals("",mycustomstring.getEveryNthCharacterFromBeginningOrEnd(30, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	//test for printing empty string when n >lengthOfString,string is not empty and startfromend is false

   	 	mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
   	 	assertEquals("",mycustomstring.getEveryNthCharacterFromBeginningOrEnd(60, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	//test for printing empty string when n >lengthOfString,string is not empty and startfromend is true

    	 mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
    	 assertEquals("",mycustomstring.getEveryNthCharacterFromBeginningOrEnd(60, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	//test for returning the word testing

    	 mycustomstring.setString("testing");
    	 assertEquals("testing",mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	//testing the sentence when startfromend is false 
    	 mycustomstring.setString("testing the sentence");
    	 assertEquals("testing the sentence",mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {

        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    @Test(expected= IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring2() {
    	
    	//test for IllegalArgumentException as start > end
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(23, 17);
        
    }

    @Test
    public void testConvertDigitsToNamesInSubstring3() {
    	//test with no digits
    	String str = "This string has no digit";
    	mycustomstring.setString(str);
        mycustomstring.convertDigitsToNamesInSubstring(1, str.length());
        assertEquals("This string has no digit", mycustomstring.getString());

    }

    @Test(expected= MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring4() {
    	//test for MyIndexOutOfBoundsException as start and endp is 0

    	
    	mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(0, 0);
        
    }

    @Test(expected= MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring5() {
    	//test for MyIndexOutOfBoundsException as end is 100
    	
    	mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(1, 100);
    }

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring6() {
    	//test for both empty string with start and end >0
    	
    	mycustomstring.setString("");
        mycustomstring.convertDigitsToNamesInSubstring(2, 5);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {
    	
    	//testing on numbers
    	
    	mycustomstring.setString("27");
        mycustomstring.convertDigitsToNamesInSubstring(1, 2);
        assertEquals("TwoSeven", mycustomstring.getString());
    }

    @Test(expected=NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring8() {
    	//testing for NullPointerException 

    	mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(1, 7);
    }

}
