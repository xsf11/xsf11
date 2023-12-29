package com.example.homemanagementsystem.com.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.homemanagementsystem.com.pojo.Worker;
import com.example.homemanagementsystem.com.vo.WorkerVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 69091
 */
@Mapper
public interface WorkerMapper extends BaseMapper<Worker> {

    List<Worker> selectHAll();

    Worker selectHById(Integer id);

    // Integer insertDept(Worker dept);
    //
    //  Integer updateDept(Worker dept);

     Integer delHById(Integer id);




      WorkerVo findDeptUser2(Integer id);

    List<WorkerVo> findHUser();
}
