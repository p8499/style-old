package com.p8499.style;

import java.io.File;
import java.io.IOException;

import static com.p8499.style.Util.colors;

/**
 * Created by Administrator on 3/20/2017.
 */
public class TextColorDrawableGenerator {

    public static void generateMain(File folder) throws IOException {
        String file = "text_%s.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<selector xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
//                "    <item android:color=\"@color/%s.600\" android:state_enabled=\"true\"/>\n" +
//                "    <item android:color=\"@color/%s.100\"/>\n" +
                "    <item android:color=\"@color/%s.600\"/>\n" +
                "</selector>";
        for (String color : colors)
            Util.write(new File(folder, String.format(file, color.toLowerCase()))
                    , String.format(template, color));
//                    , String.format(template, color, color));
    }
}
