/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author morei
 */
public class Lab {
    
    private int size;   // size of Lab
    private int num;    // number of repetitions
    private int walls;  // percentage of walls
    private List <ArrayList> lab;

    Lab(int size, int num, int walls) {
        this.size = size;
        this.num = num;
        this.walls = walls;
    }
    
    void buildLab(){
        // + -> wall
        // ' ' -> path
        // S  -> Start
        // H -> finish
        
        lab = new ArrayList <>();
        Random rand = new Random();
        
        int a = rand.nextInt(size-1),b = rand.nextInt(size-1), c = rand.nextInt(size-1);
        
        for(int i = 0; i < size; i++){        
            for(int j = 0; j < size; j++){
               
                lab.add(new ArrayList<>());
                
                if(a == i && b == j)
                    lab.get(i).add("H");
                else
                if(j == c && i == c)
                    lab.get(i).add("S");
                else    
                if(j == size - 1 || j == 0 ||i == 0 || i == size - 1){
                    lab.get(i).add("+");     
                }else
                    if(walls >= rand.nextInt(100))            
                        lab.get(i).add("+"); 
                else
                    lab.get(i).add(" ");
            }
        }
    }

    void printLab(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(" " + lab.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    void run() {
        
    }
    
}
