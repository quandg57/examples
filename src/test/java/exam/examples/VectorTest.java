package exam.examples;
import exam.examples.*;
import org.junit.*;
import static org.junit.Assert.*;


import exam.examples.Vector   ;

public class VectorTest {
    @Test
    public void testStringRepresention() {
        Vector v = new Vector(2,3);
		assertEquals("(2,3)", v.toString());
    }

	@Test
	public void testVectorEquality() {
        Vector v = new Vector(2,3);
		Vector u = new Vector(2,3);
		Vector o = new Vector(1,5);

		assertEquals(u,v);
		assertNotSame(u,o);
    }


	@Test
	public void testVectorAddition() {
        Vector v = new Vector(2,3);
		Vector u = new Vector(4,5);
		Vector expectedSum = new Vector(6,8);

		Vector actualResult = v.add(u);

		assertEquals(expectedSum, actualResult);
    }
}