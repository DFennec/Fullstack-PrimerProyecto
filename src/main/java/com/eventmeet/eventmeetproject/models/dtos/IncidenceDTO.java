package com.eventmeet.eventmeetproject.models.dtos;

import com.eventmeet.eventmeetproject.models.user;

public class IncidenceDTO {

    private Long id;
    private String category;
    private String description;
    private String priority;
    private user userCreated;
    
    public IncidenceDTO(Long id, String category, String description, String priority, user userCreated) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.priority = priority;
        this.userCreated = userCreated;
    }
    
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
    public String getPriority() {
        return priority;
    }
    public Long getId() {
        return id;
    }
    public user getUserCreated() {
        return userCreated;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setUserCreated(user userCreated) {
        this.userCreated = userCreated;
    }
}
