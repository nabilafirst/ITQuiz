package id.sch.smktelkom_mlg.project.xirpl407162534.itquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DesktopHome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desktop_home);

        findViewById(R.id.imageViewBasic1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DesktopHome.this, Desktop1_1.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.imageViewBasic2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DesktopHome.this, AndroidB2_1.class);
                startActivity(intent);

            }
        });

        findViewById(R.id.imageViewBasic3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DesktopHome.this, AndroidB3_1.class);
                startActivity(intent);

            }
        });

    }
}
