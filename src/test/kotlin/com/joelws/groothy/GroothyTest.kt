/*
Copyright 2016 Joel Whittaker-Smith

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.joelws.groothy

import org.junit.Test
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GroothyTest {

    @Test fun testStringFalsey() {
        val subject = ""

        assertFalse(groothy(subject))

        val subjectNull: String? = null

        assertFalse(groothy(subjectNull))
    }

    @Test fun testStringTruthy() {
        val subject: String? = "a String"
        assertTrue(groothy(subject))
    }


    @Test fun testNumberFalsey() {
        val subject = 0

        assertFalse(groothy(subject))

        val subjectNull: Int? = null

        assertFalse(groothy(subjectNull))

    }

    @Test fun testNumberTruthy() {
        val subject = 1

        assertTrue(groothy(subject))

    }

    @Test fun testObjectTruthy() {
        val subject = Any()

        assertTrue(groothy(subject))

    }

    @Test fun testObjectFalsey() {
        val subject: Any? = null

        assertFalse(groothy(subject))

    }

    @Test fun testCollectionTruthy() {
        val subject = listOf("")

        assertTrue(groothy(subject))

    }

    @Test fun testCollectionFalsey() {
        val subject = emptyList<String>()

        assertFalse(groothy(subject))

        val subjectNull: List<String>? = null

        assertFalse(groothy(subjectNull))

    }

    @Test fun testMutableCollectionTruthy() {
        val subject = mutableListOf("")

        assertTrue(groothy(subject))

    }

    @Test fun testArrayTruthy() {
        val subject = arrayOf("")

        assertTrue(groothy(subject))
    }

    @Test fun testArrayFalsey() {
        val subject = emptyArray<Int>()

        assertFalse(groothy(subject))

        val subjectNull: Array<Int>? = null

        assertFalse(groothy(subjectNull))
    }

    @Test fun testMapTruthy() {
        val subject = mapOf(5 to "five")

        assertTrue(groothy(subject))
    }

    @Test fun testMapFalsey() {
        val subject = emptyMap<Int, String?>()

        assertFalse(groothy(subject))

        val subjectNull: Map<Int, String?>? = null

        assertFalse(groothy(subjectNull))
    }

    @Test fun testMatcherTruthy() {
        val pattern = Pattern.compile("[A-Z]")

        val subject = pattern.matcher("AB")

        assertTrue(groothy(subject))
    }

    @Test fun testMatcherFalsey() {
        val pattern = Pattern.compile("[A-Z]")

        val subject = pattern.matcher("ab")

        assertFalse(groothy(subject))

        val subjectNull: Matcher? = null

        assertFalse(groothy(subjectNull))

    }

    @Test fun testIteratorTruthy() {
        val subject = listOf("").iterator()

        assertTrue(groothy(subject))
    }

    @Test fun testIteratorFalsey() {
        val subject = emptyList<String>().iterator()

        assertFalse(groothy(subject))

        val subjectNull: Matcher? = null

        assertFalse(groothy(subjectNull))

    }

    @Test fun testEnumerationTruthy() {
        val subject = Vector(listOf(0)).elements()
        assertTrue(groothy(subject))
    }

    @Test fun testEnumerationFalsey() {
        val subject = Vector(listOf(0)).elements()
        assertTrue(groothy(subject))

        subject.nextElement()
        assertFalse(groothy(subject))

        val subjectNull: Enumeration<Int>? = null
        assertFalse(groothy(subjectNull))

    }

}
