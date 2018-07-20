package com.shrek.oauth2service.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Supervisor {
    private Integer supervisorId;

    private String username;

    private String passwd;

    private Integer status;

    private Integer roleId;

    private Integer departmentId;

    private Integer insertBy;

    private Integer updateBy;

    private Date insertTime;

    private Date updateTime;

    private List<Role> roles;

    private Set<GrantedAuthority> authorities ;


    public Set<GrantedAuthority> getAuthorities() {

        Set<GrantedAuthority> userAuthotities = new HashSet<>();
        //System.out.printf("role size"+roles.size());
        for (Role role : roles){
            //System.out.println(role.getPermissions().size());
            for(Permission authority : role.getPermissions()){
                //System.out.println(authority.getValue());
                userAuthotities.add(new SimpleGrantedAuthority(authority.getValue()));
            }
        }

        return userAuthotities;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getInsertBy() {
        return insertBy;
    }

    public void setInsertBy(Integer insertBy) {
        this.insertBy = insertBy;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "supervisorId=" + supervisorId +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", status=" + status +
                ", roleId=" + roleId +
                ", departmentId=" + departmentId +
                ", insertBy=" + insertBy +
                ", updateBy=" + updateBy +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                ", roles=" + roles +
                ", authorities=" + authorities +
                '}';
    }
}