package com.dbn.campuslife.entity.user;

import com.dbn.campuslife.util.NatureUtil;

/**
 * 用户更新请求实体类
 */
public class UpdateUserDTO implements NatureUtil<UpdateUserDTO> {

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 昵称
     */
    private String personName;
    /**
     * 年龄
     */
    private Integer personAge;
    /**
     * 住址
     */
    private String personAddress;
    /**
     * 学校名称
     */
    private String schoolName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UpdateUserDTO{" +
                "personName='" + personName + '\'' +
                ", personAge='" + personAge + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
