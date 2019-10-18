package com.luoshi.pojo;

public class TbGroup {
    private Integer groupId;

    private String groupName;

    private Integer groupDeptId;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getGroupDeptId() {
        return groupDeptId;
    }

    public void setGroupDeptId(Integer groupDeptId) {
        this.groupDeptId = groupDeptId;
    }
}