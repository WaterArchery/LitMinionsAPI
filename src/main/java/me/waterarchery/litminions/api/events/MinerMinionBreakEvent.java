package me.waterarchery.litminions.api.events;

import me.waterarchery.litminions.models.minions.types.MinerMinion;
import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class MinerMinionBreakEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;
    private MinerMinion minion;
    private Collection<ItemStack> drops;
    private Block block;

    public MinerMinionBreakEvent(MinerMinion minion, Collection<ItemStack> drops, Block block) {
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

    public MinerMinion getMinion() {
        return minion;
    }

    public Collection<ItemStack> getDrops() {
        return drops;
    }

    public void setDrops(Collection<ItemStack> drops) {
        this.drops = drops;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlocks(Block block) {
        this.block = block;
    }
}
