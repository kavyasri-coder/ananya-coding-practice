package in.kavyasri.simple_interpreter_part_two.service;

import in.kavyasri.simple_interpreter.model.Token;
import in.kavyasri.simple_interpreter.model.TokenType;

public class LexicalAnalyzerV2 {
    private String input;
        private int currentIndex = 0;

        public LexicalAnalyzerV2(String input) {
            this.input = input;
        }

        public Token getNextToken() {
            Token currentToken = null;

            String finalTokenValue = "";

            //example -> 123 456 + 9999    end
        /*
        100     +       200 -> ' ' called a delimiter
        Tokens => 100, 200 , +

        // 9999    9999 + 10
          */

            TokenType currentTokenType = TokenType.DUMMY;
            boolean shouldRunLoop = true;
            while (shouldRunLoop) {
                if (currentIndex == input.length()) {
                    if(currentTokenType != TokenType.DUMMY){
                        currentToken = new Token(finalTokenValue, currentTokenType);
                    }else{
                        currentToken = new Token(null, TokenType.EOF);
                    }

                    break;
                }
                char currentChar = input.charAt(currentIndex++);//currentChar=2

                switch (currentTokenType) {
                    case DUMMY:
                        if (Character.isDigit(currentChar)) {
                            currentTokenType = TokenType.INTEGER;
                            finalTokenValue = finalTokenValue + currentChar + "";//finalTokenValue ="1"
                        } else if (currentChar == '+') {
                            currentToken = new Token(finalTokenValue + currentChar + "", TokenType.PLUS);
                            shouldRunLoop = false;
                            break;
                        } else if (currentChar == '-') {
                            currentToken = new Token(finalTokenValue + currentChar + "",TokenType.MINUS);
                            shouldRunLoop = false;
                            break;
                            //ignore the character
                        }
                        else if(currentChar == '*') {
                            currentToken = new Token(finalTokenValue + currentChar + "", TokenType.MULTIPLICATION);
                            shouldRunLoop = false;
                            break;
                        }else if(currentChar == '/') {
                            currentToken = new Token(finalTokenValue + currentChar + "", TokenType.DIVISION);
                            shouldRunLoop = false;
                            break;
                        }else if(currentChar == ' ') {
                        }else{
                            throw new IllegalArgumentException("Allowed characters in the language are + , digits and space");
                        }
                        break;
                    case INTEGER:
                        if (Character.isDigit(currentChar)) {
                            finalTokenValue = finalTokenValue + currentChar + "";//finalTokenValue="12"
                        } else {
                            shouldRunLoop = false;
                            currentToken = new Token(finalTokenValue, currentTokenType);
                            currentIndex--;
                        }
                        break;
                }
            }

            return currentToken;
        }
    }
