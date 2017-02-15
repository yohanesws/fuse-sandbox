fabric:create --clean --profile fabric --zookeeper-password admin --resolver manualip --manual-ip 127.0.0.1 --zookeeper-data-dir zkdata --wait-for-provisioning
profile-edit --pid io.fabric8.maven/io.fabric8.maven.localRepository=/Users/yohanesws/.m2/repository default
profile-edit --pid io.fabric8.agent/org.ops4j.pax.url.mvn.localRepository=/Users/yohanesws/.m2/repository default

profile-create --parent gateway-mq sandbox-gatewaymq
profile-edit --pid io.fabric8.gateway.detecting/port=67676 sandbox-gatewaymq
profile-edit --pid io.fabric8.gateway.detecting/openWireEnabled=true sandbox-gatewaymq
profile-edit --pid io.fabric8.gateway.detecting/defaultVirtualHost=sandboxmq sandbox-gatewaymq
profile-edit --pid io.fabric8.gateway.detecting/loadBalancerType=roundrobin sandbox-gatewaymq
profile-edit --pid io.fabric8.gateway.detecting/stickyLoadBalancerCacheSize=100 sandbox-gatewaymq
profile-edit --pid io.fabric8.gateway.detecting/stickyLoadBalancerCacheSize=100 sandbox-gatewaymq
profile-edit --pid io.fabric8.gateway.detecting/zooKeeperPath=/fabric/registry/clusters/amq sandbox-gatewaymq


profile-edit --pid com.redhat.fuse.sandbox.mq/amq.brokerURL=tcp://localhost:67676?wireFormat.host=sandboxmq com.redhat.fuse.sandbox.sandbox-eip
profile-edit --pid com.redhat.fuse.sandbox.mq/amq.userName=admin com.redhat.fuse.sandbox.sandbox-eip
profile-edit --pid com.redhat.fuse.sandbox.mq/amq.password=admin com.redhat.fuse.sandbox.sandbox-eip
profile-edit --pid com.redhat.fuse.sandbox.mq/amq.maxConnections=8 com.redhat.fuse.sandbox.sandbox-eip
profile-edit --pid com.redhat.fuse.sandbox.mq/cxfrs.url=http://127.0.0.1:8185/cxf/rs com.redhat.fuse.sandbox.sandbox-eip
