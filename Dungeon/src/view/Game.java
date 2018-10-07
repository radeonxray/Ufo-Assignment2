package view;

import control.GameControl;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import model.TextGenerator;

/**
 * Game class
 */
public class Game {

    //Declaring, initializing and instanciating variables. 
    GameControl gc;
    String input;
    private Scanner sca = new Scanner(System.in);

    /**
     * Constructor
     */
    public Game() {
        NewGame();
    }

    /**
     * Method used to start a new game.
     */
    private void NewGame() {

        //Boolean used for the while-loop.
        boolean boolean1 = true;

        //While loop-loop to ensure that we load or start a new game. 
        while (boolean1) {

            System.out.println(TextGenerator.getGameText(TextGenerator.GameText.NEW_OR_LOAD));

            String begin = sca.next();

            if (begin.equalsIgnoreCase("new")) {

                System.out.println(TextGenerator.getGameText(TextGenerator.GameText.INTRO));
                

                //Instantiating GameControl
                gc = new GameControl(sca.next());

                System.out.println(TextGenerator.getGameText(TextGenerator.GameText.INTRO_PART2));

                gc.move("");
                System.out.println("Type 'help' to show a list of available commands.");

                boolean1 = false;

            } else if (begin.equalsIgnoreCase("load")) {

                load();

                boolean1 = false;

                System.out.println("Load successfull");

            }

            if (boolean1) {

                System.out.println("Please choose a valid commmand!");

            }

        }
        
        //This while loop will keep the game running.
        while (gc.isGameActive() == true) {

            input = sca.nextLine();

            if (input.equalsIgnoreCase("save")) {

                save();

            } else if (input.equalsIgnoreCase("load")) {

                load();
                
            } else if (input.equalsIgnoreCase("new game")) {

                NewGame();
                break;

            } else if (input.equalsIgnoreCase("quit")) {

                gc.printer("Are you sure you want to quit?");

                input = sca.nextLine();

                if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {

                    gc.endGame(3);

                    System.exit(0);

                } else {

                    gc.printer("Continueing your adventure...\n");

                }

            }

            gc.inputAnalyzer(input);

        }

    }

    /**
     * Save method, used to save the current state of game variables.
     */
    public void save() {

        //Catch errors in I/O if necessary.
        try {

            // Open a file to write to, named SavedObj.sav.
            FileOutputStream saveFile = new FileOutputStream("saveFile.sav");

            // Create an ObjectOutputStream to put objects into save file.
            ObjectOutputStream save = new ObjectOutputStream(saveFile);

            //Write objects in the ObjectOutputStream.
            save.writeObject(gc);

            //Closes the stream.
            save.close();

        } catch (Exception exc) {

            //If there was an error, print the info.
            exc.printStackTrace();

        }
    }

    /**
     * Load method, used to read the data in saveFile and load it into the game
     * variables.
     */
    public void load() {

        //Catch errors in I/O if necessary.
        try {

            //Open file to read from, named SavedObj.sav.
            FileInputStream saveFile = new FileInputStream("saveFile.sav");

            //Create an ObjectInputStream to get objects from save file.
            ObjectInputStream save = new ObjectInputStream(saveFile);

            gc = (GameControl) save.readObject();

            //Closes the input stream.
            save.close();

        } catch (Exception exc) {

            //If there was an error, print the info.
            exc.printStackTrace();

        }

    }

}
