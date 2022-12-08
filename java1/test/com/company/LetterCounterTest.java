package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LetterCounterTest {

    private LetterCounter letterCounter;

    @BeforeEach
    public void init() {
        letterCounter = new LetterCounter();
    }

    @Test
    public void should_returnZero_when_wordIsNull() {
        int expected = 0;
//        letterCounter.setWord("zero");
        int actual = letterCounter.countLetter();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void should_returnNumber_when_wordDefined() {
        int expected = 6;
        letterCounter.setWord("myWord");
        int actual = letterCounter.countLetter();

        Assertions.assertEquals(expected, actual);
    }

}
