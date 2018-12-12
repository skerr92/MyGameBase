/** @Author seth kerr
 *  CopyRight 2018
 *  Oak Development Technologies
 *
 *  MIT License. See license on MyGameBase repository on GitHub
 *
 */

package Controllers;

import SpriteModels.CharacterCollection;
import SpriteModels.MyMovableCharacter;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;



public class IOController {
    /**
     * These are just some sample properties that give you an idea of what you should be doing
     * in this IO Controller. The classes in here are abstract, be sure to follow the instructions
     * and feel free to build off the sample code provided in the comments
     */
    //User an arraylist to store your characters
    private ArrayList<MyMovableCharacter> myCharacters = new ArrayList<>();
    //or build a character collection based on the CharacterCollection base.
    private CharacterCollection characterCollection = new CharacterCollection();
    private String filename;
    /**
     * You can add your characters with either the ArrayList or CharacterCollection.
     * Ideally, the CharacterCollection provides the most customization and functionality
     * in storying Character models because it is built on an ArrayList
     */

    public static void readCharacterFile(String filename) {
        try {
            Scanner input = new Scanner(new File(filename));
            while (input.hasNext()) {
                /**
                 * We recommend using a while hasNext loop because it provides flexibility
                 * to create longer character, level, or object configuration files.
                 * It also helps build individual objects and process more detail.
                 *
                 * be sure to use the 'add(MyMovableCharacter)' method to add your read in character
                 * to the character collection / arraylist.
                 */

            }
        } catch (java.io.FileNotFoundException ex) {
            /**
             * You'll want to use this to log any file not found exceptions using the logger method.
             */
        }
        /**
         * In this method, we want to read in our characters from an input file.
         * the input file it typically a text file and will come with coordinates
         * for each character view on sprite configuration file.
         * Every game will be different, so be sure to format this to follow your Character
         * Collection toString() method.
         */
    }

    public static void writeCharacterFile(CharacterCollection characterCollection) {
        try {
            /**
             *For writing our Character file, we want to use a PrintWriter because it is honestly
             * the easiest way to write the CharacterCollection toString() method to a file.
             * This also makes it easier to predict the format when you read in the Character
             * Configuraiton file.
             */
            PrintWriter output = new PrintWriter(new File("characterconfigfile.txt"));
            output.println(characterCollection.toString());
            output.close(); //Be sure to close the PrintWriter or it will not finish writing the item to the file.


        } catch (java.io.FileNotFoundException ex) {
            /**
             * You'll want to use this to log any file not found exceptions using the logger method.
             */
        }
    }


}
