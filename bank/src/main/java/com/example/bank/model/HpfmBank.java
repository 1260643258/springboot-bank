package com.example.bank.model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * 银行信息实体
 */
public class HpfmBank {
    /**
     * 银行ID
     */
    private Long bankId;

    /**
     * 银行编码
     */
    @NotEmpty(message = "银行编码不能为空")
    private String bankCode;

    /**
     * 银行名称
     */
    @NotEmpty(message = "银行名称不能为空")
    private String bankName;

    /**
     * 银行简称
     */
    private String bankShortName;

    /**
     * 银行类型
     */
    private String bankTypeCode;

    /**
     * 是否启用标记
     */
    @Range(min = 0,max = 1,message = "是否启用标记只能为0或者1")
    @NotNull(message = "是否启用标记不能为空")
    private Integer enabledFlag;

    /**
     * 行版本号，用来处理锁
     */
    @NotNull(message = "行版本号不能为空")
    private Long objectVersionNumber;

    /**
     * 创建时间
     */
    @NotNull(message = "创建时间不能为空")
    private Date creationDate;

    /**
     * 创建人
     */
    @NotNull(message = "创建人不能为空")
    private Long createdBy;

    /**
     * 最后修改人
     */
    @NotNull(message = "最后修改人不能为空")
    private Long lastUpdatedBy;

    /**
     * 最后修改时间
     */
    @NotNull(message = "最后修改时间不能为空")
    private Date lastUpdateDate;

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankShortName() {
        return bankShortName;
    }

    public void setBankShortName(String bankShortName) {
        this.bankShortName = bankShortName;
    }

    public String getBankTypeCode() {
        return bankTypeCode;
    }

    public void setBankTypeCode(String bankTypeCode) {
        this.bankTypeCode = bankTypeCode;
    }

    public Integer getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(Integer enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
