package com.example.bank.service;

import com.example.bank.model.HpfmBank;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HpfmBankService {
    /**
     * 添加银行信息
     * @throws Exception
     */
    public void addBankInfo(HpfmBank hpfmBank)throws Exception;

    /**
     * 删除银行信息
     * @param bankId
     * @throws Exception
     */
    public void removeBankInfo(Long bankId) throws Exception;

    /**
     * 修改银行信息
     * @param hpfmBank
     * @return
     */
    int updateBankInfo(HpfmBank hpfmBank) throws Exception;

    /**
     * 查询银行信息
     * @param currentPage
     * @param pageSize
     * @return
     */
    PageInfo<HpfmBank> findBankInfo(int currentPage, int pageSize) throws Exception;
}
