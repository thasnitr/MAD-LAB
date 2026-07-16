package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float mvalone,mvaltwo;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText result=findViewById(R.id.edt1);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn10 = findViewById(R.id.btn10);
        Button btn11= findViewById(R.id.btn11);
        Button btn12= findViewById(R.id.btn12);
        Button btn13= findViewById(R.id.btn13);
        Button btn14 = findViewById(R.id.btn14);
        Button btn15 = findViewById(R.id.btn15);
        Button btn16= findViewById(R.id.btn16);
        Button btn17= findViewById(R.id.btn17);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });
      btn14.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              result.setText(result.getText()+"0");
          }
      });
      btn15.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              result.setText("");
          }
      });
      btn4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (result==null)
              {
                  result.setText("");
              }
              else
              {
                  mvalone=Float.parseFloat((result.getText()+" "));
                  add=true;
                  result.setText(null);
              }
          }
      });
      btn8.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (result==null)
              {
                  result.setText("");
              }
              else {
                  mvalone=Float.parseFloat((result.getText()+" "));
                  sub=true;
                  result.setText(null);
              }
          }
      });
      btn12.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (result==null)
              {
                  result.setText("");
              }
              else {
                  mvalone=Float.parseFloat((result.getText()+" "));
                  div=true;
                  result.setText(null);
              }
          }
      });
      btn16.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (result==null)
              {
                  result.setText("");
              }
              else
              {
                  mvalone=Float.parseFloat((result.getText()+" "));
                  mul=true;
                  result.setText(null);
              }
          }
      });
      btn17.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              mvaltwo=Float.parseFloat(result.getText().toString());
              if (add=true)
              {
                  result.setText(mvalone+mvaltwo+ " ");
                  add=false;
              }
              if (sub==true)
              {
                  result.setText(mvalone-mvaltwo+" ");
                  sub=false;
              }
              if (mul==true)
              {
                  result.setText(mvalone*mvaltwo+" ");
                  mul=false;
              }
              if (div==true)
              {
                  result.setText(mvalone/mvaltwo+" ");
                  div=false;
              }
          }
      });

    }
}