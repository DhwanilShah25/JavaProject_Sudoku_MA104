package org.example.sudoku;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private HBox inputBox;
    @FXML
    private HBox clearBox;
    @FXML
    private Button giveUp;
    @FXML
    private Button playAgain;
    @FXML
    private RadioButton easy;
    @FXML
    private RadioButton medium;
    @FXML
    private RadioButton hard;
    @FXML
    private Button but00,but01,but02,but03,but04,but05,but06,but07,but08,
    but10,but11,but12,but13,but14,but15,but16,but17,but18,
    but20,but21,but22,but23,but24,but25,but26,but27,but28,
    but30,but31,but32,but33,but34,but35,but36,but37,but38,
    but40,but41,but42,but43,but44,but45,but46,but47,but48,
    but50,but51,but52,but53,but54,but55,but56,but57,but58,
    but60,but61,but62,but63,but64,but65,but66,but67,but68,
    but70,but71,but72,but73,but74,but75,but76,but77,but78,
    but80,but81,but82,but83,but84,but85,but86,but87,but88;

    public Button but[][]=new Button[9][9];
    public void initialiseButton(){
        but[0][0]=but00;
        but[0][1]=but01;
        but[0][2]=but02;
        but[0][3]=but03;
        but[0][4]=but04;
        but[0][5]=but05;
        but[0][6]=but06;
        but[0][7]=but07;
        but[0][8]=but08;

        but[1][0]=but10;
        but[1][1]=but11;
        but[1][2]=but12;
        but[1][3]=but13;
        but[1][4]=but14;
        but[1][5]=but15;
        but[1][6]=but16;
        but[1][7]=but17;
        but[1][8]=but18;

        but[2][0]=but20;
        but[2][1]=but21;
        but[2][2]=but22;
        but[2][3]=but23;
        but[2][4]=but24;
        but[2][5]=but25;
        but[2][6]=but26;
        but[2][7]=but27;
        but[2][8]=but28;

        but[3][0]=but30;
        but[3][1]=but31;
        but[3][2]=but32;
        but[3][3]=but33;
        but[3][4]=but34;
        but[3][5]=but35;
        but[3][6]=but36;
        but[3][7]=but37;
        but[3][8]=but38;

        but[4][0]=but40;
        but[4][1]=but41;
        but[4][2]=but42;
        but[4][3]=but43;
        but[4][4]=but44;
        but[4][5]=but45;
        but[4][6]=but46;
        but[4][7]=but47;
        but[4][8]=but48;

        but[5][0]=but50;
        but[5][1]=but51;
        but[5][2]=but52;
        but[5][3]=but53;
        but[5][4]=but54;
        but[5][5]=but55;
        but[5][6]=but56;
        but[5][7]=but57;
        but[5][8]=but58;

        but[6][0]=but60;
        but[6][1]=but61;
        but[6][2]=but62;
        but[6][3]=but63;
        but[6][4]=but64;
        but[6][5]=but65;
        but[6][6]=but66;
        but[6][7]=but67;
        but[6][8]=but68;

        but[7][0]=but70;
        but[7][1]=but71;
        but[7][2]=but72;
        but[7][3]=but73;
        but[7][4]=but74;
        but[7][5]=but75;
        but[7][6]=but76;
        but[7][7]=but77;
        but[7][8]=but78;

        but[8][0]=but80;
        but[8][1]=but81;
        but[8][2]=but82;
        but[8][3]=but83;
        but[8][4]=but84;
        but[8][5]=but85;
        but[8][6]=but86;
        but[8][7]=but87;
        but[8][8]=but88;
    }
    public int easyBoard[][][]= {
            {
                    {0,7,0,0,2,0,0,4,6},
                    {0,6,0,0,0,0,8,9,0},
                    {2,0,0,8,0,0,7,1,5},
                    {0,8,4,0,9,7,0,0,0},
                    {7,1,0,0,0,0,0,9,5},
                    {0,0,0,1,3,0,4,8,0},
                    {6,9,7,0,0,2,0,0,8},
                    {0,5,8,0,0,0,0,6,0},
                    {4,3,0,0,8,0,0,7,0}
            },
            {
                    {0,3,0,0,0,0,0,0,0},
                    {0,6,1,0,0,2,0,0,0},
                    {0,0,0,9,3,0,0,5,0},
                    {0,1,3,0,0,0,0,0,0},
                    {0,0,0,7,9,0,0,0,0},
                    {0,0,8,4,0,0,0,2,7},
                    {0,0,0,2,0,0,4,8,0},
                    {0,9,4,3,1,8,5,0,0},
                    {0,0,0,0,0,0,1,0,0}
            },
            {
                    {0,0,5,0,3,0,0,0,7},
                    {0,0,1,0,0,0,0,2,3},
                    {2,0,3,1,0,0,0,6,0},
                    {9,0,4,8,0,0,0,0,0},
                    {0,0,0,0,0,7,0,1,0},
                    {0,2,8,0,0,0,0,0,9},
                    {0,5,0,0,0,4,0,0,0},
                    {0,6,0,0,5,1,0,9,0},
                    {0,0,0,0,9,6,2,0,8}
            },
            {
                    {6,3,0,0,0,1,0,0,2},
                    {0,8,0,0,5,0,0,0,0},
                    {0,9,5,0,0,0,6,1,3},
                    {0,0,0,5,7,0,4,0,0},
                    {0,0,0,8,0,0,9,0,0},
                    {5,0,0,1,0,0,0,0,0},
                    {0,0,0,0,9,3,0,8,0},
                    {0,1,0,6,8,0,0,0,0},
                    {0,0,3,0,0,0,0,2,0}
            },
            {
                    {0,0,0,0,0,0,0,0,0},
                    {4,0,0,0,0,8,0,6,0},
                    {0,0,2,0,6,0,3,0,7},
                    {0,6,1,5,9,0,0,0,4},
                    {8,0,0,0,7,4,6,9,0},
                    {0,0,5,0,0,2,0,0,0},
                    {0,0,0,9,3,0,0,8,2},
                    {1,7,9,8,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0}
            }
    };
    public int easyBoardSol[][][]={
            {
                    {8,7,5,9,2,1,3,4,6},
                    {3,6,1,7,5,4,8,9,2},
                    {2,4,9,8,6,3,7,1,5},
                    {5,8,4,6,9,7,1,2,3},
                    {7,1,3,2,4,8,6,5,9},
                    {9,2,6,1,3,5,4,8,7},
                    {6,9,7,4,1,2,5,3,8},
                    {1,5,8,3,7,9,2,6,4},
                    {4,3,2,5,8,6,9,7,1}
            },
            {
                    {5,3,9,1,7,6,2,4,8},
                    {4,6,1,5,8,2,7,3,9},
                    {8,2,7,9,3,4,6,5,1},
                    {7,1,3,8,2,5,9,6,4},
                    {6,4,2,7,9,3,8,1,5},
                    {9,5,8,4,6,1,3,2,7},
                    {1,7,6,2,5,9,4,8,3},
                    {2,9,4,3,1,8,5,7,6},
                    {3,8,5,6,4,7,1,9,2}
            },
            {
                    {6,9,5,4,3,2,1,8,7},
                    {4,7,1,5,6,8,9,2,3},
                    {2,8,3,1,7,9,4,6,5},
                    {9,1,4,8,2,5,7,3,6},
                    {5,3,6,9,4,7,8,1,2},
                    {7,2,8,6,1,3,5,4,9},
                    {3,5,9,2,8,4,6,7,1},
                    {8,6,2,7,5,1,3,9,4},
                    {1,4,7,3,9,6,2,5,8}
            },
            {
                    {6,3,7,9,4,1,8,5,2},
                    {2,8,1,3,5,6,7,9,4},
                    {4,9,5,7,2,8,6,1,3},
                    {3,2,8,5,7,9,4,6,1},
                    {1,4,6,8,3,2,9,7,5},
                    {5,7,9,1,6,4,2,3,8},
                    {7,5,4,2,9,3,1,8,6},
                    {9,1,2,6,8,5,3,4,7},
                    {8,6,3,4,1,7,5,2,9}
            },
            {
                    {3,9,6,2,1,7,5,4,8},
                    {4,1,7,3,5,8,2,6,9},
                    {5,8,2,4,6,9,3,1,7},
                    {7,6,1,5,9,3,8,2,4},
                    {8,2,3,1,7,4,6,9,5},
                    {9,4,5,6,8,2,1,7,3},
                    {6,5,4,9,3,1,7,8,2},
                    {1,7,9,8,2,5,4,3,6},
                    {2,3,8,7,4,6,9,5,1}
            }
    };
    public int mediumBoard[][][]={
            {
                    {0,0,4,0,2,0,1,0,0},
                    {0,0,0,0,6,0,0,5,8},
                    {0,5,8,0,0,0,0,9,0},
                    {0,1,0,0,0,8,0,0,0},
                    {0,7,0,0,0,0,0,0,0},
                    {6,0,0,0,5,2,0,1,0},
                    {0,0,2,0,0,4,0,0,3},
                    {0,0,0,0,0,0,7,6,0},
                    {0,0,0,0,9,0,0,0,0}
            },
            {
                    {0,0,0,0,0,0,0,0,0},
                    {0,4,0,7,0,0,0,6,0},
                    {0,7,0,1,3,4,0,0,0},
                    {0,0,0,0,0,5,0,3,0},
                    {9,0,0,0,2,0,0,0,0},
                    {0,6,0,0,0,0,7,8,1},
                    {0,0,5,0,8,0,0,0,9},
                    {0,0,0,0,0,0,0,1,0},
                    {1,0,0,4,0,2,0,0,0}
            },
            {
                    {0,0,2,8,0,0,9,0,4},
                    {0,0,0,0,0,6,0,0,0},
                    {0,0,0,7,0,1,0,3,0},
                    {0,0,3,5,6,0,0,0,0},
                    {0,0,0,0,0,8,0,0,5},
                    {0,0,1,0,0,0,0,7,2},
                    {0,5,0,2,0,0,0,0,8},
                    {0,2,0,0,0,0,0,4,0},
                    {8,0,9,0,0,0,5,0,0}
            },
            {
                    {0,8,4,0,0,0,0,0,5},
                    {0,0,6,0,0,2,7,0,0},
                    {0,9,0,0,6,1,0,0,4},
                    {2,0,0,0,0,0,0,3,0},
                    {0,0,7,0,0,0,0,0,0},
                    {8,0,0,3,7,4,0,0,0},
                    {0,7,0,0,4,0,0,0,1},
                    {0,0,0,8,0,0,0,0,0},
                    {0,5,0,0,0,9,0,0,8}
            },
            {
                    {7, 0, 0, 8, 4, 0, 2, 0, 5},
                    {0, 3, 0, 1, 5, 0, 4, 0, 0},
                    {0, 0, 5, 0, 6, 0, 0, 7, 0},
                    {0, 9, 0, 0, 3, 4, 5, 8, 0},
                    {0, 2, 8, 7, 0, 0, 9, 0, 3},
                    {5, 0, 3, 9, 0, 0, 6, 0, 0},
                    {0, 0, 4, 5, 2, 0, 0, 9, 0},
                    {0, 0, 9, 4, 0, 8, 0, 0, 0},
                    {8, 0, 0, 0, 0, 1, 7, 0, 0}
            }
    };

    public int mediumBoardSol[][][]={
            {
                    {9,6,4,8,2,5,1,3,7},
                    {1,2,7,3,6,9,4,5,8},
                    {3,5,8,4,7,1,6,9,2},
                    {2,1,5,9,4,8,3,7,6},
                    {4,7,9,1,3,6,8,2,5},
                    {6,8,3,7,5,2,9,1,4},
                    {7,9,2,6,1,4,5,8,3},
                    {5,4,1,2,8,3,7,6,9},
                    {8,3,6,5,9,7,2,4,1}
            },
            {
                    {3,5,1,2,6,8,4,9,7},
                    {2,4,8,7,5,9,1,6,3},
                    {6,7,9,1,3,4,8,2,5},
                    {7,8,4,6,1,5,9,3,2},
                    {9,1,3,8,2,7,5,4,6},
                    {5,6,2,9,4,3,7,8,1},
                    {4,2,5,3,8,1,6,7,9},
                    {8,3,7,5,9,6,2,1,4},
                    {1,9,6,4,7,2,3,5,8}
            },
            {
                    {7,6,2,8,5,3,9,1,4},
                    {1,3,8,4,9,6,2,5,7},
                    {4,9,5,7,2,1,8,3,6},
                    {9,7,3,5,6,2,4,8,1},
                    {2,4,6,1,7,8,3,9,5},
                    {5,8,1,9,3,4,6,7,2},
                    {3,5,4,2,1,9,7,6,8},
                    {6,2,7,3,8,5,1,4,9},
                    {8,1,9,6,4,7,5,2,3}
            },
            {
                    {1,8,4,9,3,7,6,2,5},
                    {5,3,6,4,8,2,7,1,9},
                    {7,9,2,5,6,1,3,8,4},
                    {2,1,5,6,9,8,4,3,7},
                    {3,4,7,1,2,5,8,9,6},
                    {8,6,9,3,7,4,1,5,2},
                    {9,7,8,2,4,3,5,6,1},
                    {4,2,1,8,5,6,9,7,3},
                    {6,5,3,7,1,9,2,4,8}
            },
            {
                    {7, 6, 1, 8, 4, 9, 2, 3, 5},
                    {9, 3, 2, 1, 5, 7, 4, 6, 8},
                    {4, 8, 5, 2, 6, 3, 1, 7, 9},
                    {1, 9, 7, 6, 3, 4, 5, 8, 2},
                    {6, 2, 8, 7, 1, 5, 9, 4, 3},
                    {5, 4, 3, 9, 8, 2, 6, 1, 7},
                    {3, 7, 4, 5, 2, 6, 8, 9, 1},
                    {2, 1, 9, 4, 7, 8, 3, 5, 6},
                    {8, 5, 6, 3, 9, 1, 7, 2, 4}
            }
    };
    public int hardBoard[][][]={
            {
                    {9, 0, 0, 0, 0, 0, 8, 0, 0},
                    {0, 5, 0, 0, 0, 6, 0, 0, 0},
                    {0, 7, 0, 9, 0, 1, 0, 0, 6},
                    {7, 3, 0, 6, 0, 0, 5, 0, 8},
                    {0, 8, 5, 7, 0, 0, 1, 0, 2},
                    {0, 0, 0, 3, 0, 0, 0, 0, 4},
                    {1, 9, 0, 5, 0, 0, 6, 8, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 2, 0, 0, 0, 9, 0, 5}
            },
            {
                    {0, 0, 0, 6, 0, 0, 4, 0, 0},
                    {7, 0, 0, 0, 0, 3, 6, 0, 0},
                    {0, 0, 0, 0, 9, 1, 0, 8, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 5, 0, 1, 8, 0, 0, 0, 3},
                    {0, 0, 0, 3, 0, 6, 0, 4, 5},
                    {0, 4, 0, 2, 0, 0, 0, 6, 0},
                    {9, 0, 3, 0, 0, 0, 0, 0, 0},
                    {0, 2, 0, 0, 0, 0, 1, 0, 0}
            },
            {
                    {2, 0, 0, 3, 0, 0, 0, 0, 0},
                    {8, 0, 4, 0, 6, 2, 0, 0, 3},
                    {0, 1, 3, 8, 0, 0, 2, 0, 0},
                    {0, 0, 0, 0, 2, 0, 3, 9, 0},
                    {5, 0, 7, 0, 0, 0, 6, 2, 1},
                    {0, 3, 2, 0, 0, 6, 0, 0, 0},
                    {0, 2, 0, 0, 0, 9, 1, 4, 0},
                    {6, 0, 1, 2, 5, 0, 8, 0, 9},
                    {0, 0, 0, 0, 0, 1, 0, 0, 2}
            },
            {
                    {0, 2, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 6, 0, 0, 0, 0, 3},
                    {0, 7, 4, 0, 8, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 3, 0, 0, 2},
                    {0, 8, 0, 0, 4, 0, 0, 1, 0},
                    {6, 0, 0, 5, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 0, 7, 8, 0},
                    {5, 0, 0, 0, 0, 9, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 4, 0}
            }
    };
    public int hardBoardSol[][][]={
            {
                    {9, 2, 6, 4, 3, 5, 8, 7, 1},
                    {8, 5, 1, 2, 7, 6, 3, 4, 9},
                    {4, 7, 3, 9, 8, 1, 2, 5, 6},
                    {7, 3, 4, 6, 1, 2, 5, 9, 8},
                    {6, 8, 5, 7, 4, 9, 1, 3, 2},
                    {2, 1, 9, 3, 5, 8, 7, 6, 4},
                    {1, 9, 7, 5, 2, 4, 6, 8, 3},
                    {5, 6, 8, 1, 9, 3, 4, 2, 7},
                    {3, 4, 2, 8, 6, 7, 9, 1, 5}
            },
            {
                    {5,8,1,6,7,2,4,3,9},
                    {7,9,2,8,4,3,6,5,1},
                    {3,6,4,5,9,1,7,8,2},
                    {4,3,8,9,5,7,2,1,6},
                    {2,5,6,1,8,4,9,7,3},
                    {1,7,9,3,2,6,8,4,5},
                    {8,4,5,2,1,9,3,6,7},
                    {9,1,3,7,6,8,5,2,4},
                    {6,2,7,4,3,5,1,9,8}
            },
            {
                    {2,7,6,3,1,4,9,5,8},
                    {8,5,4,9,6,2,7,1,3},
                    {9,1,3,8,7,5,2,6,4},
                    {4,6,8,1,2,7,3,9,5},
                    {5,9,7,4,3,8,6,2,1},
                    {1,3,2,5,9,6,4,8,7},
                    {3,2,5,7,8,9,1,4,6},
                    {6,4,1,2,5,3,8,7,9},
                    {7,8,9,6,4,1,5,3,2}
            },
            {
                    {1,2,6,4,3,7,9,5,8},
                    {8,9,5,6,2,1,4,7,3},
                    {4,5,7,9,8,5,1,2,6},
                    {4,5,7,1,9,3,8,6,2},
                    {9,8,3,2,4,6,5,1,7},
                    {6,1,2,5,7,8,3,9,4},
                    {2,6,9,3,1,4,7,8,5},
                    {5,4,8,7,6,9,2,3,1},
                    {7,3,1,8,5,2,6,4,9}
            }
    };
    public int board[][]=new int[9][9];
    public int sol[][]=new int[9][9];
    public void radioClicked(ActionEvent e){
        if(e.getSource().equals(easy)){
            int randomInd=(int)(Math.random()*easyBoard.length);
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    board[i][j]=easyBoard[randomInd][i][j];
                    sol[i][j]=easyBoardSol[randomInd][i][j];
                }
            }
        }
        else if(e.getSource().equals(medium)){
            int randomInd=(int)(Math.random()*mediumBoard.length);
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    board[i][j]=mediumBoard[randomInd][i][j];
                    sol[i][j]=mediumBoardSol[randomInd][i][j];
                }
            }
        }
        else if(e.getSource().equals(hard)){
            int randomInd=(int)(Math.random()*hardBoard.length);
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    board[i][j]=hardBoard[randomInd][i][j];
                    sol[i][j]=hardBoardSol[randomInd][i][j];
                }
            }
        }
        easy.setDisable(true);
        medium.setDisable(true);
        hard.setDisable(true);
        giveUp.setDisable(false);
        giveUp.setVisible(true);
        playAgain.setDisable(true);
        playAgain.setVisible(false);
        clearBox.setDisable(false);
        inputBox.setDisable(false);

        initialiseButton();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                but[i][j].setText("");
                but[i][j].setStyle("-fx-background-color:white; -fx-border-color:black");
                but[i][j].setDisable(false);
                but[i][j].setDefaultButton(false);
            }
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!=0){
                    but[i][j].setText(Integer.toString(board[i][j]));
                    but[i][j].setStyle("-fx-background-color:yellow; -fx-border-color:black");
                    but[i][j].setDefaultButton(true);
                }
            }
        }
    }

    ActionEvent event=null;
    public void onBoardButtonClicked(ActionEvent e1){
        Button temp=(Button) e1.getSource();
        if(!temp.isDefaultButton()){
            event=e1;
            inputBox.setVisible(true);
            clearBox.setVisible(true);
        }
    }

    public void onInputButtonClicked(ActionEvent e2){
        Button temp=(Button) e2.getSource();
        String str= temp.getText();
        //System.out.println(str);
        if(event!=null){
            String id=((Node)event.getSource()).getId();

            int x= (int)(id.charAt(3))-48;
            int y= (int)(id.charAt(4))-48;
            boolean execute=checkBoard(x,y,(int)str.charAt(0)-48);
            if(execute){
                ((Button)event.getSource()).setText(str);
                board[x][y]=(int)str.charAt(0)-48;
            }
            else{
                //wrongLabel.setVisible(true);
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Lagta he tumhari Najar kamjor he!");
                alert.setContentText("Given Element cannot be added at given position!");
                alert.showAndWait();
            }
            event=null;
            boolean finish=checkWin();
            if(finish){
                //winLabel.setVisible(true);
                for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++){
                        but[i][j].setDisable(true);
                    }
                }
                giveUp.setDisable(true);
                playAgain.setDisable(false);
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Yaha jitne ka kya fayda! IIT wale itne velle h?");
                alert.setContentText("You Won!");
                alert.showAndWait();
            }
        }
        inputBox.setVisible(false);
        clearBox.setVisible(false);
    }
    public void clearButtonClicked(){
        if(event!=null){
            String id=((Node)event.getSource()).getId();
            int x= (int)(id.charAt(3))-48;
            int y= (int)(id.charAt(4))-48;
            ((Button)event.getSource()).setText("");
            board[x][y]=0;
        }
        inputBox.setVisible(false);
        clearBox.setVisible(false);
    }

    public boolean checkBoard(int x, int y, int inp){
        //System.out.println(inp);
        for(int i=0;i<9;i++){
            if(board[x][i]==inp){
                return false;
            }
            if(board[i][y]==inp){
                return false;
            }
        }
        if(x<=2 && x>=0){
            if(y>=0 && y<=2){
                for(int i=0;i<3;i++){
                    if(board[0][i]==inp || board[1][i]==inp || board[2][i]==inp){
                        return false;
                    }
                }
            }
            else if(y>=3 && y<=5){
                for(int i=3;i<6;i++){
                    if(board[0][i]==inp || board[1][i]==inp || board[2][i]==inp){
                        return false;
                    }
                }
            }
            else if(y>=6 && y<=8){
                for(int i=6;i<9;i++){
                    if(board[0][i]==inp || board[1][i]==inp || board[2][i]==inp){
                        return false;
                    }
                }
            }
        }

        else if(x<=5 && x>=3){
            if(y>=0 && y<=2){
                for(int i=0;i<3;i++){
                    if(board[3][i]==inp || board[4][i]==inp || board[5][i]==inp){
                        return false;
                    }
                }
            }
            else if(y>=3 && y<=5){
                for(int i=3;i<6;i++){
                    if(board[3][i]==inp || board[4][i]==inp || board[5][i]==inp){
                        return false;
                    }
                }
            }
            else if(y>=6 && y<=8){
                for(int i=6;i<9;i++){
                    if(board[3][i]==inp || board[4][i]==inp || board[5][i]==inp){
                        return false;
                    }
                }
            }
        }

        else if(x<=8 && x>=6){
            if(y>=0 && y<=2){
                for(int i=0;i<3;i++){
                    if(board[6][i]==inp || board[7][i]==inp || board[8][i]==inp){
                        return false;
                    }
                }
            }
            else if(y>=3 && y<=5){
                for(int i=3;i<6;i++){
                    if(board[6][i]==inp || board[7][i]==inp || board[8][i]==inp){
                        return false;
                    }
                }
            }
            else if(y>=6 && y<=8){
                for(int i=6;i<9;i++){
                    if(board[6][i]==inp || board[7][i]==inp || board[8][i]==inp){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkWin(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }


    public void GiveUp(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                but[i][j].setText(Integer.toString(sol[i][j]));
                but[i][j].setDisable(true);
            }
        }
        clearBox.setVisible(false);
        clearBox.setDisable(true);
        inputBox.setVisible(false);
        clearBox.setDisable(true);
        playAgain.setDisable(false);
        playAgain.setVisible(true);
    }

    public void playAgain(){
        easy.setDisable(false);
        easy.setSelected(false);
        medium.setDisable(false);
        medium.setSelected(false);
        hard.setDisable(false);
        hard.setSelected(false);
        giveUp.setDisable(true);
    }
}