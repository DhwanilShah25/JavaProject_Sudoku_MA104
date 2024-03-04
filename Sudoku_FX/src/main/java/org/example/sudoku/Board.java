package org.example.sudoku;

public class Board {
    private int boardLay[][]={
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0}
    };

    public void setBoardLay(int[][] boardLay) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                this.boardLay[i][j]=boardLay[i][j];
            }
        }
    }

    public int[][] getBoardLay() {
        return this.boardLay;
    }

}
