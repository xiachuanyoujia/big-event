package com.itheima.service;

import com.itheima.pojo.Category;

import java.util.List;

public interface CategoryService {
    //新增分类
    void add(Category category);

    //列表查询
    List<Category> list();

    //根据id查询详细分类
    Category findById(Integer id);

    //更新分类
    void update(Category category);

    //删除
    void delete(Integer id);
}
