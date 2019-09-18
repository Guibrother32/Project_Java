/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so_project_sinaleira;
import java.util.Scanner;
import java.util.Timer;
/**
 *
 * @author guico
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    static int aux=0;
    static int estado=0;
    
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        
        ThreadSinal Sinal = new ThreadSinal();

        Thread t1 = new Thread(Sinal);

        ThreadPedestre SinalP = new ThreadPedestre();

        Thread p1 = new Thread(SinalP);

        t1.start();

        while(true){


            Scanner s = new Scanner(System.in);

             aux = s.nextInt();

             if(aux!=0){

                 System.out.println("INTERROMPIDA");

                 p1.start();
                 

             }

             if(p1.isAlive()==false && t1.isAlive()==false){
                 System.out.println("entrei aqui");
                 aux=0;
                 t1.start();
             }
             

    }
    }
    
}
