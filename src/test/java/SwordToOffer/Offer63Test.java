package SwordToOffer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

public class Offer63Test {

	@Test
	public void test() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class<?> clazz = Class.forName("SwordToOffer.Offer63");
		Method method = clazz.getDeclaredMethod("getOnceMaxEquity2", int[].class);
		method.setAccessible(true);
		Offer63 offer63 = new Offer63();

		// case1
		int[] prices = new int[] { 100, 80, 120, 130, 70, 60, 100, 125 };
		Assert.assertEquals(method.invoke(offer63, prices), 65);
	}

}
