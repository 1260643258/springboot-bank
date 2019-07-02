package com.example.bank.controller;

import com.example.bank.model.HpfmBank;
import com.example.bank.service.HpfmBankService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 银行信息管理
 */
@RestController()
public class BankController {
    @Autowired
    private HpfmBankService hpfmBankService;

    /**
     * 增加银行信息
     * @param hpfmBank
     */
    @RequestMapping(value = "/addBankInfo")
    @ApiOperation(value = "添加银行信息",notes = "添加银行信息")
    @ApiImplicitParam(name = "hpfmBank", value = "银行实体详细信息", required = true, dataType = "HpfmBank")
    public void addBankInfo(@RequestBody @Valid HpfmBank hpfmBank)
    {
        try {
            hpfmBankService.addBankInfo(hpfmBank);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    /**
     * 删除银行信息
     * @param bankId
     */
    @RequestMapping(value = "/removeBankInfo",method = RequestMethod.POST)
    @ApiOperation(value = "删除银行信息",notes = "删除银行信息")
    public void removeBankInfo(@RequestParam(value = "bankId") Long bankId)
    {
        try {
            hpfmBankService.removeBankInfo(bankId);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    /**
     * 修改银行信息
     * @param hpfmBank
     */
    @RequestMapping(value = "/updateBankInfo",method = RequestMethod.POST)
    @ApiOperation(value = "修改银行信息",notes = "修改银行信息")
    @ApiImplicitParam(name = "hpfmBank", value = "银行实体详细信息", required = true, dataType = "HpfmBank")
    public void updateBankInfo(@RequestBody HpfmBank hpfmBank)
    {
        try {
            hpfmBankService.updateBankInfo(hpfmBank);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 查询银行信息
     * @param currentPage
     * @param pageSize
     */
    @RequestMapping(value = "/findBankInfo",method = RequestMethod.POST)
    @ApiOperation(value = "查询银行信息",notes = "查询银行信息")
    public PageInfo<HpfmBank> findBankInfo(@RequestParam(value = "currentPage")int currentPage,@RequestParam(value = "pageSize")int pageSize)
    {
        try {
            PageInfo<HpfmBank> pageInfo =  hpfmBankService.findBankInfo(currentPage,pageSize);
            return pageInfo;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
