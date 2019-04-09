package org.zero01.pojo;

public class AppUser {
    private Integer id;


    private String name;

    private String password;

    private Integer identity;

    public AppUser(Integer id, String name, String password, Integer identity) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.identity = identity;
    }

    public AppUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }
}