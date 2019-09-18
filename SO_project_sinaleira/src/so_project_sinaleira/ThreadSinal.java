/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_project_sinaleira;

import java.util.logging.Level;
import java.util.logging.Logger;
import static so_project_sinaleira.Main.aux;





/**
 *
 * @author guico
 */
public class ThreadSinal implements Runnable{
    
    boolean red=false,green=false,yellow=false;

    
    int i,tempo,aux2=0;
    //aux2 ja interrompido
   
        
    @Override
    public void run() {

        while(aux!=1){
            
            for(i=0;i<20;i++){


                if(red==false && green==false){
                    red=true;
                    tempo=19;
                    System.out.println("RED Signal!");
                    
                
                }

                try {
                    Thread.sleep(1000); //1sec
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadSinal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(aux!=1){
                    System.out.println("Tempo: " + tempo);

                }
               
                
                tempo--;
                   if(tempo==0){
                    System.out.println("!!!");
                }
                   
                if(aux==1){
                    System.out.println("Interrupcao no vermelho");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadSinal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    aux2=1;
                    break;  
                }

            }

            red=false;


            for(i=0;i<5;i++){
                if(aux2==1){
                    break;
                }
                
                if(aux==1){
                    System.out.println("Interrupcao no verde");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadSinal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;  
                }

                if(green==false && red==false){
                    green=true;
                    tempo=4;
                    System.out.println("GREEN Signal!");
                    if(aux==1){
                        break;
                    }
                }

                try {
                    Thread.sleep(1000); //1sec
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadSinal.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Tempo: " + tempo);

                tempo--;
                if(tempo==0){
                    System.out.println("!!!");
                }



            }

            green=false;

            for(i=0;i<2;i++){
                if(aux2==1){
                    break;
                }
                

                if(green==false && red==false){
                    yellow=true;

                }

                try {
                    Thread.sleep(1000); //1sec
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadSinal.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("YELLOW Signal! PAY ATTENTION");
  
                
            }


           
        }
        

        
    }
}