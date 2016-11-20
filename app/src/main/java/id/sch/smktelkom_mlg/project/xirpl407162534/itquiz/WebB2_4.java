package id.sch.smktelkom_mlg.project.xirpl407162534.itquiz;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class WebB2_4 extends Activity implements View.OnClickListener, View.OnTouchListener {

    Button btnA, btnB, btnC, btnD;
    ImageView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_b2_4);

        initButton();

        initButtonClickedCallback();


        alert = (ImageView) findViewById(R.id.imageViewCek);
        alert.setOnClickListener(this);
        btnA = (Button) findViewById(R.id.buttonA);
        btnA.setOnClickListener(this);
        btnB = (Button) findViewById(R.id.buttonB);
        btnB.setOnClickListener(this);
        btnC = (Button) findViewById(R.id.buttonC);
        btnC.setOnClickListener(this);
        btnD = (Button) findViewById(R.id.buttonD);
        btnD.setOnClickListener(this);


        findViewById(R.id.imageViewNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebB2_4.this, WebB2_5.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onClick(View view) {
        if (view == alert) {
            new AlertDialog.Builder(this)
                    .setTitle("Penjelasan")
                    .setMessage("Ciri-ciri : \n" +
                            "Desain informasi seperti berkaitan bagaimana informasi diatur di server\n" +
                            "Pemrosesan form\n" +
                            "Diakses oleh seorang admi\n" +
                            "Pemograman database\n" +
                            "Content management systems\n" +
                            "Aplikasi berbasis web server lain menggunakan PHP, JSP, Ruby, ASP.NET, Java, dan bahasa pemograman lainnya")
                    .setNeutralButton("TUTUP", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dlg, int sumthin) {

                        }
                    })
                    .show();
        } else if (view == btnD) {
            Toast.makeText(this, "Jawaban anda benar", Toast.LENGTH_SHORT).show();
        } else if (view == btnB) {
            Toast.makeText(this, "Jawaban anda salah", Toast.LENGTH_SHORT).show();
        } else if (view == btnA) {
            Toast.makeText(this, "Jawaban anda salah", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Jawaban anda salah", Toast.LENGTH_SHORT).show();
        }
    }

    private void initButton() {
        btnA = (Button) findViewById(R.id.buttonA);
        btnB = (Button) findViewById(R.id.buttonB);
        btnC = (Button) findViewById(R.id.buttonC);
        btnD = (Button) findViewById(R.id.buttonD);
    }

    private void initButtonClickedCallback() {
        btnA.setOnTouchListener(this);
        btnB.setOnTouchListener(this);
        btnC.setOnTouchListener(this);
        btnD.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            case R.id.buttonA:
                btnA.setBackgroundColor(Color.RED);
                break;
            case R.id.buttonB:
                btnB.setBackgroundColor(Color.RED);
                break;
            case R.id.buttonC:
                btnC.setBackgroundColor(Color.RED);
                break;
            case R.id.buttonD:
                btnD.setBackgroundColor(Color.GREEN);
                break;
        }
        btnA.setPressed(btnA.isPressed());
        btnB.setPressed(btnB.isPressed());
        btnC.setPressed(btnC.isPressed());
        btnD.setPressed(btnD.isPressed());
        return false;
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apakah Anda yakin akan keluar dari soal?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(WebB2_4.this, WebHome.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
