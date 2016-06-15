package com.example.btt2k16;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }


    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        populateMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        populateMenu(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void populateMenu(Menu menu) {
        int groupId = 0;
        int order = 0;
        menu.add(groupId, 4, ++order, "Return to List");
        menu.add(groupId, 3, ++order, "Show Visited");
        menu.add(groupId, 2, ++order, "Show Not Visited");
        menu.add(groupId, 1, ++order, "Show all");
    }
/*
    public boolean onContextItemSelected(MenuItem item)  {
        return (applyMenuOption(item));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        return (applyMenuOption(item));
    }


    public boolean applyMenuOption(MenuItem item) {
        int id = item.getItemId();

        // 1: close application
        // 2: map
        // 3: details

        if (id == 1) {
            finish();
        }

        else if (id == 2) {
            Coffee[] toSend;
            if (checkedCoffees.size() <= 0) {
                Toast.makeText(getApplicationContext(), "You must select at least one café!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent map = new Intent(getApplicationContext(), MapActivity.class);
                toSend = checkedCoffees.toArray(new Coffee[checkedCoffees.size()]);
                map.putExtra("size", toSend.length);
                for (int i = 0; i < toSend.length; i++) {
                    map.putExtra("coffeeObject" + i, toSend[i]);
                }
                startActivity(map);
            }
        }
        else {
            Coffee toSend;
            if (checkedCoffees.size() < 0 || checkedCoffees.size() > 1) {
                Toast.makeText(getApplicationContext(), "You must select ONLY ONE café!", Toast.LENGTH_SHORT).show();
            }
            else {
                try {
                    Intent details = new Intent(getApplicationContext(), DetailsActivity.class);
                    toSend = checkedCoffees.iterator().next();
                    details.putExtra("coffeeObject", toSend);
                    startActivity(details);
                }
                catch (Exception a){
                    Log.wtf("ouch", "out of bounds: ");
                    Toast.makeText(getApplicationContext(), "You must select ONLY ONE café!", Toast.LENGTH_SHORT).show();
                }

            }
            }
        }
        return true;*/
    }

