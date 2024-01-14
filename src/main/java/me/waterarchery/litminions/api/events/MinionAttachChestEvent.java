package me.waterarchery.litminions.api.events;


import me.waterarchery.litminions.cache.minions.Minion;
import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MinionAttachChestEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;
    private Minion minion;
    private Block chest;

    public MinionAttachChestEvent(Minion minion, Block chest) {
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }
    @Override
    public void setCancelled(boolean cancelled) {
        this.isCancelled = cancelled;
    }
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }
    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
    public Minion getMinion() {
        return minion;
    }
    public Block getChest() {
        return chest;
    }
    public void setChest(Block chest){this.chest = chest;}

}
