package id.sch.smktelkom_mlg.project.xirpl407162534.itquiz;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;

public class JavaB1_2 extends Activity implements View.OnClickListener {

    ImageView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_b1_2);

        alert = (ImageView) findViewById(R.id.imageViewCek);
        alert.setOnClickListener(this);

        findViewById(R.id.imageViewNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaB1_2.this, JavaB1_3.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onClick(View view) {
        if (view == alert) {
            new AlertDialog.Builder(this)
                    .setTitle("Penjelasan")
                    .setMessage("Jika kita ingin menggunakan nilai angka pada Java, kita dapat" +
                            " menggunakan tipe data Integer dan Double. Bedanya Integer hanya untuk" +
                            " bil. bulat, sedangkan Double untuk bil. bulat dan desimal.")
                    .setNeutralButton("TUTUP", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dlg, int sumthin) {

                        }
                    })
                    .show();
        }
    }

    @Override
    public void onBackPressed() {

    }
}