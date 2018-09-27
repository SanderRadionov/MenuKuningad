package com.example.opilane.menukuningad;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

    public static final int MENU_NAME = Menu.FIRST +1;
    public static final int MENU_TEXT = Menu.FIRST +2;

    private List<King> kings=(new Kings()).getKings();
    private ListView view;
    private EditText from, to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.lstKings);
        from = findViewById(R.id.txtFrom);
        to = findViewById(R.id.txtTo);

        disable(from);
        disable(to);

        view.setAdapter(new ArrayAdapter)
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        menu.add(Menu.NONE, MENU_NAME, Menu.NONE, "King");
        menu.add(Menu.NONE, MENU_TEXT, Menu.NONE, "Description");
    }


    @Override
    public boolean onContextItemSelected(MenuItem item){
            AdapterView.AdapterContextMenuInfo menuInfo=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
    King king=kings.get(menuInfo.position);
    switch(item.getItemId()){
        case MENU_NAME:
        Toast.makeText(this, king.getKing(), Toast.LENGTH_LONG).show();
        return true;
        case MENU_TEXT:
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle(king.getName());
            builder.setMessage(king.getText());
            builder.setPositiveButton("Close", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialogInterface, int which)
                {

                }

            });
            builder.show();
            return true;
    }
        return super.onContextItemSelected(item);
    }



    private void disable(EditText view)
    {

    }


        public void update(int position)
        {

        }
}
