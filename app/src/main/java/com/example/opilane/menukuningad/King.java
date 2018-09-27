package com.example.opilane.menukuningad;

public class King {

    private String name, text;
    private int from, to;

    public King(String name, int from, int to, String text)
    {
        this.name=name;
        this.from=from;
        this.to=to;
        this.text=text;
    }

    public String getName()
    {
        return name;
    }

    public int getFrom()
    {
        return from;
    }

    public int getTo()
    {
        return to;
    }

    public String getText()
    {
        return text;
    }

    public String toString()
    {
        return name;
    }

    public String getKing()
    {
        return name + " reign from " + from + " to " + to;
    }
}
