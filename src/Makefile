compile:
	javac *.java && rmic TrafficCircleSimulation

server:
	java -Djava.security.manager -Djava.security.policy=policy-file Server

client:
	java -Djava.security.manager -Djava.security.policy=policy-file Client

clean:

reset:
	rm *.class

.PHONY: all clean
