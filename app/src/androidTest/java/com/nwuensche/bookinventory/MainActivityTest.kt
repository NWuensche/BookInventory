package com.nwuensche.bookinventory


import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.test.suitebuilder.annotation.LargeTest
import android.view.View
import android.view.ViewGroup
import com.nwuensche.bookinventory.view.MainActivity
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun mainActivityTest() {
        // Main List View

        val textView = onView(
                allOf<View>(withId(R.id.titleItemView), withText("The Sound and the Fury"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.bookList),
                                        0),
                                1),
                        isDisplayed()))
        textView.check(matches(withText("The Sound and the Fury")))

        val textView2 = onView(
                allOf<View>(withId(R.id.authorItemView), withText("William Faulkner"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.bookList),
                                        0),
                                2),
                        isDisplayed()))
        textView2.check(matches(withText("William Faulkner")))

    }

    private fun childAtPosition(
            parentMatcher: Matcher<View>, position: Int): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return (parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position))
            }
        }
    }
}
