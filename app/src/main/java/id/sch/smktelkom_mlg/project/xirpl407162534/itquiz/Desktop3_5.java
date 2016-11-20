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

public class Desktop3_5 extends Activity implements View.OnTouchListener, View.OnClickListener {

    Button btnA, btnB, btnC, btnD;
    ImageView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desktop3_5);


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


        findViewById(R.id.buttonGambar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Desktop3_5.this, gambar3.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.imageViewNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Desktop3_5.this, DesktopHome.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onClick(View view) {
        if (view == alert) {
            new AlertDialog.Builder(this)
                    .setTitle("Penjelasan")
                    .setMessage(" ")
                    .setNeutralButton("TUTUP", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dlg, int sumthin) {

                        }
                    })
                    .show();
        } else if (view == btnC) {
            Toast.makeText(this, "Jawaban anda benar", Toast.LENGTH_SHORT).show();
        } else if (view == btnA) {
            Toast.makeText(this, "Jawaban anda salah", Toast.LENGTH_SHORT).show();
        } else if (view == btnB) {
            Toast.makeText(this, "Jawaban anda salah", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Jawaban anda salah", Toast.LENGTH_SHORT).show();
        }
    }

    private void initButtonClickedCallback() {
        btnA.setOnTouchListener(this);
        btnB.setOnTouchListener(this);
        btnC.setOnTouchListener(this);
        btnD.setOnTouchListener(this);
    }

    private void initButton() {
        btnA = (Button) findViewById(R.id.buttonA);
        btnB = (Button) findViewById(R.id.buttonB);
        btnC = (Button) findViewById(R.id.buttonC);
        btnD = (Button) findViewById(R.id.buttonD);
    }

    @Override
    public boolean onTouch(View v, MotionEvent motionEvent) {

        switch (v.getId()) {
            case R.id.buttonA:
                btnA.setBackgroundColor(Color.RED);
                break;
            case R.id.buttonB:
                btnB.setBackgroundColor(Color.RED);
                break;
            case R.id.buttonC:
                btnC.setBackgroundColor(Color.GREEN);
                break;
            case R.id.buttonD:
                btnD.setBackgroundColor(Color.RED);
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
                        Intent intent = new Intent(Desktop3_5.this, DesktopHome.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
