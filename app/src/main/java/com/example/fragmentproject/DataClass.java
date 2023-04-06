package com.example.fragmentproject;

public class DataClass {
    private String dataTitle;
    private String dataDesc;
    private String dataLang;
    private String dataVideo;
    private String dataImage;
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DataClass(String dataTitle, String dataDesc, String dataLang, String dataVideo,String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataLang = dataLang;
        this.dataVideo = dataVideo;
        this.dataImage = dataImage;
    }

    public String getDataTitle() {
        return dataTitle;
    }


    public String getDataDesc() {
        return dataDesc;
    }



    public String getDataLang() {
        return dataLang;
    }

    public String getDataVideo() {
        return dataVideo;
    }




    public String getDataImage() {
        return dataImage;
    }



    public DataClass(){

    }
}

