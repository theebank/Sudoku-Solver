package com.company;

public class PuzzleGenerator {
    public int[][] puzzle;

    public PuzzleGenerator(){
        this(1);
    }
    public PuzzleGenerator(int difficulty){

        if(difficulty==1){
            puzzle = new int[][]{
                    { 0, 9, 1, 2, 0, 0, 8, 3, 0 },
                    { 0, 0, 0, 0, 0, 6, 0, 0, 0 },
                    { 0, 2, 0, 0, 0, 9, 0, 4, 7 },
                    { 0, 5, 0, 0, 0, 3, 0, 8, 0 },
                    { 6, 0, 0, 4, 1, 0, 0, 0, 0 },
                    { 1, 0, 0, 8, 0, 0, 0, 9, 5 },
                    { 0, 6, 0, 9, 0, 0, 0, 2, 0 },
                    { 0, 0, 2, 3, 0, 0, 0, 0, 4 },
                    { 8, 3, 0, 0, 4, 0, 1, 6, 0 }
            };
        }
        if(difficulty==2){

        }
        if(difficulty==3){

        }
    }
    public void print(){
        String a = "[";
        for (int i = 0;i<9;i++){
            if(i != 0){a = a+"\n[";}
            for (int j = 0;j<9;j++){
                if(puzzle[i][j]!=0) {
                    a = a + puzzle[i][j];
                }
                if(j<8){a = a+",";}

            }a = a+"]";
        }
        System.out.println(a);
    }
}
