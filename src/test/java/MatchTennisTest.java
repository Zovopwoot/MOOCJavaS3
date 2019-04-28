import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatchTennisTest {
    @Test
    void scoreIsDisplayedWhenMatchBegins() {
        assertEquals("0-0 0-0", new MatchTennis().toString());
    }
}