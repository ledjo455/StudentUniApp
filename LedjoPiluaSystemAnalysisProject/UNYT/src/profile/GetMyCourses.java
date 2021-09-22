
package profile;

import java.sql.Date;
import java.sql.Time;


public class GetMyCourses {
    
    private String id;
    private String location;
    private Time start;
    private Time end;
    private Date begin;
    private Date finish;

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public Date getFinish(){
        return finish;
    }
    public void setFinish(){
        this.finish = finish;
    }
    public GetMyCourses(String id, String location, Time start, Time end) {
        this.id = id;
        this.location = location;
        this.start = start;
        this.end = end;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }
  
    public Date getBegin(){
        return begin;
    }
    public void setBegin(Date begin){
        this.begin=begin;
    }
    
    
}
