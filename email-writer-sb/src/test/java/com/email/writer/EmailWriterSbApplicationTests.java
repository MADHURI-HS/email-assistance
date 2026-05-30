package com.email.writer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

// ----------------------------------------------------------------
// @TestPropertySource — provides dummy values for the API key
// and URL so the Spring context loads successfully in CI
// without needing a real Gemini API key
// ----------------------------------------------------------------
@SpringBootTest
@TestPropertySource(properties = {
        "gemini.api.url=http://dummy-url-for-testing",
        "gemini.api.key=dummy-key-for-testing"
})
class EmailWriterSbApplicationTests {

    // This test simply checks that the Spring application context
    // loads without errors — all beans are wired correctly
    @Test
    void contextLoads() {
        // If the application context loads successfully, this passes
        // If any bean configuration or wiring is broken, this fails
    }

}