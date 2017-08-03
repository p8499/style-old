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
```

**Step 3**
Remove the original app/values/styles.xml file

**Step 4**
Verify you have
```xml
<application
   android:theme="@style/AppTheme"
   ...
/>
```
in AndroidManifest.xml