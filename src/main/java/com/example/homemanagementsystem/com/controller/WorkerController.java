package com.example.homemanagementsystem.com.controller;

import com.example.homemanagementsystem.com.service.WorkerService;
import com.example.homemanagementsystem.com.pojo.Worker;
import com.example.homemanagementsystem.com.vo.WorkerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/H")
public class WorkerController {
@Autowired
private WorkerService WorkerServiceImpl;

@GetMapping
    public List<Worker>  SelectHAll(){
    return   WorkerServiceImpl.selectHAll();
}

@GetMapping("/{id}")
    public Worker SelectHId(@PathVariable Integer id){
    return WorkerServiceImpl.selectHById(id);
}

@PostMapping
    public String RegistDept(@RequestBody Worker id){
    if (WorkerServiceImpl.RegisterH(id)) {
        return "注册成功";
    } else {
        return "注册失败";
    }
}


    @PostMapping("/MulRegistH")
    public String RegistDept(@RequestBody List<Worker> id){
        if (WorkerServiceImpl.MulRegisterH(id)) {
            return "批量注册成功";
        } else {
            return "批量注册失败";
        }
    }

    @PostMapping("/ModifyH")
    public String ModifyH(@RequestBody Worker id) {
        WorkerServiceImpl.ModifyH(id);
        return "修改成功";
    }

    @PostMapping("/MulModifyH")
    public String MulModifyH(@RequestBody List<Worker> dept){
        if (WorkerServiceImpl.MulModifyH(dept)) {
            return "批量修改成功";
        } else {
            return "批量修改失败";
        }
    }

    @DeleteMapping("/{id}")
    public String DeleteHByID(@PathVariable Integer id){
        WorkerServiceImpl.DeleteHById(id);
        return "删除成功";
    }

    @DeleteMapping("/Muldelete")
    public String MulDelete(@RequestBody List<Integer> ids){
        if (WorkerServiceImpl.MulDeleteH(ids)){
            return "批量删除成功";
        } else {
            return "批量删除失败";
        }
    }

    @GetMapping("/findHUser")
    public List<WorkerVo> findHUser(){
        return WorkerServiceImpl.findHUsers();
    }
    @GetMapping("/findHUser2/{id}")
    public List<WorkerVo> findHUser2(@PathVariable Integer id){
        return WorkerServiceImpl.findHUser2(id);
    }
}
