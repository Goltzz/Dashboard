
package dashboard;

public class ProcessInfo {

    private String pid;
    private String user;
    private String priority;
    private String nice;
    private String status;
    private String cpu;
    private String mem;
    private String time;
    private String start;
    private String command;

    public ProcessInfo(String pid, String user, String priority, String nice, String status, String cpu, String mem, String time,String start, String command) {
        this.pid = pid;
        this.user = user;
        this.priority = priority;
        this.nice = nice;
        this.status = status;
        this.cpu = cpu;
        this.mem = mem;
        this.start = start;
        this.time = time;
        this.command = command;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
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
    
    
}

