# style

**Step 1**
On Windows, cd to build/libs, then run
```bat
java -jar .\style-1.0-SNAPSHOT.jar .\config.properties
```
The res folder will be created after that.
For advanced usage, you can edit the config.properties file.

**Step 2**
Open an existing project in Android Studio, then create a new android module.
You can name this module to 'style'.
link this module to app module
```gradle
compile project(path: ':style')
compile 'com.android.support:design:25.0.1'
compile 'com.android.support:cardview-v7:25.0.1'
```
Do not forget to set the version to the latest.

**Step 3**
Verify you have this code in AndroidManifest.xml
```xml
<application
   android:theme="@style/AppTheme"
   ...
/>
```

**Step 4**
Remove the original app/values/styles.xml file.
This will redicrect the link to style_window.xml in style module
.