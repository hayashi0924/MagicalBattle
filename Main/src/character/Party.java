package character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Party {
    private List<Character> party = new ArrayList<>();

    private Party(List<Character> party){
        this.party = party;
    }

    public Party add(Character character){
        List<Character> result = new ArrayList<>(this.party);
        result.add(character);
        return new Party(result);
    }

    public Party remove(Character character){
        List<Character> result = new ArrayList<>(this.party);
        result.remove(character);
        return new Party(result);
    }

    public List<Character> asList(){
        return Collections.unmodifiableList(this.party);
    }



}
