# Gumball Machine with Proxy Pattern

To get code running on localhost:

1. Change directories to the same level with PatternsHeadFirst/ folder in bin/

2. Run rmiregistry in background:
   rmiregistry 

3. Run:
   java Proxy/Server/GumballMachineTest localhost 300

4. In a different window, run:
   java Proxy/Client/GumballMonitorTest localhost