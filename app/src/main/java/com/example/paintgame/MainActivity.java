package com.example.paintgame;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class MainActivity extends AppCompatActivity {

    private MyCanvasView myCanvasView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCanvasView = findViewById(R.id.myCanvasView);
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
        }

        return super.onOptionsItemSelected(item);
    }

}
