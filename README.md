javac -cp junit-platform-console-standalone-1.11.3.jar Calculator.java CalculatorTest.java -d out
java -jar junit-platform-console-standalone-1.11.3.jar --class-path out --scan-class-path

