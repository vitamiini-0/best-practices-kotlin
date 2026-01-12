package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun testAdd() {
        assertEquals(3, add(1, 2))
    }
}
