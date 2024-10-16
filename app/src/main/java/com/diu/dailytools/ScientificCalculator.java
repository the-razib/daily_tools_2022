package com.diu.dailytools;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScientificCalculator extends AppCompatActivity {
    Button Button_1,Button_2,Button_3,Button_4,Button_5,Button_6,Button_7,Button_8,Button_9,Button_0,Button_dot,
            Button_pi,Button_equal,Button_plus,Button_min,Button_mul,Button_div,Button_inv,Button_sqrt,Button_square,
            Button_fact,Button_ln,Button_log,Button_tan,Button_cos,Button_sin,Button_Button_1,Button_Button_2,Button_c,Button_ac;
    TextView mainPageTextView,secondPageTextView;
    String pi = "3.141529265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);

        Button_1 = findViewById(R.id.b1);
        Button_2 = findViewById(R.id.b2);
        Button_3 = findViewById(R.id.b3);
        Button_4 = findViewById(R.id.b4);
        Button_5 = findViewById(R.id.b5);
        Button_6 = findViewById(R.id.b6);
        Button_7 = findViewById(R.id.b7);
        Button_8 = findViewById(R.id.b8);
        Button_9 = findViewById(R.id.b9);
        Button_0 = findViewById(R.id.b0);
        Button_dot = findViewById(R.id.bdot);
        Button_pi = findViewById(R.id.bpi);
        Button_equal = findViewById(R.id.bequal);
        Button_plus = findViewById(R.id.bplus);
        Button_min = findViewById(R.id.bmin);
        Button_mul = findViewById(R.id.bmul);
        Button_div = findViewById(R.id.bdiv);
        Button_inv = findViewById(R.id.binv);
        Button_sqrt = findViewById(R.id.bsqrt);
        Button_square = findViewById(R.id.bsquare);
        Button_fact = findViewById(R.id.bfact);
        Button_ln = findViewById(R.id.bln);
        Button_log = findViewById(R.id.blog);
        Button_tan = findViewById(R.id.btan);
        Button_cos = findViewById(R.id.bcos);
        Button_sin = findViewById(R.id.bsin);
        Button_Button_1 = findViewById(R.id.bb1);
        Button_Button_2 = findViewById(R.id.bb2);
        Button_c = findViewById(R.id.bc);
        Button_ac = findViewById(R.id.bac);

        mainPageTextView = findViewById(R.id.tvmain);
        secondPageTextView = findViewById(R.id.tvsec);

        Button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"1");
            }
        });

        Button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"1");
            }
        });

        Button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"2");
            }
        });

        Button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"3");
            }
        });
        Button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"4");
            }
        });

        Button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"5");
            }
        });

        Button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"6");
            }
        });

        Button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"7");
            }
        });

        Button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"8");
            }
        });
        Button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"9");
            }
        });
        Button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"0");
            }
        });

        Button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"");
            }
        });

        Button_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText("");
                secondPageTextView.setText("");
            }
        });


        Button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = mainPageTextView.getText().toString();
                val = val.substring(0,val.length() - 1);
                mainPageTextView.setText(val);
            }
        });

        Button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"+");
            }
        });

        Button_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"-");
            }
        });


        Button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"×");
            }
        });

        Button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"÷");
            }
        });

        Button_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = mainPageTextView.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                mainPageTextView.setText(String.valueOf(r));
            }
        });

        Button_Button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"(");
            }
        });

        Button_Button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+")");
            }
        });


        Button_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondPageTextView.setText(Button_pi.getText());
                mainPageTextView.setText(mainPageTextView.getText()+pi);

            }
        });


        Button_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"sin");

            }
        });


        Button_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainPageTextView.setText(mainPageTextView.getText()+"cos");

            }
        });

        Button_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"ln");
            }
        });

        Button_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"log");
            }
        });
        Button_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainPageTextView.setText(mainPageTextView.getText()+"tan");

            }
        });

        Button_inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPageTextView.setText(mainPageTextView.getText()+"^" + "(-1)");

            }
        });

        Button_fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(mainPageTextView.getText().toString());
                int fact = factorial(val);
                mainPageTextView.setText(String.valueOf(fact));
                secondPageTextView.setText(val + "!");


            }
        });



        Button_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(mainPageTextView.getText().toString());
                double square = d*d;
                mainPageTextView.setText(String.valueOf(square));
                secondPageTextView.setText(d+"²");

            }
        });

        Button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = mainPageTextView.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                double result = eval(replacedstr);
                mainPageTextView.setText(String.valueOf(result));
                secondPageTextView.setText(val);
            }
        });

    }

    //custom factorial function
    int factorial(int n){
        return (n==1 || n==0)? 1: n*factorial(n-1);

    }

    //evual function

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}
