#!/usr/bin/env groovy
package com.yorku

def outputReport(buildUser){
        echo "Hello, this is your report ${env.BUILD_TAG} "
        println ("User is " + buildUser)
    }