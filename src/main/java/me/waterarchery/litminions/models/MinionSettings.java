package me.waterarchery.litminions.models;

import me.waterarchery.litminions.models.minions.Minion;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MinionSettings {

    private final Minion minion;
    private boolean isWorking;
    private boolean isHologramEnabled;
    private boolean isParticleEnabled;
    private String selectedParticle;
    private final List<UUID> trustedPlayers = new ArrayList<>();

    public MinionSettings(Minion minion) {
        this.minion = minion;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) { }

    public boolean isHologramEnabled() {
        return isHologramEnabled;
    }

    public void setHologramEnabled(boolean hologramEnabled) {
        isHologramEnabled = hologramEnabled;
    }

    public void addTrustedPlayer(UUID uuid) {
        trustedPlayers.add(uuid);
    }

    public void removeTrustedPlayer(UUID uuid) {
        trustedPlayers.remove(uuid);
    }

    public List<UUID> getTrustedPlayers() {
        return trustedPlayers;
    }

    public boolean isParticleEnabled() {
        return isParticleEnabled;
    }

    public void setParticleEnabled(boolean particleEnabled) {
        isParticleEnabled = particleEnabled;
    }

    public String getSelectedParticle() {
        return selectedParticle;
    }

    public void setSelectedParticle(String selectedParticle) {
        this.selectedParticle = selectedParticle;
    }

}
