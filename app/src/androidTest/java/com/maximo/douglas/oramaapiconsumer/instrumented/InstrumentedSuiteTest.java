package com.maximo.douglas.oramaapiconsumer.instrumented;

import com.maximo.douglas.oramaapiconsumer.instrumented.funddetailfragment.FundDetailFragmentTestContext;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                NavigationTest.class,
                MainActivityTest.class,
                FundListingFragmentTest.class,
                FundDetailFragmentTestContext.class
        }
)
public class InstrumentedSuiteTest {
}
