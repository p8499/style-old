package com.p8499.style;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.p8499.style.Util.*;

/**
 * Created by Administrator on 3/20/2017.
 */
public class ValueGenerator {
    public static void generateColors(File folder) throws IOException {
        String file = "colors.xml";
        Util.write(new File(folder, file), "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "    <color name=\"Red.050\">#ffffebee</color>\n" +
                "    <color name=\"Red.100\">#ffffcdd2</color>\n" +
                "    <color name=\"Red.200\">#ffef9a9a</color>\n" +
                "    <color name=\"Red.300\">#ffe57373</color>\n" +
                "    <color name=\"Red.400\">#ffef5350</color>\n" +
                "    <color name=\"Red.500\">#fff44336</color>\n" +
                "    <color name=\"Red.600\">#ffe53935</color>\n" +
                "    <color name=\"Red.700\">#ffd32f2f</color>\n" +
                "    <color name=\"Red.800\">#ffc62828</color>\n" +
                "    <color name=\"Red.900\">#ffb71c1c</color>\n" +
                "    <color name=\"Pink.050\">#fffce4ec</color>\n" +
                "    <color name=\"Pink.100\">#fff8bbd0</color>\n" +
                "    <color name=\"Pink.200\">#fff48fb1</color>\n" +
                "    <color name=\"Pink.300\">#fff06292</color>\n" +
                "    <color name=\"Pink.400\">#ffec407a</color>\n" +
                "    <color name=\"Pink.500\">#ffe91e63</color>\n" +
                "    <color name=\"Pink.600\">#ffd81b60</color>\n" +
                "    <color name=\"Pink.700\">#ffc2185b</color>\n" +
                "    <color name=\"Pink.800\">#ffad1457</color>\n" +
                "    <color name=\"Pink.900\">#ff880e4f</color>\n" +
                "    <color name=\"Purple.050\">#fff3e5f5</color>\n" +
                "    <color name=\"Purple.100\">#ffe1bee7</color>\n" +
                "    <color name=\"Purple.200\">#ffce93d8</color>\n" +
                "    <color name=\"Purple.300\">#ffba68c8</color>\n" +
                "    <color name=\"Purple.400\">#ffab47bc</color>\n" +
                "    <color name=\"Purple.500\">#ff9c27b0</color>\n" +
                "    <color name=\"Purple.600\">#ff8e24aa</color>\n" +
                "    <color name=\"Purple.700\">#ff7b1fa2</color>\n" +
                "    <color name=\"Purple.800\">#ff6a1b9a</color>\n" +
                "    <color name=\"Purple.900\">#ff4a148c</color>\n" +
                "    <color name=\"Indigo.050\">#ffe8eaf6</color>\n" +
                "    <color name=\"Indigo.100\">#ffc5cae9</color>\n" +
                "    <color name=\"Indigo.200\">#ff9fa8da</color>\n" +
                "    <color name=\"Indigo.300\">#ff7986cb</color>\n" +
                "    <color name=\"Indigo.400\">#ff5c6bc0</color>\n" +
                "    <color name=\"Indigo.500\">#ff3f51b5</color>\n" +
                "    <color name=\"Indigo.600\">#ff3949ab</color>\n" +
                "    <color name=\"Indigo.700\">#ff303f9f</color>\n" +
                "    <color name=\"Indigo.800\">#ff283593</color>\n" +
                "    <color name=\"Indigo.900\">#ff1a237e</color>\n" +
                "    <color name=\"Blue.050\">#ffe3f2fd</color>\n" +
                "    <color name=\"Blue.100\">#ffbbdefb</color>\n" +
                "    <color name=\"Blue.200\">#ff90caf9</color>\n" +
                "    <color name=\"Blue.300\">#ff64b5f6</color>\n" +
                "    <color name=\"Blue.400\">#ff42a5f5</color>\n" +
                "    <color name=\"Blue.500\">#ff2196f3</color>\n" +
                "    <color name=\"Blue.600\">#ff1e88e5</color>\n" +
                "    <color name=\"Blue.700\">#ff1976d2</color>\n" +
                "    <color name=\"Blue.800\">#ff1565c0</color>\n" +
                "    <color name=\"Blue.900\">#ff0d47a1</color>\n" +
                "    <color name=\"Cyan.050\">#ffe0f7fa</color>\n" +
                "    <color name=\"Cyan.100\">#ffb2ebf2</color>\n" +
                "    <color name=\"Cyan.200\">#ff80deea</color>\n" +
                "    <color name=\"Cyan.300\">#ff4dd0e1</color>\n" +
                "    <color name=\"Cyan.400\">#ff26c6da</color>\n" +
                "    <color name=\"Cyan.500\">#ff00bcd4</color>\n" +
                "    <color name=\"Cyan.600\">#ff00acc1</color>\n" +
                "    <color name=\"Cyan.700\">#ff0097a7</color>\n" +
                "    <color name=\"Cyan.800\">#ff00838f</color>\n" +
                "    <color name=\"Cyan.900\">#ff006064</color>\n" +
                "    <color name=\"Teal.050\">#ffe0f2f1</color>\n" +
                "    <color name=\"Teal.100\">#ffb2dfdb</color>\n" +
                "    <color name=\"Teal.200\">#ff80cbc4</color>\n" +
                "    <color name=\"Teal.300\">#ff4db6ac</color>\n" +
                "    <color name=\"Teal.400\">#ff26a69a</color>\n" +
                "    <color name=\"Teal.500\">#ff009688</color>\n" +
                "    <color name=\"Teal.600\">#ff00897b</color>\n" +
                "    <color name=\"Teal.700\">#ff00796b</color>\n" +
                "    <color name=\"Teal.800\">#ff00695c</color>\n" +
                "    <color name=\"Teal.900\">#ff004d40</color>\n" +
                "    <color name=\"Green.050\">#ffe8f5e9</color>\n" +
                "    <color name=\"Green.100\">#ffc8e6c9</color>\n" +
                "    <color name=\"Green.200\">#ffa5d6a7</color>\n" +
                "    <color name=\"Green.300\">#ff81c784</color>\n" +
                "    <color name=\"Green.400\">#ff66bb6a</color>\n" +
                "    <color name=\"Green.500\">#ff4caf50</color>\n" +
                "    <color name=\"Green.600\">#ff43a047</color>\n" +
                "    <color name=\"Green.700\">#ff388e3c</color>\n" +
                "    <color name=\"Green.800\">#ff2e7d32</color>\n" +
                "    <color name=\"Green.900\">#ff1b5e20</color>\n" +
                "    <color name=\"Lime.050\">#fff9fbe7</color>\n" +
                "    <color name=\"Lime.100\">#fff0f4c3</color>\n" +
                "    <color name=\"Lime.200\">#ffe6ee9c</color>\n" +
                "    <color name=\"Lime.300\">#ffdce775</color>\n" +
                "    <color name=\"Lime.400\">#ffd4e157</color>\n" +
                "    <color name=\"Lime.500\">#ffcddc39</color>\n" +
                "    <color name=\"Lime.600\">#ffc0ca33</color>\n" +
                "    <color name=\"Lime.700\">#ffafb42b</color>\n" +
                "    <color name=\"Lime.800\">#ff9e9d24</color>\n" +
                "    <color name=\"Lime.900\">#ff827717</color>\n" +
                "    <color name=\"Yellow.050\">#fffffde7</color>\n" +
                "    <color name=\"Yellow.100\">#fffff9c4</color>\n" +
                "    <color name=\"Yellow.200\">#fffff59d</color>\n" +
                "    <color name=\"Yellow.300\">#fffff176</color>\n" +
                "    <color name=\"Yellow.400\">#ffffee58</color>\n" +
                "    <color name=\"Yellow.500\">#ffffeb3b</color>\n" +
                "    <color name=\"Yellow.600\">#fffdd835</color>\n" +
                "    <color name=\"Yellow.700\">#fffbc02d</color>\n" +
                "    <color name=\"Yellow.800\">#fff9a825</color>\n" +
                "    <color name=\"Yellow.900\">#fff57f17</color>\n" +
                "    <color name=\"Amber.050\">#fffff8e1</color>\n" +
                "    <color name=\"Amber.100\">#ffffecb3</color>\n" +
                "    <color name=\"Amber.200\">#ffffe082</color>\n" +
                "    <color name=\"Amber.300\">#ffffd54f</color>\n" +
                "    <color name=\"Amber.400\">#ffffca28</color>\n" +
                "    <color name=\"Amber.500\">#ffffc107</color>\n" +
                "    <color name=\"Amber.600\">#ffffb300</color>\n" +
                "    <color name=\"Amber.700\">#ffffa000</color>\n" +
                "    <color name=\"Amber.800\">#ffff8f00</color>\n" +
                "    <color name=\"Amber.900\">#ffff6f00</color>\n" +
                "    <color name=\"Orange.050\">#fffff3e0</color>\n" +
                "    <color name=\"Orange.100\">#ffffe0b2</color>\n" +
                "    <color name=\"Orange.200\">#ffffcc80</color>\n" +
                "    <color name=\"Orange.300\">#ffffb74d</color>\n" +
                "    <color name=\"Orange.400\">#ffffa726</color>\n" +
                "    <color name=\"Orange.500\">#ffff9800</color>\n" +
                "    <color name=\"Orange.600\">#fffb8c00</color>\n" +
                "    <color name=\"Orange.700\">#fff57c00</color>\n" +
                "    <color name=\"Orange.800\">#ffef6c00</color>\n" +
                "    <color name=\"Orange.900\">#ffe65100</color>\n" +
                "    <color name=\"Brown.050\">#ffefebe9</color>\n" +
                "    <color name=\"Brown.100\">#ffd7ccc8</color>\n" +
                "    <color name=\"Brown.200\">#ffbcaaa4</color>\n" +
                "    <color name=\"Brown.300\">#ffa1887f</color>\n" +
                "    <color name=\"Brown.400\">#ff8d6e63</color>\n" +
                "    <color name=\"Brown.500\">#ff795548</color>\n" +
                "    <color name=\"Brown.600\">#ff6d4c41</color>\n" +
                "    <color name=\"Brown.700\">#ff5d4037</color>\n" +
                "    <color name=\"Brown.800\">#ff4e342e</color>\n" +
                "    <color name=\"Brown.900\">#ff3e2723</color>\n" +
                "    <color name=\"Grey.050\">#fffafafa</color>\n" +
                "    <color name=\"Grey.100\">#fff5f5f5</color>\n" +
                "    <color name=\"Grey.200\">#ffeeeeee</color>\n" +
                "    <color name=\"Grey.300\">#ffe0e0e0</color>\n" +
                "    <color name=\"Grey.400\">#ffbdbdbd</color>\n" +
                "    <color name=\"Grey.500\">#ff9e9e9e</color>\n" +
                "    <color name=\"Grey.600\">#ff757575</color>\n" +
                "    <color name=\"Grey.700\">#ff616161</color>\n" +
                "    <color name=\"Grey.800\">#ff424242</color>\n" +
                "    <color name=\"Grey.900\">#ff212121</color>\n" +
                "</resources>");
    }

    public static void generateDimens(File folder) throws IOException {
        String file = "dimens.xml";
        Util.write(new File(folder, file), "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "    <item name=\"Percent.100\" type=\"dimen\">100%</item>\n" +
                "    <item name=\"Percent.90\" type=\"dimen\">90%</item>\n" +
                "    <item name=\"Percent.80\" type=\"dimen\">80%</item>\n" +
                "    <item name=\"Percent.70\" type=\"dimen\">70%</item>\n" +
                "    <item name=\"Percent.60\" type=\"dimen\">60%</item>\n" +
                "    <item name=\"Percent.50\" type=\"dimen\">50%</item>\n" +
                "    <item name=\"Percent.40\" type=\"dimen\">40%</item>\n" +
                "    <item name=\"Percent.30\" type=\"dimen\">30%</item>\n" +
                "    <item name=\"Percent.20\" type=\"dimen\">20%</item>\n" +
                "    <item name=\"Percent.10\" type=\"dimen\">10%</item>\n" +
                "    <item name=\"Percent.00\" type=\"dimen\">00%</item>\n" +
                "    <dimen name=\"Size.A\">56dp</dimen>\n" +
                "    <dimen name=\"Size.B\">52dp</dimen>\n" +
                "    <dimen name=\"Size.C\">48dp</dimen>\n" +
                "    <dimen name=\"Size.D\">44dp</dimen>\n" +
                "    <dimen name=\"Size.E\">40dp</dimen>\n" +
                "    <dimen name=\"Size.F\">36dp</dimen>\n" +
                "    <dimen name=\"Size.G\">32dp</dimen>\n" +
                "    <dimen name=\"Size.H\">28dp</dimen>\n" +
                "    <dimen name=\"Size.I\">24dp</dimen>\n" +
                "    <dimen name=\"Size.J\">20dp</dimen>\n" +
                "    <dimen name=\"Size.K\">16dp</dimen>\n" +
                "    <dimen name=\"Distance.0\">0dp</dimen>\n" +
                "    <dimen name=\"Distance.1\">1dp</dimen>\n" +
                "    <dimen name=\"Distance.2\">2dp</dimen>\n" +
                "    <dimen name=\"Distance.3\">3dp</dimen>\n" +
                "    <dimen name=\"Distance.4\">4dp</dimen>\n" +
                "    <dimen name=\"Distance.5\">5dp</dimen>\n" +
                "    <dimen name=\"Distance.6\">6dp</dimen>\n" +
                "    <dimen name=\"Distance.7\">7dp</dimen>\n" +
                "    <dimen name=\"Distance.8\">8dp</dimen>\n" +
                "    <dimen name=\"Distance.9\">9dp</dimen>\n" +
                "    <dimen name=\"Distance.10\">10dp</dimen>\n" +
                "    <dimen name=\"Distance.11\">11dp</dimen>\n" +
                "    <dimen name=\"Distance.12\">12dp</dimen>\n" +
                "    <dimen name=\"Distance.13\">13dp</dimen>\n" +
                "    <dimen name=\"Distance.14\">14dp</dimen>\n" +
                "    <dimen name=\"Distance.15\">15dp</dimen>\n" +
                "    <dimen name=\"Distance.16\">16dp</dimen>\n" +
                "    <dimen name=\"Text.A\">28sp</dimen>\n" +
                "    <dimen name=\"Text.B\">26sp</dimen>\n" +
                "    <dimen name=\"Text.C\">24sp</dimen>\n" +
                "    <dimen name=\"Text.D\">22sp</dimen>\n" +
                "    <dimen name=\"Text.E\">20sp</dimen>\n" +
                "    <dimen name=\"Text.F\">18sp</dimen>\n" +
                "    <dimen name=\"Text.G\">16sp</dimen>\n" +
                "    <dimen name=\"Text.H\">14sp</dimen>\n" +
                "    <dimen name=\"Text.I\">12sp</dimen>\n" +
                "    <dimen name=\"Text.J\">10sp</dimen>\n" +
                "    <dimen name=\"Text.K\">8sp</dimen>\n" +
                "    <dimen name=\"TextPadding.A\">7.4dp</dimen>\n" +
                "    <dimen name=\"TextPadding.B\">7.3dp</dimen>\n" +
                "    <dimen name=\"TextPadding.C\">7.2dp</dimen>\n" +
                "    <dimen name=\"TextPadding.D\">7.1dp</dimen>\n" +
                "    <dimen name=\"TextPadding.E\">7.0dp</dimen>\n" +
                "    <dimen name=\"TextPadding.F\">6.9dp</dimen>\n" +
                "    <dimen name=\"TextPadding.G\">6.8dp</dimen>\n" +
                "    <dimen name=\"TextPadding.H\">6.7dp</dimen>\n" +
                "    <dimen name=\"TextPadding.I\">6.6dp</dimen>\n" +
                "    <dimen name=\"TextPadding.J\">6.5dp</dimen>\n" +
                "    <dimen name=\"TextPadding.K\">6.4dp</dimen>\n" +
                "</resources>");
    }

    public static void generateStyleWindow(File folder) throws IOException {
        String file = "style_window.xml";
        Util.write(new File(folder, file), "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<resources>\n" +
                "    <style name=\"AppTheme\" parent=\"Theme.AppCompat.Light.NoActionBar\">\n" +
                "        <item name=\"windowActionBar\">false</item>\n" +
                "        <item name=\"windowNoTitle\">true</item>\n" +
                "        <item name=\"colorPrimary\">@color/" + colorPrimary + ".600</item>\n" +
                "        <item name=\"colorPrimaryDark\">@color/" + colorPrimary + ".800</item>\n" +
                "        <item name=\"colorAccent\">@color/" + colorAccent + ".500</item>\n" +
                "        <item name=\"actionBarSize\">48dp</item>\n" +
                "    </style>\n" +
                "    <style name=\"DialogTheme\" parent=\"Theme.AppCompat.Light.NoActionBar\">\n" +
                "        <item name=\"windowActionBar\">false</item>\n" +
                "        <item name=\"android:windowNoTitle\">true</item>\n" +
                "        <item name=\"android:windowIsFloating\">true</item>\n" +
                "        <item name=\"android:backgroundDimEnabled\">true</item>\n" +
                "        <item name=\"android:backgroundDimAmount\">0.5</item>\n" +
                "        <item name=\"android:windowCloseOnTouchOutside\">true</item>\n" +
                "        <item name=\"windowMinWidthMajor\">@dimen/Percent.100</item>\n" +
                "        <item name=\"windowMinWidthMinor\">@dimen/Percent.100</item>\n" +
                "        <item name=\"android:windowFullscreen\">true</item>\n" +
                "        <item name=\"android:windowBackground\">@android:color/transparent</item>\n" +
                "        <item name=\"android:windowIsTranslucent\">false</item>\n" +
                "    </style>\n" +
                "</resources>");
    }

    public static void generateStyleButton(File folder) throws IOException {
        String file = "style_button_%s_%s_%s.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "    <style name=\"Button_%s_%s_%s\">\n" +
                "        <item name=\"android:textAllCaps\">false</item>\n" +
                "        <item name=\"android:background\">@drawable/background_%s_%s</item>\n" +
                "        <item name=\"android:gravity\">center</item>\n" +
                "        <item name=\"android:textColor\">%s</item>\n" +
                "        <item name=\"android:layout_height\">@dimen/Size.%s</item>\n" +
                "        <item name=\"android:textSize\">@dimen/Text.%s</item>\n" +
                "    </style>\n" +
                "</resources>";
        for (String style : styles)
            for (String color : colors)
                for (String size : sizes)
                    Util.write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase(), size.toLowerCase()))
                            , String.format(template, style, color, size, style.toLowerCase(), color.toLowerCase(), style.contains("Filled") ? "#ffffffff" : "@color/" + color + ".600", size, size));
    }

    public static void generateStyleTextView(File folder) throws IOException {
        String file = "style_textview_%s_%s.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "    <style name=\"TextView_%s_%s\">\n" +
                "        <item name=\"android:textColor\">%s</item>\n" +
                "        <item name=\"android:textSize\">@dimen/Text.%s</item>\n" +
                "    </style>\n" +
                "</resources>";
        List<String> textColors = new ArrayList<String>(colors);
        textColors.add("White");
        for (String textColor : textColors)
            for (String size : sizes)
                write(new File(folder, String.format(file, textColor.toLowerCase(), size.toLowerCase()))
                        , String.format(template, textColor, size, textColor.equals("White") ? "#ffffffff" : "@color/" + textColor + ".600", size));
    }

    public static void generateStyleEditText(File folder) throws IOException {
        String file = "style_edittext_%s_%s_%s.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "    <style name=\"EditText_%s_%s_%s\">\n" +
                "        <item name=\"android:background\">@drawable/background_%s_%s</item>\n" +
                "        <item name=\"android:textColor\">%s</item>\n" +
                "        <item name=\"android:textColorHint\">%s</item>\n" +
                "        <item name=\"android:layout_height\">@dimen/Size.%s</item>\n" +
                "        <item name=\"android:textSize\">@dimen/Text.%s</item>\n" +
                "        <item name=\"android:paddingLeft\">@dimen/TextPadding.%s</item>\n" +
                "        <item name=\"android:paddingRight\">@dimen/TextPadding.%s</item>\n" +
                "    </style>\n" +
                "</resources>";
        for (String style : styles)
            for (String color : colors)
                for (String size : sizes)
                    write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase(), size.toLowerCase()))
                            , String.format(template, style, color, size, style.toLowerCase(), color.toLowerCase(), style.contains("Filled") ? "#ffffffff" : "@color/" + color + ".600", style.contains("Filled") ? "#77ffffff" : "@color/" + color + ".400", size, size, size, size));
    }

    public static void generateStyleSeparator(File folder) throws IOException {
        String file = "style_layout_separator.xml";
        write(new File(folder, file), "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "    <style name=\"Separator\">\n" +
                "        <item name=\"android:layout_height\">@dimen/Distance.1</item>\n" +
                "        <item name=\"android:background\">@color/Grey.300</item>\n" +
                "    </style>\n" +
                "</resources>");
    }

    public static void generateStyleLayout(File folder) throws IOException {
        String file = "style_layout_%s_%s_%d.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "    <style name=\"Layout_%s_%s_%d\">\n" +
                "        <item name=\"android:background\">@drawable/background_%s_%s</item>\n" +
                "        <item name=\"android:paddingTop\">@dimen/Distance.%d</item>\n" +
                "        <item name=\"android:paddingBottom\">@dimen/Distance.%d</item>\n" +
                "        <item name=\"android:paddingLeft\">@dimen/Distance.%d</item>\n" +
                "        <item name=\"android:paddingRight\">@dimen/Distance.%d</item>\n" +
                "    </style>\n" +
                "</resources>";
        for (String style : styles)
            for (String color : colors)
                for (Integer distance : distances)
                    write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase(), distance))
                            , String.format(template, style, color, distance, style.toLowerCase(), color.toLowerCase(), distance, distance, distance, distance));
    }

    public static void generateStyleImageView(File folder) throws IOException {
        String file = "style_imageview_%s_%s_%s_%d.xml";
        String template = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<resources>\n" +
                "    <style name=\"ImageView_%s_%s_%s_%d\">\n" +
                "        <item name=\"android:layout_height\">@dimen/Size.%s</item>\n" +
                "        <item name=\"android:layout_width\">@dimen/Size.%s</item>\n" +
                "        <item name=\"android:background\">@drawable/background_%s_%s</item>\n" +
                "        <item name=\"android:paddingTop\">@dimen/Distance.%d</item>\n" +
                "        <item name=\"android:paddingBottom\">@dimen/Distance.%d</item>\n" +
                "        <item name=\"android:paddingLeft\">@dimen/Distance.%d</item>\n" +
                "        <item name=\"android:paddingRight\">@dimen/Distance.%d</item>\n" +
                "    </style>\n" +
                "</resources>";
        for (String style : styles)
            for (String color : colors)
                for (int sizeIndex = 0; sizeIndex < sizes.size(); sizeIndex++)
                    for (Integer scale : scales) {
                        String size = sizes.get(sizeIndex);
                        Integer distance = (56 - sizeIndex * 4) * (100 - scale) / 100 / 2;
                        write(new File(folder, String.format(file, style.toLowerCase(), color.toLowerCase(), size.toLowerCase(), scale))
                                , String.format(template, style, color, size, scale, size, size, style.toLowerCase(), color.toLowerCase(), distance, distance, distance, distance));
                    }
    }

}
