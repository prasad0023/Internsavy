package Internsavy;

import java.util.Scanner;

    class Hangman {

        public static void main(String[] args) {

            String[] words = {"computer", "java", "programming", "code", "algorithm"};
            String word = words[(int) (Math.random() * words.length)];
            String hiddenWord = new String(new char[word.length()]).replace('\0', '_');
            int tries = 6;
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to Hangman!");

            while(tries > 0 && hiddenWord.contains("_")) {
                System.out.println("You have " + tries + " tries left.");
                System.out.println("Word: " + hiddenWord);
                System.out.print("Guess a letter: ");
                char letter = input.next().charAt(0);
                if(word.contains(String.valueOf(letter))) {
                    for(int i = 0; i < word.length(); i++) {
                        if(word.charAt(i) == letter) {
                            hiddenWord = hiddenWord.substring(0, i) + letter + hiddenWord.substring(i + 1);
                        }
                    }
                } else {
                    tries--;
                    System.out.println("Wrong guess. Try again.");
                }
            }

            if(tries == 0) {
                System.out.println("You ran out of tries. The word was " + word + ".");
            } else {
                System.out.println("Congratulations! You guessed the word " + word + ".");
            }
        }
    }

