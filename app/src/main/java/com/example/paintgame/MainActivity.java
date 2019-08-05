package com.example.paintgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyCanvasView myCanvasView = (MyCanvasView)findViewById(R.id.myCanvasView);
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
        switch(item.getItemId()) {
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

        }

         return super.onOptionsItemSelected(item);
    }

}
