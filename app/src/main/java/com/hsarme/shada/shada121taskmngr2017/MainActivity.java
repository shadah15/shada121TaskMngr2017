package com.hsarme.shada.shada121taskmngr2017;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.hsarme.shada.shada121taskmngr2017.R;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button btnDate;
    private TextView tvShowDate;
    private Button btnTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.naiblayout);
        btnDate = (Button) findViewById(R.id.btnDate);
        tvShowDate = (TextView) findViewById(R.id.tvShowDate);

        btnDate.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnItmScreen1:
                Toast.makeText(getBaseContext(), "Hi...Screen1", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, Screen.class);
                startActivity(intent);
                break;
            case R.id.mnItmScreen2:
                Toast.makeText(getBaseContext(), "Hi...Screen2", Toast.LENGTH_LONG).show();
                intent = new Intent(this, Screen.class);
                startActivity(intent);
                break;
            case R.id.mnItmScreen3:
                Toast.makeText(getBaseContext(), "Hi...Screen3", Toast.LENGTH_LONG).show();
                intent = new Intent(this, Screen.class);
                startActivity(intent);
                break;
            case R.id.mnItmScreen4:
                Toast.makeText(getBaseContext(), "Hi...Screen4", Toast.LENGTH_LONG).show();
                intent = new Intent(this, Screen.class);
                startActivity(intent);
                break;
        }
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {
        if (view == btnDate) {
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog.OnDateSetListener dateListener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    tvShowDate.setText(dayOfMonth + "/" + month + "/" + year);
                }

            };
            DatePickerDialog datePickerDialog=new DatePickerDialog(this,dateListener,year,month,day);
            datePickerDialog.show();
        }

    }
}