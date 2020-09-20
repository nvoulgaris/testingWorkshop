package com.nvoulgaris.testingworkshop.examples.backbone

import spock.lang.Specification

class Backbone extends Specification {

    def setupSpec() {
        println("SETUP SPEC")
    }

    def setup() {
        println("** Setup")
    }

    def test1() {
        expect:
          println("**** Test1")
    }

    def test2() {
        expect:
          println("**** Test2")
    }

    def test3() {
        expect:
          println("**** Test3")
    }

    def cleanup() {
        println("** Cleanup")
    }

    def cleanupSpec() {
        println("CLEANUP SPEC")
    }
}
