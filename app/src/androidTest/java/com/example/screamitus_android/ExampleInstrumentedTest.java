package com.example.screamitus_android;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.screamitus_android", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule activityRule =
            new ActivityTestRule<>(MainActivity.class);


    @Test
    public void testCheckButtonTextBox() throws InterruptedException {
        //TC1
        onView(withId(R.id.Calculate)).check(matches(isDisplayed()));
        onView(withId(R.id.daysTextBox)).check(matches(isDisplayed()));
        onView(withId(R.id.resultsLabel)).check(matches(isDisplayed()));


    }

    @Test
    public void testDisplayValues() throws InterruptedException {
        //TC2   daysTextBox
        onView(withId(R.id.daysTextBox))
                .perform(typeText("5"));

        onView(withId(R.id.Calculate)).perform(click());



    }


}
