package com.example.nirmalkotiyal.tictactoe;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button[] = new Button[10];
    TextView t;
    String tag = "Dekhle";
    int count = 1;
    boolean anyone_won = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playermove();
    }

    void playermove() {
        button[1] = findViewById(R.id.button1);
        button[2] = findViewById(R.id.button2);
        button[3] = findViewById(R.id.button3);
        button[4] = findViewById(R.id.button4);
        button[5] = findViewById(R.id.button5);
        button[6] = findViewById(R.id.button6);
        button[7] = findViewById(R.id.button7);
        button[8] = findViewById(R.id.button8);
        button[9] = findViewById(R.id.button9);

        t = findViewById(R.id.textView);
        button[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0) {        //Count is used to check which player turn is it to play Like player one have 5 turns {1,3,5,7,9} and player 2 has {2,4,6,8}
                    t.setText("Player 1 Turn!!!");
                    if (button[1].isClickable() == true) {
                        button[1].setText("O");
                        button[1].setClickable(false);
                        count++;
                        result();
                    }
                } else {
                    t.setText("Player 2 Turn!!!");
                    if (button[1].isClickable() == true) {
                        button[1].setText("X");
                        button[1].setClickable(false);
                        count++;
                        result();
                    }
                }
            }
        });
        button[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0) {
                    t.setText("Player 1 Turn!!!");
                    if (button[2].isClickable() == true) {
                        button[2].setText("O");
                        button[2].setClickable(false);
                        count++;
                        result();
                    }
                } else {
                    t.setText("Player 2 Turn!!!");
                    if (button[2].isClickable() == true) {
                        button[2].setText("X");
                        button[2].setClickable(false);
                        count++;
                        result();
                    }
                }
            }
        });
        button[3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (count % 2 == 0) {
                    t.setText("Player 1 Turn!!!");
                    if (button[3].isClickable() == true) {
                        button[3].setText("O");
                        button[3].setClickable(false);
                        count++;
                        result();
                    }
                } else {
                    t.setText("Player 2 Turn!!!");
                    if (button[3].isClickable() == true) {
                        button[3].setText("X");
                        button[3].setClickable(false);
                        count++;
                        result();
                    }
                }
            }
        });
        button[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0) {
                    t.setText("Player 1 Turn!!!");
                    if (button[4].isClickable() == true) {
                        button[4].setText("O");
                        button[4].setClickable(false);
                        count++;
                        result();
                    }
                } else {
                    t.setText("Player 2 Turn!!!");
                    if (button[4].isClickable() == true) {
                        button[4].setText("X");
                        button[4].setClickable(false);
                        count++;
                        result();
                    }
                }
            }
        });
        button[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0) {
                    t.setText("Player 1 Turn!!!");
                    if (button[5].isClickable() == true) {
                        button[5].setText("O");
                        button[5].setClickable(false);
                        count++;
                        result();
                    }
                } else {
                    t.setText("Player 2 Turn!!!");
                    if (button[5].isClickable() == true) {
                        button[5].setText("X");
                        button[5].setClickable(false);
                        count++;
                        result();
                    }
                }
            }
        });
        button[6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (count % 2 == 0) {
                    t.setText("Player 1 Turn!!!");
                    if (button[6].isClickable() == true) {
                        button[6].setText("O");
                        button[6].setClickable(false);
                        count++;
                        result();
                    }
                } else {
                    t.setText("Player 2 Turn!!!");
                    if (button[6].isClickable() == true) {
                        button[6].setText("X");
                        button[6].setClickable(false);
                        count++;
                        result();
                    }
                }
            }
        });
        button[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0) {
                    t.setText("Player 1 Turn!!!");
                    if (button[7].isClickable() == true) {
                        button[7].setText("O");
                        button[7].setClickable(false);
                        count++;
                        result();
                    }
                } else {
                    t.setText("Player 2 Turn!!!");
                    if (button[7].isClickable() == true) {
                        button[7].setText("X");
                        button[7].setClickable(false);
                        count++;
                        result();
                    }
                }
            }
        });
        button[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0) {
                    t.setText("Player 1 Turn!!!");
                    if (button[8].isClickable() == true) {
                        button[8].setText("O");
                        button[8].setClickable(false);
                        count++;
                        result();
                    }
                } else {
                    t.setText("Player 2 Turn!!!");
                    if (button[8].isClickable() == true) {
                        button[8].setText("X");
                        button[8].setClickable(false);
                        count++;
                        result();
                    }
                }
            }
        });
        button[9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (count % 2 == 0) {
                    t.setText("Player 1 Turn!!!");
                    if (button[9].isClickable() == true) {
                        button[9].setText("O");
                        button[9].setClickable(false);
                        count++;
                        result();
                    }
                } else {
                    t.setText("Player 2 Turn!!!");
                    if (button[9].isClickable() == true) {
                        button[9].setText("X");
                        button[9].setClickable(false);
                        count++;
                        result();
                    }
                }
            }
        });
    }

    void result() {
        if (count <= 10) {
            if (button[1].getText() == "X" || button[1].getText() == "O" && button[2].getText() == "X" || button[2].getText() == "O") {
                if (button[1].getText() == button[2].getText()) {
                    if (button[2].getText().equals(button[3].getText())) {
                        Button line1 = findViewById(R.id.line1);//This is used to overlap the button with button on the winning moves
                        line1.animate();
                        line1.setVisibility(View.VISIBLE);
                        line1.setClickable(false);
                        if (button[2].getText() == "X") {
                            t.setText("Player One Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player one", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        } else {
                            t.setText("Player two Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player two", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
            if (button[1].getText() == "X" || button[4].getText() == "O" && button[1].getText() == "X" || button[4].getText() == "O") {
                if (button[1].getText().equals(button[4].getText())) {
                    if (button[4].getText().equals(button[7].getText())) {
                        Button line4 = findViewById(R.id.line4);
                        line4.animate();
                        line4.setVisibility(View.VISIBLE);
                        line4.setClickable(false);
                        if (button[4].getText() == "X") {
                            t.setText("Player One Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player one", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        } else {
                            t.setText("Player two Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player two", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
            if (button[1].getText() == "X" || button[1].getText() == "O" && button[5].getText() == "X" || button[5].getText() == "O") {
                Button diag1 = findViewById(R.id.diagonal1);
                if (button[1].getText().equals(button[5].getText())) {
                    if (button[5].getText().equals(button[9].getText())) {
                        if (button[5].getText() == "X") {
                            t.setText("Player One Won");
                            diag1.setVisibility(View.VISIBLE);
                            diag1.animate();
                            diag1.setClickable(false);
                            Toast.makeText(MainActivity.this, "Congratulation Player one", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        } else {
                            t.setText("Player two Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player two", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
            if (button[9].getText() == "X" || button[9].getText() == "O" && button[8].getText() == "X" || button[8].getText() == "O") {
                if (button[9].getText() == button[8].getText()) {
                    if (button[8].getText() == button[7].getText()) {
                        Button line3 = findViewById(R.id.line3);
                        line3.animate();
                        line3.setVisibility(View.VISIBLE);
                        line3.setClickable(false);
                        if (button[8].getText() == "X") {
                            t.setText("Player One Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player one", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        } else {
                            t.setText("Player two Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player two", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
            if (button[9].getText() == "X" || button[9].getText() == "O" && button[6].getText() == "X" || button[6].getText() == "O") {
                if (button[9].getText() == button[6].getText()) {
                    if (button[6].getText() == button[3].getText()) {
                        Button line6 = findViewById(R.id.line6);
                        line6.animate();
                        line6.setVisibility(View.VISIBLE);
                        line6.setClickable(false);
                        if (button[6].getText() == "X") {
                            t.setText("Player One Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player one", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        } else {
                            t.setText("Player two Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player two", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
            if (button[3].getText() == "X" || button[3].getText() == "O" && button[5].getText() == "X" || button[5].getText() == "O") {
                if (button[3].getText() == button[5].getText()) {
                    if (button[5].getText() == button[7].getText()) {
                        Button diag2 = findViewById(R.id.diagonal2);
                        diag2.animate();
                        diag2.setVisibility(View.VISIBLE);
                        diag2.setClickable(false);
                        if (button[5].getText() == "X") {
                            t.setText("Player One Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player one", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        } else {
                            t.setText("Player two Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player two", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                        }
                    }
                }
            }
            if (button[4].getText() == "X" || button[5].getText() == "O" && button[4].getText() == "X" || button[5].getText() == "O") {
                if (button[4].getText() == button[5].getText()) {
                    if (button[5].getText() == button[6].getText()) {
                        Button line2 = findViewById(R.id.line2);
                        line2.animate();
                        line2.setVisibility(View.VISIBLE);
                        line2.setClickable(false);
                        if (button[5].getText() == "X") {
                            t.setText("Player One Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player one", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        } else {
                            t.setText("Player two Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player two", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
            if (button[2].getText() == "X" || button[5].getText() == "O" && button[2].getText() == "X" || button[5].getText() == "O") {
                if (button[2].getText() == button[5].getText()) {
                    if (button[5].getText() == button[8].getText()) {
                        Button line5 = findViewById(R.id.line5);
                        line5.animate();
                        line5.setVisibility(View.VISIBLE);
                        line5.setClickable(false);
                        if (button[5].getText() == "X") {
                            t.setText("Player One Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player one", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        } else {
                            t.setText("Player two Won");
                            Toast.makeText(MainActivity.this, "Congratulation Player two", Toast.LENGTH_LONG).show();
                            anyone_won = true;
                            button[1].setClickable(false);
                            button[2].setClickable(false);
                            button[3].setClickable(false);
                            button[4].setClickable(false);
                            button[5].setClickable(false);
                            button[6].setClickable(false);
                            button[7].setClickable(false);
                            button[8].setClickable(false);
                            button[9].setClickable(false);
                            Toast.makeText(MainActivity.this, "Restart the Game Manually Please", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
            if (anyone_won == false) {
                if (button[1].isClickable() == false && button[2].isClickable() == false && button[3].isClickable() == false && button[4].isClickable() == false && button[5].isClickable() == false && button[6].isClickable() == false && button[7].isClickable() == false && button[8].isClickable() == false && button[9].isClickable() == false) {
                    Toast.makeText(MainActivity.this, "Nobody won", Toast.LENGTH_LONG).show();
                    recreate();
                    Toast.makeText(MainActivity.this, "Game Has been Restarted", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
        public void onclickreset (View view){
            recreate();
            Toast.makeText(MainActivity.this, "Game has been Restarted", Toast.LENGTH_LONG).show();
        }
    }