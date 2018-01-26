package com.nwuensche.bookinventory.view


import android.support.test.espresso.Espresso.onData
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.view.View
import android.view.ViewGroup
import com.nwuensche.bookinventory.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.*
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun mainActivityTest2() {
        val textView = onView(
                allOf(withId(R.id.titleItemView), withText("The Sound and the Fury"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.bookList),
                                        0),
                                1),
                        isDisplayed()))
        textView.check(matches(withText("The Sound and the Fury")))

        val constraintLayout = onData(anything())
                .inAdapterView(allOf(withId(R.id.bookList),
                        childAtPosition(
                                withClassName(`is`("android.widget.FrameLayout")),
                                0)))
                .atPosition(0)
        constraintLayout.perform(click())

        onView(withId(R.id.genreItemView)).check(matches(withText("Southern Gothic novel")))
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
