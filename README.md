# Jojo Grinder!

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

### Manual Compilation

*Although this guide is built for IntelliJ, it will work with any IDE you choose as long as you set the java executables properly.*

- Clone the repository and open it up with Intellij.
- Don't worry! Things will break when you first open it up, this is normal!
- Go to `File -> Project Structure -> Project` and set the SDK to 1.8. (You can click `Add SDK -> Download JDK` (And that will also work!)
- Now we need to set the gradle version. Click on the `Gradle` tab (the default is in the top right tab), click the gear, and then hit `Gradle Settings`
- Now assign the Gradle JVM to JDK 17. Like in step 3, you may use the downloaded Amazon Corretto build.
- Sync your Gradle tasks by hitting the reload icon and wait for everything to load.
- Now to build, go back to the Gradle tab and click `Tasks -> Build -> Jar` and in a few minutes you can find the jar in the build folder.


### Contributing
*Follow everything above for Manual Compilation*

#### Setting up a development environment
If you've just finished the steps above you should see a `Minecraft Client` task in the top (If you don't you might have to restart IntellIJ first), this gives you a live enviroment for rapid prototyping

If you can't see that task, it may be hidden in your task list: click on the dropdown arrow next to the current task, select "All Configurations", and select the "Minecraft Client" task.

#### Setting up DevAuth
This project comes with [DevAuth](https://github.com/DJtheRedstoner/DevAuth) built in and ready to go!
To set it up, create the following file: `C:\Users\<name>\.devauth\config.toml` and copy paste the following:
```toml
# chose if DevAuth should be on by default in new projects
defaultEnabled = true

# choose which account to use when devauth.account property is not specified
defaultAccount = "alt"

# a microsoft account
# note that setting username and password IS NOT required and does nothing
[accounts.alt]
type = "microsoft"
```
*(found from [here](https://github.com/DJtheRedstoner/DevAuth#config-file-format))*

Now you just have to launch the Minecraft Client task in IntelliJ. As the game starts up you'll get prompted with an OAuth link. After signing in it will automatically sign you in with it!


Feel free to suggest improvements.
