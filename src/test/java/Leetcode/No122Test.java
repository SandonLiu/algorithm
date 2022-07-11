package Leetcode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class No122Test {

	@Test
	public void test() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class<?> clazz = Class.forName("Leetcode.No122");
		Method method = clazz.getDeclaredMethod("getMultipleMaxEquity", int[].class);
		method.setAccessible(true);
		No122 no122 = new No122();

		// case1
		int[] prices = new int[] { 100, 80, 120, 130, 70, 60, 100, 125 };
		Assert.assertEquals(method.invoke(no122, prices), 115);

		// case2
		Mockito.doReturn(prices).when(null);

	}

}
