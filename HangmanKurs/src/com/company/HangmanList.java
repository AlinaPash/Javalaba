package com.company;
import java.util.*;
public class HangmanList {//список возможных слов для разгадывания
    private static String[] secretWords = {"hippopotamus","canyon","router","dank","violet","horses","potato","candy","puncture","bristles","question",
            "syrup","runtime","keyboard","monitor","password","turtle","assignment","blackstrap","camel","faceup","zombie","pilot","record","loading"};
    private String secret; //слово, которое игрок пытается угадать
    private StringBuilder hashedWord; //'secret' в хэш форме
    private Random random; //генерация случайного числа
    private int guesses; //количество оставшихся догадок
    private boolean gameOver; //true если победа, false если поражение
    private int x;
    /**
     * Констурктор для создания списка HangmanList
     */
    public HangmanList() {
        pickWord();
        createHash(secret);
        guesses = 6;
    }
    /**
     *  Проверка на то, что выбранная буква в секретном слове и обновление 'hashedWord'
     */
    public void checkLetter(char c) {
        if(secret.indexOf(c) < 0) {
            guesses--; //если буквы нет в 'secret'
        } else {
            for(int i=0; i<secret.length(); i++) {
                if(secret.charAt(i)==c) {
                    hashedWord.setCharAt(i,c);
                }
            }
        }
        checkGame();
    }
    /**
     *  Создание хэшированной формы 'secret'
     */
    public void createHash(String s) {
        hashedWord = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            hashedWord.append("-");
        }
    }
    /**
     *  Выбор слова из списка 'secretWords'
     */
    public void pickWord() {
        random = new Random();
        x = random.nextInt(secretWords.length);
        secret = secretWords[x];
    }
    /**
     *  Проверка завершения игры
     */
    public void checkGame() {
        if(secret.equals(hashedWord.toString())) {
            gameOver = true;
        } else if(guesses==0) {
            gameOver = false;
        }
    }
    /**
     *  Геттеры
     */
    public int getGuesses() {
        return guesses;}
    public StringBuilder getHashed() {
        return hashedWord;}
    public boolean getStatus() {
        return gameOver;}
}
