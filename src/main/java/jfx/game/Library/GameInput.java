package jfx.game.Library;


import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

import java.util.AbstractMap;
import java.util.HashMap;

/*TODO make sure to check how this class incorporates the UI*/
/* This class will be used to help creating inputs. The user will be able to create a ScreenInput class and then add in their own Scene from Javafx. or can just add it into the engine code so it is hidden from the user
inputs that are based on JavaFX input KeyEvents. They will then be able to associate a function with those events and the program will be
able to put those into the scene that it corresponds to.
 */
public class GameInput {

    Scene scene; //will need a scene to call it on or something?
    AbstractMap<KeyEvent,Runnable> keyboardCommandList;

    public GameInput(Scene scene){
        this.scene = scene;
        this.keyboardCommandList = new HashMap<>();
    }

    public void addKeyboardCommand(KeyEvent keyEvent, Runnable func){
        keyboardCommandList.put(keyEvent,func);
    }

    public void removeKeyBoardCommand(KeyEvent keyEvent){
        if(keyboardCommandList.containsKey(keyEvent))
            keyboardCommandList.remove(keyEvent);
    }

    public void addCommandsToScene(){
        removeCommandsFromScene();
        //some way to do this
    }

    public void removeCommandsFromScene(){
        //some way to do this
    }

}