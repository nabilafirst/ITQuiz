package id.sch.smktelkom_mlg.project.xirpl407162534.itquiz;

import android.app.Activity;
import android.os.Bundle;

public class WebHome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_home);


        findViewById(R.id.imageViewBasic1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebHome.this, WebB1_1.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.imageViewBasic2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebHome.this, WebB2_1.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.imageViewBasic3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebHome.this, WebB3_1.class);
                startActivity(intent);

            }
        });


    }
}
