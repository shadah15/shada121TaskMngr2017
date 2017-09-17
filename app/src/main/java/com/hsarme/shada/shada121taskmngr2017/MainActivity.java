package com.hsarme.shada.shada121taskmngr2017;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
    {
        case R.id.mnItmScreen1:
            Toast.makeText(getBaseContext(), "Hi...Screen1", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,Screen.class);
            startActivity(intent);
            break;
        case R.id.mnItmScreen2:
            Toast.makeText(getBaseContext(), "Hi...Screen2", Toast.LENGTH_LONG).show();
            intent = new Intent(this,Screen.class);
            startActivity(intent);
            break;
        case R.id.mnItmScreen3:
            Toast.makeText(getBaseContext(), "Hi...Screen3", Toast.LENGTH_LONG).show();
            intent = new Intent(this,Screen.class);
            startActivity(intent);
            break;
        case R.id.mnItmScreen4:
            Toast.makeText(getBaseContext(), "Hi...Screen4", Toast.LENGTH_LONG).show();
            intent = new Intent(this,Screen.class);
            startActivity(intent);
            break;
    }
    return true;
    }

}
