# pit-grinder-mod-final
grinds pit, uses an API for instructions

requires an authorization token

### usage:
- **important:** create a text file in your .minecraft folder called `token.txt` and put your authorization token in there
- press J to toggle bot
- press K to toggle built-in autoclicker (do not use if using external killaura or autoclicker)
- press F3 + P once to disable pausing when minecraft is not in focus

### vape/other settings:
- if using vape killaura or autoclicker then don't use built-in autoclicker
- if using vape killaura:
  - set 'allowed items' to 'sword'
  - set it to disable killaura when any gui is open

### list of data that is sent to the API:
- authorization token
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

### building
yeah i don't understand building properly so i just manually put the contents of all of the .jars in `dependencyjars` into the .jar after `gradlew build`
