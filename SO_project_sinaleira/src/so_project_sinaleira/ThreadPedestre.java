/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_project_sinaleira;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static so_project_sinaleira.Main.aux;

/**
 *
 * @author guico
 */
public class ThreadPedestre implements Runnable {
    
    int tempo=2;
    boolean estado=false;
    
    
    @Override
    public void run() {
      
     
         for (int i = 0; i < 3; i++) {
             
             
             if(estado==false){
                 estado=true;
                 System.out.println("Pedestrian Signal!");
             }
            
            try {
                Thread.sleep(1000); //1sec
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSinal.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            System.out.println("Tempo: " + tempo);
            
            tempo--;
        }
         

        
    }

    
    
}
