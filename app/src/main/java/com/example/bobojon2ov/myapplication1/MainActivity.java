package com.example.bobojon2ov.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub,
            bMul, bDiv, bSqrt, bPoint, bSqr, bDel, bEqual, bClear;
    public static TextView tv;
    public static String s = "";
    public static boolean f = false;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.editText1);
        b0 = (Button) findViewById(R.id.btn0);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        bAdd = (Button) findViewById(R.id.btnAdd);
        bSub = (Button) findViewById(R.id.btnSub);
        bMul = (Button) findViewById(R.id.btnMul);
        bDiv = (Button) findViewById(R.id.btnDiv);
        bSqrt = (Button) findViewById(R.id.btnSqrt);
        bSqr = (Button) findViewById(R.id.btnSqr);
        bPoint = (Button) findViewById(R.id.btnPoint);
        bDel = (Button) findViewById(R.id.btnDel);
        bEqual = (Button) findViewById(R.id.btnEqual);
        bClear = (Button) findViewById(R.id.btnClear);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "0";
                tv.setText(s);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "1";
                tv.setText(s);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "2";
                tv.setText(s);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "3";
                tv.setText(s);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "4";
                tv.setText(s);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "5";
                tv.setText(s);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "6";
                tv.setText(s);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "7";
                tv.setText(s);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "8";
                tv.setText(s);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s += "9";
                tv.setText(s);
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cutS();
                s += "+";
                tv.setText(s);
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cutS();
                s += "-";
                tv.setText(s);
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cutS();
                s += "*";
                tv.setText(s);
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cutS();
                s += "/";
                tv.setText(s);
            }
        });
        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.length() > 0) {
                    s = s.substring(0, s.length() - 1);
                    tv.setText(s);
                }
            }
        });
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = "";
                tv.setText(s);
            }
        });
        bPoint.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (s.length() == 0)
                    s += "0.";
                else if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-'
                        || s.charAt(s.length() - 1) == '/' || s.charAt(s.length() - 1) == '*') {
                    s += "0.";
                } else
                    s += ".";
                tv.setText(s);
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int ind_Add = s.indexOf("+");
                int ind_Sub = s.indexOf("-");
                int ind_Mul = s.indexOf("*");
                int ind_Div = s.indexOf("/");
                if (ind_Add > 0 && ind_Sub < 0 && ind_Mul < 0 && ind_Div < 0) {
                    try {
                        double val1 = Double.parseDouble(s.substring(0, ind_Add));
                        double val2 = Double.parseDouble(s.substring(ind_Add + 1, s.length()));
                        s = val1 + val2 + "";
                        if (val1 + val2 == (long)(val1 + val2))
                            s = s.substring(0, s.indexOf("."));
                    } catch (Exception e) {

                    }

                }
                if (ind_Add < 0 && ind_Sub > 0 && ind_Mul < 0 && ind_Div < 0) {
                    try {
                        double val1 = Double.parseDouble(s.substring(0, ind_Sub));
                        double val2 = Double.parseDouble(s.substring(ind_Sub + 1, s.length()));
                        s = val1 - val2 + "";
                        if (val1 - val2 == (long)(val1 - val2))
                            s = s.substring(0, s.indexOf("."));
                    } catch (Exception e) {

                    }

                }
                if (ind_Add < 0 && ind_Sub < 0 && ind_Mul > 0 && ind_Div < 0) {
                    try {
                        double val1 = Double.parseDouble(s.substring(0, ind_Mul));
                        double val2 = Double.parseDouble(s.substring(ind_Mul + 1, s.length()));
                        s = val1 * val2 + "";
                        if (val1 * val2 == (long)(val1 * val2))
                            s = s.substring(0, s.indexOf("."));
                    } catch (Exception e) {

                    }
                }
                if (ind_Add < 0 && ind_Sub < 0 && ind_Mul < 0 && ind_Div > 0) {
                    try {
                        double val1 = Double.parseDouble(s.substring(0, ind_Div));
                        double val2 = Double.parseDouble(s.substring(ind_Div + 1, s.length()));
                        double p = val1 / val2;
                        s = p + "";
                        if ((long) p == p)
                            s = s.substring(0, s.indexOf("."));
                    } catch (Exception e) {

                    }
                }
                tv.setText(s);
            }
        });
        bSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.length() != 0) {
                    try {
                        double q = Double.parseDouble(s);
                        double e = Math.sqrt(q);
                        s = e + "";
                        long w = (long) e;
                        if(w * w == q)
                            s = s.substring(0,s.indexOf("."));
                    } catch (Exception e) {
                    }
                }
                tv.setText(s);
            }
        });
        bSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.length() != 0) {
                    try {
                        double q = Double.parseDouble(s);
                        double e = q * q;
                        s = e + "";
                        long w = (long) e;
                        if(w == e)
                            s = s.substring(0,s.indexOf("."));
                    } catch (Exception e) {

                    }
                }
                tv.setText(s);
            }
        });
    }

    public static void cutS() {
        if (s.length() > 0) {
            if (s.charAt(s.length() - 1) == '-' || s.charAt(s.length() - 1) == '*'
                    || s.charAt(s.length() - 1) == '/' || s.charAt(s.length() - 1) == '+') {
                s = s.substring(0, s.length() - 1);
            }
        }
    }
}

