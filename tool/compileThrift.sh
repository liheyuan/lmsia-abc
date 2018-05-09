#!/bin/bash

PROJECT='lmsia-abc'

PROJECT_CAMEL=`echo $PROJECT | perl -ne 'print s/[-]([a-z])/\u$1/gr' | perl -ne 'print s/^([a-z])/\u$1/gr'`

thrift --gen java:beans -out "$PROJECT-common"/src/main/java "$PROJECT-common"/src/main/thrift/"$PROJECT_CAMEL.thrift"
