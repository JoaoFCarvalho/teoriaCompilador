import java.util.List;



public class Main {
    public static void main(String[] args) throws Exception {
        String input = "if (a == 10) { b = b + 1; }";
        Lexer lexer = new Lexer(input);
        List<Token> tokens = lexer.tokenize();
        // Imprime os tokens
        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}