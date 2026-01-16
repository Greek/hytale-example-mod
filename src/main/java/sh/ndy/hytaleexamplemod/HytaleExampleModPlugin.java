package sh.ndy.hytaleexamplemod;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import sh.ndy.hytaleexamplemod.commands.TestCommand;

import java.util.logging.Level;

public class HytaleExampleModPlugin extends JavaPlugin {
    private static HytaleExampleModPlugin instance;

    public HytaleExampleModPlugin(JavaPluginInit init) {
        super(init);

        instance = this;
    }

    public static HytaleExampleModPlugin getInstance() {
        return instance;
    }

    @Override
    protected void setup() {
        super.setup();

        this.getLogger().at(Level.INFO).log("Initialized mod.");
        this.getCommandRegistry().registerCommand(new TestCommand());
    }

    @Override
    protected void shutdown() {
        super.shutdown();
    }
}