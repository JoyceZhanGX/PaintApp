package com.example.paintgame;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyCanvasView myCanvasView = (MyCanvasView) findViewById(R.id.myCanvasView);
//        MyCanvasView myCanvasView = new MyCanvasView(this);
//        myCanvasView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
//        setContentView(myCanvasView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.delete:
                MyCanvasView.delete();
                return true;
            case R.id.changeColor:
                MyCanvasView.delete();
                return true;

            case R.id.pinkPen:
                MyCanvasView.setPenColor(ResourcesCompat.getColor(getResources(),
                        R.color.baby_pink, null));
                return true;

            case R.id.greenPen:
                MyCanvasView.setPenColor(ResourcesCompat.getColor(getResources(),
                        R.color.opaque_green, null));
                return true;

            case R.id.whitePen:
                MyCanvasView.setPenColor(ResourcesCompat.getColor(getResources(),
                        R.color.white, null));
                return true;

            case R.id.purplePen:
                MyCanvasView.setPenColor(ResourcesCompat.getColor(getResources(),
                        R.color.baby_purple, null));
                return true;
            case R.id.defaultPen:
                MyCanvasView.setPenColor(ResourcesCompat.getColor(getResources(),
                        R.color.opaque_yellow, null));
                return true;
//            case R.id.save:
//                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
//                        != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
//                } else {
//                    MyCanvasView.save();
//                }
        }

        return super.onOptionsItemSelected(item);
    }

}
