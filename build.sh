
#!/bin/bash

set -x

export JAVA_HOME=`/usr/libexec/java_home -v 13`

$JAVA_HOME/bin/javac Assignment1/*.java
