#!/usr/bin/env groovy
package com.yorku

def outputReport(JOB_NOTES){
        def title = "\t" + "Jenkins build report for " + env.BUILD_TAG + "\n"
        def buildDetails = "  Jenkins job '" + env.JOB_BASE_NAME + "' was executed by user:" + env.USER + ".\n"
        def nodeDetails = "  The job executed on node " + env.NODE_NAME + ".\n" 
        def workspaceDetails = "  The workspace was " + env.WORKSPACE + ".\n"
        def serverDetails = "  Jenkins login URL " + env.HUDSON_URL + ".\n"
        def border = "***********************************************************" + "\n"
        if (JOB_NOTES != null){
            def jobNotes = " Notes for this job: '" + JOB_NOTES + "'.\n"
        }
        else{
            def jobNotes = ""
        }
        
        println (border + border + title + border + buildDetails + nodeDetails + workspaceDetails + serverDetails + jobNotes + border + border)
    }