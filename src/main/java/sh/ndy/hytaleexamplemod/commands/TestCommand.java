package sh.ndy.hytaleexamplemod.commands;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.protocol.GameMode;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.AbstractAsyncPlayerCommand;
import com.hypixel.hytale.server.core.modules.entity.damage.Damage;
import com.hypixel.hytale.server.core.modules.entity.damage.DamageCause;
import com.hypixel.hytale.server.core.modules.entity.damage.DeathComponent;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.World;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;

import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

public class TestCommand extends AbstractAsyncPlayerCommand {
    public TestCommand() {
        super("hello", "Prints \"world!\"");
        this.setPermissionGroup(GameMode.Adventure);
    }

    @Nonnull
    @Override
    protected CompletableFuture<Void> executeAsync(CommandContext commandContext, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world) {
        commandContext.sendMessage(Message.raw("world!"));
        Damage.CommandSource damageSource = new Damage.CommandSource(commandContext.sender(), "hello");
        DeathComponent.tryAddComponent(world.getEntityStore().getStore(), playerRef.getReference(), new Damage(damageSource, DamageCause.DROWNING, 999));

        return null;
    }
}
