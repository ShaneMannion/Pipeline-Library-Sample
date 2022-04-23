#!/usr/bin/env groovy
package com.yorku

def outputReport(){
        echo "Hello, this is your report ${env.BUILD_TAG} "
        println ("User is " + ${env.NODE_LABELS})
    }