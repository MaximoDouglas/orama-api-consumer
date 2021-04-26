package com.maximo.douglas.oramaapiconsumer.instrumented;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {NavigationTest.class, MainActivityTest.class}
)
public class InstrumentedSuiteTest {
}
