package com.udacity.gradle.builditbigger.backend;

import android.example.com.javajokelibrary.MyJokes;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    /*
     * an endpoint method to grab a joke from the java joke telling library
     */
    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        MyBean response = new MyBean();
        MyJokes jokes = new MyJokes();
        response.setData(jokes.getJoke());

        return response;
    }

}
