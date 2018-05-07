/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaptox.zaptoxpos.util;

import java.applet.AudioClip;
import javax.swing.JApplet;

/**
 *
 * @author Vksoni
 */
public class PlayAideo {
    public void playErrorSound() {
     
        AudioClip error = JApplet.newAudioClip(getClass().getResource("/zaptox/zaptoxpos/aideo/error.wav"));
            error.play();
    }
}
