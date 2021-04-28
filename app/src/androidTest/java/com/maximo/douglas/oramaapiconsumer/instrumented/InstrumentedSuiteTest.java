package com.maximo.douglas.oramaapiconsumer.instrumented;

import com.maximo.douglas.oramaapiconsumer.instrumented.funddetailfragment.FundDetailFragmentTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                NavigationTest.class,
                MainActivityTest.class,
                FundListingFragmentTest.class,
                FundDetailFragmentTest.class
        }
)
public class InstrumentedSuiteTest {
}
