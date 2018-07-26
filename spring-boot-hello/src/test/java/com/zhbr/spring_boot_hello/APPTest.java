package com.zhbr.spring_boot_hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class APPTest  extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public APPTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( APPTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
