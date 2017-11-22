package com.example.spoonexample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);


    @Test
    public void button1ShowsText1() {

        onView(withId(R.id.button1)).perform(click());

        onView(withId(R.id.tv1)).check(matches(isDisplayed()));
    }

    @Test
    public void button2ShowsText2() {

        onView(withId(R.id.button2)).perform(click());

        onView(withId(R.id.tv2)).check(matches(isDisplayed()));
    }

    @Test
    public void button3ShowsText3() {

        onView(withId(R.id.button3)).perform(click());

        onView(withId(R.id.tv3)).check(matches(isDisplayed()));
    }
}