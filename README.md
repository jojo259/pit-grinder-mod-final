# Jojo Grinder

Grinds Hypixel Pit; uses an API for instructions

Requires an authorization key

### Usage

- Use /setkey \<key\> to set your authorization key
- Press J to toggle bot
- Press K to toggle built-in autoclicker (do not use if using external KillAura or autoclicker)
- Press F3 + P once to disable pausing when minecraft is not in focus
- Your Hypixel language must be set to English

### Vape/other settings

- If using Vape KillAura or autoclicker then don't use built-in autoclicker
- If using Vape KillAura:
  - Set 'allowed items' to 'sword'
  - Set it to disable KillAura when any GUI is open
  - You will also need to make the KillAura attack without mouse down

### API info

The mod sends a bunch of information about your game to a web API. The API then responds with instructions on what your bot should do.

If you would like to know exactly what is sent then you can ask in the Discord or look through the code.

### Contributing

- **MAKE SURE YOU'RE USING JAVA JDK 8.**
- Open the repo with your favorite IDE
- Gradle should sync automatically and build dependencies, if not get a better IDE or run `gradlew setupDecompWorkspace`
- If you're using eclipse you can optionally run `gradlew eclipse` to generate a .launch file to run the project
- Make your changes
- Run the gradle build task through your IDE or through `gradlew build`. The mod JAR will be built inside `/build/libs`
- You should now have a valid JAR. Make sure to test it and run with Forge before pushing - if you're contributing then you can ask in the Discord for a working key to test with

Feel free to suggest improvements.
