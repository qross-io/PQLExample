package io.qross

import io.qross.pql.PQL

object Test {
    def main(args: Array[String]): Unit = {
        PQL.runFile("/pql/open.sql")
    }
}
