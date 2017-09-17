package com.hsarme.shada.shada121taskmngr2017;

import android.app.AlertDialog;
import android.content.DialogInterface;

/**
 * Created by user on 9/17/2017.
 */

public class ActivityOne extends MainActivity implements DialogInterface.OnClickListener
{
    @Override
    public void onBackPressed()
    {
        //
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        //
        builder.setMessage("ARE you sure?");
        //
        builder.setCancelable(false);
        //
        builder.setPositiveButton("YES", this);
        //
        builder.setNegativeButton("NO", this);
        //
        AlertDialog dialog=builder.create();
        //
        dialog.show();
    }

    @Override
    public void onClick(DialogInterface dialog, int which)
    {
        if (which==dialog.BUTTON_POSITIVE){
            super.onBackPressed();
            dialog.cancel();
        }
        if (which==dialog.BUTTON_NEGATIVE){
            dialog.cancel();
        }
    }


}


