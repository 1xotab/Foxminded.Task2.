package com.Foxminded.Anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TestAnagrams {
    Anagrams swapper = new Anagrams();

    @Test
    void swapLettersInTheWords_shouldThrowNullPointerException_whenInputStringIsNull() {
        assertThrows(NullPointerException.class, () -> swapper.swapLettersInTheWords(null));
    }

    @Test
    void swapLettersInTheWords_shouldReturnEmptyString_whenInputStringIsEmpty() {
        String actual = swapper.swapLettersInTheWords("");
        Assertions.assertEquals("", actual);
    }

    @Test
    void swapLettersInTheWords_shouldReturnSingleSpace_whenInputStringIsSingleSpace() {
        String actual = swapper.swapLettersInTheWords(" ");
        Assertions.assertEquals(" ", actual);
    }

    @Test
    void swapLettersInTheWords_shouldReturnSeveralSpace_whenInputStringConsistOfSeveralSpaces() {
        String actual = swapper.swapLettersInTheWords("   ");
        Assertions.assertEquals("   ", actual);
    }

    @Test
    void swapLettersInTheWords_shouldReturnSingleCharacter_whenInputStringIsSingleCharacter() {
        String actual = swapper.swapLettersInTheWords("a");
        Assertions.assertEquals("a", actual);
    }

    @Test
    void swapLettersInTheWords_shouldReturnMultiSameLetterString_whenInputStringIsMultiSameLetter() {
        String actual = swapper.swapLettersInTheWords("aaaa");
        Assertions.assertEquals("aaaa", actual);
    }

    @Test
    void swapLettersInTheWords_shouldReturnSwappedSameCharacterInLowerAndUpperCasesMixed_whenInputStringSameCharacterInLowerAndUpperCasesMixed() {
        String actual = swapper.swapLettersInTheWords("aAaAaA");
        Assertions.assertEquals("AaAaAa", actual);
    }

    @Test
    void swapLettersInTheWords_shouldReturnWordWithSwappedLetters_whenInputStringWordWithDifferentLetters() {
        String actual = swapper.swapLettersInTheWords("gate");
        Assertions.assertEquals("etag", actual);
    }

    @Test
    void swapLettersInTheWords_shouldReturnSymbolsInTheSameOrder_whenInputStringConsistOfSymbols() {
        String actual = swapper.swapLettersInTheWords("!+-0343&^^^^%%");
        Assertions.assertEquals("!+-0343&^^^^%%", actual);
    }

    @Test
    void swapLettersInTheWords_shouldReturnEachWordWithSwappedLetters_whenInputStringConsistOfSeveralWords() {
        String actual = swapper.swapLettersInTheWords("word gate");
        Assertions.assertEquals("drow etag", actual);
    }
}
