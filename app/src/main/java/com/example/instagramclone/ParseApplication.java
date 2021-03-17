package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tzaVfV6PMLVeiqugfk6EqDRXe699g8FoYlqQgkbG")
                .clientKey("xxAeryW4x7CZHKdfBw30xRdZO5jeT8ziArth0XLv")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
