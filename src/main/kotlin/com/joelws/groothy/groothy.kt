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

fun CharSequence?.isTrue(): Boolean {
    return !this.isNullOrBlank()
}

fun Number?.isTrue(): Boolean {
    return !(this == null || this == 0)
}

fun Any?.isTrue(): Boolean {
    return this != null
}

fun Nothing?.isTrue(): Boolean {
    return false
}

fun <E> Collection<E>?.isTrue(): Boolean {
    return !(this == null || this.isEmpty())
}

fun <T> Array<T>?.isTrue(): Boolean {
    return !(this == null || this.isEmpty())
}

fun <K, V> Map<K, V>?.isTrue(): Boolean {
    return !(this == null || this.isEmpty())
}

fun Matcher?.isTrue(): Boolean {
    return !(this == null || !this.find())
}

fun <T> Iterator<T>?.isTrue(): Boolean {
    return !(this == null || !this.hasNext())
}

fun <T> Enumeration<T>?.isTrue(): Boolean {
    return !(this == null || !this.hasMoreElements())
}
