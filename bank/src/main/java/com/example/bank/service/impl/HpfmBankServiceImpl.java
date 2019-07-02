package com.example.bank.service.impl;

import com.example.bank.mapper.HpfmBankMapper;
import com.example.bank.model.HpfmBank;
import com.example.bank.service.HpfmBankService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 银行信息管理实现
 */
@Service
public class HpfmBankServiceImpl implements HpfmBankService {

    @Autowired
    private HpfmBankMapper hpfmBankMapper;

    /**
     * 添加银行信息
     * @param hpfmBank
     * @throws Exception
     */
    @Transactional
    @Override
    public void addBankInfo(HpfmBank hpfmBank) throws Exception {
        hpfmBankMapper.insert(hpfmBank);
    }

    /**
     * 删除银行信息
     * @param bankId
     * @throws Exception
     */
    @Transactional
    @Override
    public void removeBankInfo(Long bankId) throws Exception {
        hpfmBankMapper.removeBankInfo(bankId);
    }

    /**
     * 修改银行信息
     * @param hpfmBank
     * @return
     * @throws Exception
     */
    @Transactional
    @Override
    public int updateBankInfo(HpfmBank hpfmBank) throws Exception {
        return hpfmBankMapper.updateBankInfo(hpfmBank);
    }

    /**
     * 查询银行信息
     * @param currentPage
     * @param pageSize
     * @return
     * @throws Exception
     */
    @Override
    public PageInfo<HpfmBank> findBankInfo(int currentPage,int pageSize) throws Exception {
        PageInfo<HpfmBank> pageInfo = PageHelper.startPage(currentPage,pageSize).doSelectPageInfo(()->hpfmBankMapper.findBankInfo());
//        List<HpfmBank> hpfmBanks = hpfmBankMapper.findBankInfo();
//        PageInfo<HpfmBank> pageInfo = new PageInfo<>(hpfmBanks);
        return pageInfo;
    }
}
