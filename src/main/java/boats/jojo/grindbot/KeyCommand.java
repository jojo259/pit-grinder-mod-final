package boats.jojo.grindbot;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KeyCommand implements ICommand {

    private final List aliases;

    public KeyCommand() {
        this.aliases = new ArrayList();
        aliases.add("st");
        aliases.add("sk");
        aliases.add("settoken");
    }

    @Override
    public String getCommandName() {
        return "setkey";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "setkey <key>";
    }

    @Override
    public List<String> getCommandAliases() {
        return aliases;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (args.length == 0) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Invalid key!"));
            return;
        }
        try {
            FileWriter myWriter = new FileWriter("key.txt");
            myWriter.write(args[0]);
            myWriter.close();
        } catch (IOException e) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Something went wrong.."));
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        GrindBot.apiKey = args[0];
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Set key successfully!"));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}