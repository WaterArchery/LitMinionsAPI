package me.waterarchery.litminions.api.events;

import me.waterarchery.litminions.models.minions.types.LumberjackMinion;
import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class LumberjackMinionChopEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;
    private final LumberjackMinion minion;
    private Collection<ItemStack> drops;
    private  Collection<Block> blocks;

    public LumberjackMinionChopEvent(LumberjackMinion minion, Collection<ItemStack> drops, Collection<Block> blocks) {
        this.minion = minion;
        this.drops = drops;
        this.blocks = blocks;
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

    public LumberjackMinion getMinion() {
        return minion;
    }

    public Collection<ItemStack> getDrops() {
        return drops;
    }

    public void setDrops(Collection<ItemStack> drops) {
        this.drops = drops;
    }

    public  Collection<Block> getBlock() {
        return blocks;
    }
}
