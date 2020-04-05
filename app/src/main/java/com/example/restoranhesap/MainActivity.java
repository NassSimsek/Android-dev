package com.example.restoranhesap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ArrayList<String> sec= new ArrayList<>();
    ArrayList<String> yedek= new ArrayList<>();
String s;

    Spinner spin;
    Button btnekle;
    TextView text,textsonuc;
    TextView textsiparis;
    int b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnekle=findViewById(R.id.eklebuton);
        text=findViewById(R.id.txt);//adet fiyatın yazılı olduğu
        textsonuc=findViewById(R.id.textView);
        textsiparis=findViewById(R.id.text2);

        spin=findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { //spinnerin seçilebilir olduğunu tanımlamak içiç yazıldı
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0:


                        text.setText("2");
                        s="cay";
                      // sec.add("cay");
                        break;

                    case 1:


                        text.setText("5");
                        s="türk kahvesi";
                     //  sec.add("Türk Kahvesi"); tek seferliğine yazıyor kendisini tekrar etmiyor durum değişmediği sürece o yüzden yapmadın
                        break;

                    case 2:


                        text.setText("3");
                        s="nescafe";
                      // sec.add("Nescafe");
                        break;

                    case 3:


                        text.setText("4");
                        s="soda";
                    //   sec.add("Soda");
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                //hiç bir şey seçilmedğinde hiçbir sey yapmıyoruz
            }
        });

        btnekle.setOnClickListener(new View.OnClickListener() { //BUTONA basıldığında
            @Override
            public void onClick(View v) { //butona her basışımızda

                int a;
                a=Integer.parseInt(text.getText().toString());
                ArrayList<String> n=  new ArrayList<>();
                b=b+a;


                sec.add(s);






                textsonuc.setText("toplam"+b);
                textsiparis.setText( sec.toString());
            }
        });
        btnekle.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "hesabınız :" +b +"TL dir",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
}
