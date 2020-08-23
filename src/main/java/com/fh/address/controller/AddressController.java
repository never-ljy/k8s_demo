package com.fh.address.controller;

import com.fh.address.model.Address;
import com.fh.address.service.AddressService;
import com.fh.common.ServerResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("address")
public class AddressController {
    @Resource
    private AddressService addressService;

    @RequestMapping("test")
    public String test(){
        return "hello1234564435";
    }
    @RequestMapping("queryAddressList")
    public ServerResponse queryAddressList(){
        return addressService.queryAddressList();
    }

    @RequestMapping("del/{id}")
    public ServerResponse del(@PathVariable("id") Integer id){
        addressService.del(id);
        return ServerResponse.success();
    }
    @RequestMapping("upd")
    public ServerResponse upd(Address address){
        addressService.upd(address);
        return ServerResponse.success();
    }

    @RequestMapping("updStatus")
    public ServerResponse updStatus(Integer id){
        addressService.updStatus(id);
        return ServerResponse.success();
    }




}
