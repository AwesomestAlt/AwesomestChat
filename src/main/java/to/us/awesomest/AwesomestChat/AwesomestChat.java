package to.us.awesomest.AwesomestChat;

import org.bukkit.plugin.java.JavaPlugin;

public class AwesomestChat extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Enabled AwesomestChat v0.1");
    }
    @Override
    public void onDisable() {
        getLogger().info("Disabled AwesomestChat v0.1. If this is a reload, please restart as reloads are not supported.");
    }
}
