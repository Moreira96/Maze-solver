/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

/**
 *
 * @author morei
 *  Comparison between A* and Best-First search (with h as the objective function) for the labyrinth problem on the same 
    labyrinth of size 20 by 20, then 30 by 30. 
    Generate random labyrinths with 5, 10, 20, 25, 30 percents of the space as "walls". You should count the number cells visited.
    There will be a number of labyrinths which have no solution. The output should be written in a text file as CSV values. 
    e.g. "AStar; 20; 20; 253.35; 17"  meaning: for A* on 20 by 20 averaged number of moves measured on 50 labyrinths is 253.35 ans 17 unsolvable problems
 */
public class Labirinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = 30;  // size of Lab
        int num = 50;   //number of repetitions
        int walls = 95;  //percentage of walls
        
        Lab lab = new Lab(size, num, walls);
        lab.buildLab();
        lab.printLab();
        //lab.run();
    }
    
}
