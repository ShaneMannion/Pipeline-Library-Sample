#!/usr/bin/env groovy
package com.yorku

def outputReport(){
        def title = "Jenkins build report for " + env.BUILD_TAG + "\n"
        def buildDetails = "Job " + env.JOB_BASE_NAME + " executed by " + env.USER + "\n"
        def nodeDetails = "Node " + env.NODE_NAME + " with workspace " + env.WORKSPACE + "\n"
        def serverDetails = "Jenkins login URL " + env.HUDSON_URL + "\n"
        def border = "***********************************************************" + "\n"
        
        echo "Hello, this is your report ${env.BUILD_TAG} "
        println ("Node label is " + env.NODE_LABELS)
        println (border + border + title + border + buildDetails + nodeDetails + serverDetails + border)
    }