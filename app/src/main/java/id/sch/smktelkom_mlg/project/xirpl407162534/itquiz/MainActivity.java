package id.sch.smktelkom_mlg.project.xirpl407162534.itquiz;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    private static final String TAG = "LivecycleTag";
    MediaPlayer mediaPlayer;
    ToggleButton myToggle;
    ImageView ivAboutusIkon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivAboutusIkon = (ImageView) findViewById(R.id.imageViewAboutusIkon);

        findViewById(R.id.imageViewAndroid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AndroidHome.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageViewDesktop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DesktopHome.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.imageViewWeb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebHome.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageViewJava).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JavaHome.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.imageViewAboutusIkon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutUs.class);
                startActivity(intent);
            }
        });

        Log.d(TAG, "onCreate: ");

        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        myToggle = (ToggleButton) findViewById(R.id.toggleSound);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(1, 1);
        mediaPlayer.start();

    }

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            mediaPlayer.setVolume(0, 0);
        } else {
            mediaPlayer.setVolume(1, 1);
        }
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");

        mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");

        mediaPlayer.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");

        if (mediaPlayer != null)
            mediaPlayer.release();
    }

    @Override
    public void onBackPressed() {
        mediaPlayer.stop();


        new AlertDialog.Builder(this)
                .setMessage("Apakah Anda yakin akan keluar?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

}