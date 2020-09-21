/*package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private boolean op=false;
        private double num1=0;
        private int indexn2=0;
        private char currentOp;
        private boolean bra=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);
        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button dot = findViewById(R.id.dot);
        final Button equals = findViewById(R.id.equals);
        final Button add = findViewById(R.id.add);
        final Button sub = findViewById(R.id.sub);
        final Button mul = findViewById(R.id.mul);
        final Button div = findViewById(R.id.div);
        final Button delete =findViewById(R.id.delete);
        final Button clear =findViewById(R.id.clear);
        final Button brackets =findViewById(R.id.brackets);

        final View.OnClickListener calculatorListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id) {
                    case R.id.n0:
                        calculatorScreen.append("0");
                        break;
                    case R.id.n1:
                        calculatorScreen.append("1");
                        break;
                    case R.id.n2:
                        calculatorScreen.append("2");
                        break;
                    case R.id.n3:
                        calculatorScreen.append("3");
                        break;
                    case R.id.n4:
                        calculatorScreen.append("4");
                        break;
                    case R.id.n5:
                        calculatorScreen.append("5");
                        break;
                    case R.id.n6:
                        calculatorScreen.append("6");
                        break;
                    case R.id.n7:
                        calculatorScreen.append("7");
                        break;
                    case R.id.n8:
                        calculatorScreen.append("8");
                        break;
                    case R.id.n9:
                        calculatorScreen.append("9");
                        break;
                    case R.id.dot:
                        calculatorScreen.append(".");
                        break;
                    case R.id.equals:
                        if(op){
                            if (currentOp=='+'){
                                String scrennContent=calculatorScreen.getText().toString();
                                String num2String =scrennContent.substring(indexn2,scrennContent.length());
                                double num2= Double.parseDouble(num2String);
                                num2+=num1;
                                calculatorScreen.setText(String.valueOf(num2));
                            }
                        }
                        break;
                    case R.id.add:
                        String screenContent=calculatorScreen.getText().toString();
                        num1= Double.parseDouble(screenContent);
                        calculatorScreen.append("+");
                        op=true;
                        indexn2=screenContent.length()+1;
                        currentOp ='+';
                        break;
                    case R.id.sub:
                        calculatorScreen.append("-");
                        break;
                    case R.id.mul:
                        calculatorScreen.append("*");
                        break;
                    case R.id.div:
                        calculatorScreen.append("/");
                        break;
                    case R.id.brackets:
                                if(bra){
                                    calculatorScreen.append(calculatorScreen+")");
                                    bra=false;
                                }
                                else{
                                    calculatorScreen.append(calculatorScreen+"(");
                                    bra=true;
                                }
                                break;

                }
            }
        };
        n0.setOnClickListener(calculatorListner);
        n1.setOnClickListener(calculatorListner);
        n2.setOnClickListener(calculatorListner);
        n3.setOnClickListener(calculatorListner);
        n4.setOnClickListener(calculatorListner);
        n5.setOnClickListener(calculatorListner);
        n6.setOnClickListener(calculatorListner);
        n7.setOnClickListener(calculatorListner);
        n8.setOnClickListener(calculatorListner);
        n9.setOnClickListener(calculatorListner);
        dot.setOnClickListener(calculatorListner);
        equals.setOnClickListener(calculatorListner);
        add.setOnClickListener(calculatorListner);
        sub.setOnClickListener(calculatorListner);
        mul.setOnClickListener(calculatorListner);
        div.setOnClickListener(calculatorListner);
        brackets.setOnClickListener(calculatorListner);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayed =calculatorScreen.getText().toString();
                int lenght = displayed.length();
                if (lenght>0){
                    displayed = displayed.substring(0,lenght-1);
                    calculatorScreen.setText(displayed);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText("");
            }
        });
    }
}*/
        /*Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnP,btnadd,btnmul,btndiv,btnsub,btnres,btnc,btnb,btnpoint,btneff;
TextView input,output;
String val;
boolean parenthese=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0=findViewById(R.id.zero);
        btn1=findViewById(R.id.un);
        btn2=findViewById(R.id.deux);
        btn3=findViewById(R.id.trois);
        btn4=findViewById(R.id.quatre);
        btn5=findViewById(R.id.cinq);
        btn6=findViewById(R.id.six);
        btn7=findViewById(R.id.sept);
        btn8=findViewById(R.id.huit);
        btn9=findViewById(R.id.neuf);
        btnP=findViewById(R.id.pour);
        btnadd=findViewById(R.id.plus);
        btnmul=findViewById(R.id.moins);
        btndiv=findViewById(R.id.div);
        btnsub=findViewById(R.id.mul);
        btnres=findViewById(R.id.egale);
        btnc=findViewById(R.id.c);
        btnb=findViewById(R.id.par);
        btnpoint=findViewById(R.id.point);
        btneff=findViewById(R.id.R);
        output=findViewById(R.id.output);
        input=findViewById(R.id.input);



        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"9");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +".");
            }
        });
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"%");
            }
        });
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(parenthese){
               val=input.getText().toString();
               input.setText(val+")");
               parenthese=false;
             }
             else{
                 val=input.getText().toString();
                 input.setText(val+"(");
                 parenthese=true;
             }

            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"+");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"*");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"/");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=input.getText().toString();
                input.setText(val +"-");
            }
        });

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               val=input.getText().toString();
               val=val.replaceAll()
            }
        });



*/
package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import javax.script.ScriptException;
import  javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;


public class MainActivity extends AppCompatActivity {

    Button zero,un,deux,trois,quatre,cinq,six,sept,huit,neuf,ac,egale,plus,moin,mul,div,par1,par2,cos,sin,tang,racine,virgule,effacer;
    TextView afficheur;
    int indice;
    boolean existe,par=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList <String> affichage= new ArrayList<String>();
        final ArrayList <String> calcul= new ArrayList<String>();


        zero=(Button)findViewById(R.id.n0);
        un=(Button)findViewById(R.id.n1);
        deux=(Button)findViewById(R.id.n2);
        trois=(Button)findViewById(R.id.n3);
        quatre=(Button)findViewById(R.id.n4);
        cinq=(Button)findViewById(R.id.n5);
        six=(Button)findViewById(R.id.n6);
        sept=(Button)findViewById(R.id.n7);
        huit=(Button)findViewById(R.id.n8);
        neuf=(Button)findViewById(R.id.n9);
        ac=(Button)findViewById(R.id.clear);
        egale=(Button)findViewById(R.id.equals);
        plus=(Button)findViewById(R.id.add);
        moin=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        par1=(Button)findViewById(R.id.brackets);
        cos=(Button)findViewById(R.id.cos);
        sin=(Button)findViewById(R.id.sin);
        tang=(Button)findViewById(R.id.tan);
        racine=(Button)findViewById(R.id.racine);
        virgule=(Button)findViewById(R.id.dot);
        effacer=(Button)findViewById(R.id.delete);
///

        afficheur=(TextView)findViewById(R.id.calculatorScreen);

        indice=-1;


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                affichage.add("0");
                calcul.add("0");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("1");
                calcul.add("1");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("2");
                calcul.add("2");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("3");
                calcul.add("3");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("4");
                calcul.add("4");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        cinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("5");
                calcul.add("5");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("6");
                calcul.add("6");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("7");
                calcul.add("7");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        huit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("8");
                calcul.add("8");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        neuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("9");
                calcul.add("9");
                indice++;

                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                existe=true;
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.clear();
                calcul.clear();
                indice=-1;
                afficheur.setText(null);
            }
        });

        virgule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(existe)
                {affichage.add(".");
                    calcul.add(".");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        racine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("sqrt(");
                calcul.add("Math.sqrt(");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice).toString());
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(existe)
                {affichage.add("+");
                    calcul.add("+");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        moin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("-");
                    calcul.add("-");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(existe)
                {affichage.add("X");
                    calcul.add("*");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  if (existe){
                   affichage.add("/");
                    calcul.add("/");
                    indice++;
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());}
                else
                    afficheur.setText(null);
            }
        });

        par1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (par){
                    affichage.add(")");
                    calcul.add(")");
                    indice++;
                    if(afficheur.getText().equals(null))
                        afficheur.setText(affichage.get(indice).toString());
                    else
                        afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                    par=false;
                    }
                else {
                    affichage.add("(");
                    calcul.add("(");
                    indice++;
                    if(afficheur.getText().equals(null))
                        afficheur.setText(affichage.get(indice).toString());
                    else
                        afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
                    par=true;
                }


            }
        });



        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("cos(");
                calcul.add("Math.cos(");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice));
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("sin(");
                calcul.add("Math.sin(");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice));
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });

        tang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affichage.add("tan(");
                calcul.add("Math.tan(");
                indice++;
                if(afficheur.getText().equals(null))
                    afficheur.setText(affichage.get(indice));
                else
                    afficheur.setText(afficheur.getText()+affichage.get(indice).toString());
            }
        });


        effacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(afficheur.getText().equals(null)==false)
                {
                    affichage.remove(indice);
                    calcul.remove(indice);
                    indice=indice-1;
                    afficheur.setText(null);
                    for(int i=0;i<affichage.size();i++) {
                        if(afficheur.getText().equals(null))
                            afficheur.setText(affichage.get(i).toString());
                        else
                            afficheur.setText(afficheur.getText()+affichage.get(i).toString());
                    }
                }

            }
        });


        egale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();

                for (String s : calcul) {
                    sb.append(s);
                    sb.append("");
                }
                String resultat = sb.toString();




                ScriptEngineManager mgr = new ScriptEngineManager();


                ScriptEngine engine;
                engine= mgr.getEngineByName("js");


                try {
                    if(engine!=null)
                        afficheur.setText(engine.eval(resultat).toString());
                }
                catch (ScriptException e) {
                    Toast.makeText(MainActivity.this, "faux", Toast.LENGTH_SHORT).show();
                }


                existe=false;    }
        });




    }
}