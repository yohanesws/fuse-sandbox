Camel Project for Blueprint 
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache Karaf.
You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/camel-blueprint/1.0.0-SNAPSHOT
 
To push the fabric profile

	mvn clean compile install deploy fabric8:deploy


For more help see the Apache Camel documentation

    http://camel.apache.org/
