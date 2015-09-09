# gae-scala-jersey-scalajs
Google App Engine with Scala backend using Jersey and ScalaJs to produce JavaScript with common code. Maven project divided into three modules.

1 Google App
------------
Maven module with simple Google app with dependency to Scala with Jersey (2). Configures Jersey in web.xml. Contains a simple HTML file with including JavaScript from ScalaJS (3).

2 Scala with Jersey
-------------------
Maven module with Scala implementing Jersey and using common logic from ScalaJs (3).

3 ScalaJs
---------
Maven module with ScalaJs and also SBT to build JavaScript. Also contains common logic with Scala with Jersey (2).

Install
-------

In root folder run 'mvn install'

Build
-----

1. In root folder run 'mvn install'
2. In 'js' folder run 'sbt fastOptJS'
3. Run in 'gae' folder 'mvn appengine:devserver'

Eclipse
-------

1. Import as "Existing Maven Projects ..."
2. Set 2.10 as Scala version for projects "js" and "scala"
