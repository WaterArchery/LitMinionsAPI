package me.waterarchery.litminions.models;

import me.waterarchery.litminions.models.minions.Minion;
import org.bukkit.scheduler.BukkitTask;

public class MinionTaskManager {

    private final Minion minion;
    private BukkitTask actionTask;
    private BukkitTask moveTask;
    private BukkitTask talkTask;
    private BukkitTask hologramUpdateTask;
    private int actionPerTick;
    private int movePerTick;
    private int talkPerTick;
    private int hologramPerSecond;

    public MinionTaskManager(Minion minion) {
        this.minion = minion;
    }

    public void assignTickAction(String id) { }

    public void startPickUpTask() { }

    public int getStartTick() { return 1; }

    public void cancelTalkTask() { }

    public BukkitTask getActionTask() {
        return actionTask;
    }

    public void setActionTask(BukkitTask actionTask) { }

    public BukkitTask getMoveTask() {
        return moveTask;
    }

    public void setMoveTask(BukkitTask moveTask) { }

    public BukkitTask getTalkTask() {
        return talkTask;
    }

    public void setTalkTask(BukkitTask talkTask) { }

    public int getActionPerTick() {
        return actionPerTick;
    }

    public void setActionPerTick(int actionPerTick) {
        this.actionPerTick = actionPerTick;
    }

    public int getMovePerTick() {
        return movePerTick;
    }

    public void setMovePerTick(int movePerTick) {
        this.movePerTick = movePerTick;
    }

    public int getTalkPerTick() {
        return talkPerTick;
    }

    public void setTalkPerTick(int talkPerTick) {
        this.talkPerTick = talkPerTick;
    }

    public BukkitTask getHologramUpdateTask() {
        return hologramUpdateTask;
    }

    public void setHologramUpdateTask(BukkitTask hologramUpdateTask) { }

    public int getHologramPerSecond() {
        return hologramPerSecond;
    }

    public void setHologramPerSecond(int hologramPerSecond) {
        this.hologramPerSecond = hologramPerSecond;
    }

    public Minion getMinion() {
        return minion;
    }
}
