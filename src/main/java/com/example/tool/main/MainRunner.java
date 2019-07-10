package com.example.tool.main;


import com.example.tool.dao.BeanAutoDao;
import com.example.tool.dao.DaoAutoDao;
import com.example.tool.dao.ServiceAutoDao;
import com.example.tool.dao.ServiceImplAutoDao;
import com.example.tool.dao.impl.BeanAutoDaoImpl;
import com.example.tool.dao.impl.DaoAutoDaoImpl;
import com.example.tool.dao.impl.ServiceAutoDaoImpl;
import com.example.tool.dao.impl.ServiceImplAutoDaoImpl;

public class MainRunner {


    public void generateCode(){
//1.生成Bean实体类
        BeanAutoDao beanAuto = new BeanAutoDaoImpl();
        if(beanAuto.createBean()){
            System.out.println("所有Bean实体类生成成功");
        }else{
            System.out.println("所有Bean实体类生成失败");
        }
//2.生成Dao接口
        DaoAutoDao daoAuto = new DaoAutoDaoImpl();
        if(daoAuto.createDao()){
            System.out.println("所有Dao接口生成成功");
        }else{
            System.out.println("所有Dao接口生成失败");
        }
//3.生成Mapper.xml
//        MapperXmlAutoDao mapperXmlAuto=new MapperXmlAutoDaoImpl();
//        if(mapperXmlAuto.createMapperXml()){
//            System.out.println("所有Mapper.xml生成成功");
//        }else{
//            System.out.println("所有Mapper.xml生成失败");
//        }
//4.生成Service接口
        ServiceAutoDao serviceAuto = new ServiceAutoDaoImpl();
        if(serviceAuto.createService()){
            System.out.println("所有Service接口生成成功");
        }else{
            System.out.println("所有Service接口生成失败");
        }
//5.生成ServiceImpl实现类
        ServiceImplAutoDao serviceImplAuto = new ServiceImplAutoDaoImpl();
        if(serviceImplAuto.createServiceImpl()){
            System.out.println("所有ServiceImpl实现类生成成功");
        }else{
            System.out.println("所有ServiceImpl实现类生成失败");
        }
    }
}
