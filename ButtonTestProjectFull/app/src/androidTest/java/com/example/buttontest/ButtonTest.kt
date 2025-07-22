
package com.example.buttontest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ButtonTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testBotaoSaudacao() {
        onView(withId(R.id.buttonSaudacao)).perform(click())
        onView(withId(R.id.textViewMessage)).check(matches(withText("Olá, seja bem-vindo!")))
    }

    @Test
    fun testBotaoLimparTexto() {
        onView(withId(R.id.buttonSaudacao)).perform(click())
        onView(withId(R.id.buttonLimpar)).perform(click())
        onView(withId(R.id.textViewMessage)).check(matches(withText("")))
    }
}
