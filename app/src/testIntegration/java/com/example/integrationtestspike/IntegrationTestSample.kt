package com.example.integrationtestspike

import junit.framework.TestCase.assertTrue
import org.junit.Test

class IntegrationTestSample {
    @Test
    fun `This test pass`() {
        assertTrue(true)
    }

    @Test
    fun `This test fails`() {
        assertTrue(false)
    }
}