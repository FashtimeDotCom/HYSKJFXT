package com.scau.hyskjf.controller;

import com.scau.hyskjf.pojo.Merchantaccount;
import com.scau.hyskjf.pojo.MerchantinfoWithBLOBs;
import com.scau.hyskjf.service.MerchantManagementService;
import com.scau.hyskjf.util.json.ResponseCode;
import com.scau.hyskjf.util.json.ResponseJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/MerchantManagement")
public class MerchantManagementController {

    @Autowired
    private MerchantManagementService merchantManagementService;
    //商家查询，浏览联盟内商家，查询商家
    @RequestMapping("/merchantinfo/list")
    public ResponseJSON findAllMerchant(){
        List<MerchantinfoWithBLOBs> merchantinfos = merchantManagementService.findAllMerchant();
        return new ResponseJSON(ResponseCode.SUCCESS,merchantinfos);
    }

    //查看单个商家
    @RequestMapping("/merchantinfo/{id}")
    public ResponseJSON findMerchantById(@PathVariable int id){
        MerchantinfoWithBLOBs merchantinfoWithBLOBs = merchantManagementService.findMerchantById(id);
        return new ResponseJSON(ResponseCode.SUCCESS,merchantinfoWithBLOBs);
    }

    //查看商家所有账户信息
    @RequestMapping("/merchantAllAccount/{id}")
    public ResponseJSON findAllAccounts(@PathVariable(name = "id") int merid){
        List<Merchantaccount> merchantaccounts = merchantManagementService.findMerchantAccountsById(merid);
        return new ResponseJSON(ResponseCode.SUCCESS,merchantaccounts);
    }
    //查看单个账户信息
    @RequestMapping("/merchantAccount/{id}")
    public ResponseJSON findAccountById(@PathVariable(name = "id") int macid){
        Merchantaccount merchantaccount = merchantManagementService.findMerchantAccountById(macid);
        return new ResponseJSON(ResponseCode.SUCCESS,merchantaccount);
    }


    //禁用商家账号(包括子账号)
    @RequestMapping("/merchantAccount/{id}/forbid")
    public ResponseJSON forbidMerchantAccounts(@PathVariable(name = "id") int merid){
        merchantManagementService.forbidMerchantAccounts(merid);
        return new ResponseJSON(ResponseCode.SUCCESS,"成功");
    }
    //启用商家账号
    @RequestMapping("/merchantAccount/{id}/enable")
    public ResponseJSON enableMerchant(@PathVariable(name = "id") int merid){
        merchantManagementService.enableMerchantAccounts(merid);
        return new ResponseJSON(ResponseCode.SUCCESS,"hehe");
    }


    //积分划拨比列设置
    @RequestMapping("/credit/reset/{id}")
    public ResponseJSON resetCredit(@PathVariable(name = "id") int merid){
        return null;
    }

    //积分划拨比列设置



    //
}
