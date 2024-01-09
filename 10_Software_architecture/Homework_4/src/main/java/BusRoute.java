import java.util.List;

public class BusRoute {
    private int id;
    private String remark;
    private int capacity;
    private List<BusStop> busStops;

    public BusRoute(int id, String remark, int capacity, List<BusStop> busStops) {
        this.id = id;
        this.remark = remark;
        this.capacity = capacity;
        this.busStops = busStops;
    }

    public int getId() {
        return id;
    }

    public String getRemark() {
        return remark;
    }





}
