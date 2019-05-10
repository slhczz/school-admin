package com.sy.stu.school.pojo.po;

public class WebJobslistWithBLOBs extends WebJobslist {
    private String jl;

    private String pj;

    public String getJl() {
        return jl;
    }

    public void setJl(String jl) {
        this.jl = jl == null ? null : jl.trim();
    }

    public String getPj() {
        return pj;
    }

    public void setPj(String pj) {
        this.pj = pj == null ? null : pj.trim();
    }
}