Kotlin implementation of [Groovy Truth](http://groovy-lang.org/semantics.html#Groovy-Truth)

#Example

```
if("".isTrue()) //false  
if(" ".isTrue()) //false  
if("hello, world".isTrue()) //true 
```

## Maven

You must configure your ```pom.xml``` file using JCenter repository

```xml  
<repository>
    <id>central</id>
    <name>bintray</name>
    <url>http://jcenter.bintray.com</url>
</repository>
```

```xml
<dependency>
  <groupId>com.joelws</groupId>
  <artifactId>groothy</artifactId>
  <version>1.0</version>
</dependency>
```

## Gradle
```repositories {
        jcenter()
    }```
```compile 'com.joelws:groothy:1.0'```
