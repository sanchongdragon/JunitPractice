package idv.wqm.mvnTest;

import static org.junit.Assert.assertTrue;
import org.assertj.core.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest 
{
	@BeforeClass
	public static void beforeClass() {
		System.out.println( "Im BeforeClass" );
	}
	@Before
	public void before() {
		System.out.println( "Im before" );
	}
	@After
	public void after() {
		System.out.println( "Im after" );
	}
	@AfterClass
	public static void afterClass() {
		System.out.println( "Im afterClass" );
	}
	
    @Test
    public void case1()
    {
    	System.out.println( "Im Case1" );
    }
    @Test
    public void case2()
    {
    	System.out.println( "Im Case2" );
    }
}
