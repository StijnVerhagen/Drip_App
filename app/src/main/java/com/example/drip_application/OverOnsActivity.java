package com.example.drip_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class OverOnsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("Fontys ICT Media Design.\n\nGemaakt door: Sjoerd, Stijn, Nick, Giovanni, Timo, Chris.")
                .addGroup("Iets bespreken? Dat kan!")
                .addEmail("Drip@support.com")
                .addWebsite("http://chriskit.info/drip/index.php")
                .addFacebook("Drip")
                .addTwitter("drip_liquids")
                .addInstagram("drip.liquids")
                .addGitHub("stijnvfhict/Drip_App")
                .addItem(getCopyRightElement())
                .create();
        setContentView(aboutPage);
    }

    Element getCopyRightElement(){
        Element copyRightsElement = new Element();
        @SuppressLint({"StringFormatInvalid", "LocalSuppress"}) final String copyrights = String.format(getString(R.string.app_name), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);

        return copyRightsElement;
    }
}
