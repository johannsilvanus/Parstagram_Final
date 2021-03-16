package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("bf8PRZNpyiT3OQMN1gyKPKKlMqyeUXoeDcwEudli")
                .clientKey("gtylpuc6GpUdArp9HBQA1sPL1sa5BK3AO0ts7O8a")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
