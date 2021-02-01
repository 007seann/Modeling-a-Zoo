
#!/bin/bash

set -x

export JAVA_HOME=`/usr/libexec/java_home -v 13`; java -version

$JAVA_HOME/bin/javac *.java
