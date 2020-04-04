package com.example.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.core.io.ClassPathResource

internal class CalculatorTest {

    @Test
    fun sumOfNumbers() {
        // Arrange
        val resource = ClassPathResource("numbers")
        val sut = Calculator()

        // Act
        val actual = sut.calSum(resource.file.path)

        // Assert
        assertThat(actual).isEqualTo(10)
    }

    @Test
    fun multiplyOfNumbers() {
        // Arrange
        val resource = ClassPathResource("numbers")
        val sut = Calculator()

        // Act
        val actual = sut.calMultiply(resource.file.path)

        // Assert
        assertThat(actual).isEqualTo(24)
    }
}