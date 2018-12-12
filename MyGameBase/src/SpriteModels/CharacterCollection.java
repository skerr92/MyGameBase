/** @Author seth kerr
 *  CopyRight 2018
 *  Oak Development Technologies
 *
 *  MIT License. See license on MyGameBase repository on GitHub
 *
 */

package SpriteModels;

import java.util.ArrayList;

public class CharacterCollection {

    private ArrayList<MyMovableCharacter> myMovableCharacters;

    public CharacterCollection() {
        myMovableCharacters = new ArrayList<>();
    }

    public void addMovableCharacter(MyMovableCharacter myMovableCharacter) {
        myMovableCharacters.add(myMovableCharacter);
    }

    public MyMovableCharacter deleteMovableCharacter(int index) {
        return myMovableCharacters.remove(index);
    }

    public void setMyMovableCharacter(int index, MyMovableCharacter myMovableCharacter) {
        myMovableCharacters.add(index, myMovableCharacter);
    }

    public int numMovableCharacters() {
        return myMovableCharacters.size();
    }

    public String toString() {
        String output = "Character List";

        for (int i = 0; i < numMovableCharacters(); i++) {
            output = output + myMovableCharacters.get(i).toString() + System.lineSeparator();
        }

        return output;
    }

}
