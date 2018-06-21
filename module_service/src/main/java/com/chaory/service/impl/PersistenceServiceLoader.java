package com.chaory.service.impl;

import com.chaory.service.PersistenceService;

import java.util.Optional;
import java.util.ServiceLoader;





/**
 * Created by Chao-RY on 2018/6/20.
 */
public class PersistenceServiceLoader {

    public static PersistenceService persistenceService;
    static {

        //返回的是一个流
        final Optional<PersistenceService> optionalService = ServiceLoader.load(PersistenceService.class).findFirst();
        if(optionalService.isPresent()){
            persistenceService=optionalService.get();

        }else{
            throw new RuntimeException("No Persistence service.");
        }
    }



    public static void main(String[] args) {


        System.out.println("ssssssssss");
    }
}
