package com.joelws.groothy

import java.util.*
import java.util.regex.Matcher

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

fun groothy(subject: CharSequence?): Boolean {
    return !subject.isNullOrBlank()
}

fun groothy(subject: Number?): Boolean {
    return !(subject == null || subject == 0)
}

fun groothy(subject: Any?): Boolean {
    return subject != null
}

@Suppress("UNUSED_PARAMETER") fun groothy(subject: Nothing?): Boolean {
    return false
}

fun <E> groothy(subject: Collection<E>?): Boolean {
    return !(subject == null || subject.isEmpty())
}

fun <T> groothy(subject: Array<T>?): Boolean {
    return !(subject == null || subject.isEmpty())
}

fun <K, V> groothy(subject: Map<K, V>?): Boolean {
    return !(subject == null || subject.isEmpty())
}

fun groothy(subject: Matcher?): Boolean {
    return !(subject == null || !subject.find())
}

fun <T> groothy(subject: Iterator<T>?): Boolean {
    return !(subject == null || !subject.hasNext())
}

fun <T> groothy(subject: Enumeration<T>?): Boolean {
    return !(subject == null || !subject.hasMoreElements())
}
