package com.example.hello_mariage;

import android.graphics.Bitmap;

import com.example.hello_mariage.Controler.ManageImg;
import com.example.hello_mariage.Model.ThemesModel;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class ThemesModelUnitTest {
    @Test
    public void assertAddThemeAdd(){
        ThemesModel result = null;

        result = new ThemesModel();
        result.addThemes("StarWars");
        assertEquals("StarWars", result.getListThemes().get(0));
    }

    @Test
    public void assertAddUrlImgAdd(){
        ThemesModel result = null;

        result = new ThemesModel();
        result.addUrlImg("StarWars.jpg");
        assertEquals("StarWars.jpg", result.getListUrlImg().get(0));
    }
}
