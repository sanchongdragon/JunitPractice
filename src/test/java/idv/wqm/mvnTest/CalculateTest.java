package idv.wqm.mvnTest;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.assertj.core.*;
import org.assertj.core.api.SoftAssertions;

public class CalculateTest {
	
	@Test
	public void calculateTest() {
		// 1. Arrange 初始化目標物件
		
		int num1 = 5;
		int num2 = 10;
		int expected = 15;
		Calculate cal = new Calculate();
		
		// 2. Act 調用目標物件及欲測試的方法
		
		int actual = cal.calc(num1, num2);
		
		// 3. Actual 驗證實際結果
		
//		Hard Assertions 硬斷言
//		assertEquals(expected, actual);
//		assertEquals(expected, cal.calc(3, 10));
//		assertEquals(expected, cal.calc(11, 12));
//		assertEquals(expected, cal.calc(10, 5));
		
//		Soft Assertions 軟斷言(盡量別用or別加入業務邏輯)
//		SoftAssertions softAssertions = new SoftAssertions();
//		assertEquals(actual,10);
//		assertNull(actual);
//		assertEquals(actual,10);
//		
//		softAssertions.assertAll();
		
	}
}
