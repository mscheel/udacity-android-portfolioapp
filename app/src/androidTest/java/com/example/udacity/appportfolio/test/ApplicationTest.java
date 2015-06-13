package com.example.udacity.appportfolio.test;

import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import com.example.udacity.appportfolio.MainActivity;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
//public class ApplicationTest extends ApplicationTestCase<Application> {
//    public ApplicationTest() {
//        super(Application.class);
//    }
//}

@RunWith(AndroidJUnit4.class)
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public ApplicationTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    @Test
    public void testListGoesOverTheFold() {
        onView(withText("LIBRARY APP")).check(matches(isDisplayed()));
    }
}

//@RunWith(AndroidJUnit4.class)
//@LargeTest
//public class ApplicationTest {
//
//    @Rule
//    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);
//
//    public void listGoesOverTheFold() {
//        onView(withText("Hello world!")).check(matches(isDisplayed()));
//    }
//}