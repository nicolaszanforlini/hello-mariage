package com.example.hello_mariage.Controler;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;

import java.io.IOException;
import java.io.InputStream;

/**
 * class to managing image's url
 */
public class ManageImg {

    /**
     * @param s the url of web image
     * @return bmp the image encode in Bitmap format
     */
    public static Bitmap manageImg (String s) throws IOException {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        InputStream input = new java.net.URL(s).openStream();
        Bitmap bmp = BitmapFactory.decodeStream(input);
        return bmp;
    }

}
