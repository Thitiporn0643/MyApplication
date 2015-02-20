package com.example.student.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ContextMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    String[] Cmd = {"Command1","Command2","Command3","Command4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //final Button btn1 = ;
        registerForContextMenu((Button)findViewById(R.id.button));
         // registerForContextMenu(btn1);
    }
    @Override

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {

        menu.setHeaderIcon(android.R.drawable.btn_star_big_on);

        menu.setHeaderTitle("Menu 1");

        String[] menuItems = Cmd;

        for (int i = 0; i<menuItems.length; i++) {
                       menu.add(Menu.NONE, i, i, menuItems[i]);

        }

    }

    public void button(View v){

    }

    @Override

    public boolean onContextItemSelected(MenuItem item) {

        int menuItemIndex = item.getItemId();

        String[] menuItems = Cmd;

        String CmdName = menuItems[menuItemIndex];

// Check Event Command

        if ("Command1".equals(CmdName)) {

            Toast.makeText(MainActivity.this, "Your Selected Command1", Toast.LENGTH_LONG).show();



        } else if ("Command2".equals(CmdName)) {

            Toast.makeText(MainActivity.this,"Your Selected Command2",Toast.LENGTH_LONG).show();



        } else if ("Command3".equals(CmdName)) {

            Toast.makeText(MainActivity.this,"Your Selected Command3",Toast.LENGTH_LONG).show();



        } else if ("Command4".equals(CmdName)) {

            Toast.makeText(MainActivity.this,"Your Selected Command4",Toast.LENGTH_LONG).show();



        }


        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
