package jnitTest;

import org.junit.*;

public class JunitPracTest1 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("im beforeClass");
	}

	@Before
	public void before() {
		System.out.println("im before");
	}

	@After
	public void after() {
		System.out.println("im after");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("im afterClass");
	}

	@Test
	public void case1() {
		System.out.println("Case1 Test");
	}

	@Test
	public void case2() {
		System.out.println("Case2 Test");
	}

	@Test
	public void calc3() {	
		// 1. Arrange 初始化物件及數值
		JunitPrac calc = new JunitPrac();
		int num1 = 5;
		int num2 = 10;
		int excepted = 15;
		
		// 2. Act 執行過程
		int actual = calc.calc(num1, num2);
		
		// 3. Actual 判斷結果
		Assert.assertEquals(actual, excepted);
	}

}
