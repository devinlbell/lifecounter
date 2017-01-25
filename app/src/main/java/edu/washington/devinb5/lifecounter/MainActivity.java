package edu.washington.devinb5.lifecounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button p1Add;
    private Button p1Sub;
    private Button p1Add5;
    private Button p1Sub5;
    private TextView p1Life;
    private int p1LifeCount;

    private Button p2Add;
    private Button p2Sub;
    private Button p2Add5;
    private Button p2Sub5;
    private TextView p2Life;
    private int p2LifeCount;

    private Button p3Add;
    private Button p3Sub;
    private Button p3Add5;
    private Button p3Sub5;
    private TextView p3Life;
    private int p3LifeCount;

    private Button p4Add;
    private Button p4Sub;
    private Button p4Add5;
    private Button p4Sub5;
    private TextView p4Life;
    private int p4LifeCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1Add = (Button) findViewById(R.id.p1Add);
        p1Sub = (Button) findViewById(R.id.p1Sub);
        p1Add5 = (Button) findViewById(R.id.p1Add5);
        p1Sub5 = (Button) findViewById(R.id.p1Sub5);
        p1Life = (TextView) findViewById(R.id.p1Life);
        p1LifeCount =  Integer.parseInt(p1Life.getText().toString());
        p1Add.setOnClickListener(new LifeChangeListener(1));
        p1Add5.setOnClickListener(new LifeChangeListener(5));
        p1Sub.setOnClickListener(new LifeChangeListener(-1));
        p1Sub5.setOnClickListener(new LifeChangeListener(-5));

        p2Add = (Button) findViewById(R.id.p2Add);
        p2Sub = (Button) findViewById(R.id.p2Sub);
        p2Add5 = (Button) findViewById(R.id.p2Add5);
        p2Sub5 = (Button) findViewById(R.id.p2Sub5);
        p2Life = (TextView) findViewById(R.id.p2Life);
        p2LifeCount =  Integer.parseInt(p2Life.getText().toString());
        p2Add.setOnClickListener(new LifeChangeListener(1));
        p2Add5.setOnClickListener(new LifeChangeListener(5));
        p2Sub.setOnClickListener(new LifeChangeListener(-1));
        p2Sub5.setOnClickListener(new LifeChangeListener(-5));

        p3Add = (Button) findViewById(R.id.p3Add);
        p3Sub = (Button) findViewById(R.id.p3Sub);
        p3Add5 = (Button) findViewById(R.id.p3Add5);
        p3Sub5 = (Button) findViewById(R.id.p3Sub5);
        p3Life = (TextView) findViewById(R.id.p3Life);
        p3LifeCount =  Integer.parseInt(p3Life.getText().toString());
        p3Add.setOnClickListener(new LifeChangeListener(1));
        p3Add5.setOnClickListener(new LifeChangeListener(5));
        p3Sub.setOnClickListener(new LifeChangeListener(-1));
        p3Sub5.setOnClickListener(new LifeChangeListener(-5));

        p4Add = (Button) findViewById(R.id.p4Add);
        p4Sub = (Button) findViewById(R.id.p4Sub);
        p4Add5 = (Button) findViewById(R.id.p4Add5);
        p4Sub5 = (Button) findViewById(R.id.p4Sub5);
        p4Life = (TextView) findViewById(R.id.p4Life);
        p4LifeCount =  Integer.parseInt(p4Life.getText().toString());
        p4Add.setOnClickListener(new LifeChangeListener(1));
        p4Add5.setOnClickListener(new LifeChangeListener(5));
        p4Sub.setOnClickListener(new LifeChangeListener(-1));
        p4Sub5.setOnClickListener(new LifeChangeListener(-5));
    }

    public class LifeChangeListener implements View.OnClickListener{
        public int change;

        public LifeChangeListener(int dx) {
            this.change = dx;
        }

        @Override
        public void onClick(View v) {
            TextView game = (TextView) findViewById(R.id.gameOver);
            switch(v.getId()) {
                case R.id.p1Add:
                case R.id.p1Add5:
                case R.id.p1Sub:
                case R.id.p1Sub5:
                    p1LifeCount =  Integer.parseInt(p1Life.getText().toString());
                    p1LifeCount += change;
                    p1Life.setText("" + p1LifeCount);
                    if(p1LifeCount <= 0) {
                        game.setText("You lose Player 1");
                    }
                    break;

                case R.id.p2Add:
                case R.id.p2Add5:
                case R.id.p2Sub:
                case R.id.p2Sub5:
                    p2LifeCount =  Integer.parseInt(p2Life.getText().toString());
                    p2LifeCount += change;
                    p2Life.setText("" + p2LifeCount);
                    if(p2LifeCount <= 0) {
                        game.setText("You lose Player 2");
                    }
                    break;

                case R.id.p3Add:
                case R.id.p3Add5:
                case R.id.p3Sub:
                case R.id.p3Sub5:
                    p3LifeCount =  Integer.parseInt(p3Life.getText().toString());
                    p3LifeCount += change;
                    p3Life.setText("" + p3LifeCount);
                    if(p3LifeCount <= 0) {
                        game.setText("You lose Player 3");
                    }
                    break;

                case R.id.p4Add:
                case R.id.p4Add5:
                case R.id.p4Sub:
                case R.id.p4Sub5:
                    p4LifeCount =  Integer.parseInt(p4Life.getText().toString());
                    p4LifeCount += change;
                    p4Life.setText("" + p4LifeCount);
                    if(p4LifeCount <= 0) {
                        game.setText("You lose Player 4");
                    }
                    break;
            }

        }
    }


}
