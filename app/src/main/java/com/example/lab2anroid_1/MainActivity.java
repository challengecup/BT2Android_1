package com.example.lab2anroid_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.menuBTN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu pm = new PopupMenu(MainActivity.this,btn);
                pm.getMenuInflater().inflate(R.menu.popup_menu,pm.getMenu());
                pm.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.first:
                                Toast.makeText(MainActivity.this, "Clicked New", Toast.LENGTH_SHORT).show();
                                return true;

                            case R.id.second:
                                Toast.makeText(MainActivity.this, "Clicked Save", Toast.LENGTH_SHORT).show();
                                return true;

                            case R.id.third:
                                Toast.makeText(MainActivity.this, "Clicked Load", Toast.LENGTH_SHORT).show();
                                return true;

                            case R.id.four:
                                Toast.makeText(MainActivity.this, "Clicked Edit", Toast.LENGTH_SHORT).show();
                                return true;
                        }
                        return true;
                    }
                });
                pm.show();
            }
        });
    }
}