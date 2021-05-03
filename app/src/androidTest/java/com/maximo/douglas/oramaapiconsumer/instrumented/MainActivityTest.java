package com.maximo.douglas.oramaapiconsumer.instrumented;

import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.maximo.douglas.oramaapiconsumer.ui.MainActivity;
import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.testutils.BaseInstrumentedTesting;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest extends BaseInstrumentedTesting {

    @Override
    public void initSetup() throws IOException {
        startMockWebServer();
        ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void test_if_main_constraint_layout_is_displayed() {
        onView(withId(R.id.main_activity_constraint_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void test_if_nav_host_fragment_is_displayed() {
        onView(withId(R.id.nav_host_fragment)).check(matches(isDisplayed()));
    }

}
