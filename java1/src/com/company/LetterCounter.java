package com.company;

public class LetterCounter {
    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public int countLetter() {
        return null == this.word ? 0 : this.word.length();
    }


}
