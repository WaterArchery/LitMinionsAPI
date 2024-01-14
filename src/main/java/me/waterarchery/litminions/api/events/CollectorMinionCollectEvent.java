package me.waterarchery.litminions.api.events;

import me.waterarchery.litminions.cache.minions.types.CollectorMinion;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class CollectorMinionCollectEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;
    private final CollectorMinion minion;
    private Collection<ItemStack> drops;

    public CollectorMinionCollectEvent(CollectorMinion minion, Collection<ItemStack> drops) {
        this.minion = minion;
        this.drops = drops;
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

    public CollectorMinion getMinion() {
        return minion;
    }

    public Collection<ItemStack> getDrops() {
        return drops;
    }

    public void setDrops(Collection<ItemStack> drops) {
        this.drops = drops;
    }

}
