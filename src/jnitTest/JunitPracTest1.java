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
		// 1. Arrange ��l�ƪ���μƭ�
		JunitPrac calc = new JunitPrac();
		int num1 = 5;
		int num2 = 10;
		int excepted = 15;
		
		// 2. Act ����L�{
		int actual = calc.calc(num1, num2);
		
		// 3. Actual �P�_���G
		Assert.assertEquals(actual, excepted);
	}

}
