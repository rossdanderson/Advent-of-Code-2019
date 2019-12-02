package com.github.rossdanderson.aoc2019.day1

import java.nio.file.Paths

private fun calculateFuel(input: Long) = Math.floorDiv(input, 3L) - 2L

fun main(args: Array<String>) {
    Paths.get(args.getOrElse(0) { "./input/01.txt" })
        .toFile()
        .useLines { lines ->
            lines
                .map(String::toLong)
                .map(::calculateFuel)
                .sum()
                .also(::println)
        }
}
