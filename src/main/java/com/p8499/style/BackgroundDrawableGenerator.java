package com.p8499.style;

import java.io.*;

import static com.p8499.style.Util.colors;
import static com.p8499.style.Util.styles;

/**
 * Created by Administrator on 3/15/2017.
 */
public class BackgroundDrawableGenerator {

    public static void generateMain(File folder) throws IOException {
        String file = "background_%s_%s.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<selector xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <item android:drawable=\"@drawable/background_%s_%s_disabled\" android:state_enabled=\"false\"/>\n" +
                "    <item android:drawable=\"@drawable/background_%s_%s_selected\" android:state_selected=\"true\"/>\n" +
                "    <item android:drawable=\"@drawable/background_%s_%s_focused\" android:state_focused=\"true\"/>\n" +
                "    <item android:drawable=\"@drawable/background_%s_%s_pressed\" android:state_pressed=\"true\"/>\n" +
                "    <item android:drawable=\"@drawable/background_%s_%s_checked\" android:state_checked=\"true\"/>\n" +
                "    <item android:drawable=\"@drawable/background_%s_%s_normal\"/>\n" +
                "</selector>";
        for (String style : styles)
            for (String color : colors)
                Util.write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase()))
                        , String.format(template, style.toLowerCase(), color.toLowerCase(), style.toLowerCase(), color.toLowerCase(), style.toLowerCase(), color.toLowerCase(), style.toLowerCase(), color.toLowerCase(), style.toLowerCase(), color.toLowerCase(), style.toLowerCase(), color.toLowerCase()));
    }

    public static void generateStateDisabled(File folder) throws IOException {
        String file = "background_%s_%s_disabled.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<layer-list xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <item>\n" +
                "        <shape>\n" +
                "            <solid android:color=\"%s\"/>\n" +
                "            <corners\n" +
                "                android:bottomLeftRadius=\"%ddp\"\n" +
                "                android:bottomRightRadius=\"%ddp\"\n" +
                "                android:topLeftRadius=\"%ddp\"\n" +
                "                android:topRightRadius=\"%ddp\"/>\n" +
                "%s" +
                "        </shape>\n" +
                "    </item>\n" +
                "</layer-list>";
        for (String style : styles)
            for (String color : colors)
                Util.write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase()))
                        , String.format(template, style.contains("Filled") ? "@color/" + color + ".200" : "#00000000"
                                , style.contains("Center") || style.contains("Top") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Top") || style.contains("Left") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Left") ? 0 : 4
                                , style.contains("Bordered")
                                        ? "            <stroke\n" +
                                        "                android:width=\"1dp\"\n" +
                                        "                android:color=\"@color/" + color + ".200\"/>\n" : ""));
    }

    public static void generateStateSelected(File folder) throws IOException {
        String file = "background_%s_%s_selected.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<layer-list xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <item>\n" +
                "        <shape>\n" +
                "            <solid android:color=\"%s\"/>\n" +
                "            <corners\n" +
                "                android:bottomLeftRadius=\"%ddp\"\n" +
                "                android:bottomRightRadius=\"%ddp\"\n" +
                "                android:topLeftRadius=\"%ddp\"\n" +
                "                android:topRightRadius=\"%ddp\"/>\n" +
                "%s" +
                "        </shape>\n" +
                "    </item>\n" +
                "</layer-list>";
        for (String style : styles)
            for (String color : colors)
                Util.write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase()))
                        , String.format(template, style.contains("Filled") ? "@color/" + color + ".500" : "@color/" + color + ".100"
                                , style.contains("Center") || style.contains("Top") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Top") || style.contains("Left") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Left") ? 0 : 4
                                , style.contains("Bordered")
                                        ? "            <stroke\n" +
                                        "                android:width=\"1dp\"\n" +
                                        "                android:color=\"@color/" + color + ".600\"/>\n" : ""));
    }

    public static void generateStateFocused(File folder) throws IOException {
        String file = "background_%s_%s_focused.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<layer-list xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <item>\n" +
                "        <shape>\n" +
                "            <solid android:color=\"%s\"/>\n" +
                "            <corners\n" +
                "                android:bottomLeftRadius=\"%ddp\"\n" +
                "                android:bottomRightRadius=\"%ddp\"\n" +
                "                android:topLeftRadius=\"%ddp\"\n" +
                "                android:topRightRadius=\"%ddp\"/>\n" +
                "%s" +
                "        </shape>\n" +
                "    </item>\n" +
                "</layer-list>";
        for (String style : styles)
            for (String color : colors)
                Util.write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase()))
                        , String.format(template, style.contains("Filled") ? "@color/" + color + ".500" : "@color/" + color + ".050"
                                , style.contains("Center") || style.contains("Top") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Top") || style.contains("Left") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Left") ? 0 : 4
                                , style.contains("Bordered")
                                        ? "            <stroke\n" +
                                        "                android:width=\"1dp\"\n" +
                                        "                android:color=\"@color/" + color + ".600\"/>\n" : ""));
    }

    public static void generateStatePressed(File folder) throws IOException {
        String file = "background_%s_%s_pressed.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<layer-list xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <item>\n" +
                "        <shape>\n" +
                "            <solid android:color=\"%s\"/>\n" +
                "            <corners\n" +
                "                android:bottomLeftRadius=\"%ddp\"\n" +
                "                android:bottomRightRadius=\"%ddp\"\n" +
                "                android:topLeftRadius=\"%ddp\"\n" +
                "                android:topRightRadius=\"%ddp\"/>\n" +
                "%s" +
                "        </shape>\n" +
                "    </item>\n" +
                "</layer-list>";
        for (String style : styles)
            for (String color : colors)
                Util.write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase()))
                        , String.format(template, style.contains("Filled") ? "@color/" + color + ".500" : "@color/" + color + ".100"
                                , style.contains("Center") || style.contains("Top") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Top") || style.contains("Left") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Left") ? 0 : 4
                                , style.contains("Bordered")
                                        ? "            <stroke\n" +
                                        "                android:width=\"1dp\"\n" +
                                        "                android:color=\"@color/" + color + ".600\"/>\n" : ""));
    }

    public static void generateStateChecked(File folder) throws IOException {
        String file = "background_%s_%s_checked.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<layer-list xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <item>\n" +
                "        <shape>\n" +
                "            <solid android:color=\"%s\"/>\n" +
                "            <corners\n" +
                "                android:bottomLeftRadius=\"%ddp\"\n" +
                "                android:bottomRightRadius=\"%ddp\"\n" +
                "                android:topLeftRadius=\"%ddp\"\n" +
                "                android:topRightRadius=\"%ddp\"/>\n" +
                "%s" +
                "        </shape>\n" +
                "    </item>\n" +
                "</layer-list>";
        for (String style : styles)
            for (String color : colors)
                Util.write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase()))
                        , String.format(template, style.contains("Filled") ? "@color/" + color + ".600" : "@color/" + color + ".100"
                                , style.contains("Center") || style.contains("Top") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Top") || style.contains("Left") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Left") ? 0 : 4
                                , style.contains("Bordered")
                                        ? "            <stroke\n" +
                                        "                android:width=\"1dp\"\n" +
                                        "                android:color=\"@color/" + color + ".600\"/>\n" : ""));
    }

    public static void generateStateNormal(File folder) throws IOException {
        String file = "background_%s_%s_normal.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<layer-list xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <item>\n" +
                "        <shape>\n" +
                "            <solid android:color=\"%s\"/>\n" +
                "            <corners\n" +
                "                android:bottomLeftRadius=\"%ddp\"\n" +
                "                android:bottomRightRadius=\"%ddp\"\n" +
                "                android:topLeftRadius=\"%ddp\"\n" +
                "                android:topRightRadius=\"%ddp\"/>\n" +
                "%s" +
                "        </shape>\n" +
                "    </item>\n" +
                "</layer-list>";
        for (String style : styles)
            for (String color : colors)
                Util.write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase()))
                        , String.format(template, style.contains("Filled") ? "@color/" + color + ".600" : "#00000000"
                                , style.contains("Center") || style.contains("Top") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Top") || style.contains("Left") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Right") ? 0 : 4
                                , style.contains("Center") || style.contains("Bottom") || style.contains("Left") ? 0 : 4
                                , style.contains("Bordered")
                                        ? "            <stroke\n" +
                                        "                android:width=\"1dp\"\n" +
                                        "                android:color=\"@color/" + color + ".600\"/>\n" : ""));
    }
}
