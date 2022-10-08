# pit-grinder-mod-final
grinds pit, uses an API for instructions

requires an authorization key

### usage:
- **important:** create a text file in your .minecraft folder called `key.txt` and put your authorization key in there
- press J to toggle bot
- press K to toggle built-in autoclicker (do not use if using external killaura or autoclicker)
- press F3 + P once to disable pausing when minecraft is not in focus

### vape/other settings:
- if using vape killaura or autoclicker then don't use built-in autoclicker
- if using vape killaura:
  - set 'allowed items' to 'sword'
  - set it to disable killaura when any gui is open

### list of data that is sent to the API:
- authorization key
- client username
- client uuid
- client position
- client viewing angles
- client inventory
- all visible player usernames + positions + healths + armor values
- middle block of spawn
- last player chat message
- container items
- dropped item entities
- important chat msg (event starting, mystic drop etc.)
- current open gui type
- villager positions
- client health

if you're not ok with all of this data being sent to the API then don't run the mod

### contributing
- **MAKE SURE YOU'RE USING JAVA JDK 8.**
- Open the repo with your favorite IDE.
- Gradle should sync automatically and build dependencies, if not get a better IDE or run `gradlew setupDecompWorkspace`.
- If you're using eclipse you can optionally run `gradlew eclipse` to generate a .launch file to run the project.
- Make your changes
- Increment version number [here](https://github.com/jojo259/pit-grinder-mod-final/blob/7c0c99ffc14439ae440527381bef4d155dba252c/src/main/java/boats/jojo/grindbot/GrindBot.java#L48) and [here](https://github.com/jojo259/pit-grinder-mod-final/blob/7c0c99ffc14439ae440527381bef4d155dba252c/src/main/resources/mcmod.info#L6)
- Run the gradle build task through your ide or through `gradlew build`
- Now you need to merge all of the jars into one. We don't have a good way of doing this, but the current method that I use is to unzip all of the jars inside "dependencyjars" into a folder using a tool like WinRAR.
- After that take the jar you built and unzip it into that folder as well. Make sure to hit yes on any override prompts.
- Finally go into the folder in your terminal and type `jar cvf gb-versionnumber.jar .`
- You should now have a valid jar, make sure to test it and run with forge before pushing.

Please feel free to make this better we know it sucks.