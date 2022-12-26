package com.example.arturaandkakatya;


import android.util.Log;

public class Lion extends  Cat{
    public void talk(){
        Log.i("talk()", "R-r-r! I'm lion. My name is " + name + ", and I'm " + age + " years old." + Lion.whatCatsLike());
    }

    public final static String whatCatsLike(){
        return " I'm Lion and i like playing and sometimes scratching";
    }
}
