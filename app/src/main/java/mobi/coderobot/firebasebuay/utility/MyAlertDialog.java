package mobi.coderobot.firebasebuay.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import mobi.coderobot.firebasebuay.R;

/**
 * Created by Administrator on 25/11/2560.
 */

public class MyAlertDialog {
    private Context context;

    public MyAlertDialog(Context context) {
        this.context = context;
    }//Constructor

    public void myNomalDialog(String strTitle, String strMassage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_alert);
        builder.setTitle(strTitle);
        builder.setMessage(strMassage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }//onClick

}//Main Class
