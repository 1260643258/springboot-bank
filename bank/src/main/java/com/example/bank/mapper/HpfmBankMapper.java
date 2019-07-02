package com.example.bank.mapper;

import com.example.bank.model.HpfmBank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HpfmBankMapper {
    /**
     * 增加银行信息
     * @param hpfmBank
     * @return
     */
    int insert(HpfmBank hpfmBank);


    /**
     * 删除银行信息
     * @param bankId
     * @throws Exception
     */
    void removeBankInfo(Long bankId);

    /**
     * 修改银行信息
     * @param hpfmBank
     * @return
     */
    int updateBankInfo(HpfmBank hpfmBank);

    /**
     * 查询银行信息
     * @return
     */
    List<HpfmBank> findBankInfo();
}
