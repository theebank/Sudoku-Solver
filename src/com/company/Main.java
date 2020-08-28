package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	PuzzleGenerator a = new PuzzleGenerator(1);
	a.print();
	System.out.println();
	if(solve(a)){
	    a.print();
    }

    }
    public static boolean boardcheck(PuzzleGenerator puzzle, int row, int col, int value){
        //checking row
        for (int r = 0;r<9;r++){
                if (puzzle.puzzle[row][r] == value) {
                    return false;
                }
        }
        //checking col
        for(int c = 0;c<9;c++){
                if(puzzle.puzzle[c][col]==value) {
                    return false;
                }
        }
        //checking box
        int boxrowstart = row-row%3;
        int boxcolstart = col-col%3;
        for(int z = boxrowstart;z<boxrowstart+3;z++){
            for(int y = boxcolstart;y<boxcolstart+3;y++){
                if(puzzle.puzzle[z][y]==value){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solve(PuzzleGenerator puzzle){
            int row = 0;
            int col = 0;
            boolean finished = true;
            for(int i = 0;i<9;i++){
                for (int j = 0;j<9;j++){
                    if(puzzle.puzzle[i][j]== 0){
                        row = i;
                        col = j;
                        finished = false;
                        break;
                    }
                }
                if(!finished){
                    break;
                }
            }
            if(finished){
                return true;
            }else{
            for (int value = 1;value <=9;value++){
                if(boardcheck(puzzle,row,col,value)){
                    puzzle.puzzle[row][col]= value;
                    if(solve(puzzle)){
                        return true;
                    }
                    else{
                        puzzle.puzzle[row][col]=0;
                    }
                }
            }}
        return false;
    }



}
