package com.example.homemanagementsystem.com.service;

import com.example.homemanagementsystem.com.pojo.Worker;

import com.example.homemanagementsystem.com.vo.WorkerVo;

import java.util.List;

public interface WorkerService {
    public List<Worker> selectHAll();
    public Worker selectHById(Integer id);

   

    public String DeleteHById(Integer id);
    public boolean MulDeleteH(List<Integer> id);

    public List<WorkerVo> findHUsers();

    public List<WorkerVo> findHUser2(Integer id);

    boolean MulRegisterH(List<Worker> id);

    void ModifyH(Worker id);

    boolean MulModifyH(List<Worker> dept);

    boolean RegisterH(Worker id);
}
