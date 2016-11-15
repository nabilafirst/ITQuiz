package id.sch.smktelkom_mlg.project.xirpl407162534.itquiz;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class AndroidB1_5 extends Activity implements View.OnClickListener, OnTouchListener {

    Button btnA, btnB, btnC, btnD;
    ImageView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_b1_5);

        initButton();

        initButtonClickedCallback();


        alert = (ImageView) findViewById(R.id.imageView);
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
                Intent intent = new Intent(AndroidB1_5.this, AndroidHome.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {
        if (view == alert) {

            new AlertDialog.Builder(this)
                    .setTitle("Penjelasan")
                    .setMessage("Sejak April 2009, versi Android dikembangkan dengan nama kode " +
                            "yang dinamai berdasarkan makanan pencuci mulut dan penganan manis." +
                            " Masing-masing versi dirilis sesuai urutan alfabet, yakni Cupcake (1.5)," +
                            " Donut (1.6), Eclair (2.0–2.1), Froyo (2.2–2.2.3), Gingerbread (2.3–2.3.7), " +
                            "Honeycomb (3.0–3.2.6), Ice Cream Sandwich (4.0–4.0.4), Jelly Bean (4.1–4.3), " +
                            "KitKat (4.4+), Lollipop (5.0+), Marshmallow (6.0).")
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
        } else if (view == btnC) {
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
    public boolean onTouch(View v, MotionEvent me) {
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
}
