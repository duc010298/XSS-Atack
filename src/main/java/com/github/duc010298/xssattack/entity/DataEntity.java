package com.github.duc010298.xssattack.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "data", schema = "public", catalog = "postgres")
public class DataEntity {
	private long id;
    private String dataObject;
    private Date timeUp;
    
    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    @Basic
    @Column(name = "data_object")
    public String getDataObject() {
        return dataObject;
    }

    public void setDataObject(String dataObject) {
        this.dataObject = dataObject;
    }
    
    @Column(name="time_up")
	public Date getTimeUp() {
		return timeUp;
	}

	public void setTimeUp(Date timeUp) {
		this.timeUp = timeUp;
	}
}
