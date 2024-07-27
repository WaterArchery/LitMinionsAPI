package me.waterarchery.litminions.api.events;

import me.waterarchery.litminions.models.minions.types.SellerMinion;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SellerMinionSellEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final SellerMinion minion;
    private double price;

    public SellerMinionSellEvent(SellerMinion minion, double price) {
        this.minion = minion;
        this.price = price;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public SellerMinion getMinion() {
        return minion;
    }

    public double getPrice() {
        return price;
    }

}
