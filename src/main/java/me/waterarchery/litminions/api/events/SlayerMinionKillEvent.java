package me.waterarchery.litminions.api.events;

import me.waterarchery.litminions.models.minions.types.SlayerMinion;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Collection;

public class SlayerMinionKillEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;
    private final SlayerMinion minion;
    private Collection<Entity> entites;

    public SlayerMinionKillEvent(SlayerMinion minion, Collection<Entity> entites) {
        this.minion = minion;
        this.entites = entites;
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

    public SlayerMinion getMinion() {
        return minion;
    }

    public Collection<Entity> getEntites() {
        return entites;
    }

}
