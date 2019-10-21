package com.luoshi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luoshi.pojo.TbUserWorkTargetMonth;
import com.luoshi.service.UserWorkTargetMonthService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/userWorkTargetMonth")
public class UserWorkTargetMonthController {

    @Autowired
    private UserWorkTargetMonthService userWorkTargetMonthService;


    /**
     * 通过年月,用户id返回目标
     */
    @RequestMapping("/findOneByYearAndMonth")
    public TbUserWorkTargetMonth findOneByYearAndMonth(@RequestParam("userId") Integer userId, @RequestParam("year") Integer year, @RequestParam("month")Integer month){
        
    	return userWorkTargetMonthService.findOneByYearAndMonth(userId, year, month);
    }

    @RequestMapping("/updateOneByYearAndMonth")
    public Result updateOneByYearAndMonth(@RequestBody TbUserWorkTargetMonth tbUserWorkTargetMonth){
        System.out.println(tbUserWorkTargetMonth);
        userWorkTargetMonthService.updateOneByYearAndMonth(tbUserWorkTargetMonth);
        return new Result(true,"修改成功");
    }

    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<TbUserWorkTargetMonth> findAll(){
        return userWorkTargetMonthService.findAll();
    }


    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult  findPage(int page,int rows){
        return userWorkTargetMonthService.findPage(page, rows);
    }

    /**
     * 增加
     * @param userWorkTargetMonth
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody TbUserWorkTargetMonth userWorkTargetMonth){
        try {
            userWorkTargetMonthService.add(userWorkTargetMonth);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     * @param userWorkTargetMonth
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbUserWorkTargetMonth userWorkTargetMonth){
        try {
            userWorkTargetMonthService.update(userWorkTargetMonth);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 获取实体
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public TbUserWorkTargetMonth findOne(int id){
        return userWorkTargetMonthService.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(int [] ids){
        try {
            userWorkTargetMonthService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     * @param
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody TbUserWorkTargetMonth userWorkTargetMonth, int page, int rows  ){
        return userWorkTargetMonthService.findPage(userWorkTargetMonth, page, rows);
    }

}
