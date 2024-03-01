package com.directi.training.ocp.exercise;

public class SlotAllocator {

    public int allocate(slot sl)
    {
        int resourceId;
       
            resourceId = sl.findFreeSlot();
            sl.markSlotBusy(resourceId);
        
        return resourceId;
    }

    public void free(slot sl, int resourceId)
    {
        
            sl.markSlotFree(resourceId);
         
        }
    }


