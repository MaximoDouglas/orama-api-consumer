package com.maximo.douglas.oramaapiconsumer.instrumented;

import com.maximo.douglas.oramaapiconsumer.instrumented.funddetailfragment.FundDetailFragmentTest;
import com.maximo.douglas.oramaapiconsumer.instrumented.fundlistingfragment.FundListingFragmentTest;
import com.maximo.douglas.oramaapiconsumer.instrumented.mainactivity.MainActivityTest;
import com.maximo.douglas.oramaapiconsumer.instrumented.navigation.NavigationTest;

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
public class InstrumentedTestSuite {
}
