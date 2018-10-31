NOTE: the child ID starts from 1 in this test program.

To run the program:

* Make sure JDK 1.7 is installed

* Make sure Maven 3.2 is installed

* unpack the gzipped tar ball into the directory 'irexchange-test'

* run the following mvn command lines in the directoty 'irexchange-test'

  mvn clean package exec:java -Dexec.mainClass="au.com.irexchange.App" -DnumOfChildren=20 -DnumOfCount=3

