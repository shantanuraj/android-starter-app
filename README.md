#android-starter-app

##Overview

A quick starting point, to build material design android apps using the Support Library for backward compatibility.

##Includes
 * Material support theme.
 * Entire [material color palette.](http://www.google.com/design/spec/style/color.html#color-color-palette)
 * BaseActivity, for easily creating activities.
 * Some common icons (drawer, settings)

##Usage
 Just clone the repo

	git clone https://github.com/shantanuraj/android-starter-app <YOUR_APP_NAME>

 Run the app to launch the included activity implementation, utlising BaseActivity.

 To get rid of it, simply delete the demo folder.

 	rm -r app/src/main/java/io/sixth/baseapp/demo

 Change the `applicationId` to your package name in **app/build.gradle**, and in the **AndroidManifest.xml**. You are ready to start hacking.

## License
MIT License
Copyright 2015 [Shantanu Raj](http://sraj.me)