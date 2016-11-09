package id.sch.smktelkom_mlg.project.xirpl407162534.itquiz;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;

public class AndroidB1_1 extends Activity implements View.OnClickListener {

    ImageView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_b1_1);

        alert = (ImageView) findViewById(R.id.imageViewCek);
        alert.setOnClickListener(this);

        findViewById(R.id.imageViewNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AndroidB1_1.this, AndroidB1_2.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onClick(View view) {
        if (view == alert) {
            new AlertDialog.Builder(this)
                    .setTitle("Penjelasan")
                    .setMessage("Android adalah aplikasi perangkat lunak untuk perangkat mobile," +
                            " yang mencakup sistem operasi, aplikasi middleware, dan beberapa aplikasi kunci")
                    .setNeutralButton("TUTUP", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dlg, int sumthin) {

                        }
                    })
                    .show();
        }
    }
}
