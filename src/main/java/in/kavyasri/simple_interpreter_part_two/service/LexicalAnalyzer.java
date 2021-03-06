package in.kavyasri.simple_interpreter_part_two.service;
import in.kavyasri.simple_interpreter_part_two.model.Token;
import in.kavyasri.simple_interpreter_part_two.model.TokenType;
public class LexicalAnalyzer {

    private String input;
    private int currentIndex = 0;

    public LexicalAnalyzer(String input){
        this.input = input;
    }

    public Token getNextToken(){
        Token currentToken = null;

        /*
        9+2 -> input.lenght => 3
        0,1,2 -> indexes
         */
        if(currentIndex == input.length() ){
            currentToken = new Token(null, TokenType.EOF);
        }

        char currentChar = input.charAt(currentIndex++);

        if(Character.isDigit(currentChar)){
            currentToken = new Token(currentChar + "" , TokenType.INTEGER);
        }else if(currentChar == '+'){
            currentToken = new Token(currentChar + "" , TokenType.PLUS);
        }

        return currentToken;
    }
}



