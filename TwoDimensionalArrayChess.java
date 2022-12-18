/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodimensionalarraychess;

/**
 *
 * @author gjfur
 */
import java.util.*;
public class TwoDimensionalArrayChess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int boardDimension = 8;
        char[][] board = new char [boardDimension][boardDimension];
        boolean isWhite = false;
        for(int y = 0; y < board.length; y++){
            isWhite = !isWhite;
            for(int x = 0; x < board[y].length; x++){
                if(isWhite) board[y][x] = 'W';
                if(!isWhite) board[y][x] = 'B';
                isWhite = !isWhite;
            }
        }
        for(int i = 0; i < board.length; i++){
            System.out.println(Arrays.toString(board[i]));
        }
        
        
    }
    
}
