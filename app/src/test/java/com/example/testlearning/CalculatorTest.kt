package com.example.testlearning

import junit.framework.TestCase
import org.junit.Assert.*

import org.junit.Test

class CalculatorTest {

    @Test
    fun addingNumbers_whenGivenTwoPositiveNumbers_returnTrue() {
        //given
        val a = 5
        val b = 3
        val calculate = Calculator()
        //when
        val solution = calculate.addingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 8)
    }

    @Test
    fun addingNumbers_whenGivenTwoPositiveNumbersTwo_returnTrue() {
        //given
        val a = 8
        val b = 9
        val calculate = Calculator()
        //when
        val solution = calculate.addingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 17)
    }

    @Test
    fun addingNumbers_whenGivenTwoPositiveNumbersThree_returnTrue() {
        //given
        val a = 3
        val b = 3
        val calculate = Calculator()
        //when
        val solution = calculate.addingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 6)
    }

    @Test
    fun addingNumbers_whenGivenTwoNegativeNumbers_returnTrue() {
        //given
        val a = -4
        val b = -7
        val calculate = Calculator()
        //when
        val solution = calculate.addingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, -11)
    }

    @Test
    fun addingNumbers_whenGivenTwoNegativeNumbersTwo_returnTrue() {
        //given
        val a = -5
        val b = -9
        val calculate = Calculator()
        //when
        val solution = calculate.addingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, -14)
    }

    @Test
    fun addingNumbers_whenGivenTwoNegativeNumbersThree_returnTrue() {
        //given
        val a = -8
        val b = -2
        val calculate = Calculator()
        //when
        val solution = calculate.addingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, -10)
    }

    @Test
    fun subtractingNumbers_whenGivenTwoPositiveNumbers_returnTrue() {
        //given
        val a = 4
        val b = 7
        val calculate = Calculator()
        //when
        val solution = calculate.subtractingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, -3)
    }

    @Test
    fun subtractingNumbers_whenGivenTwoPositiveNumbersTwo_returnTrue() {
        //given
        val a = 9
        val b = 3
        val calculate = Calculator()
        //when
        val solution = calculate.subtractingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 6)
    }

    @Test
    fun subtractingNumbers_whenGivenTwoPositiveNumbersThree_returnTrue() {
        //given
        val a = 0
        val b = 0
        val calculate = Calculator()
        //when
        val solution = calculate.subtractingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 0)
    }

    @Test
    fun subtractingNumbers_whenGivenTwoNegativeNumbers_returnTrue() {
        //given
        val a = -9
        val b = -2
        val calculate = Calculator()
        //when
        val solution = calculate.subtractingNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, -7)
    }

    @Test
    fun multiplicationNumbers_whenGivenTwoPositiveNumbers_returnTrue() {
        //given
        val a = 5
        val b = 7
        val calculate = Calculator()
        //when
        val solution = calculate.multiplicationNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 35)
    }

    @Test
    fun multiplicationNumbers_whenGivenTwoPositiveNumbersTwo_returnTrue() {
        //given
        val a = 3
        val b = 4
        val calculate = Calculator()
        //when
        val solution = calculate.multiplicationNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 12)
    }

    @Test
    fun multiplicationNumbers_whenGivenTwoPositiveNumbersThree_returnTrue() {
        //given
        val a = 9
        val b = 1
        val calculate = Calculator()
        //when
        val solution = calculate.multiplicationNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 9)
    }

    @Test
    fun multiplicationNumbers_whenGivenTwoPositiveNumbersFour_returnTrue() {
        //given
        val a = 0
        val b = 3
        val calculate = Calculator()
        //when
        val solution = calculate.multiplicationNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 0)
    }

    @Test
    fun multiplicationNumbers_whenGivenTwoNegativeNumbers_returnTrue() {
        //given
        val a = -3
        val b = -9
        val calculate = Calculator()
        //when
        val solution = calculate.multiplicationNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 27)
    }

    @Test
    fun multiplicationNumbers_whenGivenTwoNegativeNumbersTwo_returnTrue() {
        //given
        val a = -5
        val b = -2
        val calculate = Calculator()
        //when
        val solution = calculate.multiplicationNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 10)
    }

    @Test
    fun divisionNumbers_whenGivenTwoPositiveNumbers_returnTrue() {
        //given
        val a = 6
        val b = 2
        val calculate = Calculator()
        //when
        val solution = calculate.divisionNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 3)
    }

    @Test
    fun divisionNumbers_whenGivenTwoPositiveNumbersTwo_returnTrue() {
        //given
        val a = 12
        val b = 3
        val calculate = Calculator()
        //when
        val solution = calculate.divisionNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 4)
    }

    @Test
    fun divisionNumbers_whenGivenTwoPositiveNumbersThree_returnTrue() {
        //given
        val a = 5
        val b = 5
        val calculate = Calculator()
        //when
        val solution = calculate.divisionNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 1)
    }

    @Test
    fun divisionNumbers_whenGivenTwoPositiveNumbersFour_returnTrue() {
        //given
        val a = 9
        val b = 1
        val calculate = Calculator()
        //when
        val solution = calculate.divisionNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 9)
    }




    @Test
    fun divisionNumbers_whenGivenTwoNegativeNumbers_returnTrue() {
        //given
        val a = -8
        val b = -4
        val calculate = Calculator()
        //when
        val solution = calculate.divisionNumbers(a, b)
        //assert
        TestCase.assertEquals(solution, 2)
    }
}