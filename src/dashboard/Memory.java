
package dashboard;

class Memory {
    private String totalMemory;
    private String usedMemory;
    private String freeMemory;
    private String sharedMemory;
    private String chachedMemory;
    private String availableMemory;
    private String totalSwap;
    private String usedSwap;
    private String freeSwap;

    public Memory(String totalMemory, String usedMemory, String freeMemory, String sharedMemory, String chachedMemory, String availableMemory, String totalSwap, String usedSwap, String freeSwap) {
        this.totalMemory = totalMemory;
        this.usedMemory = usedMemory;
        this.freeMemory = freeMemory;
        this.sharedMemory = sharedMemory;
        this.chachedMemory = chachedMemory;
        this.availableMemory = availableMemory;
        this.totalSwap = totalSwap;
        this.usedSwap = usedSwap;
        this.freeSwap = freeSwap;
    }

    public String getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(String totalMemory) {
        this.totalMemory = totalMemory;
    }

    public String getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(String usedMemory) {
        this.usedMemory = usedMemory;
    }

    public String getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(String freeMemory) {
        this.freeMemory = freeMemory;
    }

    public String getSharedMemory() {
        return sharedMemory;
    }

    public void setSharedMemory(String sharedMemory) {
        this.sharedMemory = sharedMemory;
    }

    public String getChachedMemory() {
        return chachedMemory;
    }

    public void setChachedMemory(String chachedMemory) {
        this.chachedMemory = chachedMemory;
    }

    public String getAvailableMemory() {
        return availableMemory;
    }

    public void setAvailableMemory(String availableMemory) {
        this.availableMemory = availableMemory;
    }

    public String getTotalSwap() {
        return totalSwap;
    }

    public void setTotalSwap(String totalSwap) {
        this.totalSwap = totalSwap;
    }

    public String getUsedSwap() {
        return usedSwap;
    }

    public void setUsedSwap(String usedSwap) {
        this.usedSwap = usedSwap;
    }

    public String getFreeSwap() {
        return freeSwap;
    }

    public void setFreeSwap(String freeSwap) {
        this.freeSwap = freeSwap;
    }
 
    public void formatMemLine(StringBuilder sb){
        String line;
        sb.append(System.lineSeparator());
        sb.append("Memória:");
        line = String.format("        %-10s %-15s %-20s %-35s %-30s %-10s",totalMemory,usedMemory,freeMemory,sharedMemory,chachedMemory,availableMemory);
        sb.append(line);
        sb.append(System.lineSeparator());
        sb.append("Swap:");
        line = String.format("             %-11s %-16s %-10s",totalSwap,usedSwap,freeSwap);
        sb.append(line);
    }
}
