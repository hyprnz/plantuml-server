PlantUML Server
===============


[![Build Status](https://travis-ci.org/hyprnz/plantuml-server.svg?branch=master)](https://travis-ci.org/hyprnz/plantuml-server)

PlantUML Server is a web application to generate UML diagrams on-the-fly. This is a [spark](http://sparkjava.com/)-based
implementation and is based on [PlantUML Server](https://github.com/plantuml/plantuml-server).

To know more about PlantUML, please visit [http://plantuml.sourceforge.net/](http://plantuml.sourceforge.net/).

Requirements
============

 * jre/jdk 1.6.0 or above
 * gradle

How to run the server
=====================

Just run:

```
gradlew build
```

The server is now listing to [http://localhost:8080/png](http://localhost:8080/png).
In this way the server is run on an embedded jetty server.


How to generate the jar
=======================

To build the jar with dependencies, just run:

```
gradlew fatJar
```

at the root directory of the project to produce `plantuml-server-all-1.0.jar` in the `build/libs` directory.
