package pub;

import java.util.ResourceBundle;

/**
 *
 * @author Pieter van den Hombergh {@code pieter.van.den.hombergh@gmail.com}
 */
public class LanguageUtils {
    static String getMessageOrDefault( ResourceBundle bundle, String utterance, String defaultString ) {

        return bundle.containsKey( utterance ) ? bundle.getString( utterance ) : utterance;

    }

}
