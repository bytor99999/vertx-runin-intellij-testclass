vertx-runin-intellij-testclass
==============================

Just a very basic test class that will start up Vert.x. 

You modify the code to put your verticle or module name in the deploy call. 
And remember to put a package statement at the top for whatever package you end up putting it in. Really you should just create
a class with the same name in your test directory and then just copy and paste from here.

org.vertx.testtools.JavaClassRunner. This is the JUnit Test class runner that JUnit will use from Vertx when you extend
TestVerticle. In that class it sets a timeout to 300 seconds. I guess that is 5 minutes, but it feels like it is less.
In order to change this you will have to set the vertx.test.timeout with -Dvertx.test.timeout=###. Where ### is in seconds and 
must be a postive number. No setting it to -1, cause it is exactly like setting it to 0.

No need to clone this project. Although if you want to fork it and do pull requests, by all means go crazy. Yes, I am making a joke
here.
