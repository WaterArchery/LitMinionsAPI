package me.waterarchery.litminions.models;

import me.waterarchery.litminions.models.minions.Minion;
import org.bukkit.Location;

import java.util.List;

public class MinionHologram {

    private final Minion minion;

    public MinionHologram(Minion minion) {
        this.minion = minion;
    }

    public void create() { }

    public void update() { }

    public void update(List<String> lines) { }

    public void delete() { }

    public Location getHologramLocation() { return null; }

    public void toggleHologram() { }

}
