import static org.junit.jupiter.api.Assertions.*;
import CardFactory.FaceValues;
import org.junit.jupiter.api.Test;

class FaceValuesTest {

	@Test
	void testFaceValuesStrings() {
		assertEquals("Ace", FaceValues.ACE.toString());
		assertEquals("Two", FaceValues.TWO.toString());
		assertEquals("Three", FaceValues.THREE.toString());
		assertEquals("Four", FaceValues.FOUR.toString());
		assertEquals("Five", FaceValues.FIVE.toString());
		assertEquals("Six", FaceValues.SIX.toString());
		assertEquals("Seven", FaceValues.SEVEN.toString());
		assertEquals("Eight", FaceValues.EIGHT.toString());
		assertEquals("Nine", FaceValues.NINE.toString());
		assertEquals("Ten", FaceValues.TEN.toString());
		assertEquals("Jack", FaceValues.JACK.toString());
		assertEquals("Queen", FaceValues.QUEEN.toString());
		assertEquals("King", FaceValues.KING.toString());
	}
	
	@Test
	void testFaceValuesSymbols() {
		assertEquals("A", FaceValues.ACE.toSymbol());
		assertEquals("J", FaceValues.JACK.toSymbol());
		assertEquals("Q", FaceValues.QUEEN.toSymbol());
		assertEquals("K", FaceValues.KING.toSymbol());
	}
	
	@Test
	void testFaceValuesNumericValue() {
		assertEquals(1, FaceValues.ACE.getNumbericFaceValue());
		assertEquals(2, FaceValues.TWO.getNumbericFaceValue());
		assertEquals(3, FaceValues.THREE.getNumbericFaceValue());
		assertEquals(4, FaceValues.FOUR.getNumbericFaceValue());
		assertEquals(5, FaceValues.FIVE.getNumbericFaceValue());
		assertEquals(6, FaceValues.SIX.getNumbericFaceValue());
		assertEquals(7, FaceValues.SEVEN.getNumbericFaceValue());
		assertEquals(8, FaceValues.EIGHT.getNumbericFaceValue());
		assertEquals(9, FaceValues.NINE.getNumbericFaceValue());
		assertEquals(10, FaceValues.TEN.getNumbericFaceValue());
		assertEquals(11, FaceValues.JACK.getNumbericFaceValue());
		assertEquals(12, FaceValues.QUEEN.getNumbericFaceValue());
		assertEquals(13, FaceValues.KING.getNumbericFaceValue());
	}

}
