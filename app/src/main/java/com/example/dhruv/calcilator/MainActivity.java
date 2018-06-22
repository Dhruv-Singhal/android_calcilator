package com.example.dhruv.calcilator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button b,b2,b3,b4,b5,b6,b7,b8,b9,b0,beq,bp,bmi,bac,bmu,bdi,bcl,bmrc,bmp,bmm;
    TextView tv1;
    long var1=0,var=0,var2=0,var3=0;
    String s;
    int flag=0;
    char c='=';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button5);
        b4=findViewById(R.id.button4);
        b2=findViewById(R.id.button11);
        b0=findViewById(R.id.button);
        b3=findViewById(R.id.button14);
        b5=findViewById(R.id.button8);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button2);
        b8=findViewById(R.id.button7);
        b9=findViewById(R.id.button10);
        bmi=findViewById(R.id.button15);
        beq=findViewById(R.id.button12);
        bp=findViewById(R.id.button9);
        bac=findViewById(R.id.button3);
        bmu=findViewById(R.id.button13);
        bdi=findViewById(R.id.button16);
        bcl=findViewById(R.id.button17);
        tv1=findViewById(R.id.tv1);
        bmrc=findViewById(R.id.button20);
        bmp=findViewById(R.id.button19);
        bmm=findViewById(R.id.button21);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1;
                tv1.setText(String.valueOf(var1));

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1+1;
                tv1.setText(String.valueOf(var1));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1+2;
                tv1.setText(String.valueOf(var1));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1+3;
                tv1.setText(String.valueOf(var1));


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1+4;
                tv1.setText(String.valueOf(var1));

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1+5;
                tv1.setText(String.valueOf(var1));

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1+6;
                tv1.setText(String.valueOf(var1));

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1+7;
                tv1.setText(String.valueOf(var1));

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1+8;
                tv1.setText(String.valueOf(var1));

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=10*var1+9;
                tv1.setText(String.valueOf(var1));

            }

        });
        bmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    var3=var3+var;

                var=0;
                flag=0;

                tv1.setText(String.valueOf(var));






            }
        });



        bmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    var3=var3-var;


                var=0;
                flag=0;

                tv1.setText(String.valueOf(var));







            }
        });



        bmrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                tv1.setText(String.valueOf(var3));
                var=var3;
                var3=0;
                flag=0;




            }
        });

        bcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                var2= Integer.valueOf(tv1.getText().toString());
                if(var2==var1) {
                    var1 = var1 / 10;
                    tv1.setText(String.valueOf(var1));
                }

                else if(var2==var||var2==var3)
                {
                    var=0;
                    var1=0;
                    flag=0;
                    tv1.setText(String.valueOf(var1));
                }
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (var1==0)
                {
                    c='+';
                }
                switch(c)
                {
                    case '+':var=var+var1;break;
                    case '-':var=var-var1;break;
                    case '/': var =var/var1;
                              break;
                    case'*' :var= var*var1 ;
                             break;
                    default: var=0;}
                if (flag==0||(c=='='&&var==0))
                {
                    var=var+var1;
                }
                flag++;
                c='+';
                var1=0;
                tv1.setText(String.valueOf(var1));


            }

        });
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (var1==0)
                {
                    c='+';
                }
                switch(c)
                {
                    case '+':var=var+var1;break;
                    case '-':var=var-var1;break;
                    case '/': var =var/var1;
                        break;
                    case'*' :var= var*var1 ;
                        break;
                    default: var=0;}
                c='-';
                if (flag==0||(c=='='&&var==0))
                {
                    var=var1;
                }
                flag++;


                var1=0;
                tv1.setText(String.valueOf(var1));


            }

        });
        bmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var1==0)
                {
                    c='+';
                }
                switch(c)
                {
                    case '+':var=var+var1;break;
                    case '-':var=var-var1;break;
                    case '/': var =var/var1;
                        break;
                    case'*' :var= var*var1 ;
                        break;
                    default: var=0;}
                c='*';
                if (flag==0||(c=='='&&var==0))
                {
                    var=var1;
                }
                flag++;
                var1=0;
                tv1.setText(String.valueOf(var1));

            }

        });
        bdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (var1==0)
                {
                    c='+';
                }
                switch(c)
                {
                    case '+':var=var+var1;break;
                    case '-':var=var-var1;break;
                    case '/': var =var/var1;
                    break;
                    case'*' :var= var*var1 ;
                    break;
                    default: var=0;}
                        c='/';
                if (flag==0||(c=='='&&var==0))
                {
                    var=var1;
                }
                flag++;
                    var1=0;
                tv1.setText(String.valueOf(var1));

                }

        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var=0;
                var1=0;
                flag=0;
                var3=0;
                c=0;

                tv1.setText(String.valueOf(var1));

            }

        });

        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(c)
                {
                    case '+':var=var+var1;break;
                    case '-':var=var-var1;break;
                    case '/': var =var/var1;
                              break;
                    case'*' :var= var*var1 ;
                              break;
                    default: var=0;}
                tv1.setText(String.valueOf(var));
                var1=0;

                c='=';





            }


        });








    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
