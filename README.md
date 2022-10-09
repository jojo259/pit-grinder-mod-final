# pit-grinder-mod-final
Grinds pit, uses an API for instructions

Requires an authorization key

### Usage:
- Use /setkey <key> to set your authorization key
- Press J to toggle bot
- Press K to toggle built-in autoclicker (do not use if using external killaura or autoclicker)
- Press F3 + P once to disable pausing when minecraft is not in focus

### Vape/other settings:
- If using Vape killaura or autoclicker then don't use built-in autoclicker
- If using Vape killaura:
  - Set 'allowed items' to 'sword'
  - Set it to disable killaura when any gui is open

### List of data that is sent to the API:
- Authorization key
- Client username
- Client uuid
- Client position
- Client viewing angles
- Client inventory
- All visible player usernames + positions + healths + armor values
- Middle block of spawn
- Last player chat message
- Container items
- Dropped item entities
- Important chat message (event starting, mystic drop etc.)
- Current open gui type
- Villager positions
- Client health

If you're not ok with all of this data being sent to the API then don't run the mod

### Contributing
- **MAKE SURE YOU'RE USING JAVA JDK 8.**
- Open the repo with your favorite IDE
- Gradle should sync automatically and build dependencies, if not get a better IDE or run `gradlew setupDecompWorkspace`
- If you're using eclipse you can optionally run `gradlew eclipse` to generate a .launch file to run the project
- Make your changes
- Run the gradle build task through your IDE or through `gradlew build`, the mod jar will be built inside `/build/libs`
- Now you need to add all of the dependencies into the jar. We don't have a good way of doing this, but the current method is to unzip all of the jars inside "dependencyjars" into a folder using a tool like WinRAR
- Next, open the mod jar with WinRAR and add the extracted contents of the "dependencyjars" into the mod jar
- You should now have a valid jar, make sure to test it and run with Forge before pushing - if you're contributing and need a key to test with just ask

Please feel free to suggest improvements.
