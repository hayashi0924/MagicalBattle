package character.name.rule;

import java.util.HashSet;
import java.util.Set;

public class Decision {
    private static final Set<NamingRule> rules = new HashSet<>();

    public static boolean isValid(final String name){
        for(Index each : Index.values()){
            if(!each.rule().isValid(name)){
                throw new IllegalArgumentException("文字数は" +
                        WordLengthRule.MIN_LENGTH + "から" +
                        WordLengthRule.MAX_LENGTH + "までの間で指定してください");
            }
        }
        return true;
    }
}
