
package dashboard;

public class ProcessInfo {

    private String pid;
    private String user;
    private String priority;
    private String nice;
    private String virtual;
    private String resident;
    private String shared;
    private String status;
    private String cpu;
    private String mem;
    private String time;
    private String command;

    public ProcessInfo(String pid, String user, String priority, String nice, String virtual, String resident, String shared, String status, String cpu, String mem, String time, String command) {
        this.pid = pid;
        this.user = user;
        this.priority = priority;
        this.nice = nice;
        this.virtual = virtual;
        this.resident = resident;
        this.shared = shared;
        this.status = status;
        this.cpu = cpu;
        this.mem = mem;
        this.time = time;
        this.command = command;
    }

    public String getPid() {
        return pid;
    }

    public String getUser() {
        return user;
    }

    public String getPriority() {
        return priority;
    }

    public String getNice() {
        return nice;
    }

    public String getVirtual() {
        return virtual;
    }

    public String getResident() {
        return resident;
    }

    public String getShared() {
        return shared;
    }

    public String getStatus() {
        return status;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMem() {
        return mem;
    }

    public String getTime() {
        return time;
    }

    public String getCommand() {
        return command;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setNice(String nice) {
        this.nice = nice;
    }

    public void setVirtual(String virtual) {
        this.virtual = virtual;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCommand(String command) {
        this.command = command;
    }
    
    public String formatLine(){
        String line;
        line = String.format("%-13s %-17s%-11s%-8s %-10s%-10s%-12s%-12s%-10s%-12s%-12s%-12s",pid,user,priority,nice,virtual,resident,shared,status,cpu,mem,time,command);
        return line;
    }
    
}

