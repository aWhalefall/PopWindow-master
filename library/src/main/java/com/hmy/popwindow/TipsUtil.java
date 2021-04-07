package com.hmy.popwindow;

import android.app.Activity;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class TipsUtil {
    
    //PopupWindow的背景
    public static void setBackgroundAlpha(Activity activity, float bgAlpha) {
        WindowManager.LayoutParams lp = activity.getWindow()
                .getAttributes();
        lp.alpha = bgAlpha;
        (activity).getWindow().setAttributes(lp);
    }
    
}
