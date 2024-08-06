import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {
    public String str;
    private static Singleton instance;

    // Corrected constructor
    private Singleton() {
        this.str = "Default String";
    }

    // Corrected method with return type and parentheses
    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}