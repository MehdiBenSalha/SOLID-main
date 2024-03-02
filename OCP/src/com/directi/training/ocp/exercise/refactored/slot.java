package com.directi.training.ocp.exercise.refactored;

public abstract class slot {
    private int SlotId;
    public abstract void markSlotFree(int resourceId);
    public abstract int findFreeSlot();
    public abstract void markSlotBusy(int resourceId);
    }
