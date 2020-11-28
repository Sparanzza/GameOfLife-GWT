package com.sparanzza.client;

import com.google.gwt.core.client.EntryPoint;
import org.jboss.gwt.elemento.core.Elements;

public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {
        Elements.body().add("Hello, Game Of Life!");
    }
}