package testcase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import maincase.Main;
class MainTest {
	@Test
	void testMaxsum1() {
		int n=6;
		int num[]={-5,-1,-13,-7,-18,-25};
        assertEquals(0,Main.maxsum(n,num));
	}
	@Test
	void testMaxsum2() {
		int n=5;
		int num[]={1,3,5,7,9};
        assertEquals(25,Main.maxsum(n,num));
	}
	@Test
	void testMaxsum3() {
		int n=5;
		int num[]={-7,1,-3,-5,12};
        assertEquals(12,Main.maxsum(n,num));
	}
}