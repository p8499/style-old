package com.p8499.style;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 3/20/2017.
 */
public class Util {
    public static String colorPrimary = "Blue";
    public static String colorAccent = "Orange";
    public static List<String> colors = Arrays.asList(new String[]{"Red", "Pink", "Purple", "Indigo", "Blue", "Cyan", "Teal", "Green", "Lime", "Yellow", "Amber", "Orange", "Brown", "Grey"});
    public static List<String> styles = Arrays.asList(new String[]{"Bordered", "BorderedLeft", "BorderedRight", "BorderedTop", "BorderedBottom", "BorderedCenter", "Borderless", "BorderlessLeft", "BorderlessRight", "BorderlessTop", "BorderlessBottom", "BorderlessCenter", "Filled", "FilledLeft", "FilledRight", "FilledTop", "FilledBottom", "FilledCenter"});
    public static List<String> sizes = Arrays.asList(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"});
    public static List<Integer> distances = Arrays.asList(new Integer[]{0, 4, 8, 12, 16});
    public static List<Integer> scales = Arrays.asList(new Integer[]{50, 75});

    public static void write(File file, String str) throws IOException {
        if (!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        FileWriter writer = new FileWriter(file);
        writer.write(str);
        writer.close();
    }
}
