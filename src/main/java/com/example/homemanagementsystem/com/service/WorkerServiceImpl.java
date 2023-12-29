package com.example.homemanagementsystem.com.service;


import com.example.homemanagementsystem.com.pojo.Worker;

import com.example.homemanagementsystem.com.mapper.WorkerMapper;

import com.example.homemanagementsystem.com.vo.WorkerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerMapper workerMapper;


    @Override
    public List<Worker> selectHAll() {
        return workerMapper.selectHAll();
    }

    @Override
    public Worker selectHById(Integer id) {
        return workerMapper.selectHById(id);
    }

    // @Override
    // public Boolean RegisterDept(Worker dept) {
    //     workerMapper.insertDept(dept);
    //     return true;
    // }
    //
    // @Override
    // public Boolean MulRegisterDept(List<department> dept) {
    //     for (department depts : dept) {
    //         RegisterDept(depts);
    //     }
    //     return true;
    // }
    //
    // @Override
    // public void ModifyDept(department dept) {
    //     workerMapper.updateDept(dept);
    // }
    //
    // @Override
    // public Boolean MulModifyDept(List<department> dept) {
    //     for (department depts : dept) {
    //         ModifyDept(depts);
    //     }
    //     return true;
    // }

    @Override
    public String DeleteHById(Integer id) {
        workerMapper.delHById(id);
        return "删除成功";
    }

    @Override
    public boolean MulDeleteH(List<Integer> ids) {
        for (Integer id:ids) {
            workerMapper.delHById(id);
        }
        return true;
    }



    @Override
    public List<WorkerVo> findHUsers() {
        return workerMapper.findHUser();
    }

    @Override
    public List<WorkerVo> findHUser2(Integer id) {
        return null;
    }

    @Override
    public boolean MulRegisterH(List<Worker> id) {
        for (Worker ids : id) {
            RegisterH(ids);
        }
        return true;

    }

    @Override
    public void ModifyH(Worker id) {

    }

    @Override
    public boolean MulModifyH(List<Worker> id) {
        for (Worker ids : id) {
            RegisterH(ids);
        }
        return true;
    }

    @Override
    public boolean RegisterH(Worker id) {

        return false;
    }


    // @Override
    // public List<WorkerVo> findDeptUser2(Integer id) {
    //     List<WorkerVo> res = new ArrayList<>();
    //     //List<department> depts = deptMapper.selectDeptAll();
    //     Map map = new HashMap();
    //     map.put("deptID", id);
    //
        // department dept = workerMapper.selectById(id);
        // WorkerVo dv = new WorkerVo();
        //     dv.setId(dept.getId());
        //     dv.setDept_name(dept.getDept_name());
        //     dv.setDescription(dept.getDescription());
        //     dv.setAddress(dept.getAddress());
        //     List<User> users = userMapper.selectByMap(map);
        //     dv.setUsers(users);
        //     res.add(dv);
        //     return res;
//            deptVo dv=new deptVo();
        //  for (department dept:depts) {
//            dv.setId(dept.getId());
//            dv.setDeptName(dept.getDept_name());
//            dv.setDescription(dept.getDescription());
//            dv.setAddress(dept.getAddress());
//         List<User> users=userMapper.selectByMap(map);
        // User users=userMapper.selectById(id);
//            dv.setUserName(user.getUser_name());
//            dv.setPassword(user.getPassword());
//            dv.setGender(user.getGender());
//            dv.setBirthday(user.getBirthday());
//            dv.setDeptID(user.getDeptID());
//              dv.setUsers(users);
//             res.add(dv);
//            System.out.println("---------------");
//            System.out.println(dv);


        // }

        //  return res;}
    }