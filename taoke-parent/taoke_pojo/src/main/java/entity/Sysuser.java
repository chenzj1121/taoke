package entity;

import java.io.Serializable;

import com.luoshi.pojo.TbDept;
import com.luoshi.pojo.TbGroup;
import com.luoshi.pojo.TbSysUser;

public class Sysuser implements Serializable {
	private TbSysUser user;
	private TbDept dept;
	private TbGroup group;
	public TbSysUser getUser() {
		return user;
	}
	public void setUser(TbSysUser user) {
		this.user = user;
	}
	public TbDept getDept() {
		return dept;
	}
	public void setDept(TbDept dept) {
		this.dept = dept;
	}
	public TbGroup getGroup() {
		return group;
	}
	public void setGroup(TbGroup group) {
		this.group = group;
	}
	

}
