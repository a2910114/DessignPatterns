package com.mykhaylenko.dessign.builder;

import com.oracle.webservices.internal.api.databinding.Databinding;

/**
 * Created by Pavlo.Mykhaylenko on 9/25/2015.
 */
public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Joe", "calcin")
                .age(22)
                .address("Nikolaev")
                .build();
        System.out.println(user);

        Request.RequestBuilder requestBuilder = new Request.RequestBuilder();
        requestBuilder.param1("param1");
        requestBuilder.param4("param4");
        System.out.println(requestBuilder.build());
    }
}
