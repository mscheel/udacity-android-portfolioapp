package com.example.udacity.appportfolio;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */


@LargeTest
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public ApplicationTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testSpotifyButtonIsOnScreen() {
        onView(withText(R.string.spotify_streamer_button_label)).check(matches(isDisplayed()));
    }

    public void testToastDoesDisplayWhenSpotifyButtonIsClicked() {
        onView(withText(R.string.spotify_streamer_button_label)).inRoot(
                withDecorView(not(getActivity().getWindow().getDecorView()))).perform(click()).check(
                matches(isDisplayed()));
    }
}
