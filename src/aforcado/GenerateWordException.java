/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

/**
 *
 * @author haleacu
 */
public class GenerateWordException extends Exception {
    private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public GenerateWordException(String message, boolean visible) {
        super(message);
        this.visible = visible;
    }
    
    
    
}
