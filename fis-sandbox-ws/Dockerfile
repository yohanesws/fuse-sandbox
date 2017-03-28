from registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift

ADD target/*.jar /deployments
ADD bin/*.sh /deployments/bin/
#ADD jolokia/* /opt/jolokia/etc/

USER root
RUN chown -R jboss:jboss /deployments
RUN chown -R jboss:jboss /deployments/bin/run.sh
#RUN chown -R jboss:jboss /opt/jolokia/etc/
USER jboss

RUN chmod -R 755 /deployments
#RUN chmod -R 755 /opt/jolokia/etc
RUN chmod +x /deployments/bin/*.sh

expose 8080
expose 8778
expose 9779

ENTRYPOINT /deployments/bin/run.sh
