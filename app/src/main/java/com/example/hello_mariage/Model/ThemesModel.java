package com.example.hello_mariage.Model;

import java.util.ArrayList;

public class ThemesModel {
    public ArrayList<String> getListThemes() {
        return listThemes;
    }

    public void setListThemes(ArrayList<String> listThemes) {
        this.listThemes = listThemes;
    }

    public ArrayList<String> getListUrlImg() {
        return listUrlImg;
    }

    public void setListUrlImg(ArrayList<String> listUrlImg) {
        this.listUrlImg = listUrlImg;
    }

    public void addThemes(String theme){
        if (listThemes == null){
            listThemes = new ArrayList<>();
        }
        listThemes.add(theme);
    }

    public void addUrlImg(String theme){
        if (listUrlImg == null){
            listUrlImg = new ArrayList<>();
        }
        listUrlImg.add(theme);
    }

    private ArrayList<String> listThemes;
    private ArrayList<String> listUrlImg;
}
