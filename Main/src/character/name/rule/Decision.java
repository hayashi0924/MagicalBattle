package character.name.rule;

import java.util.HashSet;
import java.util.Set;

public class Decision {
    private final Set<NamingRule> rules;

    Decision(){
        rules = new HashSet();
    }

    public boolean isValid(final String name){
        for(NamingRule each : rules){
            if(!each.isValid(name)){
                throw new IllegalArgumentException("文字数は" +
                        WordLengthRule.MIN_LENGTH + "から" +
                        WordLengthRule.MAX_LENGTH + "までの間で指定してください");
            }
        }
        return true;
    }
}
