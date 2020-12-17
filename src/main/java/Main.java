import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        ChuckNorrisQuotes joke = new ChuckNorrisQuotes();
        String text= joke.getRandomQuote();
//        System.out.println(joke.getRandomQuote());
        Translator translator = new Translator();
        System.out.println("Translated joke: " + Translator.translate("en", "pl",text));
    }

}
