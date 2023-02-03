package com.example.reversi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Pair;
import android.util.Range;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView button1;
    private ImageView button2;
    private ImageView button3;
    private ImageView button4;
    private ImageView button5;
    private ImageView button6;
    private ImageView button7;
    private ImageView button8;
    private ImageView button9;
    private ImageView button10;
    private ImageView button11;
    private ImageView button12;
    private ImageView button13;
    private ImageView button14;
    private ImageView button15;
    private ImageView button16;
    private ImageView button17;
    private ImageView button18;
    private ImageView button19;
    private ImageView button20;
    private ImageView button21;
    private ImageView button22;
    private ImageView button23;
    private ImageView button24;
    private ImageView button25;
    private ImageView button26;
    private ImageView button27;
    private ImageView button28;
    private ImageView button29;
    private ImageView button30;
    private ImageView button31;
    private ImageView button32;
    private ImageView button33;
    private ImageView button34;
    private ImageView button35;
    private ImageView button36;
    private ImageView button37;
    private ImageView button38;
    private ImageView button39;
    private ImageView button40;
    private ImageView button41;
    private ImageView button42;
    private ImageView button43;
    private ImageView button44;
    private ImageView button45;
    private ImageView button46;
    private ImageView button47;
    private ImageView button48;
    private ImageView button49;
    private ImageView button50;
    private ImageView button51;
    private ImageView button52;
    private ImageView button53;
    private ImageView button54;
    private ImageView button55;
    private ImageView button56;
    private ImageView button57;
    private ImageView button58;
    private ImageView button59;
    private ImageView button60;
    private ImageView button61;
    private ImageView button62;
    private ImageView button63;
    private ImageView button64;

    private TableLayout tableLayout;

    private Button button;
    private Integer[][] board;
    public Integer[][] score = new Integer[][] {
        {  500, -150, 30, 10, 10, 30, -150,  500},
        { -150, -250,  0,  0,  0,  0, -250, -150},
        {   30,    0,  1,  2,  2,  1,    0,   30},
        {   10,    0,  2, 16, 16,  2,    0,   30},
        {   10,    0,  2, 16, 16,  2,    0,   30},
        {   30,    0,  1,  2,  2,  1,    0,   30},
        { -150, -250,  0,  0,  0,  0, -250, -150},
        {  500, -150, 30, 10, 10, 30, -150,  500}
    };
    private TextView textView0;
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        board = new Integer[8][8];


        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.imageView1);
        button2 = findViewById(R.id.imageView2);
        button3 = findViewById(R.id.imageView3);
        button4 = findViewById(R.id.imageView4);
        button5 = findViewById(R.id.imageView5);
        button6 = findViewById(R.id.imageView6);
        button7 = findViewById(R.id.imageView7);
        button8 = findViewById(R.id.imageView8);
        button9 = findViewById(R.id.imageView9);
        button10 = findViewById(R.id.imageView10);
        button11 = findViewById(R.id.imageView11);
        button12 = findViewById(R.id.imageView12);
        button13 = findViewById(R.id.imageView13);
        button14 = findViewById(R.id.imageView14);
        button15 = findViewById(R.id.imageView15);
        button16 = findViewById(R.id.imageView16);
        button17 = findViewById(R.id.imageView17);
        button18 = findViewById(R.id.imageView18);
        button19 = findViewById(R.id.imageView19);
        button20 = findViewById(R.id.imageView20);
        button21 = findViewById(R.id.imageView21);
        button22 = findViewById(R.id.imageView22);
        button23 = findViewById(R.id.imageView23);
        button24 = findViewById(R.id.imageView24);
        button25 = findViewById(R.id.imageView25);
        button26 = findViewById(R.id.imageView26);
        button27 = findViewById(R.id.imageView27);
        button28 = findViewById(R.id.imageView28);
        button29 = findViewById(R.id.imageView29);
        button30 = findViewById(R.id.imageView30);
        button31 = findViewById(R.id.imageView31);
        button32 = findViewById(R.id.imageView32);
        button33 = findViewById(R.id.imageView33);
        button34 = findViewById(R.id.imageView34);
        button35 = findViewById(R.id.imageView35);
        button36 = findViewById(R.id.imageView36);
        button37 = findViewById(R.id.imageView37);
        button38 = findViewById(R.id.imageView38);
        button39 = findViewById(R.id.imageView39);
        button40 = findViewById(R.id.imageView40);
        button41 = findViewById(R.id.imageView41);
        button42 = findViewById(R.id.imageView42);
        button43 = findViewById(R.id.imageView43);
        button44 = findViewById(R.id.imageView44);
        button45 = findViewById(R.id.imageView45);
        button46 = findViewById(R.id.imageView46);
        button47 = findViewById(R.id.imageView47);
        button48 = findViewById(R.id.imageView48);
        button49 = findViewById(R.id.imageView49);
        button50 = findViewById(R.id.imageView50);
        button51 = findViewById(R.id.imageView51);
        button52 = findViewById(R.id.imageView52);
        button53 = findViewById(R.id.imageView53);
        button54 = findViewById(R.id.imageView54);
        button55 = findViewById(R.id.imageView55);
        button56 = findViewById(R.id.imageView56);
        button57 = findViewById(R.id.imageView57);
        button58 = findViewById(R.id.imageView58);
        button59 = findViewById(R.id.imageView59);
        button60 = findViewById(R.id.imageView60);
        button61 = findViewById(R.id.imageView61);
        button62 = findViewById(R.id.imageView62);
        button63 = findViewById(R.id.imageView63);
        button64 = findViewById(R.id.imageView64);

        tableLayout = findViewById(R.id.tableLayout);
        textView0 = findViewById(R.id.textView0);

        reset();
        count();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(0,0);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(0,1);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(0,2);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(0,3);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(0,4);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(0,5);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(0,6);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(0,7);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(1,0);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(1,1);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(1,2);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(1,3);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(1,4);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(1,5);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(1,6);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(1,7);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(2,0);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(2,1);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(2,2);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(2,3);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(2,4);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(2,5);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(2,6);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(2,7);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(3,0);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(3,1);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(3,2);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(3,3);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(3,4);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(3,5);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(3,6);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(3,7);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(4,0);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(4,1);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(4,2);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(4,3);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(4,4);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(4,5);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(4,6);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(4,7);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(5,0);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(5,1);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(5,2);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(5,3);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(5,4);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(5,5);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(5,6);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(5,7);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(6,0);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(6,1);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(6,2);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(6,3);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(6,4);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(6,5);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(6,6);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(6,7);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(7,0);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(7,1);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(7,2);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(7,3);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(7,4);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(7,5);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(7,6);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pair <Integer, Integer> pair = new Pair<>(7,7);
                ArrayList x = checkPossibleMoves(2,board);
                ArrayList y = checkPossibleMoves(1,board);
                if (x.size()==0 && y.size()==0) {
                    Integer white = 0;
                    Integer black = 0;
                    for (int i=0; i<8 ; i++) {
                        for (int j=0; j<8; j++) {
                            if(board[i][j]==1) {
                                white++;
                            }
                            if(board[i][j]==2) {
                                black++;
                            }
                        }
                    }
                    if (white==black) {
                        textView0.setText("Remis");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white>black) {
                        textView0.setText("Wygrywa biały");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                    if (white<black) {
                        textView0.setText("Wygrywa czarny");
                        textView0.setVisibility(View.VISIBLE);
                        textView1.setText(black.toString());
                        textView2.setText(white.toString());
                    }
                }
                if (x.contains(pair)==true) {
                    mark(2, pair);
                    markAll(pair, board);
                    y = checkPossibleMoves(1,board);
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Nie możesz tu kliknąć.", Toast.LENGTH_LONG).show();
                }
                if (x.size() == 0 && y.size() > 0) {
                    if (y.size()==0 || returnBestMove(checkPossibleMoves(1, board)).first==-1000) {
                        Toast.makeText(MainActivity.this, "Przeciwnik nie miał ruchów do wykonania", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Pair<Integer, Integer> bestMove = returnBestMove(checkPossibleMoves(1, board));
                        mark(1, bestMove);
                        markAll(bestMove, board);
                    }
                    Toast.makeText(MainActivity.this, "Nie miałeś możliwych ruchów do wykonania", Toast.LENGTH_LONG).show();
                }
                count();
            }
        });

    }

    public void reset() {
        for (int i=0; i<8 ; i++) {
            for (int j=0; j<8; j++) {
                mark(0,new Pair<>(i,j));
            }
        }

        button28.setImageResource(R.drawable.ic_black_circle_foreground);
        board[3][3]=2;
        button29.setImageResource(R.drawable.ic_white_circle_foreground);
        board[3][4]=1;
        button36.setImageResource(R.drawable.ic_white_circle_foreground);
        board[4][3]=1;
        button37.setImageResource(R.drawable.ic_black_circle_foreground);
        board[4][4]=2;
        textView0.setVisibility(View.GONE);
        count();
    }

    public void count() {
        Integer white = 0;
        Integer black = 0;
        for (int i=0; i<8 ; i++) {
            for (int j=0; j<8; j++) {
                if(board[i][j]==1) {
                    white++;
                }
                if(board[i][j]==2) {
                    black++;
                }
            }
        }
        textView1.setText(black.toString());
        textView2.setText(white.toString());
    }

    public ArrayList<Pair<Integer,Integer>> checkPossibleMoves(int player, Integer table[][]) {

        ArrayList arrayList= new ArrayList<Pair<Integer,Integer>>();

        int oponent=3;
        if (player==1) {
            oponent=2;
        }
        if (player==2) {
            oponent=1;
        }

        for (int row=0; row<8; row++) {
            int pom1=0;
            int pom2=0;
            for (int col = 0; col < 8; col++) {
                if (table[row][col]==0 && pom1==1 && pom2==1) {
                    Integer x = row;
                    Integer y = col;
                    Pair pair = new Pair(x,y);
                    arrayList.add(pair);
                }
                if (pom1==1) {
                    if (table[row][col]==oponent) {
                        pom2=1;
                    }
                    if (table[row][col]==0) {
                        pom1=0;
                        pom2=0;
                    }
                }
                if (table[row][col]==player) {
                        pom1=1;
                        pom2=0;
                }
            }

            pom1=0;
            pom2=0;
            for (int col = 7; col >= 0; col--) {
                if (table[row][col]==0 && pom1==1 && pom2==1) {
                    Integer x = row;
                    Integer y = col;
                    Pair pair = new Pair(x,y);
                    arrayList.add(pair);
                }
                if (pom1==1) {
                    if (table[row][col]==oponent) {
                        pom2=1;
                    }
                    if (table[row][col]==0) {
                        pom1=0;
                        pom2=0;
                    }
                }
                if (table[row][col]==player) {
                    pom1=1;
                    pom2=0;
                }
            }
        }

        for (int col=0; col<8; col++) {
            int pom1=0;
            int pom2=0;
            for (int row = 0; row < 8; row++) {
                if (table[row][col]==0 && pom1==1 && pom2==1) {
                    Integer x = row;
                    Integer y = col;
                    Pair pair = new Pair(x,y);
                    arrayList.add(pair);
                }
                if (pom1==1) {
                    if (table[row][col]==oponent) {
                        pom2=1;
                    }
                    if (table[row][col]==0) {
                        pom1=0;
                        pom2=0;
                    }
                }
                if (table[row][col]==player) {
                    pom1=1;
                    pom2=0;
                }
            }

            pom1=0;
            pom2=0;
            for (int row = 7; row >= 0; row--) {
                if (table[row][col]==0 && pom1==1 && pom2==1) {
                    Integer x = row;
                    Integer y = col;
                    Pair pair = new Pair(x,y);
                    arrayList.add(pair);
                }
                if (pom1==1) {
                    if (table[row][col]==oponent) {
                        pom2=1;
                    }
                    if (table[row][col]==0) {
                        pom1=0;
                        pom2=0;
                    }
                }
                if (table[row][col]==player) {
                    pom1=1;
                    pom2=0;
                }
            }

        }


        //Searching diagonal in direction ↙
        int a=8;
        int b=0;
        int row;
        int col;
        for (int pom=0; pom<15; pom++) {
            int pom1=0;
            int pom2=0;
            row=0;
            while (row<a) {
                col=7;
                while (col>=b) {
                   if (pom==row+col) {
                       if (table[row][col]==0 && pom1==1 && pom2==1) {
                           Integer x = row;
                           Integer y = col;
                           Pair pair = new Pair(x,y);
                           arrayList.add(pair);
                           pom1=0;
                           pom2=0;
                       }
                       if (pom1==1) {
                           if (table[row][col]==oponent) {
                               pom2=1;
                           }
                       }
                       if (table[row][col]==player) {
                           pom1=1;
                           pom2=0;
                       }
                   }
                    col--;
                }
                row++;
            }
        }

        //Searching diagonal in direction ↗
        a=0;
        b=8;
        for (int pom=0; pom<15; pom++) {
            int pom1=0;
            int pom2=0;
            row=7;
            while (row>=a) {
                col=0;
                while (col<b) {
                    if (pom==row+col) {
                        if (table[row][col]==0 && pom1==1 && pom2==1) {
                            Integer x = row;
                            Integer y = col;
                            Pair pair = new Pair(x,y);
                            arrayList.add(pair);
                            pom1=0;
                            pom2=0;
                        }
                        if (pom1==1) {
                            if (table[row][col]==oponent) {
                                pom2=1;
                            }
                        }
                        if (table[row][col]==player) {
                            pom1=1;
                            pom2=0;
                        }
                    }
                    col++;
                }
                row--;
            }
        }

        //Searching diagonal in direction ↘
        int z=1;
        while(z<9) {
            int pom1=0;
            int pom2=0;
            row=7-z+1;
            col=0;
            int start=0;
            while (start<z) {
                if (table[row][col]==0 && pom1==1 && pom2==1) {
                    Integer x = row;
                    Integer y = col;
                    Pair pair = new Pair(x,y);
                    arrayList.add(pair);
                    pom1=0;
                    pom2=0;
                }
                if (pom1==1) {
                    if (table[row][col]==oponent) {
                        pom2=1;
                    }
                }
                if (table[row][col]==player) {
                    pom1=1;
                    pom2=0;
                }
                row++;
                col++;
                start++;
            }
            z++;
        }
        z=7;
        while (z>0) {
            int pom1=0;
            int pom2=0;
            row=0;
            col=8-z;
            int start=0;
            while (start<z) {
                if (table[row][col]==0 && pom1==1 && pom2==1) {
                    Integer x = row;
                    Integer y = col;
                    Pair pair = new Pair(x,y);
                    arrayList.add(pair);
                    pom1=0;
                    pom2=0;
                }
                if (pom1==1) {
                    if (table[row][col]==oponent) {
                        pom2=1;
                    }
                }
                if (table[row][col]==player) {
                    pom1=1;
                    pom2=0;
                }
                row++;
                col++;
                start++;
            }
            z--;
        }

        //Searching diagonal in direction ↖
        z=1;
        while (z<8) {
            int pom1=0;
            int pom2=0;
            col=7;
            row=z-1;
            int start=0;
            while (start<z) {
                if (table[row][col]==0 && pom1==1 && pom2==1) {
                    Integer x = row;
                    Integer y = col;
                    Pair pair = new Pair(x,y);
                    arrayList.add(pair);
                    pom1=0;
                    pom2=0;
                }
                if (pom1==1) {
                    if (table[row][col]==oponent) {
                        pom2=1;
                    }
                }
                if (table[row][col]==player) {
                    pom1=1;
                    pom2=0;
                }
                row--;
                col--;
                start++;
            }
            z++;
        }
        z=8;
        while (z>0) {
            int pom1=0;
            int pom2=0;
            row=7;
            col=z-1;
            int start=0;
            while (start<z) {
                if (table[row][col]==0 && pom1==1 && pom2==1) {
                    Integer x = row;
                    Integer y = col;
                    Pair pair = new Pair(x,y);
                    arrayList.add(pair);
                    pom1=0;
                    pom2=0;
                }
                if (pom1==1) {
                    if (table[row][col]==oponent) {
                        pom2=1;
                    }
                }
                if (table[row][col]==player) {
                    pom1=1;
                    pom2=0;
                }
                row--;
                col--;
                start++;
            }
            z--;
        }
        return arrayList;
    }

    public void mark(int player, Pair<Integer, Integer> pair) {

        Integer row=pair.first;
        Integer col=pair.second;

        if (player==2) {
            board[row][col]=2;
            if (row==0 && col==0) {
                button1.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==0 && col==1) {
                button2.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==0 && col==2) {
                button3.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==0 && col==3) {
                button4.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==0 && col==4) {
                button5.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==0 && col==5) {
                button6.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==0 && col==6) {
                button7.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==0 && col==7) {
                button8.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==1 && col==0) {
                button9.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==1 && col==1) {
                button10.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==1 && col==2) {
                button11.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==1 && col==3) {
                button12.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==1 && col==4) {
                button13.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==1 && col==5) {
                button14.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==1 && col==6) {
                button15.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==1 && col==7) {
                button16.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==2 && col==0) {
                button17.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==2 && col==1) {
                button18.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==2 && col==2) {
                button19.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==2 && col==3) {
                button20.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==2 && col==4) {
                button21.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==2 && col==5) {
                button22.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==2 && col==6) {
                button23.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==2 && col==7) {
                button24.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==3 && col==0) {
                button25.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==3 && col==1) {
                button26.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==3 && col==2) {
                button27.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==3 && col==3) {
                button28.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==3 && col==4) {
                button29.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==3 && col==5) {
                button30.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==3 && col==6) {
                button31.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==3 && col==7) {
                button32.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==4 && col==0) {
                button33.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==4 && col==1) {
                button34.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==4 && col==2) {
                button35.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==4 && col==3) {
                button36.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==4 && col==4) {
                button37.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==4 && col==5) {
                button38.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==4 && col==6) {
                button39.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==4 && col==7) {
                button40.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==5 && col==0) {
                button41.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==5 && col==1) {
                button42.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==5 && col==2) {
                button43.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==5 && col==3) {
                button44.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==5 && col==4) {
                button45.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==5 && col==5) {
                button46.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==5 && col==6) {
                button47.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==5 && col==7) {
                button48.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==6 && col==0) {
                button49.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==6 && col==1) {
                button50.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==6 && col==2) {
                button51.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==6 && col==3) {
                button52.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==6 && col==4) {
                button53.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==6 && col==5) {
                button54.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==6 && col==6) {
                button55.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==6 && col==7) {
                button56.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==7 && col==0) {
                button57.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==7 && col==1) {
                button58.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==7 && col==2) {
                button59.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==7 && col==3) {
                button60.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==7 && col==4) {
                button61.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==7 && col==5) {
                button62.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==7 && col==6) {
                button63.setImageResource(R.drawable.ic_black_circle_foreground);
            }
            if (row==7 && col==7) {
                button64.setImageResource(R.drawable.ic_black_circle_foreground);
            }
        }
        if (player==1) {
            board[row][col]=1;
            if (row==0 && col==0) {
                button1.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==0 && col==1) {
                button2.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==0 && col==2) {
                button3.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==0 && col==3) {
                button4.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==0 && col==4) {
                button5.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==0 && col==5) {
                button6.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==0 && col==6) {
                button7.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==0 && col==7) {
                button8.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==1 && col==0) {
                button9.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==1 && col==1) {
                button10.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==1 && col==2) {
                button11.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==1 && col==3) {
                button12.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==1 && col==4) {
                button13.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==1 && col==5) {
                button14.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==1 && col==6) {
                button15.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==1 && col==7) {
                button16.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==2 && col==0) {
                button17.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==2 && col==1) {
                button18.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==2 && col==2) {
                button19.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==2 && col==3) {
                button20.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==2 && col==4) {
                button21.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==2 && col==5) {
                button22.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==2 && col==6) {
                button23.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==2 && col==7) {
                button24.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==3 && col==0) {
                button25.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==3 && col==1) {
                button26.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==3 && col==2) {
                button27.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==3 && col==3) {
                button28.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==3 && col==4) {
                button29.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==3 && col==5) {
                button30.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==3 && col==6) {
                button31.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==3 && col==7) {
                button32.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==4 && col==0) {
                button33.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==4 && col==1) {
                button34.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==4 && col==2) {
                button35.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==4 && col==3) {
                button36.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==4 && col==4) {
                button37.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==4 && col==5) {
                button38.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==4 && col==6) {
                button39.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==4 && col==7) {
                button40.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==5 && col==0) {
                button41.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==5 && col==1) {
                button42.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==5 && col==2) {
                button43.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==5 && col==3) {
                button44.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==5 && col==4) {
                button45.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==5 && col==5) {
                button46.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==5 && col==6) {
                button47.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==5 && col==7) {
                button48.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==6 && col==0) {
                button49.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==6 && col==1) {
                button50.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==6 && col==2) {
                button51.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==6 && col==3) {
                button52.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==6 && col==4) {
                button53.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==6 && col==5) {
                button54.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==6 && col==6) {
                button55.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==6 && col==7) {
                button56.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==7 && col==0) {
                button57.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==7 && col==1) {
                button58.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==7 && col==2) {
                button59.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==7 && col==3) {
                button60.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==7 && col==4) {
                button61.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==7 && col==5) {
                button62.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==7 && col==6) {
                button63.setImageResource(R.drawable.ic_white_circle_foreground);
            }
            if (row==7 && col==7) {
                button64.setImageResource(R.drawable.ic_white_circle_foreground);
            }
        }
        if (player==0) {
            board[row][col]=0;
            if (row==0 && col==0) {
                button1.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==0 && col==1) {
                button2.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==0 && col==2) {
                button3.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==0 && col==3) {
                button4.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==0 && col==4) {
                button5.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==0 && col==5) {
                button6.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==0 && col==6) {
                button7.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==0 && col==7) {
                button8.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==1 && col==0) {
                button9.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==1 && col==1) {
                button10.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==1 && col==2) {
                button11.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==1 && col==3) {
                button12.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==1 && col==4) {
                button13.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==1 && col==5) {
                button14.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==1 && col==6) {
                button15.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==1 && col==7) {
                button16.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==2 && col==0) {
                button17.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==2 && col==1) {
                button18.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==2 && col==2) {
                button19.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==2 && col==3) {
                button20.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==2 && col==4) {
                button21.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==2 && col==5) {
                button22.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==2 && col==6) {
                button23.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==2 && col==7) {
                button24.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==3 && col==0) {
                button25.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==3 && col==1) {
                button26.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==3 && col==2) {
                button27.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==3 && col==3) {
                button28.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==3 && col==4) {
                button29.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==3 && col==5) {
                button30.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==3 && col==6) {
                button31.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==3 && col==7) {
                button32.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==4 && col==0) {
                button33.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==4 && col==1) {
                button34.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==4 && col==2) {
                button35.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==4 && col==3) {
                button36.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==4 && col==4) {
                button37.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==4 && col==5) {
                button38.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==4 && col==6) {
                button39.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==4 && col==7) {
                button40.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==5 && col==0) {
                button41.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==5 && col==1) {
                button42.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==5 && col==2) {
                button43.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==5 && col==3) {
                button44.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==5 && col==4) {
                button45.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==5 && col==5) {
                button46.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==5 && col==6) {
                button47.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==5 && col==7) {
                button48.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==6 && col==0) {
                button49.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==6 && col==1) {
                button50.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==6 && col==2) {
                button51.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==6 && col==3) {
                button52.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==6 && col==4) {
                button53.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==6 && col==5) {
                button54.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==6 && col==6) {
                button55.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==6 && col==7) {
                button56.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==7 && col==0) {
                button57.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==7 && col==1) {
                button58.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==7 && col==2) {
                button59.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==7 && col==3) {
                button60.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==7 && col==4) {
                button61.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==7 && col==5) {
                button62.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==7 && col==6) {
                button63.setImageResource(R.drawable.ic_green_circle_foreground);
            }
            if (row==7 && col==7) {
                button64.setImageResource(R.drawable.ic_green_circle_foreground);
            }
        }
    }

    public Pair<Integer, Integer> returnBestMove(ArrayList<Pair<Integer,Integer>> list) {
        Integer best=-1000;
        Integer bestrow=-1000;
        Integer bestcol=-1000;
        for (int i=0; i<list.size(); i++) {
            Pair<Integer, Integer> pair = list.get(i);
            if (score[pair.first][pair.second]>best) {
                best=score[pair.first][pair.second];
                bestrow = pair.first;
                bestcol = pair.second;
            }
        }
        Pair<Integer, Integer> pair = new Pair<>(bestrow, bestcol);
        return pair;
    }

    public void markAll(Pair <Integer, Integer> pair, Integer[][] matrix) {
        ArrayList <Pair<Integer, Integer>> list1 = new ArrayList<>();
        ArrayList <Pair<Integer, Integer>> list2 = new ArrayList<>();
        int oponent=3;
        int row = pair.first;
        int col = pair.second;
        int player = matrix[row][col];
        if (player==2) {
            oponent = 1;
        }
        if (player == 1) {
            oponent = 2;
        }

        list1.clear();
        for (int i=row; i>=0; i--) {
            if (matrix[i][col]==oponent) {
                Pair <Integer, Integer> pair2= new Pair<>(i,col);
                list1.add(pair2);
            }
            if (matrix[i][col]==player && list1.size()>0) {
                list2.addAll(list1);
                break;
            }
        }

        list1.clear();
        for (int i=row; i<=7; i++) {
            if (matrix[i][col]==oponent) {
                Pair <Integer, Integer> pair2= new Pair<>(i,col);
                list1.add(pair2);
            }
            if (matrix[i][col]==player && list1.size()>0) {
                list2.addAll(list1);
                break;
            }
        }

        list1.clear();
        for (int i=col; i>=0; i--) {
            if (matrix[row][i]==oponent) {
                Pair <Integer, Integer> pair2= new Pair<>(row,i);
                list1.add(pair2);
            }
            if (matrix[row][i]==player && list1.size()>0) {
                list2.addAll(list1);
                break;
            }
        }

        list1.clear();
        for (int i=col; i<=7; i++) {
            if (matrix[row][i]==oponent) {
                Pair <Integer, Integer> pair2= new Pair<>(row,i);
                list1.add(pair2);
            }
            if (matrix[row][i]==player && list1.size()>0) {
                list2.addAll(list1);
                break;
            }
        }

        list1.clear();
        int pom1=row;
        int pom2=col;
        while (pom1<=7 && pom2<=7) {
            if (matrix[pom1][pom2]==oponent) {
                Pair <Integer, Integer> pair2= new Pair<>(pom1, pom2);
                list1.add(pair2);
            }
            if (matrix[pom1][pom2]==player && list1.size()>0) {
                list2.addAll(list1);
                break;
            }
            pom1++;
            pom2++;
        }

        list1.clear();
        pom1=row;
        pom2=col;
        while (pom1>=0 && pom2<=7) {
            if (matrix[pom1][pom2]==oponent) {
                Pair <Integer, Integer> pair2= new Pair<>(pom1, pom2);
                list1.add(pair2);
            }
            if (matrix[pom1][pom2]==player && list1.size()>0) {
                list2.addAll(list1);
                break;
            }
            pom1--;
            pom2++;
        }

        list1.clear();
        pom1=row;
        pom2=col;
        while (pom1<=7 && pom2>=0) {
            if (matrix[pom1][pom2]==oponent) {
                Pair <Integer, Integer> pair2= new Pair<>(pom1, pom2);
                list1.add(pair2);
            }
            if (matrix[pom1][pom2]==player && list1.size()>0) {
                list2.addAll(list1);
                break;
            }
            pom1++;
            pom2--;
        }

        list1.clear();
        pom1=row;
        pom2=col;
        while (pom1>=0 && pom2>=0) {
            if (matrix[pom1][pom2]==oponent) {
                Pair <Integer, Integer> pair2= new Pair<>(pom1, pom2);
                list1.add(pair2);
            }
            if (matrix[pom1][pom2]==player && list1.size()>0) {
                list2.addAll(list1);
                break;
            }
            pom1--;
            pom2--;
        }


        for (int i=0; i<list2.size();i++) {
            mark(player,list2.get(i));
        }
    }

    public void test() {
        for (int i=0; i<8 ; i++) {
            for (int j=0; j<8; j++) {
                board[i][j]=0;
            }
        }


        button24.setImageResource(R.drawable.ic_black_circle_foreground);
        board[2][7]=2;
        button31.setImageResource(R.drawable.ic_black_circle_foreground);
        board[3][6]=2;
        button38.setImageResource(R.drawable.ic_black_circle_foreground);
        board[4][5]=2;
        button45.setImageResource(R.drawable.ic_black_circle_foreground);
        board[5][4]=2;
        button52.setImageResource(R.drawable.ic_black_circle_foreground);
        board[6][3]=2;
        button59.setImageResource(R.drawable.ic_black_circle_foreground);
        board[7][2]=2;




        button15.setImageResource(R.drawable.ic_white_circle_foreground);
        board[1][6]=1;
        button22.setImageResource(R.drawable.ic_white_circle_foreground);
        board[2][5]=1;
        button29.setImageResource(R.drawable.ic_white_circle_foreground);
        board[3][4]=1;
        button36.setImageResource(R.drawable.ic_white_circle_foreground);
        board[4][3]=1;
        button43.setImageResource(R.drawable.ic_white_circle_foreground);
        board[5][2]=1;
        button50.setImageResource(R.drawable.ic_white_circle_foreground);
        board[6][1]=1;

    }

    public void test2() {
        for (int i=0; i<8 ; i++) {
            for (int j=0; j<8; j++) {
                board[i][j]=0;
            }
        }

        button17.setImageResource(R.drawable.ic_black_circle_foreground);
        board[2][0]=2;
        button21.setImageResource(R.drawable.ic_white_circle_foreground);
        board[2][4]=1;
        button49.setImageResource(R.drawable.ic_black_circle_foreground);
        board[6][0]=2;
        button53.setImageResource(R.drawable.ic_black_circle_foreground);
        board[6][4]=2;


        button33.setImageResource(R.drawable.ic_black_circle_foreground);
        board[4][0]=2;
        button34.setImageResource(R.drawable.ic_white_circle_foreground);
        board[4][1]=1;
        button36.setImageResource(R.drawable.ic_white_circle_foreground);
        board[4][3]=1;
        button37.setImageResource(R.drawable.ic_black_circle_foreground);
        board[4][4]=2;

        button26.setImageResource(R.drawable.ic_white_circle_foreground);
        board[3][1]=1;
        button28.setImageResource(R.drawable.ic_white_circle_foreground);
        board[3][3]=1;
        button42.setImageResource(R.drawable.ic_white_circle_foreground);
        board[5][1]=1;
        button44.setImageResource(R.drawable.ic_white_circle_foreground);
        board[5][3]=1;
        button14.setImageResource(R.drawable.ic_black_circle_foreground);
        board[1][5]=2;


    }

    public void test3() {
        for (int i=0; i<8 ; i++) {
            for (int j=0; j<8; j++) {
                board[i][j]=0;
            }
        }


        button15.setImageResource(R.drawable.ic_black_circle_foreground);
        board[1][6]=2;
        button36.setImageResource(R.drawable.ic_black_circle_foreground);
        board[4][3]=2;




        button43.setImageResource(R.drawable.ic_white_circle_foreground);
        board[5][2]=1;
        button22.setImageResource(R.drawable.ic_white_circle_foreground);
        board[2][5]=1;



    }
}