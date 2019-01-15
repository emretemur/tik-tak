package com.example.cookie.tiktak;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button button, button2, button3, button4, button5, button6, button7, button8, button9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        turn = 1;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button.getText().toString().equals("") && turn == 1) {
                    turn = 2;
                    button.setText("X");
                    button.setBackgroundColor(Color.GREEN);
                }
                if (button2.getText().toString().equals("") && turn == 2) {
                    button2.setText("O");
                    button2.setBackgroundColor(Color.BLUE);
                    turn = 1;
                }
                 /* else if (button3.getText().toString().equals("") && turn==2){
                    button3.setText("O");
                    button3.setBackgroundColor(Color.BLUE); turn=1;
                }*/

                fGame();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equals("") && turn == 1) {

                    button2.setText("X");
                    button2.setBackgroundColor(Color.GREEN);
                    turn = 2;
                }
                if (button.getText().toString().equals("") && turn == 2) {
                    button.setText("O");
                    button.setBackgroundColor(Color.BLUE);
                    turn = 1;
                }


                fGame();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().toString().equals("") && turn == 1) {

                    turn = 2;
                    button3.setText("X");
                    button3.setBackgroundColor(Color.GREEN);
                    if (button4.getText().toString().equals("") && turn == 2) {
                        turn = 1;
                        button4.setText("O");
                        button4.setBackgroundColor(Color.BLUE);
                    }
                }
                fGame();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().toString().equals("") && turn == 1) {

                    button4.setText("X");
                    button4.setBackgroundColor(Color.GREEN);
                    turn = 2;
                }
                if (button5.getText().toString().equals("") && turn == 2) {
                    turn = 1;
                    button4.setText("O");
                    button4.setBackgroundColor(Color.BLUE);
                }
            fGame();
        }
    });
        button5.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View v){
        if (button5.getText().toString().equals("") && turn == 1) {
                turn = 2;
                button5.setText("X");
                button5.setBackgroundColor(Color.GREEN);
         if (button7.getText().toString().equals("") &&turn == 2) {
                turn = 1;
                button7.setText("O");
                button7.setBackgroundColor(Color.BLUE);
            }
        }
        fGame();
    }
    });
        button6.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (button6.getText().toString().equals("") && turn==1) {

                turn = 2;
                button6.setText("X");
                button6.setBackgroundColor(Color.GREEN);
                if (button8.getText().toString().equals("") &&turn == 2) {
                turn = 1;
                button8.setText("O");
                button8.setBackgroundColor(Color.BLUE);
            }
        }
        fGame();
    }
    });
        button7.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (button7.getText().toString().equals("")) {
            if (turn == 1) {
                turn = 2;
                button7.setText("X");
                button7.setBackgroundColor(Color.GREEN);
            } else if (turn == 2) {
                turn = 1;
                button7.setText("O");
                button7.setBackgroundColor(Color.BLUE);
            }
        }
        fGame();
    }
    });
        button8.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (button8.getText().toString().equals("")) {
            if (turn == 1) {
                turn = 2;
                button8.setText("X");
                button8.setBackgroundColor(Color.GREEN);
            } else if (turn == 2) {
                turn = 1;
                button8.setText("O");
                button8.setBackgroundColor(Color.BLUE);
            }
        }
        fGame();
    }

    });

        button9.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (button9.getText().toString().equals("")) {
            if (turn == 1) {
                turn = 2;
                button9.setText("X");
                button9.setBackgroundColor(Color.GREEN);
            } else if (turn == 2) {
                turn = 1;
                button9.setText("O");
                button9.setBackgroundColor(Color.BLUE);
            }
        }
        fGame();
    }
    });
}

    public void fGame() {
        String a, b, c, d, e, g, h, i, f;
        boolean end = false;
        a = button.getText().toString();
        b = button2.getText().toString();
        c = button3.getText().toString();
        d = button4.getText().toString();
        e = button5.getText().toString();
        f = button6.getText().toString();
        g = button7.getText().toString();
        h = button8.getText().toString();
        i = button9.getText().toString();
        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(Main2Activity.this, "Player 1 win", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(Main2Activity.this, "Player 1 win", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(Main2Activity.this, "Player 1 win", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(Main2Activity.this, "Player 1 win", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(Main2Activity.this, "Player 1 win", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(Main2Activity.this, "Player 1 win", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(Main2Activity.this, "Player 1 win", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("X") && e.equals("X") && c.equals("X")) {
            Toast.makeText(Main2Activity.this, "Player 1 win", Toast.LENGTH_LONG).show();
            end = true;
        }


        if (a.equals("O") && b.equals("O") && c.equals("0")) {
            Toast.makeText(Main2Activity.this, "Player 2 win", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(Main2Activity.this, "Player 2 win", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("O") && e.equals("O") && c.equals("O")) {
            Toast.makeText(Main2Activity.this, "Player 2 win", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(Main2Activity.this, "Player 2 win", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(Main2Activity.this, "Player 2 win", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(Main2Activity.this, "Player 2 win", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(Main2Activity.this, "Player 2 win", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(Main2Activity.this, "Player 2 win", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (end) {
            button.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button9.setEnabled(false);
            button8.setEnabled(false);
            button7.setEnabled(false);

        }
    }
}