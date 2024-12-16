# astra-eis-tower

This is a minimal implementation of an Environment Interface Standard (EIS) project
that is configured for the [tower](https://github.com/eishub/tower) environment.

#Requirements

To run this project, you must install the following:

* [Maven 3.3+](http://apache.maven.org
* A Java 1.8 JDK/JRE (required due to EIS)

Simply clone the project, go to the project root folder and type `mvn` to run the
project.

# NOTES

* To shutdown the environment, you must manually kill the associated Java process (at least in windows)
* A default goal has been set up for this project that includes the maven-dependencies-plugin.  This is necessary to copy the environment jar file into the `target/dependencies` folder of the ASTRA project.
