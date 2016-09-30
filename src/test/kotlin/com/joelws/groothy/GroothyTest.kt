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

        assertFalse("".isTrue())

        val subjectNull: String? = null

        assertFalse(subjectNull.isTrue())
    }

    @Test fun testStringTruthy() {
        assertTrue("a String".isTrue())
    }


    @Test fun testNumberFalsey() {

        assertFalse(0.isTrue())

        val subjectNull: Int? = null

        assertFalse(subjectNull.isTrue())

    }

    @Test fun testNumberTruthy() {

        assertTrue(1.isTrue())

    }

    @Test fun testObjectTruthy() {

        assertTrue(Any().isTrue())

    }

    @Test fun testObjectFalsey() {
        val subject: Any? = null

        assertFalse(subject.isTrue())

    }

    @Test fun testCollectionTruthy() {

        assertTrue(listOf("").isTrue())

    }

    @Test fun testCollectionFalsey() {
        assertFalse(emptyList<String>().isTrue())

        val subjectNull: List<String>? = null

        assertFalse(subjectNull.isTrue())

    }

    @Test fun testMutableCollectionTruthy() {

        assertTrue(mutableListOf("").isTrue())

    }

    @Test fun testArrayTruthy() {

        assertTrue(arrayOf("").isTrue())
    }

    @Test fun testArrayFalsey() {

        assertFalse(emptyArray<Int>().isTrue())

        val subjectNull: Array<Int>? = null

        assertFalse(subjectNull.isTrue())
    }

    @Test fun testMapTruthy() {

        assertTrue(mapOf(5 to "five").isTrue())
    }

    @Test fun testMapFalsey() {

        assertFalse(emptyMap<Int, String?>().isTrue())

        val subjectNull: Map<Int, String?>? = null

        assertFalse(subjectNull.isTrue())
    }

    @Test fun testMatcherTruthy() {
        val pattern = Pattern.compile("[A-Z]")

        assertTrue(pattern.matcher("AB").isTrue())
    }

    @Test fun testMatcherFalsey() {
        val pattern = Pattern.compile("[A-Z]")


        assertFalse(pattern.matcher("ab").isTrue())

        val subjectNull: Matcher? = null

        assertFalse(subjectNull.isTrue())

    }

    @Test fun testIteratorTruthy() {

        assertTrue(listOf("").iterator().isTrue())
    }

    @Test fun testIteratorFalsey() {

        assertFalse(emptyList<String>().iterator().isTrue())

        val subjectNull: Matcher? = null

        assertFalse(subjectNull.isTrue())

    }

    @Test fun testEnumerationTruthy() {
        assertTrue(Vector(listOf(0)).elements().isTrue())
    }

    @Test fun testEnumerationFalsey() {
        val subject = Vector(listOf(0)).elements()
        assertTrue(subject.isTrue())

        subject.nextElement()
        assertFalse(subject.isTrue())

        val subjectNull: Enumeration<Int>? = null
        assertFalse(subjectNull.isTrue())

    }

    @Test fun testNothingTruthy() {
        val subject: Nothing? = null
        assertFalse(subject.isTrue())

    }

}
