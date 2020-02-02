import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@SuppressWarnings("deprecation")
	@Test
	public final void test() {
		Circulo_IBR c1= new Circulo_IBR(7,"Circulo");
		Circulo_IBR c2= new Circulo_IBR(0,"Circulo");
		Circulo_IBR c3= new Circulo_IBR(-3,"Circulo");
		double area1= c1.area();
		double area2= c2.area();
		double area3= c3.area();
	
		assertEquals(153.9384,area1,0.0001);
		assertEquals(0,area2,0.0001);
		assertEquals(28.2744,area3,0.0001);
	}

}
