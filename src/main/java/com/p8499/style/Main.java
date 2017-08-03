package com.p8499.style;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

import static com.p8499.style.Util.colorAccent;
import static com.p8499.style.Util.colorPrimary;
import static com.p8499.style.Util.colors;

/**
 * Created by Administrator on 3/20/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Properties config = new Properties();
        if (args == null || args.length == 0) {
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("config.properties");
            config.load(inputStream);
            inputStream.close();
        } else {
            InputStream inputStream = new FileInputStream(args[0]);
            config.load(inputStream);
            inputStream.close();
        }
        colorPrimary = config.getProperty("colorPrimary", colorPrimary);
        colorAccent = config.getProperty("colorAccent", colorAccent);
        colors = Arrays.asList(config.getProperty("colors", String.join(",", Util.colors)).split(","));
        File folder = new File(".");
        BackgroundDrawableGenerator.generateMain(new File(folder, "res/drawable"));
        BackgroundDrawableGenerator.generateStateDisabled(new File(folder, "res/drawable"));
        BackgroundDrawableGenerator.generateStateSelected(new File(folder, "res/drawable"));
        BackgroundDrawableGenerator.generateStateFocused(new File(folder, "res/drawable"));
        BackgroundDrawableGenerator.generateStatePressed(new File(folder, "res/drawable"));
        BackgroundDrawableGenerator.generateStateChecked(new File(folder, "res/drawable"));
        BackgroundDrawableGenerator.generateStateNormal(new File(folder, "res/drawable"));
        //TextColorDrawableGenerator.generateMain(new File(folder, "res/drawable"));
        ValueGenerator.generateColors(new File(folder, "res/values"));
        ValueGenerator.generateDimens(new File(folder, "res/values"));
        ValueGenerator.generateStyleWindow(new File(folder, "res/values"));
        ValueGenerator.generateStyleButton(new File(folder, "res/values"));
        ValueGenerator.generateStyleTextView(new File(folder, "res/values"));
        ValueGenerator.generateStyleEditText(new File(folder, "res/values"));
        ValueGenerator.generateStyleSeparator(new File(folder, "res/values"));
        ValueGenerator.generateStyleLayout(new File(folder, "res/values"));
        ValueGenerator.generateStyleImageView(new File(folder, "res/values"));
    }
}
