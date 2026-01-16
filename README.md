# Hytale Example Mod

This is my mod template for building mods on Hytale.

## Setting up

I use IntelliJ as my preferred IDE for coding.

1. Add `HytaleServer.jar` via Project Structure settings
   1. Go to `File > Project Structure > Libraries`
   2. Add Java file library and navigate to the JAR of the Hytale Server.
2. In `gradle.properties`, change `hytale_home_dir` to the path **you have Hytale installed** (not the `hytale/install` directory).
3. Update your mod's metadata in `build.gradle`
   1. To change the fields NOT listed in the `build.gradle` file, modify the `manifest.json` file.

## Running the mod

To run your mod, you have two options:
1. Use the `deployPlugin` gradle task to copy the build plugin to your Hytale mods directory
2. **FOR DEVELOPMENT**: Use the `HytaleServer` run configuration **in debug mode**

### For development

Launch your mod using the `HytaleServer` run configuration with the **Debug** launch button. When you make changes to
your mod, you will be able to **hot-swap** your code while the server is running.
