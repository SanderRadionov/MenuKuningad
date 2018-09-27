package com.example.opilane.menukuningad;

import java.util.ArrayList;
import java.util.List;

public class Kings {

    private List<King> list = new ArrayList<>();

    private static final String[][] data=
            {
                    {"ahoi meremees!"},
                    {"terekest"},
                    {"filler"},
                    {"james"},
                    {"swag"},
                    {"suvakas tekst"},
                    {"piraat"},
                    {"ekool oli parem"},
                    {"\n" +
                     "William was married to..."}

            };
    public Kings()
    {
        for (String[] arr: data)
            list.add(new King(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), arr[3]));
    }
    public List<King> getKings()
    {
        return list;
    }
}
